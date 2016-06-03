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
public class Velero extends Barco{
    
    private int nMastiles;

    public Velero(String matricula,int nMastiles) {
        super(matricula);
        this.nMastiles=nMastiles;
    }

    @Override
    void calcularAlquiler(int nDias, int eslora) {
        int modulo = eslora * 10 + nMastiles;
        JOptionPane.showMessageDialog(null, "Matrícula: " + super.getMatricula() + "\nEslora: " + eslora + "m" + "\nPrecio: "
        + modulo*nDias + "€");
    }
}
