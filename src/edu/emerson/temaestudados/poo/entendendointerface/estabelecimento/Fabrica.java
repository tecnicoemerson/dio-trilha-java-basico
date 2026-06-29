package edu.emerson.temaestudados.poo.entendendointerface.estabelecimento;

import edu.emerson.temaestudados.poo.entendendointerface.equipamentos.copiadora.Copiadora;
import edu.emerson.temaestudados.poo.entendendointerface.equipamentos.digitalizadora.Digitalizadora;
import edu.emerson.temaestudados.poo.entendendointerface.equipamentos.digitalizadora.Scanner;
import edu.emerson.temaestudados.poo.entendendointerface.equipamentos.impressora.DeskJet;
import edu.emerson.temaestudados.poo.entendendointerface.equipamentos.impressora.Impressora;
import edu.emerson.temaestudados.poo.entendendointerface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        DeskJet desk = new DeskJet();
        Scanner scanner = new Scanner();

        Impressora impressora = desk;
        //Impressora impressora = em;
        Digitalizadora digitalizadora = scanner;
        //Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
