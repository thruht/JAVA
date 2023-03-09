import java.util.Scanner;

public class mesesI {
    public static void meses(String[] args){
        System.out.println("BIENVENIDO AL SISTEMA DE LOS MESES DEL AÑO 2023");
        System.out.println(" 0 - salir.");
        System.out.println(" 1 - Enero.");
        System.out.println(" 2 - Febrero.");
        System.out.println(" 3 - Marzo.");
        System.out.println(" 4 - Abril.");
        System.out.println(" 5 - Mayo.");
        System.out.println(" 6 - Junio.");
        System.out.println(" 7 - Julio.");
        System.out.println(" 8 - Agosto.");
        System.out.println(" 9 - Setiembre.");
        System.out.println("10 - Octubre.");
        System.out.println("11 - Nobiembre.");
        System.out.println("12 - Diciembre.");
    }
    public static void Enero_octubre(String[] args) {
        String[][] enero = {
                {" L", " M", " M", " J", " V", " S", " D"},
                {"  ", "  ", "  ", "  ", "  ", "  ", " 1"},
                {" 2", " 3", " 4", " 5", " 6", " 7", " 8"},
                {" 9", "10", "11", "12", "13", "14", "15"},
                {"16", "17", "18", "19", "20", "21", "22"},
                {"23", "24", "25", "26", "27", "28", "29"},
                {"30", "31", "  ", "  ", "  ", "  ", "  "}};

        for (int i = 0; i < enero.length; i++) {
            System.out.print(" ");
            for (int j = 0; j < enero[i].length; j++) {
                System.out.print( enero[i][j] + "  " );
            }
            System.out.println(" ");
        }
    }
    public static int leerEntero(String promt){
        int entero = 0;
        int cont = 0;
        do{
            try {
                System.out.print(promt+": ");
                entero = new Scanner(System.in).nextInt();
                cont = 3;
            } catch (Exception e) {
                System.out.println("Opción invalidad");
                System.out.print("Intentelo nuevamente : ");
                cont++; // cont = cont + 1
            }
        } while(cont != 3); // este while temrina cuando cont = 3
        return entero;


    }

    public static void main(String[] args) {
        meses(args);
        System.out.print("Escriba el mes: ");
        int opcion;
        opcion = new Scanner(System.in).nextInt();
        String[][] febrero = {
                {" L", " M", " M", " J", " V", " S", " D"},
                {"  ", "  ", " 1", " 2", " 3", " 4", " 5"},
                {" 6", " 7", " 8", " 9", "10", "11", "12"},
                {"13", "14", "15", "16", "17", "18", "19"},
                {"20", "21", "22", "23", "24", "25", "26"},
                {"27", "28", "29", "30", "31", "  ", "  "}};
        String[][] abril = {
                {" L", " M", " M", " J", " V", " S", " D"},
                {"  ", "  ", "  ", "  ", "  ", " 1", " 2"},
                {" 3", " 4", " 5", " 6", " 7", " 8", " 9"},
                {"10", "11", "12", "13", "14", "15", "16"},
                {"17", "18", "19", "20", "21", "22", "23"},
                {"24", "25", "26", "27", "28", "29", "30"},
                {"31", "  ", "  ", "  ", "  ", "  ", "  "}};
        String[][] mayo = {
                {" L", " M", " M", " J", " V", " S", " D"},
                {"  ", "  ", "  ", "  ", "  ", " 1", " 2"},
                {" 3", " 4", " 5", " 6", " 7", " 8", " 9"},
                {"10", "11", "12", "13", "14", "15", "16"},
                {"17", "18", "19", "20", "21", "22", "23"},
                {"24", "25", "26", "27", "28", "29", "30"},
                {"31", "  ", "  ", "  ", "  ", "  ", "  "}};
        String[][] junio = {
                {" L", " M", " M", " J", " V", " S", " D"},
                {"  ", "  ", "  ", "  ", "  ", " 1", " 2"},
                {" 3", " 4", " 5", " 6", " 7", " 8", " 9"},
                {"10", "11", "12", "13", "14", "15", "16"},
                {"17", "18", "19", "20", "21", "22", "23"},
                {"24", "25", "26", "27", "28", "29", "30"},
                {"31", "  ", "  ", "  ", "  ", "  ", "  "}};
        String[][] agosto = {
                {" L", " M", " M", " J", " V", " S", " D"},
                {"  ", "  ", "  ", "  ", "  ", " 1", " 2"},
                {" 3", " 4", " 5", " 6", " 7", " 8", " 9"},
                {"10", "11", "12", "13", "14", "15", "16"},
                {"17", "18", "19", "20", "21", "22", "23"},
                {"24", "25", "26", "27", "28", "29", "30"},
                {"31", "  ", "  ", "  ", "  ", "  ", "  "}};
        String[][] setiembre = {
                {" L", " M", " M", " J", " V", " S", " D"},
                {"  ", "  ", "  ", "  ", " 1", " 2", " 3"},
                {" 4", " 5", " 6", " 7", " 8", " 9", "10"},
                {"11", "12", "13", "14", "15", "16", "17"},
                {"18", "19", "20", "21", "22", "23", "24"},
                {"25", "26", "27", "28", "29", "30", "31"}};


        switch (opcion) {
            case 0:
                System.out.println(" Adios. Vuelve pronto ...");
                break;
            case 1:
                System.out.println("  ..........ENERO..........");
                Enero_octubre(args);
                break;
            case 2:
                System.out.println(" ..........FEBRERO..........");

                for (int i = 0; i < febrero.length-1; i++) {
                    System.out.print(" ");
                    for (int j = 0; j < febrero[i].length ; j++) {
                        System.out.print( febrero[i][j]+"  " );
                    }
                    System.out.println(" ");
                }
                System.out.print(" ");
                System.out.print( febrero[5][0]+"  " );
                System.out.print( febrero[5][1]+"  " );

                break;
            case 3:
                System.out.println("  ...........MARZO...........");

                for (int i = 0; i < febrero.length; i++) {
                    System.out.print(" ");
                    for (int j = 0; j < febrero[i].length ; j++) {
                        System.out.print( febrero[i][j]+"  " );
                    }
                    System.out.println(" ");
                }

                break;
            case 4:
                System.out.println("  ..........ABRIL..........");

                for (int i = 0; i < abril.length-1; i++) {
                    System.out.print(" ");
                    for (int j = 0; j < abril[i].length ; j++) {
                        System.out.print( abril[i][j]+"  " );
                    }
                    System.out.println(" ");
                }
                break;
            case 5:
                System.out.println("  ..........MAYO..........");

                for (int i = 0; i < abril.length-1; i++) {
                    System.out.print(" ");
                    for (int j = 0; j < abril[i].length ; j++) {
                        System.out.print( abril[i][j]+"  " );
                    }
                    System.out.println(" ");
                }
                break;
            case 6:
                System.out.println("  ..........JUNIO..........");

                for (int i = 0; i < abril.length-1; i++) {
                    System.out.print(" ");
                    for (int j = 0; j < abril[i].length ; j++) {
                        System.out.print( abril[i][j]+"  " );
                    }
                    System.out.println(" ");
                }
                break;
            case 7:
                System.out.println("  ..........JULIO..........");

                for (int i = 0; i < abril.length; i++) {
                    System.out.print(" ");
                    for (int j = 0; j < abril[i].length ; j++) {
                        System.out.print( abril[i][j]+"  " );
                    }
                    System.out.println(" ");
                }
                break;
            case 8:
                System.out.println("  ..........AGOSTO..........");

                for (int i = 0; i < abril.length-1; i++) {
                    System.out.print(" ");
                    for (int j = 0; j < abril[i].length ; j++) {
                        System.out.print( abril[i][j]+"  " );
                    }
                    System.out.println(" ");
                }
                break;
            case 9:
                System.out.println("  ..........SETIEMBRE..........");

                for (int i = 0; i < abril.length-1; i++) {
                    System.out.print(" ");
                    for (int j = 0; j < abril[i].length ; j++) {
                        System.out.print( abril[i][j]+"  " );
                    }
                    System.out.println(" ");
                }
                break;
            case 10:
                System.out.println(" ..........OCTUBRE..........");
                Enero_octubre(args);
                break;
            case 11:
                System.out.println("  ........NOVIEMBRE........");

                for (int i = 0; i < febrero.length-1; i++) {
                    System.out.print(" ");
                    for (int j = 0; j < febrero[i].length ; j++) {
                        System.out.print( febrero[i][j]+"  " );
                    }
                    System.out.println(" ");
                }
                System.out.print(" ");
                System.out.print( febrero[5][0]+"  " );
                System.out.print( febrero[5][1]+"  " );
                System.out.print( febrero[5][2]+"  " );
                System.out.print( febrero[5][3]+"  " );
                break;
            case 12:
                System.out.println("  ..........DICIEMBRE..........");

                for (int i = 0; i < abril.length-1; i++) {
                    System.out.print(" ");
                    for (int j = 0; j < abril[i].length ; j++) {
                        System.out.print( abril[i][j]+"  " );
                    }
                    System.out.println(" ");
                }
                break;
            case -1:
                System.out.print("Opciones inválidas.");
                break;
        }








    }
}