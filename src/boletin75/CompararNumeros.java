/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin75;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class CompararNumeros {
    public int pedirNumEnteiro(){
        int num;
        String res= JOptionPane.showInputDialog("teclee un numero");
        num= Integer.parseInt(res);
        return num;
    }
    public void comparar(int num1, int num2, int num3){
        if (num1>num2 & num1>num3)
            System.out.println(num1 +" e maior");
        
        else if(num2>num1 & num2>num3)
            System.out.println(num2 +" e maior");
        
        else if (num3>num1 & num3>num1)
            System.out.println(num3 +" e maior");
    }
}
