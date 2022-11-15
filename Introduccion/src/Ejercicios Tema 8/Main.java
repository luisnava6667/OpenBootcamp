package EjerciciosTema8;

public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona();

        miPersona.setEdad(33);
        miPersona.setNombre("Luis Navarro");
        miPersona.setTelefono("541531496472");

        System.out.println("Nombre de la persona: " + miPersona.getNombre());
        System.out.println("Edad: " + miPersona.getEdad());
        System.out.println("Telefono: " + miPersona.getTelefono());
    }
}