import java.time.LocalDate;
import java.util.Scanner;

public class mesII {
    public static void proceso(int year,int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        // Creamos un objeto LocalDate con la fecha del primer día del mes
        // Imprimimos el encabezado del calendario
        System.out.println("   Calendario de " + year);
        System.out.println("       "+obtenerNombreMes(month));
        System.out.println("---------------------------");
        System.out.println("Lu  Ma  Mi  Ju  Vi  Sa  Do");

        // Imprimimos los días del mes
        int primerDiaSemana = date.getDayOfWeek().getValue();
        // Obtenemos el día de la semana en que empieza el mes obtiene el 3(MI) cuando (2023_3)
        int y;
        int i ;
        for (y = 1; y < primerDiaSemana; y++) {
            System.out.print("    ");
        }
        for ( i = 1; i <= date.lengthOfMonth(); i++) {
            //date.lengthOfMonth() es un método de la clase
            // LocalDate que devuelve la cantidad de días que
            // tiene el mes correspondiente a la fecha date. En el
            // código que proporcionaste, se utiliza este método para
            // iterar a través de todos los días del mes e imprimirlos en el
            // calendario. El bucle for comienza en 1 y termina en date.lengthOfMonth()
            // para imprimir todos los días del mes.
            if (i<=9){
                System.out.printf("%2d",i);
            }else {
                System.out.print(i);
            }
            if ((i + primerDiaSemana - 1) % 7 == 0 || i == date.lengthOfMonth()) {
                System.out.println();
            } else {
                System.out.print("  ");
            }
        }

    }
    public static void menu() {
        Scanner aoomes=new Scanner(System.in);
        System.out.println("_______________AÑO Y MES_______________");
        System.out.println("Se muestra el mes del año que des a conocer.");
        System.out.println("Agregue el valor numericamente ");
        System.out.print("Ingrese el Año: ");
        int aoo = aoomes.nextInt(); // Año que quieres imprimir
        System.out.print("Ingrese el Mes: ");
        int mes = aoomes.nextInt();// Mes que quieres imprimir (1 = Enero, 2 = Febrero, etc.)
        System.out.println(" ");
        System.out.println("---------------------------");
        proceso(aoo,mes);
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        do {
            menu();
        }while (num1 != 0);

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


