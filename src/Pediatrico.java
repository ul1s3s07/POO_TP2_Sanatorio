import Interfaces.IAdministracion;
import Interfaces.INutricion;

public class Pediatrico extends Paciente implements IAdministracion, INutricion {
    private double peso;
    private String celular;
    private String tutor;

    public Pediatrico(String dni, String nombre, String obraSocial, double peso, String celular, String tutor) {
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }

    @Override
    public String obtenerCoberturaOS() {
        return "Cobertura de obra social para Pediatrico: " + this.obraSocial;
    }

    @Override
    public double calcularDescuento() {
        return 0.10;
    }

    @Override
    public String obtenerVademecum() {
        return "Vademecum para Pediatrico";
    }

    @Override
    public String obtenerTipoDieta() {
        return "Dieta balanceada para niños";
    }
}
