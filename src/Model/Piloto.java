package Model;

import Contratos.Iacao2;
import Contratos.Iacao3;

import java.util.Scanner;

public class Piloto implements Iacao2,Iacao3 {
    public String nome1;
    public int idade1;
    public String nome2;
    public int idade2;


    public Piloto(String nome1,int idade1,String nome2,int idade2){

        this.nome1 = nome1;
        this.idade1 = idade1;
        this.nome2 = nome2;
        this.idade2 = idade2;
    }

    public Piloto() {

    }

    public String getNome1() {
        return nome1;
    }

    public int getIdade1() {
        return idade1;
    }

    public String getNome2() {
        return nome2;
    }

    public int getIdade2() {
        return idade2;
    }
    @Override
    public void informacoesPiloto1() {
        String nomeDoPiloto1 = getNome1();
        int idadeDoPiloto1 = getIdade1();
        System.out.println("Nome do piloto1: " + nomeDoPiloto1);
        System.out.println("Idade do piloto1: " + idadeDoPiloto1);
    }

    @Override
    public void informacoesPiloto2() {
        String nomeDoPiloto2 = getNome2();
        int idadeDoPiloto2 = getIdade2();
        System.out.println("Nome do piloto2: " + nomeDoPiloto2);
        System.out.println("Idade do piloto2: " + idadeDoPiloto2);
    }

    public void preencherDadosPilotos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do primeiro piloto: ");
        nome1 = scanner.nextLine();

        System.out.println("Informe a idade do primeiro piloto: ");
        idade1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o nome do segundo piloto: ");
        nome2 = scanner.nextLine();

        System.out.println("Informe a idade do segundo piloto: ");
        idade2 = scanner.nextInt();
        scanner.nextLine();


        informacoesPiloto1();
        System.out.println();
        informacoesPiloto2();








    }

}
