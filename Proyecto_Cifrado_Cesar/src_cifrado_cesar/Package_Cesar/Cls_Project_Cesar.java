package Package_Cesar;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase donde se implementa el Encriptado Cesar
 * @author 
 *
 */

public class Cls_Project_Cesar implements Interface_Cifrado_Cesar{
		public char array[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M'
				      ,'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		Cls_Project_Cesar()
		{
		}
		
		private char getTextoCifrado(char parTextoClaro,int dezpl)
		{
        		int indiceX = 0;
        		for (int i = 0; i < array.length; i++)
			{
        			if (parTextoClaro ==array[i]) {
        			indiceX = i;
        			break;
            			}
        		}
		 return array[(indiceX + dezpl) % 27];
		}
		
		private char getTextoClaro(char parTextoCifrado,int dezpl)
		{
        		int indiceX = 0;
        		for (int i = 0; i < array.length; i++)
			{
            			if (parTextoCifrado == array[i]){
                			indiceX = i;
                			break;
            			}
        		}
        		return array[(indiceX +(27-dezpl)) % 27];
		}
		
		public String encriptarTextoClaro(String textoClaro,int dezpl)
		{
	        	String textoCifrado = "";
	        	for(int i=0; i<textoClaro.length(); i++)
	        	{
	            		if(textoClaro.charAt(i) != ' ')
	                	textoCifrado += this.getTextoCifrado(textoClaro.charAt(i),dezpl)+"";
	        	else
	                	textoCifrado += " ";
	        	}
	        	return textoCifrado;
		} 
		
		public String desencriptarTextoCifrado(String textoCifrado,int dezpl)
		{
			 String textoClaro = "";
	        	 for(int i=0; i<textoCifrado.length(); i++){
	            		if(textoCifrado.charAt(i) != ' ')
	                	textoClaro += this.getTextoClaro(textoCifrado.charAt(i),dezpl)+"";
	            	 else
	                	textoClaro += " ";
	        	 }
	        	return textoClaro;
	    	}    
		
		public void muestraFile(String archivo) throws FileNotFoundException, IOException
		{
			String cadena;
			FileReader f = new FileReader(archivo);
			BufferedReader b = new BufferedReader(f);
			while((cadena = b.readLine())!=null)
			{
        		 System.out.println(cadena);
			}
			b.close();
		}
		
		public boolean EsPalabra(String archivo,String palabra) throws IOException
		{
			/** 
		  	Determina si una palabra es valida
		  	archivo: archivo file que contiene lista de las palabras en el diccionario(Español).
  		  	palabras: una posible palabra.
          	retorna Verdadero si la palabra está en la lista.
			 **/
			String cadena;
			palabra=palabra.toLowerCase();
	        FileReader f = new FileReader(archivo);//Para poder leer el archivo file
	        BufferedReader b = new BufferedReader(f);//Lee texto de una entrada de caracteres.
	        while((cadena = b.readLine())!=null)
	        {
	            if(cadena.equals(palabra)){
	            	return true;}
	        }
	        b.close();
	        return false;
		 }
		


}
