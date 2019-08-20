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
        List_Estado list = new List_Estado(null, null);
        Lista lista = new Lista(null, null);
        lista.insere(lista, 0);
        lista.insere(lista, 3);

        if (lista.busca_sentinela(lista, 3) == null) {
            System.out.println("not found");
        } else {
            System.out.println("found");
        }

        lista.exibe(lista);

        list.insere_estado( "Sao Paulo", "Presidente Prudente");
        list.insere_estado( "Parana", "Maringa");
        list.insere_estado( "Sao Paulo", "Campinas");
        list.insere_estado( "Sao Paulo", "Bauru");
        list.insere_estado( "Sao Paulo", "Alvares Machado");
        list.insere_estado( "Parana", "Londrina");
        list.insere_estado( "Mato Grosso do Sul", "Campo Grande");
        list.insere_estado( "Alagoas", "Maceio");
        list.insere_estado( "Amapa", "Macapa");
        list.insere_estado( "Amazonas", "Manaus");
        list.insere_estado( "Ceara", "Fortaleza");
        list.insere_estado( "Espirito Santo", "Vitoria");
        list.insere_estado( "Mato Grosso", "Cuiaba");
        list.insere_estado( "Maranhao", "Sao luis");
        list.insere_estado( "Para", "Belem");
        list.insere_estado( "Pernambuco", "Recife");
        list.insere_estado( "Rio de Janeiro", "Rio de janeiro");
        list.insere_estado( "Rondonia", "Londrina");

        if (list.busca_par("Parana", "Maringa")) {
            System.out.println("found");
        }
        list.exibe(list);
    }

    private void call_list() {
    }

}
