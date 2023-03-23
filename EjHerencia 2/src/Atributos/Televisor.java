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
public final class Televisor extends Electrodomesticos {

    protected int resolucion;
    protected boolean tdt;

    public Televisor() {

    }

    public Televisor(int resolucion, boolean tdt, String color, double precios, double peso, char consumo) {
        super(color, precios, peso, consumo);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in);
        crearElectrodomestico();
        System.out.println("ingrese las pulgadas del televisor");
        resolucion = leer.nextInt();
        System.out.println("ingrese si tiene sintonizador TDT. SI o NO");
        String tieneTDT;
        tieneTDT = leer.next();
        tdt = false;
        if ("SI".equalsIgnoreCase(tieneTDT)) {
            tdt = true;
        }
       // precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        double imp = 0, precio = 0;
        if (resolucion > 40) {

            imp = precios * 1.30;

        } else {
            imp = precios;
        }
        if (tdt == true) {

            precio = 500;

        } else {
             precio=0;
        }
        double total;
        total = precio + imp;
            precios=total;
        System.out.println("el precio final del televisor es de : " + precios);
    }
}
