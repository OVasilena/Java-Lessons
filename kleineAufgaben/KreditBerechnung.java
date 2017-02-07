package kleineAufgaben;

/**
 * Comhard2017
 * package kleineAufgaben
 * Created by olechka on 04.02.2017.
 **/

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author opodlubnaja
 */
import javax.swing.*;
import java.awt.*;

    public class KreditBerechnung extends JFrame {
        JLabel label1, label2, label3, label4, label5, label6, label7;
        JTextField tf1, tf2, tf3, tf4;
        JButton bt1;

        KreditBerechnung() {

            setTitle("Kredit Berechnung"); //Überschrift
            setSize(500, 400); //Fenstergröße
            setLocationRelativeTo(null); //Fenster mittig setzen
//		setLayout(new FlowLayout()); //legt Anordnung der Elemente fest
            setLayout(null); //legt Anordnung der Elemente fest
            //getContentPane().setBackground(Color.MAGENTA); //Farbiges Fenster
            getContentPane().setBackground(new Color(0,200,0));
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true); //Fenster anzeigen

            add(label1 = new JLabel("Kredit")); //Label erzeugen
            label1.setBounds(40,30,80,20);
            add(label2 = new JLabel("Zins")); //Label erzeugen
            label2.setBounds(40,60,80,20);
            add(label3 = new JLabel("Jahr")); //Label erzeugen
            label3.setBounds(40,90,80,20);

            add(label4 = new JLabel("EUR")); //Label erzeugen
            label4.setBounds(250,30,80,20);
            add(label5 = new JLabel("%")); //Label erzeugen
            label5.setBounds(250,60,80,20);
            add(label6 = new JLabel("Jahre")); //Label erzeugen
            label6.setBounds(250,90,80,20);
            add(label7 = new JLabel("EUR")); //Label erzeugen
            label7.setBounds(250,120,80,20);

            add(tf1 = new JTextField(" "));
            tf1.setBounds(140,30,80,20);
            add(tf2 = new JTextField(" "));
            tf2.setBounds(140,60,80,20);
            add(tf3 = new JTextField(" "));
            tf3.setBounds(140,90,80,20);

            add(bt1 = new JButton("Rechne"));
            bt1.setBounds(40,120,80,20);
            add(tf4 = new JTextField(" "));
            tf4.setBounds(140,120,80,20);

            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");

            bt1.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    double kredit; // basis von 2 bis 16
                    double zins; // dezimalzahl
                    int jahr; // modulo
                    //String ergebnis;

                    kredit = Double.parseDouble(tf1.getText());
                    zins = Double.parseDouble(tf2.getText());
                    jahr = Integer.parseInt(tf3.getText());

                    for (int i=0; i<=jahr; i++){
                        kredit += kredit * zins/100;


                    }

                    String ergebnis = String.valueOf(Math.rint(kredit*100)/100);
                    tf4.setText(ergebnis); //Wert ins Textfeld schreien
                }
            });

        }
        public static void main(String[] args) {

            new KreditBerechnung ();

        }
    }


