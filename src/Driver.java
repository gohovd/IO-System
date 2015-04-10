import java.util.ArrayList;

//Gøran's bit.
public class Driver {
    ArrayList<String> text = new ArrayList();

    public Driver() {

    }

    public void convertInput(String string){
        String[] split = string.split(" ");
        for(String s : split) {
            text.add(s);
        }
    }

    public void writeToDisk(Harddisk d){
        d.write(text);
    }

}
