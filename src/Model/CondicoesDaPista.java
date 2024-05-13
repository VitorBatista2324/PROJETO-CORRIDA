package Model;

public class CondicoesDaPista extends Clima {

    public void condicoes(){
        InterfaceGrafica interfaceGrafica = new InterfaceGrafica();
        System.out.println("O clima da pista está: " + getClimas());
    }
}
