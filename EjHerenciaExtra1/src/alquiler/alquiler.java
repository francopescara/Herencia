/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquiler;

import Barcos.Barcos;
import Barcos.Yate;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class alquiler extends Barcos {
    private String nombre,barco;
    private Integer DNI,fechaAlq,fechaDev,posAmarre;
    private Barcos barcos;
    public alquiler() {
    }

    public alquiler(int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
    }

    public alquiler(String nombre, String barco, Integer DNI, Integer fechaAlq, Integer fechaDev, Integer posAmarre) {
        this.nombre = nombre;
        this.barco = barco;
        this.DNI = DNI;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.posAmarre = posAmarre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarco() {
        return barco;
    }

    public void setBarco(String barco) {
        this.barco = barco;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(Integer fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public Integer getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(Integer fechaDev) {
        this.fechaDev = fechaDev;
    }

    public Integer getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(Integer posAmarre) {
        this.posAmarre = posAmarre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    

   
    ////METODOS
    /*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).*/
    public void alquiler(){
         Scanner leer=new Scanner(System.in);
        //alquiler a = new alquiler();
        Barcos b=new Barcos();
        Barcos y=new Yate();
        System.out.println("ingrese su nombre");
        nombre=leer.next();
        System.out.println("ingrese su DNI");
        a.setDNI(leer.nextInt());
        System.out.println("ingrese fecha de alquiler");
        a.setFechaAlq(leer.nextInt());
        System.out.println("ingrese fecha de devolucion");
        a.setFechaDev(leer.nextInt());
        System.out.println("ingrese posicion del amarre");
        a.setPosAmarre(leer.nextInt());
        System.out.println("ingrese el barco q  ocupara");
        y.crearBarco();
        a.alquiler();
        crearBarco();
        int calculo;
        calculo=(fechaDev-fechaAlq)*(eslora*10);
        System.out.println(calculo);
    }
}
