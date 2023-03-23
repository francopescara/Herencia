/*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package newpackage;

import atributos.circulo;
import atributos.rectangulo;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        circulo c = new circulo();
        rectangulo r = new rectangulo();
        System.out.println("ingrese el radio del ciruclo");
        c.setRadio(leer.nextInt());
        System.out.println("ingrese el diametro del circulo");
        c.setDiametro(leer.nextInt());
        System.out.println("ingrese la base del rectangulo");
        r.setBase(leer.nextInt());
        System.out.println("ingrese la altura del rectangulo");
        r.setAltura(leer.nextInt());
        System.out.println("el area del circulo es : "+c.area());
        System.out.println("el perimetro del circulo es :"+ c.perimetro());
        System.out.println("el area del rectangulo es :"+r.area());
        System.out.println("el perimetro del rectangulo es : "+r.perimetro());
        
        
        
        
    }

}
