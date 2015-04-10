import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        OS opsys = new OS();
        Driver d = new Driver();
        Harddisk hdd = new Harddisk();

        opsys.enterInput();
        opsys.sendToDriver(d);
        d.writeToDisk(hdd);

    }

}
