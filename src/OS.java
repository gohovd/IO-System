import java.util.Scanner;
import javax.swing.JOptionPane;

public class OS {



public static void OS(String args[]){

    //Scanner example
    Scanner input = new Scanner(System.in);
    System.out.print("Enter something > ");
    String inputString = input.nextLine();
    System.out.print("You entered : ");
    System.out.println(inputString);

    //JOptionPane example
    String input2 = JOptionPane.showInputDialog(null, "Enter some text:");
    JOptionPane.showMessageDialog(null, "You entered " + input);

    }



}

