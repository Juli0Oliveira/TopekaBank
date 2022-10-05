import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //leitura de dados do teclado
        Scanner texto = new Scanner(System.in);
        String str;
        System.out.println("Entre com seu nome:");
        str = texto.nextLine();
    System.out.println("Bem-vindo " + str);

    texto.close();
    }
}