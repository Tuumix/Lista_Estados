/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city;

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
        List_Estado list = new List_Estado(null, null);

        list.insere_estado(list, "Sao Paulo", "Presidente Prudente");
        list.insere_estado(list, "Parana", "Maringa");
        list.insere_estado(list, "Sao Paulo", "Campinas");
        list.insere_estado(list, "Sao Paulo", "Bauru");
        list.insere_estado(list, "Sao Paulo", "Alvares Machado");
        list.insere_estado(list, "Parana", "Londrina");
        list.insere_estado(list, "Mato Grosso do Sul", "Campo Grande");
        list.insere_estado(list, "Alagoas", "Maceio");
        list.insere_estado(list, "Amapa", "Macapa");
        list.insere_estado(list, "Amazonas", "Manaus");
        list.insere_estado(list, "Ceara", "Fortaleza");
        list.insere_estado(list, "Espirito Santo", "Vitoria");
        list.insere_estado(list, "Mato Grosso", "Cuiaba");
        list.insere_estado(list, "Maranhao", "Sao luis");
        list.insere_estado(list, "Para", "Belem");
        list.insere_estado(list, "Pernambuco", "Recife");
        list.insere_estado(list, "Rio de Janeiro", "Rio de janeiro");
        list.insere_estado(list, "Rondonia", "Londrina");
        
        if(list.busca_par(list, "Parana", "Maringa"))
            System.out.println("found");
        //list.exibe(list);
    }

}
