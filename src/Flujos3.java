import java.io.*;
import java.util.Scanner;
	public class Flujos3 {
		public static void main ( String [] args) throws IOException {
			
			System.out.println("introduce la ruta: ");
			Scanner read = new Scanner(System.in);
			String input = read.nextLine();
			
			File fichero = new File (input); // declaración fichero
			FileReader flu = new FileReader (fichero); // creamos flujo de entrada hacia el fichero
			
			char[] buf = new char[20];
			while ((flu.read(buf))!=-1) {	//Vamos leyendo carácter a carácter
				System.out.println(buf);
			}	//hacemos cast a char del entero leído
			flu.close();
	}
}