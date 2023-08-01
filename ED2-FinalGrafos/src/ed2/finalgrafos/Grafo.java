/*
 * https://github.com/starcode07/01
 * To change this template file, choose Tools | Templates
 * To change this license header, choose License Headers in Project Properties.
 */
package ed2.finalgrafos;

import java.util.HashSet;
import java.util.LinkedList;

public class Grafo {

//    public Nodo prim;
//    public Nodo ult;
//    public int cantNodos;
//
//    public Grafo() {
//        this.prim = null;
//        this.ult = null;
//        this.cantNodos = 0;
//    }
//
//    public boolean vacia() {
//        return prim == null;
//    }
//
//    /*  *****  5 Metodos para crear y consultar un grafo.  *****   */
//    
//    /*  1. G1.seEncuentra(name) : Método que verifica si un nodo se encuentra en el grafo   */
//    public boolean seEncuentra(String nombre) {
//        Nodo actual = prim;
//        while (actual != null) {
//            if (actual.nombre.equals(nombre)) {
//                return true;
//            }
//            actual = actual.prox;
//        }
//        return false;
//    }
//
//    /*    2. G1.insertarNodo(name) : Método que insertar un nodo en el grafo */
//    public void insertarNodo(String nombre) {
//        if (this.seEncuentra(nombre)) {
//            return;
//        }
//        if (this.vacia()) {
//            prim = ult = new Nodo(nombre, null);
//        } else {
//            ult.prox = ult = new Nodo(nombre, null);
//        }
//        cantNodos++;
//    }
//
//    /*    3. G1.insertarArco(name1, name2, valor) */
//    public Nodo buscarNodo(String nombre) {
//        Nodo actual = prim;
//        while (actual != null) {
//            if (actual.nombre.equals(nombre)) {
//                return actual;
//            }
//            actual = actual.prox;
//        }
//        return null;
//    }
//
//    public void insertarArco(String nombreOrigen, String nombreDestino, int valor) {
//        Nodo pOrigen = buscarNodo(nombreOrigen);
//        Nodo pDestino = buscarNodo(nombreDestino);
//        if (pOrigen == null || pDestino == null) {
//            return;
//        }
//        pOrigen.insertarArco(valor, pDestino, null);
//    }
//
//    /*    4. G1.mostrarGrafo(): Método que muestra un grafo. */
//    public void mostrarGrafo() {
//        Nodo actual = prim;
//        while (actual != null) {
//            System.out.print(actual.nombre + " -> ");
//            Arco arcoActual = actual.prim;
//            while (arcoActual != null) {
//                System.out.print(arcoActual.pDestino.nombre + "," + arcoActual.valor + " ");
//                arcoActual = arcoActual.prox;
//            }
//            System.out.println();
//            actual = actual.prox;
//        }
//    }
//
//    /* 5. G1.cantidadLlegadas(name1) : devuelve la cantidad de arcos que llegan al nodo X.*/
//    public int cantidadLlegadas(String nombreNodo) {
//        int cantidad = 0;
//        Nodo actual = prim;
//        while (actual != null) {
//            Arco arcoActual = actual.prim;
//            while (arcoActual != null) {
//                if (arcoActual.pDestino.nombre.equals(nombreNodo)) {
//                    cantidad++;
//                }
//                arcoActual = arcoActual.prox;
//            }
//            actual = actual.prox;
//        }
//        return cantidad;
//    }
//
//    /* 6. G1.mostrarNodosBucle(): muestra los nodos que tienen bubles.*/
//    public void mostrarNodosBucle() {
//        Nodo actual = prim;
//        while (actual != null) {
//            boolean tieneBucle = false;
//            Arco arcoActual = actual.prim;
//            while (arcoActual != null && !tieneBucle) {
//                if (arcoActual.pDestino == actual) {
//                    tieneBucle = true;
//                }
//                arcoActual = arcoActual.prox;
//            }
//            if (tieneBucle) {
//                System.out.println("Nodo con bucle: " + actual.nombre);
//            }
//            actual = actual.prox;
//        }
//    }
//
//    /*  *****  5 Metodos navegacion y consultas en un grafo. backtracking().  *****  */
//    /*  1. G1.mostrarCaminos(name1, name2) : muestra todos los caminos posibles desde el nodo name1 hasta name2 */
//    public void mostrarCamino(String nombreInicio, String nombreDestino) {
//        Nodo nodoInicio = buscarNodo(nombreInicio);
//        Nodo nodoDestino = buscarNodo(nombreDestino);
//        if (nodoInicio == null || nodoDestino == null) {
//            return;
//        }
//        LinkedList<Nodo> caminoActual = new LinkedList<>();
//        caminoActual.add(nodoInicio);
//        mostrarCamino(caminoActual, nodoInicio, nodoDestino);
//    }
//
//    public void mostrarCamino(LinkedList<Nodo> caminoActual, Nodo nodoActual, Nodo nodoDestino) {
//        if (nodoActual == nodoDestino) {
//            System.out.println(caminoActual);
//            return;
//        }
//        Arco arcoActual = nodoActual.prim;
//        while (arcoActual != null) {
//            if (!caminoActual.contains(arcoActual.pDestino)) {
//                caminoActual.add(arcoActual.pDestino);
//                mostrarCamino(caminoActual, arcoActual.pDestino, nodoDestino);
//                caminoActual.removeLast();
//            }
//            arcoActual = arcoActual.prox;
//        }
//    }
//
//    /*  2. G1.cantidadCaminos(name1, name2) : Cantidad total de formas de llegadas que existen desde el nodo name1 hasta name2.*/
//    public int cantidadCaminos(String nombreInicio, String nombreDestino) {
//        Nodo nodoInicio = buscarNodo(nombreInicio);
//        Nodo nodoDestino = buscarNodo(nombreDestino);
//        if (nodoInicio == null || nodoDestino == null) {
//            return 0;
//        }
//        return contarCaminos(nodoInicio, nodoDestino, new HashSet<>());
//    }
//
//    private int contarCaminos(Nodo nodoActual, Nodo nodoDestino, HashSet<Nodo> visitados) {
//        if (nodoActual == nodoDestino) {
//            return 1;
//        }
//        int cantidadCaminos = 0;
//        Arco arcoActual = nodoActual.prim;
//        while (arcoActual != null) {
//            if (!visitados.contains(arcoActual.pDestino)) {
//                visitados.add(arcoActual.pDestino);
//                cantidadCaminos = cantidadCaminos + contarCaminos(arcoActual.pDestino, nodoDestino, visitados);
//                visitados.remove(arcoActual.pDestino);
//            }
//            arcoActual = arcoActual.prox;
//        }
//        return cantidadCaminos;
//    }
//
//    /*  3. G1.mostrarCaminosMasValorTotal(name1, name2) : con su valor total del recorrido.*/
//    public void mostrarCaminosMasValorTotal(String nombreInicio, String nombreDestino) {
//        Nodo nodoInicio = buscarNodo(nombreInicio);
//        Nodo nodoDestino = buscarNodo(nombreDestino);
//        if (nodoInicio == null || nodoDestino == null) {
//            System.out.println("Algun nodo no existe en el grafo.");
//            return;
//        }
//        mostrarTotalCaminoRecursivo(nodoInicio, nodoDestino, new LinkedList<>(), 0);
//    }
//
//    private void mostrarTotalCaminoRecursivo(Nodo nodoActual, Nodo nodoDestino, LinkedList<Nodo> caminoActual, int costoTotal) {
//        caminoActual.add(nodoActual);
//
//        if (nodoActual == nodoDestino) {
//            System.out.print("Caminos: ");
//            for (Nodo nodo : caminoActual) {
//                System.out.print(nodo.nombre + " -> ");
//            }
//            System.out.println("Costo total: " + costoTotal);
//        } else {
//            Arco arcoActual = nodoActual.prim;
//            while (arcoActual != null) {
//                if (!caminoActual.contains(arcoActual.pDestino)) {
//                    mostrarTotalCaminoRecursivo(arcoActual.pDestino, nodoDestino, caminoActual, costoTotal + arcoActual.valor);
//                }
//                arcoActual = arcoActual.prox;
//            }
//        }
//        caminoActual.removeLast();
//    }
//
//    /*4. G1.existeCaminoIdaVuelta(nombreInicio, nombreDestino) :  */
//    public boolean existeCaminoIdaVuelta(String nombreInicio, String nombreDestino) {
//        Nodo nodoInicio = buscarNodo(nombreInicio);
//        Nodo nodoDestino = buscarNodo(nombreDestino);
//        if (nodoInicio == null || nodoDestino == null) {
//            return false;
//        }
//
//        HashSet<Nodo> visitadosInicio = new HashSet<>();
//        HashSet<Nodo> visitadosDestino = new HashSet<>();
//
//        return recorridoBacktracking(nodoInicio, nodoDestino, visitadosInicio)
//                && recorridoBacktracking(nodoDestino, nodoInicio, visitadosDestino);
//    }
//
//    private boolean recorridoBacktracking(Nodo nodoActual, Nodo nodoDestino, HashSet<Nodo> visitados) {
//        if (nodoActual == nodoDestino) {
//            return true;
//        }
//        visitados.add(nodoActual);
//        Arco arcoActual = nodoActual.prim;
//        while (arcoActual != null) {
//            Nodo nodoVecino = arcoActual.pDestino;
//            if (!visitados.contains(nodoVecino)) {
//                if (recorridoBacktracking(nodoVecino, nodoDestino, visitados)) {
//                    return true;
//                }
//            }
//            arcoActual = arcoActual.prox;
//        }
//        visitados.remove(nodoActual);
//        return false;
//    }
//
//    /*5. G1.esFuertementeConexo() : 
//         cualquier nodo del grafo puede alcanzar cualquier otro nodo mediante una secuencia de caminos.*/
//    public boolean esFuertementeConexo() {
//        for (Nodo nodo : obtenerTodosLosNodos()) {
//            for (Nodo otroNodo : obtenerTodosLosNodos()) {
//                if (nodo != otroNodo && !existeCaminoIdaVuelta(nodo.nombre, otroNodo.nombre)) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    public LinkedList<Nodo> obtenerTodosLosNodos() {
//        LinkedList<Nodo> nodos = new LinkedList<>();
//        Nodo actual = prim;
//        while (actual != null) {
//            nodos.add(actual);
//            actual = actual.prox;
//        }
//        return nodos;
//    }
    
}
