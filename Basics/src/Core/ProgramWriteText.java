//Author Veera
package Core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramWriteText {
	public static void main(String[] args) throws IOException {
        String text = "Hello world";
        BufferedWriter output = null;
        try {
            File file = new File("example.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
          if ( output != null ) {
            output.close();
          }
        }
    }
}
