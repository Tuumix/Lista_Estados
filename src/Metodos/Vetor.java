/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.util.Random;

/**
 *
 * @author hiroshi
 */
public class Vetor {

    private int TL = 7;
    private int[] vet = new int[100];
    private Random generator = new Random();

    public void inicializa_vet() {

        for (int i = 0; i < TL; i++) {
            vet[i] = generator.nextInt((10 - 1) + 1) + 1;
        }
    }

    public void exibe() {
        System.out.println("Valor : ");
        for (int i = 0; i < TL; i++) {
            System.out.println("" + vet[i]);
        }
    }

    public int busca_exaustiva(int chave) {
        int i = 0;

        while (i < TL && vet[i] != chave) {
            i++;
        }

        if (i < TL) {
            return i;
        }
        return -1;
    }

    public int busca_sentinela(int chave) {
        int i = 0;
        vet[TL] = chave;

        while (vet[i] != chave) {
            i++;
        }
        vet[TL] = vet[TL + 1];
        if (i < TL) {
            return i;
        }
        return -1;
    }

    public int busca_binaria(int chave) {
        int ini = 0, fim = TL - 1, meio = fim / 2;

        while (ini < fim) {

        }
        return 1;
    }

    public void insercao_binaria(int chave) {
        int pos, aux;

        for (int i = 1; i < TL; i++) {
            aux = vet[i];
            pos = i;

            while (pos > 0 && aux < vet[pos - 1]) {

            }
        }
    }

    //-------------------------------------------------------------------------------- ORDENAÇÂO
    public void selecao_direta() {
        int menor, posmenor;

        for (int i = 0; i < TL - 1; i++) {
            menor = vet[i];
            posmenor = i;
            for (int j = i + 1; j < TL; j++) {
                if (vet[j] < menor) {
                    menor = vet[j];
                    posmenor = j;
                }
            }
            vet[posmenor] = vet[i];
            vet[i] = menor;
        }
    }

    public void bubble_sort() {
        int aux;
        int tl2 = TL;

        while (tl2 > 1) {
            for (int j = 0; j < TL - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
            tl2--;
        }
    }

    public void shake_sort() {
        int ini = 0, fim = TL - 1, aux;

        while (ini < fim) {
            for (int j = 0; j < fim; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
            
            fim--;
            
            for(int k = fim; k > ini;k--){
                if(vet[k] < vet[k-1]){
                    aux = vet[k];
                    vet[k] = vet[k-1];
                    vet[k-1] = aux;
                }
            }
            ini++;
        }
    }
    
    public void heap_sort(){
        int pai, fe, fd, tl2 = TL, maiorf = 0, aux;
        
        while(tl2 != 1){
            pai = tl2/2 - 1;
            
            while(pai >= 0){
                fe = pai + pai + 1;
                fd = fe + 1;
                
                if(fd < tl2){
                    if(vet[fe] > vet[fd])
                        maiorf = fe;
                    else
                        maiorf = fd;
                }
                else
                    maiorf = fe;
                if(vet[maiorf] > vet[pai]){
                    aux = vet[pai];
                    vet[pai] = vet[maiorf];
                    vet[maiorf] = aux;
                }
                pai--;
            }
            
            aux = vet[0];
            vet[0] = vet[tl2-1];
            vet[tl2-1] = aux;
            tl2--;
        }
    }
}
