package files.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {

        try{
            FileWriter writer = new FileWriter("Java Learning\\Files" +
                    "\\src\\FileWriter\\message.txt");

            writer.write("Roses are red" +
                    "\n Violets are blue" +
                    "\n Booty booty booty booty" +
                    "\n Rockin' everywhere");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}