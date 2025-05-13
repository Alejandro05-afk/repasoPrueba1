public class registrarHoteles {
    public String nombre;
    public int numeroHabitaciones;

    public void registrarHoteles(String nombre, int numeroHabitaciones){
        this.nombre = nombre;
        this.numeroHabitaciones = numeroHabitaciones;

    }
    public void mostrarInfo(){
        System.out.print("\nNombre: "+ nombre);
        System.out.print("\nNumero de habitaciones: "+ numeroHabitaciones);
    }
}


