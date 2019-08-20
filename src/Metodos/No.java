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
public class No {
    private No ant, prox;
    private int num;

    public No(No ant, No prox, int num) {
        this.ant = null;
        this.prox = null;
        this.num = num;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }  
}
