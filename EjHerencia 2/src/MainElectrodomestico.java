
import Atributos.Electrodomesticos;
import Atributos.Lavadora;
import Atributos.Televisor;
import java.util.ArrayList;
import servicios.servicioelectro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author franco
 */
public class MainElectrodomestico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //servicioelectro se=new servicioelectro();
        //Electrodomesticos r=se.crearElectrodomestico();
        //se.precioFinal(r);
        ArrayList<Electrodomesticos> electro = new ArrayList();
        Electrodomesticos r = new Electrodomesticos();
        Lavadora l = new Lavadora();

        Televisor t = new Televisor();

        t.crearTelevisor();
        l.crearLavadora();
        electro.add(l);
        electro.add(t);
        double total = 0;
        for (Electrodomesticos aux : electro) {
            aux.precioFinal();
            total+=aux.getPrecios();

        }
        System.out.println(total);
    }

    // r.crearElectrodomestico();
}


