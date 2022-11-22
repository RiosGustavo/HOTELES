/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_herencia_ejer7;

/**
 *
 * @author User
 */
public class Residencia extends ExtraHotel {
    private int cantHabitaciones;
    private boolean descuentos;
    private boolean campoDeportivo;

    public Residencia(int cantHabitaciones, boolean descuentos, boolean campoDeportivo, 
            boolean tipoPrivado, int espacioMt2, String nombre, String direccion, String localidad, String gerente) {
        super(tipoPrivado, espacioMt2, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    
    
    @Override
    public boolean Descuento(){
        
         return descuentos;
    }

    @Override
    public String toString() {
        return "Redidencia{" + super.toString() + "\n cantHabitaciones=" + cantHabitaciones + "\n Descuentos Para empresas=" + descuentos + "\n campoDeportivo=" + campoDeportivo + '}';
    }
    
    
    
    
    
}
