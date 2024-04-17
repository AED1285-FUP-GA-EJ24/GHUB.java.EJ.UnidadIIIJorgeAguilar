package vocal;
import java.util.Scanner;
public class Vocal {
    public void vocal(){
        //Creamos objeto Scanner
        Scanner entrada = new Scanner(System.in);
        //definir variable de entrada
        char voc;
        System.out.println("Introduce una vocal: ");
        voc = entrada.next().charAt(0);
        switch (voc) {
            case 'a':
                System.out.println("1");
                break;
            case 'e':
                System.out.println("2");
                break;
            case 'i':
                System.out.println("3");
                break;
            case 'o':
                System.out.println("4");
                break;
            case 'u':
                System.out.println("5");
                break;
            default:
                System.out.println("Caracter Invalido");
                break;
        }
        entrada.close();
    }   

}
