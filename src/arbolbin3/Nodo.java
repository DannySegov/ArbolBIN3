/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbin3;

/**
 *
 * @author carol
 */
public class Nodo {
    //Atributo
    public String Dato;
    public Nodo NodoIzquierdo;
    public Nodo NodoDerecho;
    
    //Constructor
    public Nodo(String dato){
        this.Dato = dato;
        this.NodoIzquierdo = null;
        this.NodoDerecho = null;
    }

    public String getDato() {
        return Dato;
    }

    public void setDato(String Dato) {
        this.Dato = Dato;
    }

    public Nodo getNodoIzquierdo() {
        return NodoIzquierdo;
    }

    public void setNodoIzquierdo(Nodo NodoIzquierdo) {
        this.NodoIzquierdo = NodoIzquierdo;
    }

    public Nodo getNodoDerecho() {
        return NodoDerecho;
    }

    public void setNodoDerecho(Nodo NodoDerecho) {
        this.NodoDerecho = NodoDerecho;
    }  
}
