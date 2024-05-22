//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pediatrico pediatrico = new Pediatrico("12345678", "Juan Perez", "OSDE", 25.0, "123-456-789", "Maria Perez");
        Adulto adulto = new Adulto("87654321", "Ana Gomez", "Swiss Medical", 120.0, 1.75, 70.0);
        Internado internado = new Internado("11223344", "Carlos Ruiz", "Camioneros", "101", 110.0, "O+");

        // Información para el Departamento de Administración
        System.out.println("Información para el Departamento de Administración:");
        System.out.println("Pediatrico:");
        System.out.println("- Cobertura OS: " + pediatrico.obtenerCoberturaOS());
        System.out.println("- Descuento: " + pediatrico.calcularDescuento());
        System.out.println("- Vademecum: " + pediatrico.obtenerVademecum());

        System.out.println("Adulto:");
        System.out.println("- Cobertura OS: " + adulto.obtenerCoberturaOS());
        System.out.println("- Descuento: " + adulto.calcularDescuento());
        System.out.println("- Vademecum: " + adulto.obtenerVademecum());

        System.out.println("Internado:");
        System.out.println("- Cobertura OS: " + internado.obtenerCoberturaOS());
        System.out.println("- Descuento: " + internado.calcularDescuento());
        System.out.println("- Vademecum: " + internado.obtenerVademecum());

        // Información para el Departamento de Nutrición
        System.out.println("\nInformación para el Departamento de Nutrición:");
        System.out.println("Pediatrico:");
        System.out.println("- Tipo de dieta: " + pediatrico.obtenerTipoDieta());

        System.out.println("Internado:");
        System.out.println("- Tipo de dieta: " + internado.obtenerTipoDieta());

        // Información para el Departamento de Clínica Médica
        System.out.println("\nInformación para el Departamento de Clínica Médica:");
        System.out.println("Adulto:");
        System.out.println("- Estudios recetados: " + adulto.recetarEstudios());

        System.out.println("Internado:");
        System.out.println("- Estudios recetados: " + internado.recetarEstudios());
    }
}