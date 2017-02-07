package kleineAufgaben;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        import javax.swing.*;
import java.awt.*;


/**
 *
 * @author opodlubnaja
 */
public class AusgabeKredit extends JFrame {

    JLabel label1, label2, label3, label4; //eingabe Maske
    JTextField tf1, tf2, tf3, tf4, tf5; // eingabe Text
    JLabel kredit1, zinssatz2, laufzeit3, tilgung4; //ausgabe Maske
    JTextField atf1, atf2, atf3, atf4; // ausgabe Text

    JButton bt1; // Button für Berechnung

    AusgabeKredit (){
        setTitle("Kredit Berechnung");
        setSize(500, 400); //Fenstergröße
        setLocationRelativeTo(null); //Fenster mittig setzen
        setLayout(new FlowLayout()); //legt Anordnung der Elemente fest
        setLayout(null); //legt Anordnung der Elemente fest
        getContentPane().setBackground(Color.GRAY); //Farbiges Fenster
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
        //add(panel);
        //panel.setBorder(BorderFactory.createLineBorder(Color.yellow));

//        getContentPane().setBackground(new Color(0,200,0));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); //Fenster anzeigen
//
        add(label1 = new JLabel("Kredit:")); //Label erzeugen
        label1.setBounds(40,30,80,20);
        add(label2 = new JLabel("Zins:")); //Label erzeugen
        label2.setBounds(40,60,80,20);
        add(label3 = new JLabel("Laufzeit:")); //Label erzeugen
        label3.setBounds(40,90,80,20);
        add(label4 = new JLabel("Auszahlungsrate:")); //Label erzeugen
        label4.setBounds(40,120,80,20);
//
        add(tf1 = new JTextField(" "));
        tf1.setBounds(180,30,80,20);
        add(tf2 = new JTextField(" "));
        tf2.setBounds(180,60,80,20);
        add(tf3 = new JTextField(" "));
        tf3.setBounds(180,90,80,20);
        add(tf4 = new JTextField(" "));
        tf4.setBounds(180,120,80,20);
//
        add(bt1 = new JButton("Rechne"));
        bt1.setBounds(40,150,80,20);
        add(tf5 = new JTextField(" "));
        tf5.setBounds(180,150,80,20);
//
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("jährlich");
        tf5.setText("");
//
        bt1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                double kredit;
                double zinssatz;
                int laufzeit;
                double jahresrate, tilgung, zins;
                double hilfszahl;
//                double kredit; // basis von 2 bis 16
//                double zins; // dezimalzahl
//                int jahr; // modulo
                String ergebnis;
//
                kredit = Double.parseDouble(tf1.getText());
                zinssatz = Double.parseDouble(tf2.getText());
                laufzeit = Integer.parseInt(tf3.getText());

                hilfszahl = Math.pow((1 + zinssatz/100), laufzeit);
                jahresrate = kredit * (hilfszahl*zinssatz/100)/(hilfszahl-1);

                for(int i = 1; i <= laufzeit; i++){
                    System.out.println("Jahr " + i);
                    System.out.println("Kredit zum Jahresanfang " + Math.round(kredit*100)/100.00);

                    zins = kredit * zinssatz/100;
                    tilgung = jahresrate - zins;
                    kredit -= tilgung;
                    // System.out.println("Tilgung " + Math.round(tilgung*100)/100.00 + "\tJahresrate " +Math.round(jahresrate*100)/100.00);
                }
                ergebnis = String.valueOf(Math.round(jahresrate*100)/100.00);
                tf5.setText(ergebnis); //Wert ins Textfeld schreien
            }
        });
    }


    public static void main(String[] args) {
        new AusgabeKredit ();
    }

}
