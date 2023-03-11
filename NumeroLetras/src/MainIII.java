import java.util.Scanner;

public  class MainIII {
    public static void nombreiii(int centi,int deci, int uni){

        String[] centii={"cien","ciento","Docientos","Trecientos","Cuatrocientos",
                "Quinientos","Seisientos","Setecientos","Ochocientos","novecientos"};
        switch (centi)
        {
            case 1:

                if (deci ==0 && uni==0)
                {
                System.out.print(centii[0]);
                } else {
                    System.out.print(centii[1]);
                    if (deci !=0 && uni!=0){
                        nombreii(deci,uni);
                    }
                    if (deci >0 && uni==0) {
                        nombre(deci*10);
                    }
                    if (deci==0 && uni!=0) {
                        nombre(uni);
                    }
                }
                break;
            case 2:
                System.out.print(centii[2]);
                if (deci!=0 && uni!=0){
                    nombreii(deci,uni);}
                if (deci >0 && uni==0) {
                    nombre(deci*10);
                }
                if (deci==0 && uni!=0)
                {nombre(uni);
                }
                break;
            case 3:
                System.out.print(centii[3]);
                if (deci!=0 && uni!=0){
                    nombreii(deci,uni);}
                if (deci >0 && uni==0) {
                    nombre(deci*10);
                }
                if (deci==0 && uni!=0)
                {nombre(uni);
                }
                break;
            case 4:
                System.out.print(centii[4]);
                if (deci!=0 && uni!=0){
                    nombreii(deci,uni);}
                if (deci >0 && uni==0) {
                    nombre(deci*10);
                }
                if (deci==0 && uni!=0)
                {nombre(uni);
                }
                break;
            case 5:
                System.out.print(centii[5]);
                if (deci!=0 && uni!=0){
                    nombreii(deci,uni);}
                if (deci >0 && uni==0) {
                    nombre(deci*10);
                }
                if (deci==0 && uni!=0)
                {nombre(uni);
                }
                break;
            case 6:
                System.out.print(centii[6]);
                if (deci!=0 && uni!=0){
                    nombreii(deci,uni);}
                if (deci >0 && uni==0) {
                    nombre(deci*10);
                }
                if (deci==0 && uni!=0)
                {nombre(uni);
                }
                break;
            case 7:
                System.out.print(centii[7]);
                if (deci!=0 && uni!=0){
                    nombreii(deci,uni);}
                if (deci >0 && uni==0) {
                    nombre(deci*10);
                }
                if (deci==0 && uni!=0)
                {nombre(uni);
                }
                break;
            case 8:
                System.out.print(centii[8]);
                if (deci!=0 && uni!=0){
                    nombreii(deci,uni);}
                if (deci >0 && uni==0) {
                    nombre(deci*10);
                }
                if (deci==0 && uni!=0)
                {nombre(uni);
                }
                break;
            case 9:
                System.out.print(centii[9]);
                if (deci!=0 && uni!=0){
                    nombreii(deci,uni);}
                if (deci >0 && uni==0) {
                    nombre(deci*10);
                }
                if (deci==0 && uni!=0)
                {nombre(uni);
                }
                break;
        }
    }
    public static void nombreii(int dece,int uni){

        String[] decii={"dieci","Veinti","treintai","cuarentai","Cincuentai","Sesentai","Setentai","Ochentai","Noventai"};
        switch (dece){
            case 1:
                System.out.print(decii[0]);
                break;
            case 2:
                System.out.print(decii[1]);
                break;
            case 3:
                System.out.print(decii[2]);
                break;
            case 4:
                System.out.print(decii[3]);
                break;
            case 5:
                System.out.print(decii[4]);
                break;
            case 6:
                System.out.print(decii[5]);
                break;
            case 7:
                System.out.print(decii[6]);
                break;
            case 8:
                System.out.print(decii[7]);
                break;
            case 9:
                System.out.print(decii[8]);
                break;
        }
        nombre(uni);
    }
    public static void nombre(int uni){
        String[] unii={"Cero","Uno","Dos","Tres","Cuatro","Cinco"
                ,"Seis","Siete","Ocho","Nueve","Dies","Once",
                "Doce","Trece","Catorce","Quince","veinte",
                "Treinta","cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};
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
            case 14:
                System.out.println(unii[14]);
                break;
            case 15:
                System.out.println(unii[15]);
                break;
            case 20:
                System.out.println(unii[16]);
                break;
            case 30:
                System.out.println(unii[17]);
                break;
            case 40:
                System.out.println(unii[18]);
                break;
            case 50:
                System.out.println(unii[19]);
                break;
            case 60:
                System.out.println(unii[20]);
                break;
            case 70:
                System.out.println(unii[21]);
                break;
            case 80:
                System.out.println(unii[22]);
                break;
            case 90:
                System.out.println(unii[23]);
                break;

        }
    }
    public static void descomponer(int num0)
    {
        if (num0<0){
            num0=num0*-1;
            System.out.print("-");
            System.out.print(num0+": Menos ");
        }else {System.out.print(num0+": " );}

        int unidades = num0 % 10;
        int decenas = ( num0 / 10 ) % 10;
        int centenas = ( num0/100 ) % 10;

        if (num0 <10) {
            nombre(unidades);
        }
        if (num0<100 && num0>9 ) {
            if ( num0 % 10==0 | (num0 <=15 && num0 % 10 <6 ) )
            {
                nombre(num0);
            }else {
                nombreii(decenas,unidades);
            }
        }
        if (num0<=999 && num0>=100 ){
            if ( unidades==0 && decenas==0)
            {
                nombreiii((centenas),0,0);
            }else {
                nombreiii(centenas,decenas,unidades);
            }
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

