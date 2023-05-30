/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradas;
import java.util.Scanner;

/**
 *
 * @author jbeta
 */
public class paradaRegular {


        String paradasRegulares;
        String paradasRegulares (String ruta) {
        int x = Integer.parseInt(ruta);
        if (x%2==0){
        paradasRegulares = "Portal Norte - Chicó - Chapinero - Centro Internacional";
        }
        else {
        paradasRegulares = "Suba - Calle 100 - Fontibon - Mordor1";
        }
        return paradasRegulares;
    }
 
    
}