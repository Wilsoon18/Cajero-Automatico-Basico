/*
Autor: Wilson Velasquez
Universidad Mariano Galvez de Guatemala
Hacer un programa que simule un cajero automatico con saldo inicial de 1000
1. ingresar dinero a la cuenta
2.retirar dinero de la cuenta
3.salir.
 */
package cajero_automatico;

import javax.swing.JOptionPane;

public class Cajero_Automatico {

    
    public static void main(String[] args) {
       int saldo_inicial = 1000;
       int opc;
       float ingreso,saldoActual,retiro;
       
       opc = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su Cajero Automatico\n"
      
               + "1. Ingresar dinero a la cuenta\n"
               + "2. Retirar dinero de la cuenta\n"
               + "3. Salir"));
       
      switch(opc){
      
          case 1: ingreso = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar."));
                  saldoActual = saldo_inicial + ingreso;
                  JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldoActual);
                  break;
                  
          case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar: "));
                  
            if (retiro>saldo_inicial){
                JOptionPane.showMessageDialog(null,"No cuenta con saldo suficiente para retirar");
            }
            else{
                saldoActual = saldo_inicial - retiro;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldoActual);
                break;
            }
          case 3: break;
          default: JOptionPane.showMessageDialog(null, "Opcion incorrecta.");
      }
    }  
}
