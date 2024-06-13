package problema1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String nombre;
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        Persona persona = new Persona();

	        try {
	            System.out.print("Ingrese su nombre: ");

	            nombre = reader.readLine();
	            persona.setNombre(nombre);
	        } catch (Excepciones e) {
	            System.err.println("Error: " + e.getMessage());
	        }
	        catch (IOException e) {
	            System.err.println("Error de entrada/salida: " + e.getMessage());

	        }
	    }
	}


