package ListaEx;

import java.util.Scanner;

public class Exo13 {
    static boolean ehPrimo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i += 1) {
            if (numero%i == 0) {
                contador += 1;
            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }
    static void listarPrimos(int limite){
        for(int i=2;i<=limite;i+=1){
            if(ehPrimo(i)){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um valor:");
        int valor= sc.nextInt();
        //System.out.println(ehPrimo(valor));
        listarPrimos(valor);
    }
}

