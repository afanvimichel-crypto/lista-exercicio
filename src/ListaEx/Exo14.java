package ListaEx;

import java.util.Scanner;

public class Exo14 {

    static double calcularIMC(double peso, double altura){
        return (peso/(altura*altura));
    }
    static String classificarIMC(double imc){
        if(imc<18.5){
            return "Abaixo do peso";
        } else if (imc<25) {
            return "Normal";
        } else if (imc<30) {
            return "Sobrepeso";
        }return "Obesidade";
    }
    static void exibirRelatorio(double peso,double altura){
        double imc=calcularIMC(peso,altura);
        String classificacao=classificarIMC(imc);
        System.out.println("Peso: "+peso+" KG");
        System.out.println("Altura: "+altura+" m");
        System.out.println("IMC: "+imc);
        System.out.println("Classificção: "+classificacao);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o peso(KG):");
        double peso= sc.nextDouble();
        System.out.println("Informe da altura(m):");
        double altura= sc.nextDouble();
        System.out.println("**************~~~~~~~°°°°~~~~~~****************");
exibirRelatorio(peso,altura);

    }
}
