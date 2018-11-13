import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Flujos9 {
	public static void main ( String [] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Jan\\Desktop\\test.txt"));
	 
		for (int i = 0; i < 10; i++) {
			pw.println("jeje");
		}
	 
		pw.close();
	}
}
