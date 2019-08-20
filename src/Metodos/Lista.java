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

    public Lista(No ini, No fim) {
        this.ini = ini;
        this.fim = fim;
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

    public void insere(Lista head, int chave) {
        No nc = new No(null, null, chave);
        No aux;
        if (head.getIni() == null && head.getFim() == null) {
            head.setIni(nc);
            head.setFim(nc);
        } else {
            aux = head.getIni();

            while (aux.getProx() != null) {
                aux = aux.getProx();
            }

            aux.setProx(nc);
            nc.setAnt(aux);
            head.setFim(nc);
        }
    }

    public void exibe(Lista head) {
        No aux = head.getIni();

        while (aux != null) {
            System.out.println("" + aux.getNum());
            aux = aux.getProx();
        }
    }

    public No busca_exaustiva(Lista head, int chave) {
        No aux = head.getIni();

        while (aux != null && chave != aux.getNum()) {
            aux = aux.getProx();
        }

        if (aux != null) {
            return aux;
        }
        return null;
    } //funcionando

    public No busca_sentinela(Lista head, int chave) {
        No nc = new No(null, null, chave);
        No aux = head.getIni();
        
        head.getFim().setProx(nc);
        nc.setAnt(head.getFim());
        head.setFim(nc);
        
        while (aux.getNum() != chave) {
            aux = aux.getProx();
        }

        head.setFim(head.getFim().getAnt());
        head.getFim().setProx(null);
        nc = null;

        if (aux.getProx() == null) {
            return null;
        }
        return aux;
    } //funcionando
   
}
