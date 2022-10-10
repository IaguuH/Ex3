import java.util.Scanner;

    public class App {
    public static void main(String[] args) {
    
        double numero1, numero2, soma;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o primeiro número - ");
        numero1 = teclado.nextDouble();
        System.out.print("Insira o segundo número - ");
        numero2 = teclado.nextDouble();

        System.out.print("Resultado = ");
        soma = numero1 + numero2;
        System.out.print(soma);
    }
    
}