package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {
    public static void main(String[] args) throws IOException {
        /*
            Serialization = The process of converting an object into a byte stream
            Persists (saves the state) of object after the program exist.
            In English: Serialization saves a Java object into storage memory
            This byte stream can be saved as a file or sent over a network
            Saved as .ser
            Serialization saves data unique to a particular instance of a class,
            not the class itself (definition, static etc.). This is why we still need
            our own definition of the class to deserialize a byte stream.

            Deserialization = the reverse of above. Turning a byte stream into an object
        */

        User user = new User();
        user.name = "james";
        user.password = "12345";
        user.sayHello();

        /*
                Steps to serialize:

                1) object must implement Serializable interface
                2) FileOutputStream fileOut = new FileOutputStream(path);
                3) ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
                4) objOut.writeObject(objectName);
                5) objOut.close();
                6) fileOut.close();

         */

        FileOutputStream fileOut = new FileOutputStream("Java Learning/Serialization/UserInfo.ser");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        objOut.writeObject(user);
        objOut.close();
        fileOut.close();

        System.out.println("Object saved!");
    }
}