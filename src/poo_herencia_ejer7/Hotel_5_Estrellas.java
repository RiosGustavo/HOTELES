/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_herencia_ejer7;

/**
 *
 * @author User
 */
public class Hotel_5_Estrellas extends Hotel_4_Estrellas {

    private int cantSalonesConferencia;
    private int cantSuites;
    private int cantlimosinas;

    public Hotel_5_Estrellas(int cantSalonesConferencia, int cantSuites, int cantlimosinas, boolean gimnacio, 
            char tipoGimnacio, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones,
            int numeroCamas, int pisos, int preciohabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimnacio, tipoGimnacio, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, numeroCamas, pisos, preciohabitacion, nombre, direccion, localidad, gerente);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantlimosinas = cantlimosinas;
    }

    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(int cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantlimosinas() {
        return cantlimosinas;
    }

    public void setCantlimosinas(int cantlimosinas) {
        this.cantlimosinas = cantlimosinas;
    }

    public int valorAgregadoLimosinas() {

        return 15 * cantlimosinas;

    }
    
    @Override
     public int PrecioHabitacion(){
         
          
         
        return 50+(1*super.capacidadHotel()+valorAgregadoRestaurante()+valorAgregadoGimnacio()+valorAgregadoLimosinas());
         
     }

    @Override
    public String toString() {
        return "Hotel_5_Estrellas{" + super.toString() + "\n cantSalonesConferencia=" + cantSalonesConferencia + "\n cantSuites=" + cantSuites + "\n cantlimosinas=" + cantlimosinas + '}';
    }

}
