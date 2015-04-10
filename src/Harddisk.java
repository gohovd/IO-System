import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Harddisk {
    List<String> list;

    public Harddisk() {

    }
        public void write(ArrayList text) {ArrayList<String> text = new ArrayList();
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

    public void read(String filename){
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

    public void seek(String word, String filename){
        Scanner scanner = new Scanner(filename);
        list = new ArrayList<>();
        while(scanner.hasNextLine()){
            list.add(scanner.nextLine());
        }
        if(list.contains(word)){
            //print filename where the word can be found and line?
        }else{
            //nothing found
        }

    }

}