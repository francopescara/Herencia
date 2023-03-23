/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributos;

import newpackage.interfaces.calculosFormas;

/**
 *
 * @author franco
 */
public class rectangulo implements calculosFormas{
    public double base,altura;
    public rectangulo() {
    }

    @Override
    public int area() {
        //Área rectángulo: base * altura
        double area;
        area=base*altura;
        return (int) area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public int perimetro() {
       //Perímetro rectángulo: (base + altura) * 2.
       double perimetro;
       perimetro=(base+altura)*2;
       return (int) perimetro;
    }

   
    
}
