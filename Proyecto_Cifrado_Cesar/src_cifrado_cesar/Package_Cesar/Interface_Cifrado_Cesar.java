package Package_Cesar;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface Interface_Cifrado_Cesar
{
		void muestraFile(String archivo) throws FileNotFoundException, IOException;
		boolean EsPalabra(String archivo,String palabra) throws IOException;
		String encriptarTextoClaro(String textoClaro,int dezpl);
		String desencriptarTextoCifrado(String textoCifrado,int dezpl);
}
