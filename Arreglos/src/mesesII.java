import java.util.Scanner;

public class mesesII {
    public static void mostrarCalendario(int dias, int diaini){
        System.out.println(" D   L   M   M   J   V   S");
        for (int i = 1; i <= diaini; i++) {
            System.out.println(" . ");
        }
        int cont=diaini;
        for (int i = 1; i <= dias; i++) {
            cont ++;
            if(i < 10 )
                System.out.print("  "+i+" ");
            else
                System.out.print(" "+i+" ");
            if(cont % 7 == 0 )
                System.out.println(" ");
            cont=0;
        }
    }
    public static void calendario(int mes){
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] iniMes = { 5, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };

        switch (mes){
            case 0:
                System.out.println("Asios, vuelva pronto.");
                break;
            case 1:
                System.out.println("ENERO");
                mostrarCalendario(dias[mes-1], iniMes[mes-1]);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            default:
                System.out.println("Error: Ese mes no existe");
                break;
        }
    }

    public static void main(String[] args) {
        int mes = new Scanner(System.in).nextInt();
        calendario(mes);
    }
}
