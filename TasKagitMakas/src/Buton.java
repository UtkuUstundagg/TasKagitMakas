import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Buton extends JFrame{
    JButton button;
    JButton button1;


    Buton(){

    }
    public void BaslangicEkranCiz(){

        button = new JButton();
        button.setText("Kullanici - Bilgisayar");
        button.setBounds(150,100,200,75);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Kullanici - Bilgisayar Secildi");
                SecimScreen s1 = new SecimScreen();
                dispose();
                s1.SecimScreenCiz();

            }
        });

        button1 = new JButton();
        button1.setText("Bilgisayar - Bilgisayar");
        button1.setBounds(430,100,200,75);
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Bilgisayar - Bilgisayar Secildi");
                dispose();
                GamescreenComputer g1 = new GamescreenComputer();
                g1.BilgisayarOyunEkranCiz();
            }
        });

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800,800);
        this.setVisible(true);

        this.add(button);
        this.add(button1);

    }

}
