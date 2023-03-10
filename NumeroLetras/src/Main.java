import javax.swing.*;
import java.util.Scanner;

public  class Main {
    public static void nombreii(int dece){
        switch (dece){
            case 1:
                System.out.println(dece+"- Uno");
                break;
        }

    }
    public static void nombre(int uni){
        String[] unii={"Cero","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve"};
        String[] decii={"Veinte","Veinti"};
        int cont=0;
        int U=0;
        int D=0;
        System.out.println(cont);
        cont++;
        if (cont==1){
            U=uni;
            System.out.println(U);

        } else if (cont==2) {
            D=uni;

        }

//        do {


            switch (uni){
                case 0:
                    System.out.println("0-"+unii[0]);
                    break;
                case 1:
                    System.out.println("1-"+unii[1]);
                    break;
                case 2:
                    if (cont<1)
                        System.out.println("1-"+unii[2]);

                    else if (cont<2) {
                        System.out.println("1-"+decii[1]+ U);
                    }
                    else
                        System.out.println("1-"+unii[1]);
                    break;
                case 3:
                    System.out.println("-"+uni);
                    break;
                case 4:
                    System.out.println(uni+"- Cuatro");
                    break;
                case 5:
                    System.out.println(uni+"- Cinco");
                    break;
                case 6:
                    System.out.println(uni+"- Seis");
                    break;
                case 7:
                    System.out.println(uni+"- Siete");
                    break;
                case 8:
                    System.out.println(uni+"- Ocho");
                    break;
                case 9:
                    System.out.println(uni+"- Nueve");
                    break;
            }


 //       }while (cont<4);



    }
    public static void Descomponer(int num)
    {
        int unidades = num % 10;
        int decenas = ( num / 10 ) % 10;
        int centenas = ( num/100 ) % 10;
        if (unidades <10) {
            System.out.println("Hay "+ unidades+" Unidades" );
            nombre(unidades);
        }
        if ((decenas*10)<100) {
            System.out.println("Hay "+ decenas+" Decenas" );
            nombre(decenas);
        }
        else{
            System.out.println("Hay "+ centenas+" Centenas" );
            nombre(centenas);
        }
    }
    public static void main(String[] args) {
        System.out.print("Escriba un numero maximo de tres cifras :" );
        int numero = new Scanner(System.in).nextInt();
        Descomponer(numero);
    }
}