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
    
    private NoEstado prox;
    private NoCidade cidade;
    private String estado;
    private List_Cidade list_cidade;

    public NoEstado(NoEstado prox, NoCidade cidade, String estado, List_Cidade list_cidade) {
        this.prox = prox;
        this.cidade = cidade;
        this.estado = estado;
        this.list_cidade = list_cidade;
    }

    public NoEstado getProx() {
        return prox;
    }

    public void setProx(NoEstado prox) {
        this.prox = prox;
    }

    public NoCidade getCidade() {
        return cidade;
    }

    public void setCidade(NoCidade cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List_Cidade getList_cidade() {
        return list_cidade;
    }

    public void setList_cidade(List_Cidade list_cidade) {
        this.list_cidade = list_cidade;
    }
    
}
