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
        Vetor vet = new Vetor();
        vet.inicializa_vet();
       
        vet.exibe();
        System.out.println("----");
        vet.heap_sort();
        vet.exibe();

        /*Lista lista = new Lista();
        lista.insere(2);
        lista.insere(6);
        lista.insere(7);
        lista.insere(5);
        lista.insere(4);
        lista.insere(8);
        lista.insere(9);

        lista.exibe();
        lista.bubble_sort();
        System.out.println("-------------------");
        lista.exibe();*/

        /*List_Estado list = new List_Estado();

        list.insere( "Sao Paulo", "Campinas");
        list.insere( "Sao Paulo", "Bauru");
        list.insere( "Sao Paulo", "Alvares Machado");
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
        list.exibe();*/
    }
}
