package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        menu();
        int numero1, numero2;
        System.out.println("ingrese un numero");
        numero1 = getNumero();
        System.out.println("ingrese otro numero");
        numero2 = getNumero();
        System.out.println("La suma es: "+suma(numero1,numero2));
    }
    public static void menu(){
        System.out.println("a para vocal");
        System.out.println("b para numero");
    }
    public static int getNumero(){
        Scanner r = new Scanner(System.in);
        int numero = r.nextInt();
        return numero;
    }
    public static int suma(int valor1, int valor2){
        int suma = valor1 + valor2;
        return suma;
    }
    //public static int getNumero(Scanner 1){
     //   menu();

   //}
}
