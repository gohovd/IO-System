import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Harddisk {

    public Harddisk() {

    }
        public void write(ArrayList text, String filename) {
            //fjerne siste ordet i setningen (dvs filnavnet!)
            text.remove(text.size()-1);
            try {
                File file = new File(filename);
                BufferedWriter output = new BufferedWriter(new FileWriter(file,true));
                for(Object s : text) {
                    String txt = s.toString();
                    output.write(txt + " ");
                    System.out.print(txt + " ");
                }
                output.close();
            } catch (IOException e) {
                System.out.println("Oh no, stronk mistakes were made");
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
            System.out.println("something went wrong");
        }
    }

    public void seek(String word, String filename){
        Scanner scanner = new Scanner(filename);
        List<String> list = new ArrayList<>();
        while(scanner.hasNextLine()){
            list.add(scanner.nextLine());
        }
        if(list.contains(word)){
            System.out.println("The word '" + word +"' was found in" + filename);
        }else{
            System.out.println("Found nothing stronk");
        }

    }

}