package ListaEx;

public class Exo2 {
    static void imprimirLinha(int quantidade){
        for(int i=0;i<quantidade;i+=1){
            System.out.print("***");
        }
    }
    public static void main(String[] args) {
        imprimirLinha(20);
        System.out.println("\nQue legal.......");
        imprimirLinha(20);

    }
}
