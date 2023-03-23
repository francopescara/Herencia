/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Atributos.Electrodomesticos;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class servicioelectro {

    Scanner leer = new Scanner(System.in);

    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
    private void comprobarConsumoEnergetico(Electrodomesticos r) {
        String consumo = String.valueOf(r.getConsumo());
        if ("A".equalsIgnoreCase(consumo) || "B".equalsIgnoreCase(consumo) || "C".equalsIgnoreCase(consumo) || "D".equalsIgnoreCase(consumo) || "E".equalsIgnoreCase(consumo) || "F".equalsIgnoreCase(consumo)) {

        } else {
            String letra = "F";
            char c = letra.charAt(0);
            r.setConsumo(c);
        }
        System.out.println(r.getConsumo());
    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    private void comprobarColor(Electrodomesticos r) {
        if ("blanco".equalsIgnoreCase(r.getColor()) || "negro".equalsIgnoreCase(r.getColor())) {

        } else {
            r.setColor("blanco");
        }
        System.out.println(r.getColor());
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    public Electrodomesticos crearElectrodomestico() {
        Electrodomesticos r = new Electrodomesticos() {
            @Override
            public void crearElectrodomestico() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        System.out.println("ingrese color del electrodomestico");
        r.setColor(leer.next());
        r.setPrecios(1000);
        comprobarColor(r);

        System.out.println("ingrese peso del electrodomestico");
        r.setPeso(leer.nextInt());
        System.out.println("ingrese la letra del consumo electrico");
        String letra = leer.next();
        char michar = letra.charAt(0);
        r.setConsumo(michar);
        comprobarConsumoEnergetico(r);
        return r;
    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
    LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
     */
    public void precioFinal(Electrodomesticos r) {
        int impKG = 0;
        int imp=0;
        String letra=String.valueOf(r.getConsumo());
        if (r.getPeso() >= 1 && r.getPeso() <= 19) {
            impKG = 100;
        }
        if (r.getPeso() >= 20 && r.getPeso() <= 49) {
            impKG = 500;

        }
        if (r.getPeso() >= 50 && r.getPeso() <= 79) {
            impKG = 800;
        }
        if (r.getPeso() >= 80) {
            impKG = 1000;
        }
        if(letra.equalsIgnoreCase("A")){
            imp=1000;
        }
        if(letra.equalsIgnoreCase("B")){
            imp=800;
        }
        if(letra.equalsIgnoreCase("C")){
            imp=600;
        }
        if(letra.equalsIgnoreCase("D")){
            imp=500;
        }
        if(letra.equalsIgnoreCase("E")){
            imp=300;
        }
        if(letra.equalsIgnoreCase("F")){
            imp=100;
        }
        int suma;
        suma=imp+impKG;
        System.out.println("El precio final del electrodomistico es de : "+suma);
    }
}
