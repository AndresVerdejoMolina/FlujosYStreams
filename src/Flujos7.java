import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Flujos7 {

public static void main(String[]args) throws IOException{

    FileReader in = new FileReader("C:\\Users\\Jan\\Desktop\\test.txt");
    BufferedReader br = new BufferedReader(in);

    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
    in.close();

}
}