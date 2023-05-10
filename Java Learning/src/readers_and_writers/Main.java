package readers_and_writers;


import java.io.InputStream;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        /*
                There are input streams and output streams of Bytes
                readers/writers turn bytes into characters(ints)

                For example, Readers wrap around InputStreams so that the
                byte input is turned into characters
                The same foes for OutputStreams & Writers

                Often, Readers/Writers are wrapped by Buffers which
                improve efficiency (e.g. BufferedReader/BufferedWriter)
                Buffer classes also have useful methods like readLine()
                that return lines as Strings

                Essentially, if you want to read binary data, use InputStream.
                If you want to read characters,strings etc., use Reader

         */
    }
}
