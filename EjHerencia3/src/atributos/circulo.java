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
public class circulo  implements calculosFormas{
    public double radio,diametro;
    public circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public int area() {
        //Área circulo: PI * radio ^ 2
        double area;
        area=Math.PI*Math.pow(radio, 2);
        return (int) area;
    }

    @Override
    public int perimetro() {
        //Perímetro circulo: PI * diámetro.
        double perimetro;
        perimetro=Math.PI*diametro;
        return (int) perimetro;
    }

    
}
