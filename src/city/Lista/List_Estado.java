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

    private NoEstado ini, fim;

    public List_Estado(NoEstado ini, NoEstado fim) {
        this.ini = ini;
        this.fim = fim;
    }

    public NoEstado getIni() {
        return ini;
    }

    public void setIni(NoEstado ini) {
        this.ini = ini;
    }

    public NoEstado getFim() {
        return fim;
    }

    public void setFim(NoEstado fim) {
        this.fim = fim;
    }

    public void inicializa() {
        ini = fim = null;
    }

    public NoEstado busca(List_Estado list, String chave) {
        NoEstado aux = list.getIni();

        while (aux != null && !aux.getEstado().equals(chave)) {
            aux = aux.getProx();
        }

        if (aux != null) {
            return aux;
        }
        return null;
    }

    public void exibe(List_Estado lista) {
        NoEstado aux = lista.getIni();

        while (aux != null) {
            NoCidade auxC = aux.getList_cidade();
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━");

            System.out.println("Estado : " + aux.getEstado());
            while (auxC != null) {
                System.out.println("〖" + auxC.getCidade() + "〗");
                auxC = auxC.getBaixo();
            }
            aux = aux.getProx();
        }
    }

    public void insere_estado(List_Estado lista, String estado, String cidade) {
        NoEstado nc = new NoEstado(null, null, null, estado);
        NoEstado aux, ant, pos;

        if (lista.getIni() == null && lista.getFim() == null) {
            lista.setIni(nc);
            lista.setFim(nc);
            insere_cidades(nc, cidade);
        } else {
            pos = busca(lista, estado);
            if (pos == null) {
                aux = ant = lista.getIni();

                while (aux.getProx() != null && estado.compareTo(aux.getEstado()) > 0) {
                    ant = aux;
                    aux = aux.getProx();
                }

                if (lista.getIni().getEstado().equals(aux.getEstado())) { //inserir no inicio
                    nc.setProx(aux);
                    aux.setAnt(nc);
                    lista.setIni(nc);
                } else if (estado.compareTo(lista.getFim().getEstado()) > 0) { //insere no final
                    lista.getFim().setProx(nc);
                    lista.setFim(nc);
                } else {
                    nc.setProx(aux);
                    aux.setAnt(nc);
                    nc.setAnt(ant);
                    ant.setProx(nc);
                }
                insere_cidades(nc, cidade);
            } else {
                insere_cidades(pos, cidade);
            }
        }
    }

    public void insere_cidades(NoEstado head, String cidade) {
        NoCidade nc = new NoCidade(null, cidade);
        NoCidade ant;

        if (head.getList_cidade() == null) {
            head.setList_cidade(nc);
        } else {
            NoCidade aux = head.getList_cidade();
            ant = null;

            while (aux.getBaixo() != null && cidade.compareTo(aux.getCidade()) > 0) {
                ant = aux;
                aux = aux.getBaixo();
            }

            if (head.getList_cidade().getCidade().equals(aux.getCidade())) {
                nc.setBaixo(head.getList_cidade());
                head.setList_cidade(nc);
            } else if (cidade.compareTo(aux.getCidade()) < 0) {
                nc.setBaixo(ant.getBaixo());
                ant.setBaixo(nc);
            } else {
                aux.setBaixo(nc);
            }

        }
    }

    public NoCidade busca_cidades(List_Estado lista, String cidade) {
        NoEstado aux = lista.getIni();
        NoCidade auxC, pos = null;

        while (aux != null) {
            auxC = aux.getList_cidade();
            while (auxC != null && !auxC.getCidade().equals(cidade)) {
                auxC = auxC.getBaixo();
            }
            if (auxC != null) {
                pos = auxC;
            }
            aux = aux.getProx();
        }

        return pos;
    }

    public Boolean busca_par(List_Estado lista, String estado, String cidade) {
        NoEstado aux = lista.getIni();
        NoCidade auxC;
        Boolean found = false;

        while (aux != null) {
            auxC = aux.getList_cidade();

            while (auxC != null && !auxC.getCidade().equals(cidade) && !aux.getEstado().equals(estado)) {
                auxC = auxC.getBaixo();
                found = true;
            }
            aux = aux.getProx();
        }
        
        if(found)
            return true;
        return false;
    }
}
