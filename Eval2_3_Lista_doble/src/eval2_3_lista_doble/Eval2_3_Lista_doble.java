/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval2_3_lista_doble;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moviles
 */
public class Eval2_3_Lista_doble {

    public static void main(String[] args) {
        ListaDoble listaDoble = new ListaDoble();
        
        listaDoble.agregar(10);//0
        listaDoble.agregar(20);//1
        listaDoble.agregar(30);//2
        listaDoble.agregar(40);//3
        listaDoble.imprimir();
        
        
        try {
            listaDoble.insertarEn(5, 0);
        } catch (Exception ex) {
            Logger.getLogger(Eval2_3_Lista_doble.class.getName()).log(Level.SEVERE, null, ex);
        }
            listaDoble.imprimir();
        
        
        try {
            listaDoble.borrarEn(1);
        } catch (Exception ex) {
            Logger.getLogger(Eval2_3_Lista_doble.class.getName()).log(Level.SEVERE, null, ex);
        }
            listaDoble.imprimir();
    }
}
