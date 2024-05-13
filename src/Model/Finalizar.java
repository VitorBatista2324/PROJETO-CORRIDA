package Model;

import Contratos.Iacao4;

public abstract class Finalizar implements Iacao4 {
    @Override
    public void finalizar() {
        System.out.println("--------Corrida Encerrada!---------");
    }
}
