package mx.edu.utng.aherrera.modelo.MODELO;

import java.util.Date;

/**
 * Nombre Clase: Administrador
 * Creado por: Aherrera on 14/02/2018.
 */

public class Administrador extends Usuario {
    private String rfc;
    private String noEmpleado;
    public Administrador(String nombre, String apellidoPaterno, String apellidoMaterno, String curp, int edad, String direccion, String ciudad, String pais, String email) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp, edad, direccion, ciudad, pais, email);
    }

    public Administrador(String nombre, String apellidoPaterno, String apellidoMaterno, String curp, int edad, String direccion, String ciudad, String pais, String email, String rfc, String noEmpleado) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp, edad, direccion, ciudad, pais, email);
        this.rfc = rfc;
        this.noEmpleado = noEmpleado;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNoEmpleado() {
        return noEmpleado;
    }

    public void setNoEmpleado(String noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    public static void generarTarjeta (){
        //Genera el numero de tarjeta para ser otorgado al automovilista
        System.out.println("Metodo generarTarjeta");
    }

    public static int getTotalVehiculos (Date fechaInicial, Date fechaFinal){
        // Muestra el total de vehículos en un rango de fechas dadas
        System.out.println("Metodo getTotalVehiculos");
        return 0;
    }

    public static int getAutosHoraPico (Date fecha){
        //Muestra el total de autos durante las horas mas concurridas
        //de un día dado
        System.out.println("Metodo getAutosHoraPico");
        return 0;
    }

    public static int getTotalVehiculosTipo (Date fecha, String tipoVehiculo){
        //Muestra el total de vehículos por tipo en un día dado
        System.out.println("Metodo getTotalVehiculosTipo");
        return 0;
    }

    public static String getDatosVehiculo (String placa, String motor, String NombreAutomovilista){
        //Muestra los datos del vehiculo dada la placa, motor o nombre del automovilista
        System.out.println("Metodo getDatosVehiculo");
        return null;
    }
}
