import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Flujos6 {
	public static void main (String [] args) throws IOException {
		File fichero = new File("C:\\Users\\Jan\\Desktop\\test.txt");
		FileWriter fic = new FileWriter (fichero);
		String prov[] = {"Albacete", "Avila", "Badajoz", "Caceres", "Huelva", "Jaen",
				"Madrid", "Segovia", "Soria", "Toledo", "Valladolid", "Zamora"};
		for (int i=0; i < prov.length; i++) {
			fic.write (prov[i]);
			fic.append ("*");
		}
		fic.close ();
}
}
