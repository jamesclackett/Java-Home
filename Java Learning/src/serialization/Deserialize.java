package serialization;

import java.io.*;

public class Deserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
                Steps to deserialize:
                1) Declare object (don't instantiate)
                2) FileInputStream fileIn = new FileInputStream(path);
                3) ObjectInputStream objIn = new ObjectInputStream(fileIn);
                4) objectName = (Class) objIn.readObject();
                5) objIn.close();
                6) fileIn.close();

        */

        User user;
        FileInputStream fileIn = new FileInputStream("Java Learning/Serialization/UserInfo.ser");
        ObjectInputStream objIn = new ObjectInputStream(fileIn);
        user = (User) objIn.readObject();
        objIn.close();
        fileIn.close();

        user.sayHello();
    }
}
