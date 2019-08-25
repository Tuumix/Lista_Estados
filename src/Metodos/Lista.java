/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author hiroshi
 */
public class Lista {

    private No ini, fim;

    public Lista() {
        this.ini = null;
        this.fim = null;
    }

    public No getIni() {
        return ini;
    }

    public void setIni(No ini) {
        this.ini = ini;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public void insere(int chave) {
        No nc = new No(null, null, chave);
        No aux;
        if (ini == null && fim == null) {
            ini = nc;
            fim = nc;
        } else {
            aux = ini;

            while (aux.getProx() != null) {
                aux = aux.getProx();
            }

            aux.setProx(nc);
            nc.setAnt(aux);
            fim = nc;
        }
    }

    public void exibe() {
        No aux = ini;

        while (aux != null) {
            System.out.println("" + aux.getNum());
            aux = aux.getProx();
        }
    }

    public No busca_exaustiva(int chave) {
        No aux = ini;

        while (aux != null && chave != aux.getNum()) {
            aux = aux.getProx();
        }

        if (aux != null) {
            return aux;
        }
        return null;
    } //funcionando

    public No busca_sentinela(int chave) {
        No nc = new No(null, null, chave);
        No aux = ini;

        ini.setProx(nc);
        nc.setAnt(fim);
        fim = nc;

        while (aux.getNum() != chave) {
            aux = aux.getProx();
        }

        nc = fim;
        fim = nc.getAnt();
        nc = null;

        if (aux.getProx() == null) {
            return null;
        }
        return aux;
    } //funcionando

    //-------------------------------------------------------------------- ORDENAÇÃO
    public void selecao_direta() {
        No posmenor, aux = ini, j;
        int menor;

        while (aux.getProx() != null) {
            posmenor = aux;
            menor = posmenor.getNum();
            j = aux.getProx();
            while (j != null) {
                if (j.getNum() < menor) {
                    posmenor = j;
                    menor = j.getNum();
                }
                j = j.getProx();
            }
            posmenor.setNum(aux.getNum());
            aux.setNum(menor);
            aux = aux.getProx();
        }
    }
}
