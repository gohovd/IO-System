import java.io.IOException;
import java.util.ArrayList;

//Gøran's bit.
public class Driver {
    ArrayList<String> text = new ArrayList();
    boolean write, read, seek;
    Harddisk instance;

    public Driver(Harddisk input) {
        instance = input;
    }

    public void convertInput(String string) {
        String[] split = string.split(" ");
        for (String s : split) {
            if (split[0].contains("write")) {
                write = true;
            } else if (split[0].contains("read")) {
                read = true;
            } else if (split[0].contains("seek")) {
                seek = true;
            }
            text.add(s);
        }
        text.remove(0);
        if(write) {
            writeToDisk(instance, text.get(text.size()-1));
        }
        if(read) { readFromDisk(instance, text.get(1)); }
        if(seek) { seekOnDisk(instance, text.get(1), text.get(2)); }

    }

    public void writeToDisk(Harddisk d, String filename) {
            d.write(text, filename);
    }
    public void readFromDisk(Harddisk d, String filename) { d.read(filename); }
    public void seekOnDisk(Harddisk d, String wordToFind, String filename) { d.seek(wordToFind, filename); }

}
