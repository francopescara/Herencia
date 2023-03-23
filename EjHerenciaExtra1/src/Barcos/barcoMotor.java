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
public class barcoMotor extends Barcos{
    protected int potenciaCV;

    public barcoMotor(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public barcoMotor(int potenciaCV, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = potenciaCV;
    }

   public void crearbarcoMotor(){
       crearBarco();
       potenciaCV=600;
   }
    
}
