package peaje;
import java.util.Scanner;
public class Peaje {
    public void peaje() {
        //Defino objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //defino variable de salida
        float tarifa;
        //definir variable de entrada
        int tipo_vehiculo;

        System.out.println("****************************************");
	    System.out.println("            TIPO DE VEHICULO            ");
        System.out.println("****************************************");
        System.out.println(" 1) Turismo           ($500.00)         ");
        System.out.println(" 2) Autobus          ($3000.00)         ");
        System.out.println(" 3) Motocicleta      ($250.00)          ");
        System.out.println("****************************************");
        System.out.print("Introduzca el tipo de vehiculo (1-3): ");
        tipo_vehiculo = teclado.nextInt();
        switch (tipo_vehiculo) {
            case 1:
                tarifa = 500f;
                break;
            case 2:
                tarifa = 3000f;
                break;
            case 3:
                tarifa = 250f;
                break;
            default:
            tarifa = -1f;
                break;
        }
        System.out.println("Usted debe pagar una tarifa de: "+tarifa);
    }
}
