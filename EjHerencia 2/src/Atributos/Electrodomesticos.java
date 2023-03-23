/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atributos;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Electrodomesticos {

    protected String color;
    protected double precios, peso;
    protected char consumo;
    Scanner leer = new Scanner(System.in);

    public Electrodomesticos() {
    }

    public Electrodomesticos(String color, double precios, double peso, char consumo) {
        this.color = color;
        this.precios = precios;
        this.peso = peso;
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecios() {
        return precios;
    }

    public void setPrecios(double precios) {
        this.precios = precios;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "color=" + color + ", precios=" + precios + ", peso=" + peso + ", consumo=" + consumo + ", leer=" + leer + '}';
    }
    

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese color del electrodomestico");
        color = leer.next();
        System.out.println("ingrese peso del electrodomestico");
        peso = leer.nextDouble();
        System.out.println("ingrese la letra del consumo electrico");
        precios = 1000;
        String letra = leer.next();
        char michar = letra.charAt(0);
        consumo = michar;
        comprobarConsumoEnergetico(michar);
        comprobarColor();
    }

    public void comprobarConsumoEnergetico(char michar) {

        michar = Character.toUpperCase(consumo);

        /*public void comprobarCosumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);

        if ('A' == letra || 'B' == letra || 'C' == letra || 'D' == letra || 'E' == letra) {
            this.consumo = letra;
        } else {
            this.consumo = 'F';
        }
    }*/
        if (michar == 'A' || michar == 'B' || michar == 'C' || michar == 'D' || michar == 'E' || michar == 'F') {
            this.consumo = michar;

        } else {

            this.consumo = 'F';
        }

        System.out.println(michar);

    }

    public void comprobarColor() {
        if ("blanco".equalsIgnoreCase(color) || "negro".equalsIgnoreCase(color) || "rojo".equalsIgnoreCase(color) || "rojo".equalsIgnoreCase(color) || "azul".equalsIgnoreCase(color) || "gris".equalsIgnoreCase(color)) {

        } else {
            color = "blanco";
        }
        System.out.println(color);
    }

    public void precioFinal() {
        int impKG = 0;
        int imp = 0;
        //String letra = String.valueOf(r.getConsumo());
        if (peso >= 1 && peso <= 19) {
            impKG = 100;
        }
        if (peso >= 20 && peso <= 49) {
            impKG = 500;

        }
        if (peso >= 50 && peso <= 79) {
            impKG = 800;
        }
        if (peso >= 80) {
            impKG = 1000;
        }
        if (consumo == 'A') {
            imp = 1000;
        }
        if (consumo == 'B') {
            imp = 800;
        }
        if (consumo == 'C') {
            imp = 600;
        }
        if (consumo == 'D') {
            imp = 500;
        }
        if (consumo == 'E') {
            imp = 300;
        }
        if (consumo == 'F') {
            imp = 100;
        }
        double suma;
        suma = imp + impKG + precios;
        precios = suma;
        System.out.println("El precio final del electrodomistico es de : " + precios);
    }
}
