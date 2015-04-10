import java.util.Scanner;


public class OS {

    String textToSend;

    public OS(){

    }

    public void sendToDriver(Driver d){
        d.convertInput(textToSend);
    }


    public void enterInput(){

    //Scanner example
    Scanner input = new Scanner(System.in);
        System.out.println("Instructions:");
        System.out.println("- To read a file, write read then the filename (example: read filename.txt)");
        System.out.println("- To write a file, write write then the content for the document and finally the filename (example: write My name is Windows. filename.txt)");
        System.out.println("- To seek a file, write seek then the filename (example: seek filename.txt)");

    System.out.print("What would you like to do? > ");
    String inputString = input.nextLine();
    //System.out.print("You entered: ");
    //System.out.println(inputString);
        textToSend = inputString;


    }



}

