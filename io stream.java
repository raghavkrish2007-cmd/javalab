import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Run {
    public static void main(String[] args) {

        String source = "C:\\Users\\25uad033\\Desktop\\ex 7\\source.txt";
        String destination = "C:\\Users\\25uad033\\Desktop\\ex 7\\destination.txt";

        try {
            FileInputStream input = new FileInputStream(source);
            FileOutputStream output = new FileOutputStream(destination);

            int data;

            // Read from source and write to destination
            while ((data = input.read()) != -1) {
                output.write(data);
            }

            input.close();
            output.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error while copying the file: " + e.getMessage());
        }
    }
}
