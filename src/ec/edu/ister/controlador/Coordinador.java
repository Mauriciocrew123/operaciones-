/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import ec.edu.ister.modelo.Operaciones;
import java.util.Scanner;

/**
 *
 * @author LAB5-PC8-USUARIO
 */
public class Coordinador {

    Scanner entrada = new Scanner(System.in);
    Operaciones objOperaciones = new Operaciones();

    public void opcionesMenu() {
        System.out.println("Ingresa una opcion:\n"
                + "1.-sumar(met clase)\n"
                + "2.-restar (met clase)\n"
                + "3.-divicion(met instancia)\n"
                + "4.-multiplicacion(met instancia)\n"
                + "5.-salir\n");
        int op = entrada.nextInt();
    }

    public void menuScanner() {
        opcionesMenu();
        int op = 0;
        do {

            op = entrada.nextInt();
            switch (op) {
                case 1:
                    Operaciones.suma();
                    break;
                case 2:
                    System.out.println("La resta es:" + Operaciones.resta());
                    break;
                case 3:
                    objOperaciones.divion();
                    break;
                case 4:
                    System.out.println("La mulplicacion es:" + objOperaciones.multiplicacion());
                    break;

            }

        } while (op != 5);
    }
}
