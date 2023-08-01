/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed2.finalgrafos;

public class Nodo {

    public String nombre;
    public Nodo prox;
    public Arco prim;
    public Arco ult;
    public int cantArcos;

    public Nodo(String nombre, Nodo prox) {
        this.nombre = nombre;
        this.prox = prox;
        this.prim = null;
        this.ult = null;
        this.cantArcos = 0;
    }

    public boolean vacio() {
        return prim == null;
    }

    public void insertarArco(int valor, Nodo pDestino, Arco prox) {
        if (vacio()) {
            prim = ult = new Arco(valor, pDestino, prox);
        } else {
            ult.prox = ult = new Arco(valor, pDestino, prox);
        }
        cantArcos++;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
