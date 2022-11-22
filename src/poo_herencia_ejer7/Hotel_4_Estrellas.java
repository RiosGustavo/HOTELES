/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_herencia_ejer7;

/**
 *
 * @author User
 */
public class Hotel_4_Estrellas extends Hoteles {

    private boolean gimnacio;
    private char tipoGimnacio;
    private String nombreRestaurante;
    private int capacidadRestaurante;

    public Hotel_4_Estrellas(boolean gimnacio, char tipoGimnacio, String nombreRestaurante,
            int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int pisos, 
            int preciohabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, pisos, preciohabitacion, nombre, direccion, localidad, gerente);
        this.gimnacio = gimnacio;
        this.tipoGimnacio = tipoGimnacio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public boolean isGimnacio() {
        return gimnacio;
    }

    public void setGimnacio(boolean gimnacio) {
        this.gimnacio = gimnacio;
    }

    public char getTipoGimnacio() {
        return tipoGimnacio;
    }

    public void setTipoGimnacio(char tipoGimnacio) {
        this.tipoGimnacio = tipoGimnacio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public int valorAgregadoRestaurante() {
        int valor1= 0;

        if (capacidadRestaurante < 30) {
            valor1 = 10;
        }
        if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            valor1 = 30;
        }
        if (capacidadRestaurante > 50) {
            valor1 = 50;
        }

        return valor1;

    }

    public int valorAgregadoGimnacio() {
        int valor2 = 0;

        if (tipoGimnacio == 'A') {
            valor2 = 50;
        }
        if (tipoGimnacio == 'B') {
            valor2 = 30;
        }

        return valor2;

    }

    @Override
    public int PrecioHabitacion() {
       

        return 50+(1*super.capacidadHotel()+valorAgregadoRestaurante()+valorAgregadoGimnacio());

    }

    @Override
    public String toString() {
        return """
               Hotel_4_Estrellas{
               gimnacio=""" + super.toString() +"\n Tiene Gimnacio=" + gimnacio + "\n tipoGimnacio=" + tipoGimnacio + "\n nombreRestaurante=" + nombreRestaurante + "\n capacidadRestaurante=" + capacidadRestaurante + '}';
    }

}
