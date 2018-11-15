/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB5-PC8-USUARIO
 */
public class Operaciones {
    private int n1 , n2;

    public Operaciones() {
    }

    public Operaciones(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public static void suma() {
        JOptionPane.showMessageDialog(null,"la suma es: "+(5+6));
    }
        public static int resta() {
            return 7-3;
            
        }
    public void divicion() {
         JOptionPane.showMessageDialog(null,"la suma es: "+(5+6));
    }
    public int multiplicacion() {
        return 4*6;
    }

    public void divion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
