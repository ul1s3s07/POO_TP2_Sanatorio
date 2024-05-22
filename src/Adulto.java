import Interfaces.IAdministracion;
import Interfaces.IClinicaMedica;

public class Adulto extends Paciente implements IAdministracion, IClinicaMedica {
    private double pa;
    private double altura;
    private double peso;

    public Adulto(String dni, String nombre, String obraSocial, double pa, double altura, double peso) {
        super(dni, nombre, obraSocial);
        this.pa = pa;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String obtenerCoberturaOS() {
        return "Cobertura de obra social para Adulto: " + this.obraSocial;
    }

    @Override
    public double calcularDescuento() {
        return 0.15;
    }

    @Override
    public String obtenerVademecum() {
        return "Vademecum para Adulto";
    }

    @Override
    public String recetarEstudios() {
        return "Rx y Sangre para Adulto";
    }
}
