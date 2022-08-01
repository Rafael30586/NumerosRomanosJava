/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosromanos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NumerosRomanos implements ActionListener {
    private static cuadroTexto numArabigoCuadro;
    private static JLabel numArabigoEtiqueta;
    private static JLabel numRomanoEtiqueta;
    private static JButton resultadoBoton;
    private static JPanel panel;
    private static Font myFont;
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("S-Tools");
        
        frame.setVisible(true);
        frame.setBounds(50, 50, 250, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(200,200));
        frame.setResizable(false);
        
        myFont = new Font("Arial Black",Font.BOLD,15);
        
        panel = new JPanel();
        panel.setBackground(new Color(40,40,40));
        
        frame.add(panel);
        
        numArabigoEtiqueta = new JLabel();
        numRomanoEtiqueta = new JLabel("Numero romano");
        resultadoBoton = new JButton("Convertir");
        numArabigoCuadro = new cuadroTexto();
        
        panel.add(numArabigoEtiqueta);
        panel.add(numRomanoEtiqueta);
        panel.add(resultadoBoton);
        panel.add(numArabigoCuadro);
        panel.setLayout(null);
        
        numArabigoCuadro.setBounds(40,30,150,25);
        numArabigoCuadro.setBackground(new Color(24,24,24));
        numArabigoCuadro.setForeground(new Color(75,132,255));
        numArabigoCuadro.setBorder(null);
        numArabigoCuadro.addFocusListener(numArabigoCuadro);
        
        resultadoBoton.setBounds(40, 60, 150, 25);
        resultadoBoton.setFont(myFont);
        resultadoBoton.setBackground(new Color(75,132,255));
        resultadoBoton.setForeground(new Color(40,40,40));
        resultadoBoton.setBorder(null);
        resultadoBoton.addActionListener(new NumerosRomanos());
        
        numRomanoEtiqueta.setBounds(40,120,150,25);
        numRomanoEtiqueta.setFont(myFont);
        numRomanoEtiqueta.setForeground(new Color(75,255,233));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int numArabigo;
        String numRomano;
        int unidades;
        int decenas;
        int centenas;
        int millar;
        String mil = "";
        String cien = "";
        String diez = "";
        String cero = "";
        String preNumArabigo;
        
        
        preNumArabigo = numArabigoCuadro.getText();
        
       
    try{
        numArabigo = Integer.parseInt(numArabigoCuadro.getText());
        
        if(numArabigo <= 3999 && numArabigo > 0){
            unidades = numArabigo%10;
        numArabigo /= 10; 
        
        decenas = numArabigo%10;
        numArabigo /= 10;
        
        centenas = numArabigo%10;
        numArabigo /= 10;
        
        millar = numArabigo%10;
        numArabigo /= 10;
        
        switch(millar){
            case 1: mil = "M";break;
            case 2: mil = "MM";break;
            case 3: mil = "MMM";break;   
        }
        
        switch(centenas){
            case 1: cien = "C";break;
            case 2: cien = "CC";break;
            case 3: cien = "CCC";break;
            case 4: cien = "CD";break;
            case 5: cien = "D";break;
            case 6: cien = "DC";break;
            case 7: cien = "DCC";break;
            case 8: cien = "DCCC";break;
            case 9: cien = "CM";break;   
        }
        
        switch(decenas){
            case 1: diez = "X";break;
            case 2: diez = "XX";break;
            case 3: diez = "XXX";break;
            case 4: diez = "XL";break;
            case 5: diez = "L";break;
            case 6: diez = "LX";break;
            case 7: diez = "LXX";break;
            case 8: diez = "LXXX";break;
            case 9: diez = "XC";break;   
        }
        
        switch(unidades){
            case 1: cero = "I";break;
            case 2: cero = "II";break;
            case 3: cero = "III";break;
            case 4: cero = "IV";break;
            case 5: cero = "V";break;
            case 6: cero = "VI";break;
            case 7: cero = "VII";break;
            case 8: cero = "VIII";break;
            case 9: cero = "IX";break;   
        }
        
        numRomanoEtiqueta.setText(mil+cien+diez+cero);
    }
    else{
        JOptionPane.showMessageDialog(null,"El numero debe ser mayor que 0 y menor que 4000");
        }
        
    }
    catch(Exception numberFormat){
        JOptionPane.showMessageDialog(null, "Solo se permite ingresar numeros");
    }    
        
    
    
    
    
    
    
    
    
    
        
        numArabigoCuadro.setText(null);
        
        } //termina el action prformed
        
        
    
}
