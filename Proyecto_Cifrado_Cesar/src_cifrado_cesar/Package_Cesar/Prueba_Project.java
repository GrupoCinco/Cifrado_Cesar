package Package_Cesar;
import java.util.Scanner;
import java.io.IOException;

public class Prueba_Project {

	public static void main(String[] args) throws IOException {
//		Scanner teclado =new Scanner(System.in);
//		String archivo=("/Users/Brian/Documents/GitHub/Paradigmas-y-Lenguajes/Proyecto-Cesar/words.txt");
//		Cls_Project_Cesar cod_c = new Cls_Project_Cesar();
//		String palabra;
//		System.out.println("Ingrese una Palabra :");
//		palabra=teclado.next();
//		if(palabra.contains(" !@#$%^&*()-_+={}[]|\\:;'<>?,./\"")){
//			System.out.println("Palabra con caracteres NO validos ");
//		}
//		
//	
//		if(cod_c.EsPalabra(archivo,palabra)){
//			System.out.println("Palabra Valida");
//		}
//		else{
//			System.out.println("Palabra NO  Valida");
//			
//		}
		Cls_Project_Cesar cod_c = new Cls_Project_Cesar();
		String texto=cod_c.encriptarTextoClaro("HOLA MUNDO",5);
		System.out.println("Texto a Encriptar :"+texto);
		System.out.println(cod_c.desencriptarTextoCifrado(texto,5));
		

	}

}
