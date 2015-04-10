import java.util.Scanner;


public class OS {

    public OS(){

    }


    public void enterInput(){

    //Scanner example
    Scanner input = new Scanner(System.in);
    System.out.print("Enter something > ");
    String inputString = input.nextLine();
    System.out.print("You entered : ");
    System.out.println(inputString);


    }



}

