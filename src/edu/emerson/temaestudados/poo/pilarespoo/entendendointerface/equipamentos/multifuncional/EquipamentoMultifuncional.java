package edu.emerson.temaestudados.poo.pilarespoo.entendendointerface.equipamentos.multifuncional;

import edu.emerson.temaestudados.poo.pilarespoo.entendendointerface.equipamentos.copiadora.Copiadora;
import edu.emerson.temaestudados.poo.pilarespoo.entendendointerface.equipamentos.digitalizadora.Digitalizadora;
import edu.emerson.temaestudados.poo.pilarespoo.entendendointerface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {
    @Override
    public void copiar() {
        System.out.println("Copiando Via Equipamento MultiFuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando Via Equipamento MultiFuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Via Equipamento MultiFuncional");
    }
}
