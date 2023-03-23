/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barcos;

/**
 *
 * @author franco
 */
public class Barcos {
    protected int matricula,eslora,añoFabricacion;

    public Barcos() {
    }

    public Barcos(int matricula, int eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    public void crearBarco(){
        
        eslora=1000;
        añoFabricacion=1994;
        matricula=12563;
    }
}
