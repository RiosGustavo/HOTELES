/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_herencia_ejer7;

/**
 *
 * @author User
 */
public class ExtraHotel extends Alojamiento {
    
    private boolean tipoPrivado;
    private int espacioMt2;

    public ExtraHotel(boolean tipoPrivado, int espacioMt2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.tipoPrivado = tipoPrivado;
        this.espacioMt2 = espacioMt2;
    }

    public boolean isTipoPrivado() {
        return tipoPrivado;
    }

    public void setTipoPrivado(boolean tipoPrivado) {
        this.tipoPrivado = tipoPrivado;
    }

    public int getEspacioMt2() {
        return espacioMt2;
    }

    public void setEspacioMt2(int espacioMt2) {
        this.espacioMt2 = espacioMt2;
    }
    
    public boolean Restaurante(){
        
        return false;
        
    }
    
   
    public boolean Descuento(){
        
         return false;
    }

    @Override
    public String toString() {
        return "ExtraHotel{\n " + super.toString()+"\n tipoPrivado=" + tipoPrivado + "\n espacioMt2=" + espacioMt2 + '}';
    }
    
    
    
}
