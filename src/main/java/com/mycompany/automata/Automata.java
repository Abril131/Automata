/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author pukia
 */
public class Automata extends JFrame{
    private JTextField matricula;
    private JButton button;

    public Automata() {
    setTitle("Automata Matriculas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        matricula = new JTextField(20);
        button = new JButton("Aceptar");
        
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 String userInput = matricula.getText(); // Obtener el texto ingresado
                 ValidarMatricula validar = new ValidarMatricula();
                 String resultado = validar.ValidarMatriculas(userInput); // Validar la matrícula
                  JOptionPane.showMessageDialog(Automata.this, "Matrícula ingresada: " + userInput);
               JOptionPane.showMessageDialog(Automata.this, "Resultado de validación: " + resultado);
    
            
               
            }
        });
        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese la matricula: "));
        panel.add(matricula);
        panel.add(button);
        
        
        add(panel);
}

    public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Automata().setVisible(true);
          
            }
        });
    }
}
