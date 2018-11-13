import java.io.*;
public class Flujos5 {
	public static void main (String [] args) throws IOException {
		File fichero = new File("C:\\Users\\Jan\\Desktop\\test.txt");
		FileWriter fic = new FileWriter (fichero);
		String cadena = " Esto es una prueba con FileWriter";
		char [] cad = cadena.toCharArray() ;
		fic.write (cad); // se va escribiendo carácter a carácter
		fic.append ("*"); // añadimos un asterisco al final
		
		fic.close (); // cerramos fichero
}
}
