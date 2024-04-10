package incentivo;
/*Proposito: Determinar si un trabajador recibira incentivos, si este 
			 produce mas de 100 unidades a la semana
 Autor: Jorge Aguilar
 Fecha: 10/abril/2024
 */
import java.util.Scanner;

public class Incentivo {
    public void incentivo(){
        //crear objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //defino la variable de salida
        boolean tiene_incentivo;
        //definir variable de entrada
        short unidades;
        System.out.println("Proporcione unidades semanales producidas: ");
        unidades = teclado.nextShort();
        if (unidades>100) {
            tiene_incentivo = true;
        }
        else{
            tiene_incentivo= false;
        }
        System.out.println("Tiene incentivo "+tiene_incentivo);
        teclado.close();
        
    }

    
}