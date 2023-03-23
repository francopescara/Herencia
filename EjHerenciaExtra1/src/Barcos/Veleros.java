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
public class Veleros extends Barcos{
    protected int veleros;

    public Veleros(int veleros) {
        this.veleros = veleros;
    }

    public Veleros(int veleros, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.veleros = veleros;
    }
    public void crearVeleros(){
         crearBarco();
         veleros=4;
    }
    
}
