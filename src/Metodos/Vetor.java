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

    private int TL = 10;
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
        
        while(ini < fim){
            
        }
        return 1;
    }
    
    public void insercao_binaria(int chave){
        int pos, aux;
        
        for(int i = 1; i < TL; i++)
        {
            aux = vet[i];
            pos = i;
            
            while(pos > 0 && aux < vet[pos-1]){
                
            }
        }
    }

    //-------------------------------------------------------------------------------- ORDENAÇÂO
    
    public void selecao_direta(){
        int menor, posmenor;
        
        for(int i = 0; i < TL - 1;i++){
            menor = vet[i];
            posmenor = i;
            for(int j = i + 1; j < TL;j++){
                if(vet[j] < menor){
                    menor = vet[j];
                    posmenor = j;
                }
            }
            vet[posmenor] = vet[i];
            vet[i] = menor;
        }
    }
    
    public void bubble_sort() {

    }
}
