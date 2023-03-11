import java.util.Scanner;

public  class MainII {
    public static void nombreiii(int centi,int deci, int uni){

        String[] centii={"cien","ciento","Docientos","Trecientos","Cuatrocientos","Quinientos","Seisientos","Setecientos","Ochocientos","novecientos"};
        switch (centi)
        {
            case 0:
//                System.out.println(" "+decii[0]);
                break;
            case 1:
                System.out.print(centii[1]);
                nombreii(deci,uni);
                break;
            case 2:
                System.out.print(centii[2]);
                nombreii(deci,uni);
                break;
            case 3:
                System.out.print(centii[3]);
                nombreii(deci,uni);
                break;
            case 4:
                System.out.print(centii[4]);
                nombreii(deci,uni);
                break;
            case 5:
                System.out.print(centii[5]);
                nombreii(deci,uni);
                break;
            case 6:
                System.out.print(centii[6]);
                nombreii(deci,uni);
                break;
            case 7:
                System.out.print(centii[7]);
                nombreii(deci,uni);
                break;
            case 8:
                System.out.print(centii[8]);
                nombreii(deci,uni);
                break;
            case 9:
                System.out.print(centii[9]);
                nombreii(deci,uni);
                break;
        }
    }
    public static void nombreii(int dece,int uni){

        String[] decii={"Veinte","Veinti","Treinta","treintai","Cuarenta","cuarentai","cincuenta","Cincuentai","Sesenta","Sesentai","Ochenta","Ochentai","Noventa","Noventai",};
        switch (dece){
            case 0:
                System.out.println(decii[0]);
                break;
            case 1:
                System.out.print(decii[1]);
                nombre(uni);
                break;
            case 2:
                System.out.print(decii[1]);
                nombre(uni);
                break;
            case 3:
                System.out.println("20-"+decii[4]);
                break;
        }
    }
    public static void nombre(int uni){
        String[] unii={"Cero","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Dies","Once","Doce","Trece","Catorce","Quince"};
        switch (uni){
            case 0:
                System.out.println(unii[0]);
                break;
            case 1:
                System.out.println(unii[1]);
                break;
            case 2:
                System.out.println(unii[2]);
                break;
            case 3:
                System.out.println(unii[3]);
                break;
            case 4:
                System.out.println(unii[4]);
                break;
            case 5:
                System.out.println(unii[5]);
                break;
            case 6:
                System.out.println(unii[6]);
                break;
            case 7:
                System.out.println(unii[7]);
                break;
            case 8:
                System.out.println(unii[8]);
                break;
            case 9:
                System.out.println(unii[9]);
                break;
            case 10:
                System.out.println(unii[10]);
                break;
            case 11:
                System.out.println(unii[11]);
                break;
            case 12:
                System.out.println(unii[12]);
                break;
            case 13:
                System.out.println(unii[13]);
                break;

            case 15:
                System.out.println(unii[15]);
                break;

        }
    }


        public static void descomponer(int num0)
        {
            int unidades = num0 % 10;
            int decenas = ( num0 / 10 ) % 10;
            int centenas = ( num0/100 ) % 10;

            if (num0 <10) {
                System.out.print(num0+": " );
                nombre(unidades);
            }
            if (num0<100 && num0>9 ) {
                if (num0==10 | num0 ==11 | num0 ==12 |num0 ==13 | num0==14 | num0 ==15)
                {
                    System.out.print(num0+": " );
                    nombre(num0);
                }else {
                    System.out.print(num0+": " );
                    nombreii(decenas, unidades);
                }


            }
            if (num0<999 && num0>100 ){
                System.out.print(num0+": ");
                nombreiii(centenas,decenas,unidades);
            }
        }
        public static void menu()
        {
            System.out.println("MENU:");
            System.out.println("0- Salir");
            System.out.println("1- Ingresar un numero");
            System.out.println("_____________________________________________________________________________");
            System.out.print("Ingrese la Opción que decea realizar:");
        }
        public static void main(String[] args) {
            System.out.println("_____________________________________________________________________________");
            System.out.println("            LECTURA DE NUMEROS CON UN MAXIMO DE TRES CIFRAS");
            System.out.println("_____________________________________________________________________________");
            menu();
            int valor = new Scanner(System.in).nextInt();
            if (valor==1) {
                do {
                    System.out.println("LECTURA DE NUMEROS" );
                    System.out.print("Ingrese el numero que desea leer:" );
                    int numero = new Scanner(System.in).nextInt();
                    descomponer(numero);
                    System.out.println(" ");
                }while (valor==1);
            }
            if (valor==0)
                System.out.println("Hasta luego, Vuelva Pronto ☺" );
            else {
                System.out.println("No Existe la Opción Ingresada");
                main(args);
            }


        }
    }

