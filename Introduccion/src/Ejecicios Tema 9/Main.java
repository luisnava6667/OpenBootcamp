package EjerciciosTema9;

public class Main {
    public static void main(String[] args) {
        Cliente myCliente = new Cliente();

        myCliente.setNombre(" Luis Navarro");
        myCliente.setEdad(33);
        myCliente.setTelefono("541531496472");
        myCliente.setCredito(3360.78);

        System.out.println("El cliente es:");
        System.out.println("Nombre: " + myCliente.getNombre());
        System.out.println("Edad: " + myCliente.getEdad());
        System.out.println("Telefono: " + myCliente.getTelefono());
        System.out.println("El credito es: " + myCliente.getCredito());

        Trabajador myTrabajador = new Trabajador();
        myTrabajador.setNombre(" Luis");
        myTrabajador.setEdad(33);
        myTrabajador.setTelefono("541531496472");
        myTrabajador.setSalario(4000.78);

        System.out.println("\n El trabajador es:");
        System.out.println("Nombre: " + myTrabajador.getNombre());
        System.out.println("Edad: " + myTrabajador.getEdad());
        System.out.println("Telefono: " + myTrabajador.getTelefono());
        System.out.println("El salario es: " + myTrabajador.getSalario() + " al mes");
    }
}