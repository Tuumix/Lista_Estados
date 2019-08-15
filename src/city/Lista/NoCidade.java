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
public class NoCidade {
    private NoCidade baixo;
    private String cidade;
    
    public NoCidade(NoCidade baixo, String cidade){
        this.baixo = baixo;
        this.cidade = cidade;
    }

    public NoCidade getBaixo() {
        return baixo;
    }

    public void setBaixo(NoCidade baixo) {
        this.baixo = baixo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
}
