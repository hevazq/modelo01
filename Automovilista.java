package mx.edu.utng.aherrera.modelo.MODELO;

/**
 * Nombre Clase: Automovilista
 * Creado por: Aherrera on 14/02/2018.
 */

public class Automovilista extends Usuario {
    private boolean esEmpleado; //True = Empleado, False = Alumno
    private int numeroIdentificacion; // Número de Empleado o Número de control
    private String licencia;
    private String tarjetaCirculacion;
    private String celular;
    private String telefono;

    public Automovilista(String nombre, String apellidoPaterno, String apellidoMaterno, String curp, int edad, String direccion, String ciudad, String pais, String email) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp, edad, direccion, ciudad, pais, email);
    }

    public Automovilista(String nombre, String apellidoPaterno, String apellidoMaterno, String curp, int edad, String direccion, String ciudad, String pais, String email, boolean esEmpleado, int numeroIdentificacion, String licencia, String tarjetaCirculacion, String celular, String telefono) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp, edad, direccion, ciudad, pais, email);
        this.esEmpleado = esEmpleado;
        this.numeroIdentificacion = numeroIdentificacion;
        this.licencia = licencia;
        this.tarjetaCirculacion = tarjetaCirculacion;
        this.celular = celular;
        this.telefono = telefono;
    }

    public boolean isEsEmpleado() {
        return esEmpleado;
    }

    public void setEsEmpleado(boolean esEmpleado) {
        this.esEmpleado = esEmpleado;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getTarjetaCirculacion() {
        return tarjetaCirculacion;
    }

    public void setTarjetaCirculacion(String tarjetaCirculacion) {
        this.tarjetaCirculacion = tarjetaCirculacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void registrarDatos (){
        //Registra datos para darse de alta en la aplicacion
        System.out.println("Metodo registrarDatos");
    }

    public static void ingresar (){
        //Registra entrada al estacionamiento
        System.out.println("Metodo ingresar");
    }

    public static void salir (){
        //Registra salida del estacionamiento
        System.out.println("Metodo salir");
    }

}
