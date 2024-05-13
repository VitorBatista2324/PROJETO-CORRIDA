package Model;

import Contratos.Iacao1;

public abstract class Iniciar implements Iacao1 {
    @Override
    public void inciar() {
        System.out.println("-------Iniciando Corrida-------");
    }
}
