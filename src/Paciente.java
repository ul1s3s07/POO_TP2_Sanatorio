abstract class Paciente {
    protected String dni;
    protected String nombre;
    protected String obraSocial;

    public Paciente(String dni, String nombre, String obraSocial) {
        this.dni = dni;
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public abstract String obtenerCoberturaOS();
    public abstract double calcularDescuento();
    public abstract String obtenerVademecum();
}

