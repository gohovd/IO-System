
import java.io.*;


public class Harddisk
{
    private String s;
    public Harddisk()
    {
        String fileName = ("C:"+File.separator+"test"+File.separator+"odata.txt");
        File dataFile = new File(fileName);
        byte[] content = new byte[0];
        {
            try {FileInputStream dataInputStream = new FileInputStream(dataFile);
                int bytesAvailable = dataInputStream.available();
                content = new byte[bytesAvailable];
                dataInputStream.read(content);
                dataInputStream.close();}
            catch (FileNotFoundException fnfe) {System.out.println("Couldn't find a file called " + fileName);}
            catch (IOException ioe) {System.out.println("Couldn't read from a file called " + fileName);}
            this.s = new String(content);
        }
    }
    public String getpayload(){return s;}
}