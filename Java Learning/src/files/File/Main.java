package files.File;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
                File = an abstract representation of file and directory patterns
        */

        File file = new File("Java Learning\\Files\\src\\File\\message.txt");
        // JVM looking in Playground generally, hence the path
        file.createNewFile();

        if (file.exists()){
            System.out.println("exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.isFile());
            //file.delete();
        }
        else System.out.println("does not exist");

    }
}