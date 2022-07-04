/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;
        
/**
 *
 * @author cesar
 */
public class ClsCalculadora {

    public ClsCalculadora() {
    }
       
    public void IniciarOperacion(){
        int opcion=0;
        do{
            try{
                opcion= Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion\n 1.Realizar una operacion\n 2.Salir "));
                    if (opcion==1) {

                        int operacion=0;

                            do{
                               try{
                                operacion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una operacion\n\n "
                                + "1.Suma\n 2.Resta\n 3.Multiplicacion\n 4.Division\n "
                                + "5.Potencia\n 6.Raiz Cuadrada\n 7.Salir"));
                                    if(operacion<7){
                                    double numero1=Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero\n\n"));
                                    double numero2=Double.parseDouble(JOptionPane.showInputDialog("Digite el Segundo numero\n\n"));

                                        switch (operacion) {
                                            case 1:
                                                JOptionPane.showMessageDialog(null,"El Resultado es:\n\n" + Math.round((numero1 + numero2)*100.0)/100.0);
                                                break;
                                            case 2:
                                                JOptionPane.showMessageDialog(null,"El Resultado es:\n\n" + (numero1 - numero2));
                                                break;
                                            case 3:
                                                JOptionPane.showMessageDialog(null,"El Resultado es:\n\n" +  numero1 * numero2);
                                                break;
                                            case 4:
                                                JOptionPane.showMessageDialog(null,"El Resultado es:\n\n" +  numero1 / numero2);
                                                break;
                                            case 5:
                                                JOptionPane.showMessageDialog(null,"El Resultado es:\n\n" +  Math.pow(numero1, numero2));
                                                break;
                                            case 6:
                                                JOptionPane.showMessageDialog(null,"El Resultado es:\n\n" +  Math.pow(numero1, 0.5));
                                                break;
                                            }
                                    }
                                }catch(Exception e) {
                                    JOptionPane.showMessageDialog(null,"Seleccion errada, Selecione una operacion nuevamente");
                                }
                            }while(operacion!=(7));
                     } 
                }catch(Exception e) {
                           JOptionPane.showMessageDialog(null,"Seleccion errada, Selecione una operacion nuevamente");
                       }
        }while(opcion!=(2));
    }
}