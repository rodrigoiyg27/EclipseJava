package problema1;

public class Persona {
	private String nombre;
    public Persona() {
        this.nombre = "";
    }
    public void setNombre(String nombre) throws Excepciones {
        if (nombre.matches(".*\\d.*")) {  // Verifica si el nombre contiene números
            throw new Excepciones();
        }
        this.nombre = nombre;
    }
}
