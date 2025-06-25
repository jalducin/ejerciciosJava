import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EjercicioFechas {
    public static void main(String[] args) {
        LocalDate inicio = LocalDate.of(2025, 4, 1);
        LocalDate fin = LocalDate.of(2025, 5, 26);

        // 1. Diferencia de días
        long diasDiferencia = ChronoUnit.DAYS.between(inicio, fin);
        System.out.println("Diferencia de días: " + diasDiferencia);

        // Etapa 1: 13 días
        LocalDate finEtapa1 = inicio.plusDays(13);
        System.out.println("Fin Etapa 1: " + finEtapa1);

        // Etapa 2: 28 días
        LocalDate inicioEtapa2 = finEtapa1.plusDays(1);
        LocalDate finEtapa2 = inicioEtapa2.plusDays(28);
        System.out.println("Inicio Etapa 2: " + inicioEtapa2);
        System.out.println("Fin Etapa 2: " + finEtapa2);

        // Etapa 3: 14 días
        LocalDate inicioEtapa3 = finEtapa2.plusDays(1);
        LocalDate finEtapa3 = inicioEtapa3.plusDays(14);
        System.out.println("Inicio Etapa 3: " + inicioEtapa3);
        System.out.println("Fin Etapa 3: " + finEtapa3);
    }
}