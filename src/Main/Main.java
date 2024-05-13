package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe a potência do primeiro veículo: ");
        double potenciaVeiculo1 = scanner.nextDouble();

        System.out.println("Informe a potência do segundo veículo: ");
        double potenciaVeiculo2 = scanner.nextDouble();


        System.out.println("Potência do primeiro veículo: " + potenciaVeiculo1);
        System.out.println("Potência do segundo veículo: " + potenciaVeiculo2);
    }

}
