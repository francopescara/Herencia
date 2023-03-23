/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributos;

/**
 *
 * @author franco
 */
public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }

   

    

    
    @Override
    public void Alimentarse(){
        
        
        super.Alimentarse();
        System.out.println(alimento);
    }
}
