/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;
/**
 *
 * @author jota
 */
public abstract class Barco {
    
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    Barco(String matricula){
        this.matricula=matricula;
    }
    
    abstract void calcularAlquiler(int nDias, int slora);
    
}
