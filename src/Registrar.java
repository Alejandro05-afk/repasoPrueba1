public class Registrar {
    //Declarar las variables
    private String nombre;
    private int numeroHabitaciones;
    //Metodo constructor
    public Registrar(String nombre, int numeroHabitaciones) {
        this.nombre = nombre;
        this.numeroHabitaciones = numeroHabitaciones;
    }
    //Set para modifica nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Set para modificar numero de habitaciones
    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }
    //Metodo para mostrar la informacion
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de habitaciones: " + numeroHabitaciones);
        System.out.println("---------------------------");
    }
    //Metodo para poner en null
    public void borrarDatos() {
        this.nombre = null;
        this.numeroHabitaciones = 0;
    }
}



