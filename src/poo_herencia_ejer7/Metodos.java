/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_herencia_ejer7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import static poo_herencia_ejer7.ordenar.ordenarPorPrecio;
//import static poo_herencia_ejer7.ordenar.ordenarPorPrecio;

/**
 *
 * @author User
 */
public class Metodos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    boolean gimnacio, Restaurante;
    String nombreRestaurante, nombre, direccion, localidad, gerente;
    int capacidadRestaurante, cantidadHabitaciones, numeroCamas, pisos,
            cantMaxCarpas, bañosDisponibles, cantSalonesConferencia, cantSuites, cantlimosinas;
    int preciohabitacion;
    private char tipoGimnacio;

    ArrayList<Hoteles> hotel = new ArrayList();

    ArrayList<ExtraHotel> hostal = new ArrayList();

    public void Alojamientos() {

        int opt;
        String respuesta;
        do {
            do {
                System.out.println("Bienvenido ");
                System.out.println("A su compañia de turismo");
                System.out.println("1. para ver todos los alojamientos disponibles");
                System.out.println(" 2.  para verlo del hotel mas caro a mas barato "
                        + "por precio de Habitacion");
                System.out.println(" 3. campings con restaurante");
                System.out.println(" 4. Residencias con Descuento");
                System.out.print("Opcion  ");
                opt = leer.nextInt();
            } while (opt < 1 || opt > 4);

            switch (opt) {
                case 1:
                    mostrarAlojamientos();
                    break;
                case 2:
                    ordenarPorPrecio_mayor_menor();
                    break;
                case 3:
                    mostrarCamping();
                    break;
                case 4:
                    mostrarResidencia();
                    break;

            }

            System.out.println("Desea realizar otra busqueda ");
            System.out.println("s/n");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("s"));
    }

    public void crearHoteles() {

        Hotel_4_Estrellas HotelCE = new Hotel_4_Estrellas(gimnacio, tipoGimnacio, nombreRestaurante,
                capacidadRestaurante, cantidadHabitaciones, numeroCamas, pisos, preciohabitacion,
                nombre, direccion, localidad, gerente);

        hotel.add(new Hotel_4_Estrellas(true, 'A', "ITALIANO", 200, 100, 100, 30, HotelCE.PrecioHabitacion(),
                "PALACE", "VIA AL MAR", "CARTAGENA", "ANDRES SUAREZ"));
        hotel.add(new Hotel_4_Estrellas(true, 'A', "FRANCES", 450, 130, 150, 70, HotelCE.PrecioHabitacion(),
                "CASTILLO", "VIA AL MAR", "SANTAMARTA", "CARLA GIRALDO"));

        hotel.add(new Hotel_4_Estrellas(true, 'A', "MEXICANO", 800, 100, 150, 26, HotelCE.PrecioHabitacion(),
                "HELICONIAS", "VIA AL MAR", "ARMENIA", "VIVIAN GARCIA"));

        Hotel_5_Estrellas HotelC = new Hotel_5_Estrellas(cantSalonesConferencia, cantSuites, cantlimosinas,
                gimnacio, tipoGimnacio, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones,
                numeroCamas, pisos, preciohabitacion, nombre, direccion, localidad, gerente);

        hotel.add(new Hotel_5_Estrellas(5, 20, 40, true, 'A', "ITALIANO", 200, 100, 150, 45, HotelC.PrecioHabitacion(),
                "PALACE", "VIA AL MAR", "BARRANQUILLA", "JORGE SUAREZ"));

        hotel.add(new Hotel_5_Estrellas(2, 40, 70, true, 'A', "ASADOS", 450, 360, 110, 30, HotelC.PrecioHabitacion(),
                "COSTA AZUL", "VIA AL MAR", "SAN ANDRES", "FELIPE SUAREZ"));

        hotel.add(new Hotel_5_Estrellas(7, 46, 60, true, 'A', "ASADOS", 400, 160, 180, 120, HotelC.PrecioHabitacion(),
                "ELARRIERO", "COLINA VERDE", "ANTIOQUIA", "JERONIMO CALDERON"));

    }

    public void crearExtraHoteles() {
        /// double preciohabitacion SETEADO EN  VALOR EN 0 
        /// MIENTRAS COLOCO EL METOD DEL PRECIO

        ///Camping(int cantMaxCarpas, int bañosDisponibles, boolean Restaurante, boolean tipoPrivado, 
        ///int espacioMt2, String nombre, String direccion, String localidad, String gerente)
        hostal.add(new Camping(200, 50, true, true, 2000, "CRISTALES", "VALLE DEL RIO", "LLANOS VIA MOTAÑA", "SANDRA SARMIENTO"));
        hostal.add(new Camping(300, 80, true, true, 1500, "EL REMANDO", "COCORA", "NEVADO", "CAROLINA  GOMEZ"));

//        Residencia(int cantHabitaciones, boolean descuentos, boolean campoDeportivo, 
//            boolean tipoPrivado, int espacioMt2, String nombre, String direccion, String localidad, String gerente)
        hostal.add(new Residencia(39, true, false, true, 3500, "villa julia", "via a las montañas",
                "barranca", "mari carmen"));
        hostal.add(new Residencia(79, false, true, true, 1500, "el retiro", "av. 45 ",
                "cucuta", "carlos marin"));

    }

    public void ordenarPorPrecio_mayor_menor() {

        System.out.println("Hoteles ordenados de  Mayor a menor Precio");
        System.out.println("**********************************");

        Collections.sort(hotel, ordenarPorPrecio);
        for (Hoteles hoteles : hotel) {
            System.out.println(hoteles);
            System.out.println("Precio " + hoteles.PrecioHabitacion());
            System.out.println("*************************************");
        }

    }

    public void mostrarCamping() {
        System.out.println("CAMPINGS CON RESTAURANTES");
        for (ExtraHotel camping : hostal) {
            if (camping.Restaurante() == true) {
                System.out.println("Campings con restaurantes" + camping.toString());
                System.out.println("*************************************");

            }

        }

    }

    public void mostrarResidencia() {
        System.out.println("RESIDENCIAS CON DESCUENTOS");
        for (ExtraHotel residencia : hostal) {
            if (residencia.Descuento() == true) {
                System.out.println("Residencia con Descuento" + residencia.toString());
                System.out.println("*************************************");

            }

        }

    }

    public void mostrarAlojamientos() {
        System.out.println("ALOJAMIENTOS HOTEL");
        for (Hoteles hoteles : hotel) {
            System.out.println("" + hoteles.getNombre());
            System.out.println("" + hoteles.toString());
            System.out.println("El precido de la habitacion Es: " + hoteles.PrecioHabitacion());
            System.out.println("*************************************");
        }

        System.out.println("ALOJAMIENTOS EXTRAHOTEL");
        for (ExtraHotel otro : hostal) {

            System.out.println("Campings con restaurantes" + otro.toString());
            System.out.println("*************************************");

        }

    }

}
