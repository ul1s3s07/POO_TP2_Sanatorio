import Interfaces.IAdministracion;
import Interfaces.IClinicaMedica;
import Interfaces.INutricion;

public class Internado extends Paciente implements IAdministracion, INutricion, IClinicaMedica {
    private String habitacion;
    private double pa;
    private String rh;

    public Internado(String dni, String nombre, String obraSocial, String habitacion, double pa, String rh) {
        super(dni, nombre, obraSocial);
        this.habitacion = habitacion;
        this.pa = pa;
        this.rh = rh;
    }

    @Override
    public String obtenerCoberturaOS() {
        return "Cobertura de obra social para Internado: " + this.obraSocial;
    }

    @Override
    public double calcularDescuento() {
        return 0.20;
    }

    @Override
    public String obtenerVademecum() {
        return "Vademecum para Internado";
    }

    @Override
    public String obtenerTipoDieta() {
        return "Dieta específica para internados";
    }

    @Override
    public String recetarEstudios() {
        return "Rx y Sangre para Internado";
    }
}
