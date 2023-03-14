/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbin3;

import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class ArbolBIN3 {

    /**
     * @param args the command line arguments
     */
    public static String Salida;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo raiz = new Nodo("1");
        
        Nodo nodo2 = new Nodo("2");
        
        Nodo nodo3 = new Nodo("3");
        
        raiz.setNodoIzquierdo((nodo2));
        
        nodo2.setNodoIzquierdo(new Nodo("4"));
        
        
        raiz.setNodoDerecho(nodo3);
        
        nodo3.setNodoIzquierdo(new Nodo("5"));
        nodo3.setNodoDerecho(new Nodo("6"));
        
        Salida = "";
        
        Salida +="\nDatos en In Orden\n";
        InOrden(raiz);
        
        Salida += "\nDatos en Pre Orden\n";
        PreOrden(raiz);
        
        Salida += "\nDatos en Post Orden\n";
        PostOrden(raiz);  
       
        JOptionPane.showMessageDialog(null,"Los Datos del Árbol son: "+Salida,"\nMuestra Árbol Binario", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void InOrden(Nodo raiz) { 
        if (raiz != null) {
            InOrden(raiz.getNodoIzquierdo());
            Salida += " " + raiz.getDato() + " ";
            InOrden(raiz.getNodoDerecho());
        }
    }
    
    public static void PreOrden(Nodo raiz) {
        if (raiz != null) {
            Salida += " " + raiz.getDato() + " ";
            PreOrden(raiz.getNodoIzquierdo());
            PreOrden(raiz.getNodoDerecho());  
        }
    }
    
    public static void PostOrden(Nodo raiz) {
        if (raiz != null){
            PostOrden(raiz.getNodoIzquierdo());
            PostOrden(raiz.getNodoDerecho());
            Salida += " " + raiz.getDato() + " ";
        }
    }
}
