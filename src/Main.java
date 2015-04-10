import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        OS opsys = new OS();
        Driver d = new Driver();
        opsys.enterInput();
        opsys.sendToDriver(d);
    }

}
