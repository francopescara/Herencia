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
public final class Lavadora extends Electrodomesticos {

    protected int carga;

    public Lavadora() {
    }

    public Lavadora(String color, double precios, double peso, char consumo) {
        super(color, precios, peso, consumo);
    }

    public void crearLavadora() {
        Scanner leer = new Scanner(System.in);
        crearElectrodomestico();
        System.out.println("cuanta carga");
        carga = leer.nextInt();
        //precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        double precio = 0, total;

        if (carga >= 30) {
            precio = 500;
        } else {
            precio = 0;
        }
        total = precios + precio;
        precios = total;
        System.out.println("el precio final de la lavadora es de : " + precios);
    }

}
