import java.io.*;
	public class Flujos2 {
		public static void main ( String [] args) throws IOException {
			File fichero = new File ("C:\\Users\\Jan\\Desktop\\test.txt"); // declaraci�n fichero
			FileReader flu = new FileReader (fichero); // creamos flujo de entrada hacia el fichero
			
			char[] buf = new char[20];
			while ((flu.read(buf))!=-1) {	//Vamos leyendo car�cter a car�cter
				System.out.println(buf);
			}	//hacemos cast a char del entero le�do
			flu.close();
	}
}