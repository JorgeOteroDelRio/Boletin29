/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import javax.swing.JOptionPane;

/**
 *
 * @author jota
 */
public class Yate extends Barco{
    
    private int nCamarotes;
    private int potencia;
    
    Yate(String matricula,int nCamarotes,int potencia){
        super(matricula);
        this.nCamarotes=nCamarotes;
        this.potencia=potencia;
    }

    @Override
    void calcularAlquiler(int nDias, int eslora) {
        int modulo = eslora * 10 + nCamarotes + potencia;
        JOptionPane.showMessageDialog(null, "Matrícula: " + super.getMatricula() + "\nEslora: " + eslora + "m" + "\nPrecio: "
        + modulo*nDias + "€");
    }
}
