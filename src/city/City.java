/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city;

import Metodos.Lista;
import Metodos.Vetor;
import city.Lista.List_Estado;

/**
 *
 * @author hiroshi
 */
public class City {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Vetor vet = new Vetor();
        vet.inicializa_vet();
        vet.exibe();

        if(vet.busca_sentinela(5) != -1)
            System.out.println("achou");*/
        List_Estado list = new List_Estado(null);

        list.exibe();

        list.insere( "Sao Paulo", "Campinas");
        list.insere( "Sao Paulo", "Bauru");
        /*list.insere( "Sao Paulo", "Alvares Machado");
        list.insere( "Parana", "Londrina");
        list.insere( "Mato Grosso do Sul", "Campo Grande");
        list.insere( "Alagoas", "Maceio");
        list.insere( "Amapa", "Macapa");
        list.insere( "Amazonas", "Manaus");
        list.insere( "Ceara", "Fortaleza");
        list.insere( "Espirito Santo", "Vitoria");
        list.insere( "Mato Grosso", "Cuiaba");
        list.insere( "Maranhao", "Sao luis");
        list.insere( "Para", "Belem");
        list.insere( "Pernambuco", "Recife");
        list.insere( "Rio de Janeiro", "Rio de janeiro");
        list.insere( "Rondonia", "Londrina");
        list.exibe();

        if (list.busca_par("Parana", "Maringa")) {
            System.out.println("found");
        }*/
        list.exibe();
    }

    private void call_list() {
    }

}
