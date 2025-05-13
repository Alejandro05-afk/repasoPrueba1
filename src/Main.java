public class Main {
    public static void main(String[] args) {
        //instanciar la clase (5 objetos)
        Registrar hotel1 = new Registrar("Love",20);
        Registrar hotel2 = new Registrar("Quito",50);
        Registrar hotel3 = new Registrar("Colon",26);
        Registrar hotel4 = new Registrar("Delfin",31);
        Registrar hotel5 = new Registrar("Naranjal",10);

        // Usar SETTERS para modificar los valores
        hotel1.setNombre("Love love");
        hotel1.setNumeroHabitaciones(32);
        // Imprimir todos los objetos
        System.out.print("Lista de hoteles");
        hotel1.mostrarInfo();
        hotel2.mostrarInfo();
        // c. Poner valores null y 0 con método borrarDatos()
        hotel3.borrarDatos();
        hotel4.borrarDatos();
        hotel5.borrarDatos();
        hotel3.mostrarInfo();
        hotel4.mostrarInfo();
        hotel5.mostrarInfo();


        //Instanciar la clase con valores nulos
        /*Registrar hotel6 = new Registrar();
        Registrar hotel7 = new Registrar();

        //Usar set ara modificar los valores
        hotel6.setNombre("California");
        hotel6.setHabitaciones(28);
        hotel7.setNombre("Stark");
        hotel7.setHabitaciones(1000);
        //Imprimir los valores modificados con set
        hotel6.mostrarInfo();
        hotel7.mostrarInfo();*/


    }
}