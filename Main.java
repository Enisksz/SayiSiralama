package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int sayi1,sayi2,sayi3;

        Scanner sayiAl= new Scanner(System.in);

        System.out.print("ilk sayiyi giriniz: ");
        sayi1= sayiAl.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        sayi2= sayiAl.nextInt();
        System.out.print("üçüncü sayiyi giriniz: ");
        sayi3= sayiAl.nextInt();

        if(sayi1>sayi2 && sayi1>sayi3){
            if(sayi2>sayi3){
                System.out.println("sayi1>sayi2>sayi3");
            }
            else {
                System.out.println("sayi1>sayi3>sayi2");
            }
        }
        if(sayi2>sayi1 && sayi2>sayi3){
            if (sayi1>sayi3){
                System.out.println("sayi2>sayi1>sayi3");
            }
            else{
                System.out.println("sayi2>sayi3>sayi1");
            }
        }
        if(sayi3>sayi1 && sayi3>sayi2){
            if (sayi1>sayi2){
                System.out.println("sayi3>sayi1>sayi2");
            }
            else{
                System.out.println("sayi3>sayi2>sayi1");
            }
        }
    }
}
