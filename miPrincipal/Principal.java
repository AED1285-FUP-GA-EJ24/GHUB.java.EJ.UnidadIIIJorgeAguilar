package miPrincipal;


import ine.Ine;

import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("****************************************");
	    System.out.println("            MENU DE OPCIONES            ");
        System.out.println("****************************************");
        System.out.println(" 1) Calcular Edad para INE              ");
        System.out.println(" 2) Hermano Mayor                       ");
        System.out.println(" 3) Incentivos de Unidades Producidas   ");
        System.out.println(" 4) Determinar mayor de 3 Números       ");
        System.out.println(" 5) Tipo de Triángulo                   ");
        System.out.println(" 6) Convertir Arábigo a Romano          ");
        System.out.println(" 7) Covertir Caracter a Vocal           ");
        System.out.println(" 8) Menor, Igual o Mayor de 3           ");
        System.out.println(" 9) Determinar Tipo de Calificacion     ");
        System.out.println(" 10) Seleccionar Tipo Tarifa            ");
        System.out.println("****************************************");
        System.out.print("Seleccione Opcion: ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1: 
            Ine objIne = new Ine();
            objIne.determinarSiIne(); 
            break;
            case 2: 
                
                break;
            case 3: 
                
                break;
            case 4: 
                
                break;
            case 5: 
                
                break;
            case 6: 
                
                break;
            case 7: 
                
                break;
            case 8: 
                
                break;
            case 9: 
                
                break;
            case 10: 
                
                break;
            default:
                break;
        }

    }
}