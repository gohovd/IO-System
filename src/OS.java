import java.util.Scanner;


public class OS {

    public OS(){

    }


    public void enterInput(){

    //Scanner example
    Scanner input = new Scanner(System.in);
        System.out.println("Instructions:");
        System.out.println("- To read a file make sure to write read then the filename (example: read filename.txt)");
        System.out.println("- To write a file make sure to write write then the filename (example: write filename.txt)");
        System.out.println("- To seek a file make sure to write seek then the filename (example: seek filename.txt)");

    System.out.print("What would you like to do? > ");
    String inputString = input.nextLine();
    System.out.print("You entered: ");
    System.out.println(inputString);


    }



}

