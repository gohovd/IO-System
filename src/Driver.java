import java.util.ArrayList;

//Gøran's bit.
public class Driver {
    ArrayList<String> text = new ArrayList();

    public Driver() {

    }

    private void convertInput(String string){
        String[] split = string.split(" ");
        for(String s : split) {
            text.add(s);
            System.out.println(s);
        }
    }

    private void writeToDisk(ArrayList text, Harddisk d){

    }

}
