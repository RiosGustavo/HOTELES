/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_herencia_ejer7;

import java.util.Comparator;

/**
 *
 * @author User
 */
public class ordenar {
    

    public static Comparator<Hoteles> ordenarPorPrecio = new Comparator<Hoteles>(){

        @Override
        public int compare (Hoteles h1, Hoteles h2) {
            
           
            return new Integer(h2.getPreciohabitacion()).compareTo(new Integer(h1.getPreciohabitacion()));
                    
         
            
        }

    };
}
