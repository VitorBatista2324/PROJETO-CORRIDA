package Model;

import Contratos.Iacao2;
import Contratos.Iacao3;

import java.util.Scanner;

public class Veiculo extends Piloto  {
    private double potencia1;
    private double potencia2;

    public Veiculo(String nome1, int idade1, String nome2, int idade2, double potencia1, double potencia2) {
        super(nome1, idade1, nome2, idade2);
        this.potencia1 = potencia1;
        this.potencia2 = potencia2;
    }

    public double getPotencia1() {
        return potencia1;
    }

    public double getPotencia2() {
        return potencia2;
    }

    public void preencherDadosVeiculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a potência do veículo do Piloto1: ");
        potencia1 = scanner.nextDouble();

        System.out.println("Informe a potência do veículo do Piloto2: ");
        potencia2 = scanner.nextDouble();

        if (potencia1 > potencia2) {
            System.out.println("O Piloto 1 venceu a corrida!");


        } else if (potencia2 > potencia1) {
            System.out.println("O Piloto2 venceu a corrida!");


        } else {
            System.out.println("A corrida terminou em empate!");
        }

    }
}

