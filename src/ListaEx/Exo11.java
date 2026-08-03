package ListaEx;

import java.util.Scanner;

public class Exo11 {
static void exibirMenu(){
    System.out.println("1-Somar");
    System.out.println("2-Subtrair");
    System.out.println("3-Multiplicar");
    System.out.println("4-Dividir");
}
static double somar(double num1,double num2){
    return num1+num2;
}
static double subitrair(double num1,double num2){
    return num1-num2;
}
static double multiplicar(double num1,double num2){
    return num1*num2;
}
static double dividir(double num1,double num2){
    if(num2!=0){
        return num1/num2;
    }else {
       System.out.println("Não pode dividir por zero");
       return Double.NaN;
    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("<<<<<<<<<<<BEM VINDO>>>>>>>>>>>>>");
    System.out.println("O que você deseja fazer?\n");
    exibirMenu();
    System.out.println("     ");
    System.out.println("Escolhe uma opção:");
    int opcao= sc.nextInt();
    if(opcao==1){
        System.out.println("Digite os valores");
        System.out.print("valor 1:");
        double val1= sc.nextDouble();
        System.out.print("valor 2:");
        double val2= sc.nextDouble();
        System.out.println("***********SOMA***************");
        System.out.println("Resultado: "+somar(val1,val2));
    } else if (opcao==2) {
        System.out.println("Digite os valores");
        System.out.print("valor 1:");
        double val1= sc.nextDouble();
        System.out.print("valor 2:");
        double val2= sc.nextDouble();
        System.out.println("***********SOUBTRAçÃo***************");
        System.out.println("Resultado: "+subitrair(val1,val2));
    } else if (opcao==3) {
        System.out.println("Digite os valores");
        System.out.print("valor 1:");
        double val1= sc.nextDouble();
        System.out.print("valor 2:");
        double val2= sc.nextDouble();
        System.out.println("***********MULTIPLICAçÃO***************");
        System.out.println("Resultado: "+multiplicar(val1,val2));
    } else if (opcao==4) {
        System.out.println("Digite os valores");
        System.out.print("valor 1:");
        double val1= sc.nextDouble();
        System.out.print("valor 2:");
        double val2= sc.nextDouble();
        System.out.println("***********DIVISÃO***************");
        System.out.println("Resultado: "+dividir(val1,val2));
    }else {
        System.out.println("OPçÃO INVALIDA!!!");
    }
}

}
