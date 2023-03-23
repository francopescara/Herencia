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
public class Yate extends Barcos{
    protected int CV,camarotes;

    public Yate(int CV, int camarotes) {
        this.CV = CV;
        this.camarotes = camarotes;
    }

    public Yate(int CV, int camarotes, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.CV = CV;
        this.camarotes = camarotes;
    }

    public Yate() {
        
    }

    public  void crearYate(){
        crearBarco();
        camarotes=5;
        CV=500;
        
    }
    
}
