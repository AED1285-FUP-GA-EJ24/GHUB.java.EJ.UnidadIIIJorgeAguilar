//Proposito: Convertir un numero arabigo del 1 al 10 
//			en Romano I -1 2-II 3-III 4-IV 5-V
//						6-VI 7-VII 8-VIII 9-IX 10-X
//Autor: Jorge Aguilar
//Fecha 16/abr/2024
package romano;
import java.util.Scanner;
public class Romano {
    public void romano(){
        //Definir objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //Definir variable de salida
        String roma;
        //Definir variable de entrada
        short ara;
        System.out.println("Proporciona número arábigo(1-10): ");
        ara = teclado.nextShort();
        switch (ara) {
            case 1:
                roma ="I";
                break;
            case 2:
                roma ="II";
                break;
            case 3:
                roma ="III";
                break;
            case 4:
                roma ="IV";
                break;
            case 5:
                roma ="V";
                break;
            case 6:
                roma ="VI";
                break;
            case 7:
                roma ="VII";
                break;
            case 8:
                roma ="VIII";
                break;
            case 9:
                roma ="IX";
                break;
            case 10:
                roma ="X";
                break;
            default:
                roma = "Valor Invalido";
                break;
        }
        System.out.println("Romano = "+roma);
    }
}
