/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed2.finalgrafos;

public class Arco {
    public int valor;
    public Nodo pDestino;
    public Arco prox;

    public Arco(int valor, Nodo pDestino, Arco prox) {
        this.valor = valor;
        this.pDestino = pDestino;
        this.prox = prox;
    }    
}
