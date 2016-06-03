/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;

/**
 *
 * @author jota
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList();
        barcos.add(new Velero("nrngrd",5));
        barcos.add(new Yate("bfdbfdfhrt",3,50));
        barcos.add(new EmbarcacionDeportiva("nvrngireg",100));
        for(Barco b:barcos){
            b.calcularAlquiler(5, 100);
        }
    }
    
}
