import java.util.Scanner;

public class Enteros {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int numero;
        int contador;

        System.out.println("Inserta un número:");
        numero= sc.nextInt();
        contador = 0;
        while (contador <= numero){
            System.out.println(contador);
            contador ++;
        }
    }
}
