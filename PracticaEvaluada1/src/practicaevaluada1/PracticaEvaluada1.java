/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author Santi
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicita nombre de usuario y salario
        String nombreUsuario = JOptionPane.showInputDialog("Digite su nombre de Usuario");
        String SalarioMensual = JOptionPane.showInputDialog("Digite en colones el monto recibido como salario");
        //Se hacen los calculos correspondientes
        int salarioMensual = Integer.parseInt(SalarioMensual);
        double montoSEM = salarioMensual * 0.0925;
        double montoIVM = salarioMensual * 0.0508;
        int montoFinal = (int) (montoIVM + montoSEM);
        double deduccionAso = (salarioMensual - montoFinal) * 0.025;
        //Salida de datos
        JOptionPane.showMessageDialog(null, "Para el usuario" + nombreUsuario + "empresa debe pagar a la CCSS un total de " + montoFinal);
        JOptionPane.showMessageDialog(null, "Para el usuario" + nombreUsuario + "el monto de la empresa destinado a la asociacion es de " + deduccionAso);

    }
    
}
