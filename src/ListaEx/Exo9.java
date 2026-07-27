package ListaEx;

import java.util.Scanner;

public class Exo9 {
    static double celsiusParaFahrenheit(double celsius){
        return (celsius*1.8+32);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Qual é a temperatura atual em celcius(°C): ");
        double temperatura=sc.nextDouble();
        System.out.println(celsiusParaFahrenheit(temperatura)+" °F");
    }
}
