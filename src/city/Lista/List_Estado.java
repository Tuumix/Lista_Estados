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
public class List_Estado {

    private NoEstado ini;

    public List_Estado(NoEstado ini) {
        this.ini = ini;
    }

    public NoEstado getIni() {
        return ini;
    }

    public void setIni(NoEstado ini) {
        this.ini = ini;
    }

    public NoEstado busca_estado(String estado) //funcionando
    {
        NoEstado aux = ini;

        while (aux != null && !estado.equals(aux.getEstado())) {
            aux = aux.getProx();
        }
        return aux;
    }

    public void insere(String estado, String cidade) {
        NoEstado aux, ant, pos;

        if (ini == null) {
            NoEstado nc = new NoEstado(null, null, estado, new List_Cidade(null));
            ini = nc;
            nc.getList_cidade().insere(cidade);
        } else {
            pos = busca_estado(estado);

            if (pos == null) {
                aux = ini;
                ant = null;

                while (ini != null && estado.compareTo(aux.getEstado()) > 0) {
                    ant = aux;
                    aux = aux.getProx();
                }

                if (aux == ini) {
                    NoEstado nc = new NoEstado(null, null, estado, new List_Cidade(null));
                    nc.setProx(aux);
                    ini = nc;
                    nc.getList_cidade().insere(cidade);
                } else {
                    NoEstado nc = new NoEstado(null, null, estado, new List_Cidade(null));
                    nc.setProx(ant.getProx());
                    ant.setProx(nc);
                    nc.getList_cidade().insere(cidade);
                }
            } else {
                pos.getList_cidade().insere(cidade);
                //System.out.println(""+pos.getCidade().getCidade());
            }
        }
    }

    public void exibe() {
        NoEstado aux = ini;
        NoCidade auxCid;
        while (aux != null) {
            auxCid = aux.getCidade();
            System.out.println("Estado : " + aux.getEstado());
            while (auxCid != null) {
                System.out.println("---------" + auxCid.getCidade());
                auxCid = auxCid.getBaixo();
            }
            aux = aux.getProx();
        }
    }
}
