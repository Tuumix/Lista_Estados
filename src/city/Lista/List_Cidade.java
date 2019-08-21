/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city.Lista;

/**
 *
 * @author hiroshi
 */
public class List_Cidade {

    private NoCidade ini;

    public List_Cidade(NoCidade ini) {
        this.ini = ini;
    }

    public NoCidade getIni() {
        return ini;
    }

    public void setIni(NoCidade ini) {
        this.ini = ini;
    }

    public NoCidade busca_cidade(String cidade) {
        NoCidade aux = ini;

        while (aux != null && !aux.equals(aux.getCidade())) {
            aux = aux.getBaixo();
        }

        return aux;
    }

    public void insere(String cidade) {
        NoCidade aux, ant;

        if (ini == null) {
            NoCidade nc = new NoCidade(null, cidade);
            ini = nc;
        } else {
            aux = ini;
            ant = null;

            while (aux != null && cidade.compareTo(aux.getCidade()) > 0) {
                ant = aux;
                aux = aux.getBaixo();
            }

            if (aux == ini) {
                NoCidade nc = new NoCidade(null, cidade);
                nc.setBaixo(ini);
                ini = nc;
            } else {
                NoCidade nc = new NoCidade(null, cidade);
                nc.setBaixo(ant.getBaixo());
                ant.setBaixo(nc);
            }

        }
    }
}
