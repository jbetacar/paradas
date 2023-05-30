/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradas;

/**
 *
 * @author jbeta
 */
import java.util.Scanner;

public class Menu {

    int seleccion = 0;
    String paradasRegulares;
    private Scanner input = new Scanner(System.in);

    public void menu() {
        
    System.out.println("Bienvenido, selccione una opcion:");
    System.out.println("1) Consultar paradas por ruta. \n");
    System.out.println("2) Consultar paradas en festivos. \n");

    int seleccion = input.nextInt();
    input.nextLine();

    switch (seleccion) {

        case 1:
            consultarParadasRegulares();
        break;

        case 2:
            consultarParadasFestivos();
        break;

        default:
            System.out.println("Seleccione una opcion valida");
        break;

    }

    } 

    void consultarParadasRegulares() {
        System.out.println("Ingrese la ruta (solo números): ");
        String ruta = "";
        Scanner entradaEscaner = new Scanner (System.in);
        ruta = entradaEscaner.nextLine();
        System.out.println("El numero de ruta a consultar es: " + ruta);

        paradaRegular paradaRegular = new paradaRegular();
        paradasRegulares = paradaRegular.paradasRegulares(ruta);
        System.out.println("Las paradas de esta ruta son: " + paradasRegulares);

    } 

    void consultarParadasFestivos() {
        System.out.println("Las paradas en días festivos son: XXXXXXXX");
    } 
}
