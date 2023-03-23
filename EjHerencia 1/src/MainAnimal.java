
import atributos.Animal;
import atributos.Gato;
import atributos.Perro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franco
 */
public class MainAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro1=new Perro("coco", "carnivoro", "callejero", 10);
        System.out.println(perro1);
        perro1.Alimentarse();
        Animal gato1=new Gato("mimir", "kennel", "comun", 5);
        System.out.println(gato1);
        gato1.Alimentarse();
        
    }
    
}
