import java.time.LocalDate;
import java.util.Scanner;

public class mesI {
    public static void proceso(int year,int month) {
        LocalDate date = LocalDate.of(year, month, 1);// Creamos un objeto LocalDate con la fecha del primer día del mes// Imprimimos el encabezado del calendario
        System.out.printf("%15s %d\n", "Calendario de", year);
        System.out.printf("%11s\n", obtenerNombreMes(month));
        System.out.println("-----------------------------");
        System.out.println("  Lu Ma Mi Ju Vi Sa Do");

        // Imprimimos los días del mes
        int primerDiaSemana = date.getDayOfWeek().getValue();  // Obtenemos el día de la semana en que empieza el mes
        for (int i = 1; i < primerDiaSemana; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= date.lengthOfMonth(); i++) {
            System.out.printf("%3d", i);
            if ((i + primerDiaSemana - 1) % 7 == 0 || i == date.lengthOfMonth()) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
    public static void menu() {
        System.out.printf("Se muestra el mes del año que des a conocer");
    }

    public static void main(String[] args) {
        menu();
        int aoo = new Scanner(System.in).nextInt();// Año que quieres imprimir
        int mes = new Scanner(System.in).nextInt();// Mes que quieres imprimir (1 = Enero, 2 = Febrero, etc.)

        proceso(aoo,mes);

    }

    // Función para obtener el nombre de un mes dado su número (1 = Enero, 2 = Febrero, etc.)
    public static String obtenerNombreMes(int mes) {
        switch (mes) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "";
        }
    }
}

