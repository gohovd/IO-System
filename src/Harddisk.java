import java.io.*;
import java.util.ArrayList;


public class Harddisk {

    public Harddisk() {

    }
        public void write(ArrayList text) {
            try {
                File file = new File("example.txt");
                BufferedWriter output = new BufferedWriter(new FileWriter(file,true));
                for(Object s : text) {
                    String txt = s.toString();
                    output.write(txt + " ");
                    System.out.print(txt + " ");
                }
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public void read(ArrayList filename){
        String str = null;
        try{
            BufferedReader in = new BufferedReader(new FileReader(filename));
            while(( str = in.readLine()) != null ){
                System.out.println(str + "\n");
            }
        } catch (IOException e) {
            System.out.println("something went wronk");
        }
    }
}