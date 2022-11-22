/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_herencia_ejer7;

/**
 *
 * @author User
 */
public abstract class Hoteles extends Alojamiento{
    private int cantidadHabitaciones;
    private int numeroCamas;
    private int pisos;
    private int preciohabitacion;

    public Hoteles(int cantidadHabitaciones, int numeroCamas, int pisos, int preciohabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.pisos = pisos;
        this.preciohabitacion = preciohabitacion;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPreciohabitacion() {
        return preciohabitacion;
    }

    public void setPreciohabitacion(int preciohabitacion) {
        this.preciohabitacion = preciohabitacion;
    }

    public int capacidadHotel(){
        
        return pisos*cantidadHabitaciones*numeroCamas;
        
    }
    
    public  int PrecioHabitacion(){
        
        return preciohabitacion;
        
    }
    
    @Override
    public String toString() {
        return "Hotel{\n" + super.toString()+ "\n cantidadHabitaciones=" + cantidadHabitaciones + "\n numeroCamas=" + numeroCamas + "\n pisos=" + pisos +  '}';
    }
    
    
    
}
