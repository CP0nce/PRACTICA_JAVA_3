import java.util.Scanner;

public class menu extends CajeroAutomatico{
    public static void main(String[] args) {
        System.out.println("Bienvenido a la tercera actividad de Java");
        Scanner s = new Scanner(System.in);
        boolean salir = false;
        int opcion;


        while (!salir){
        mostrarCajero(); 
        System.out.println ("1-Sacar dinero");
        System.out.println("0-Cerrar programa");
        System.out.println("Selecciona una opción");

        opcion = s.nextInt();

        switch(opcion) {
            case 1 :
                System.out.println("Has elegido sacar dinero");
                sacarDinero();
            case 2 :
                System.out.println("Adiós");
                salir = true; 
                break;
            default:
                System.out.println("Porfavor elige una de las dos opciones validas");
            }
        }

        int[] carga_billetes = {[500, 1], [200, 3], [100, 0], [50, 0], [20, 0}, [10, 18], [5, 25]};
        CajeroAutomatico micajero = new CajeroAutomatico();
        micajero.setBilletes (carga_billetes);
        TarjetaDebito mitarj1 = new TarjetaDebito("12345678a", 1111, "Fran", "Fran", 20000);
        TarjetaCredito mitarj2 = new TarjetaCredito("87654321b", 2222, "Javi", "Javi", 1000, 5000);
        micajero.getListaTarjeta().add(mitarj1);
        micajero.getListaTarjeta().add(mitarj2);


    }

    private static void mostrarCajero(){
        //!!!!!!!!!!!!!!!!!!!

    }

    private static void sacarDinero(){


    }
}