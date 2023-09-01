import java.util.Scanner;

public class ContagemVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        scanner.close();

        int contadorVogais = contarVogais(frase);

        System.out.println("Número de vogais na frase: " + contadorVogais);
    }

    public static int contarVogais(String str) {
        int contador = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        return contador;
    }
}
