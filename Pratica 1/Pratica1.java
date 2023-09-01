import java.util.Scanner;

public class CalculoConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tempo gasto na viagem (em horas): ");
        double tempoViagem = scanner.nextDouble();

        System.out.print("Informe a velocidade média (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        System.out.print("Informe o consumo de combustível (km por litro): ");
        double consumoKmPorLitro = scanner.nextDouble();

        scanner.close();

        double distanciaPercorrida = tempoViagem * velocidadeMedia;
        double combustivelGasto = distanciaPercorrida / consumoKmPorLitro;

        System.out.println("Distância percorrida: " + distanciaPercorrida + " km");
        System.out.println("Combustível gasto: " + combustivelGasto + " litros");
    }
}
