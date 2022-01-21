import java.util.Scanner;

/**
 * @author fatih-git
 * */

public class Calculator {

    static float sum(float a, float b){

        return a+b;
    }

    static float minus(float a, float b){

        return a-b;
    }

    static float times(float a, float b){

        return a*b;
    }

    static float divide(float a, float b){

        if(b==0){
            System.out.println("Herhangi bir sayı 0'a bölünemez.");
            return 0;
        }

        return a/b;
    }

    static float power(float a, int b){

        int i;
        float result=1;

        for (i=0; i<b; i++){
            result*=a;
        }

        return result;
    }

    static int factorial(float a){

        int i, result=1;

        for (i=1; i<a; i++){

            result*=a;
            a--;

        }

        return result;
    }

    static int mod(int a, int b){

        return a%b;

    }

    static void rectangle(){

        float a, b;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen dikdörtgenin kısa kenrını giriniz: ");
        a=input.nextFloat();

        System.out.print("Lütfen dikdörtgenin uzun kenrını giriniz: ");
        b= input.nextFloat();

        System.out.println("Dikdörtgenin çevresi= "+(2*a+2*b));
        System.out.println("Dikdörtgenin alanı= "+(a*b));

    }

    public static void main(String[] args) {

        System.out.println("Hesap Makinesi");
        System.out.println("_______________\n");

        Scanner input=new Scanner(System.in);
        byte giris;
        float a, b, result;

        do {

            System.out.println("\nToplama yapmak için:1");
            System.out.println("Çıkarma yapmak için: 2");
            System.out.println("Çarpma yapmak için: 3");
            System.out.println("Bölme yapmak için: 4");
            System.out.println("Üslü sayı hesabı için: 5");
            System.out.println("Faktoriyel hesaplamak için: 6");
            System.out.println("Mod almak için: 7");
            System.out.println("Dİkdörtgen alan ve çevre hesabı için: 8 giriniz.");
            System.out.println("Çıkış yapmak için: 0 giriniz...\n");

            giris=input.nextByte();
            switch (giris){

                case 1:
                    System.out.print("Toplananı giriniz: ");
                    a=input.nextFloat();
                    System.out.print("Ekleneni giriniz: ");
                    b=input.nextFloat();
                    result=sum(a,b);
                    System.out.println("Sonuç= "+result);
                    break;
                case 2:
                    System.out.print("Çıkarılanı giriniz: ");
                    a=input.nextFloat();
                    System.out.print("Çıkanı giriniz: ");
                    b=input.nextFloat();
                    result=minus(a,b);
                    System.out.println("Sonuç= "+result);
                    break;
                case 3:
                    System.out.print("Çarpılanı giriniz: ");
                    a=input.nextFloat();
                    System.out.print("Çarpanı giriniz: ");
                    b=input.nextFloat();
                    result=times(a,b);
                    System.out.println("Sonuç= "+result);
                    break;
                case 4:
                    System.out.print("Bölüneni giriniz: ");
                    a=input.nextFloat();
                    System.out.print("Böleni giriniz: ");
                    b=input.nextFloat();
                    result=divide(a,b);
                    System.out.println("Sonuç= "+result);
                    break;
                case 5:
                    System.out.print("Taban değerini giriniz: ");
                    a=input.nextFloat();
                    System.out.print("Üssü giriniz: ");
                    b=input.nextFloat();
                    result=power(a,(int)b);
                    System.out.println("Sonuç= "+result);
                    break;
                case 6:
                    System.out.println("Faktöriyeli alınacak tamsayı değeri giriniz: ");
                    a=input.nextInt();
                    result=factorial(a);
                    System.out.println("Sonuç= "+result);
                    break;
                case 7:
                    System.out.print("Modu alınanı (tamsayı) giriniz: ");
                    a=input.nextFloat();
                    System.out.print("Mod alanı (tamsayı) giriniz: ");
                    b=input.nextFloat();
                    result=mod((int)a,(int)b);
                    System.out.println("Sonuç= "+result);
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Görüşmek üzere...");
                    break;
                default:
                    System.out.println("Hatalı giriş.");
                    break;

            }

        }while(giris!=0);

    }

}
