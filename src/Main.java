import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        OS opsys = new OS();
        Harddisk hdd = new Harddisk();
        Driver d = new Driver(hdd);

        opsys.enterInput();
        opsys.sendToDriver(d);
    }

}
