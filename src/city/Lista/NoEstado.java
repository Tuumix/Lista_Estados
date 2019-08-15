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
public class NoEstado {
    private NoEstado ant, prox;
    private NoCidade list_cidade;
    private String estado;

    public NoEstado(NoEstado ant, NoEstado prox, NoCidade list_cidade, String estado) {
        this.ant = ant;
        this.prox = prox;
        this.list_cidade = list_cidade;
        this.estado = estado;
    }

    public NoEstado getAnt() {
        return ant;
    }

    public void setAnt(NoEstado ant) {
        this.ant = ant;
    }

    public NoEstado getProx() {
        return prox;
    }

    public void setProx(NoEstado prox) {
        this.prox = prox;
    }

    public NoCidade getList_cidade() {
        return list_cidade;
    }

    public void setList_cidade(NoCidade list_cidade) {
        this.list_cidade = list_cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
  
}
