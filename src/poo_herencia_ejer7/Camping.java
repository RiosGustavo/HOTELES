/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_herencia_ejer7;

/**
 *
 * @author User
 */
public class Camping extends ExtraHotel{
    private int cantMaxCarpas;
    private int bañosDisponibles;
    private boolean Restaurante;

    public Camping(int cantMaxCarpas, int bañosDisponibles, boolean Restaurante, boolean tipoPrivado, 
            int espacioMt2, String nombre, String direccion, String localidad, String gerente) {
        super(tipoPrivado, espacioMt2, nombre, direccion, localidad, gerente);
        this.cantMaxCarpas = cantMaxCarpas;
        this.bañosDisponibles = bañosDisponibles;
        this.Restaurante = Restaurante;
    }

    public int getCantMaxCarpas() {
        return cantMaxCarpas;
    }

    public void setCantMaxCarpas(int cantMaxCarpas) {
        this.cantMaxCarpas = cantMaxCarpas;
    }

    public int getBañosDisponibles() {
        return bañosDisponibles;
    }

    public void setBañosDisponibles(int bañosDisponibles) {
        this.bañosDisponibles = bañosDisponibles;
    }

    public boolean isRestaurante() {
        return Restaurante;
    }

    public void setRestaurante(boolean Restaurante) {
        this.Restaurante = Restaurante;
    }
    
    @Override
     public boolean Restaurante(){
        
      
                
         
        return Restaurante;
        
    }

    @Override
    public String toString() {
        return "Camping{" + super.toString() + "\n cantMaxCarpas=" + cantMaxCarpas + "\n bañosDisponibles=" + bañosDisponibles + "\n Restaurante=" + Restaurante + '}';
    }
    
    
    
}
