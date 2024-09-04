import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecimScreen extends JFrame {
    JFrame frame;
    JButton Tas1;
    JButton Tas2;
    JButton Tas3;
    JButton Tas4;
    JButton Tas5;
    JButton Kagit1;
    JButton Kagit2;
    JButton Kagit3;
    JButton Kagit4;
    JButton Kagit5;
    JButton Makas1;
    JButton Makas2;
    JButton Makas3;
    JButton Makas4;
    JButton Makas5;
    JButton Baslat;

    int GlobalCount = 0;
    int TasCount = 0;
    int KagitCount = 0;
    int MakasCount = 0;


    public SecimScreen() {

    }

    public void SecimScreenCiz(){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Tas1 = new JButton();
        Tas1.setVisible(true);
        Tas1.setText("Tas-1");
        Tas1.setBounds(5,50,100,75);
        Tas1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                TasCount++;
                Tas1.setVisible(false);
                Tas2.setVisible(true);
                System.out.println(GlobalCount);
                System.out.println(TasCount);
                SetVisible();
            }
        });


        Tas2 = new JButton();
        Tas2.setVisible(false);
        Tas2.setText("Tas-2");
        Tas2.setBounds(155,50,100,75);
        Tas2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                TasCount++;
                Tas2.setVisible(false);
                Tas3.setVisible(true);
                System.out.println(GlobalCount);
                System.out.println(TasCount);
                SetVisible();
            }
        });

        Tas3 = new JButton();
        Tas3.setVisible(false);
        Tas3.setText("Tas-3");
        Tas3.setBounds(305,50,100,75);
        Tas3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                TasCount++;
                Tas3.setVisible(false);
                Tas4.setVisible(true);
                System.out.println(GlobalCount);
                System.out.println(TasCount);
                SetVisible();
            }
        });

        Tas4 = new JButton();
        Tas4.setVisible(false);
        Tas4.setText("Tas-4");
        Tas4.setBounds(455,50,100,75);
        Tas4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                TasCount++;
                Tas4.setVisible(false);
                Tas5.setVisible(true);
                System.out.println(GlobalCount);
                System.out.println(TasCount);
                SetVisible();
            }
        });

        Tas5 = new JButton();
        Tas5.setVisible(false);
        Tas5.setText("Tas-5");
        Tas5.setBounds(605,50,100,75);
        Tas5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                TasCount++;
                Tas5.setVisible(false);
                System.out.println(GlobalCount);
                System.out.println(TasCount);
                SetVisible();
            }
        });

        Kagit1= new JButton();
        Kagit1.setVisible(true);
        Kagit1.setText("Kagit-1");
        Kagit1.setBounds(5,150,100,75);
        Kagit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                KagitCount++;
                Kagit1.setVisible(false);
                Kagit2.setVisible(true);
                System.out.println(GlobalCount);
                System.out.println(KagitCount);
                SetVisible();
            }
        });

        Kagit2= new JButton();
        Kagit2.setVisible(false);
        Kagit2.setText("Kagit-2");
        Kagit2.setBounds(155,150,100,75);
        Kagit2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                KagitCount++;
                Kagit2.setVisible(false);
                Kagit3.setVisible(true);
                System.out.println(GlobalCount);
                System.out.println(KagitCount);
                SetVisible();
            }
        });

        Kagit3= new JButton();
        Kagit3.setVisible(false);
        Kagit3.setText("Kagit-3");
        Kagit3.setBounds(305,150,100,75);
        Kagit3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                KagitCount++;
                Kagit3.setVisible(false);
                Kagit4.setVisible(true);
                System.out.println(GlobalCount);
                System.out.println(KagitCount);
                SetVisible();
            }
        });

        Kagit4= new JButton();
        Kagit4.setVisible(false);
        Kagit4.setText("Kagit-4");
        Kagit4.setBounds(455,150,100,75);
        Kagit4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                KagitCount++;
                Kagit4.setVisible(false);
                Kagit5.setVisible(true);
                System.out.println(GlobalCount);
                System.out.println(KagitCount);
                SetVisible();
            }
        });

        Kagit5= new JButton();
        Kagit5.setVisible(false);
        Kagit5.setText("Kagit-5");
        Kagit5.setBounds(605,150,100,75);
        Kagit5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                KagitCount++;
                Kagit5.setVisible(false);
                System.out.println(GlobalCount);
                System.out.println(KagitCount);
                SetVisible();
            }
        });

        Makas1= new JButton();
        Makas1.setVisible(true);
        Makas1.setText("Makas-1");
        Makas1.setBounds(5,250,100,75);
        Makas1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                MakasCount++;
                Makas1.setVisible(false);
                Makas2.setVisible(true);
                System.out.println(GlobalCount);
                System.out.println(MakasCount);
                SetVisible();
            }
        });

        Makas2= new JButton();
        Makas2.setVisible(false);
        Makas2.setText("Makas-2");
        Makas2.setBounds(155,250,100,75);
        Makas2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                MakasCount++;
                Makas2.setVisible(false);
                Makas3.setVisible(true);
                System.out.println(GlobalCount);
                System.out.println(MakasCount);
                SetVisible();
            }
        });

        Makas3= new JButton();
        Makas3.setVisible(false);
        Makas3.setText("Makas-3");
        Makas3.setBounds(305,250,100,75);
        Makas3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                MakasCount++;
                Makas3.setVisible(false);
                Makas4.setVisible(true);
                System.out.println(GlobalCount);
                System.out.println(MakasCount);
                SetVisible();
            }
        });

        Makas4= new JButton();
        Makas4.setVisible(false);
        Makas4.setText("Makas-4");
        Makas4.setBounds(455,250,100,75);
        Makas4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                MakasCount++;
                Makas4.setVisible(false);
                Makas5.setVisible(true);
                System.out.println(GlobalCount);
                System.out.println(MakasCount);
                SetVisible();
            }
        });

        Makas5= new JButton();
        Makas5.setVisible(false);
        Makas5.setText("Makas-5");
        Makas5.setBounds(605,250,100,75);
        Makas5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalCount++;
                MakasCount++;
                Makas5.setVisible(false);
                System.out.println(GlobalCount);
                System.out.println(MakasCount);
                SetVisible();
            }
        });

        Baslat = new JButton();
        Baslat.setVisible(false);
        Baslat.setText("Oyunu Baslat");
        Baslat.setBounds(50,500,150,100);
        Baslat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Gamescreen g1 = new Gamescreen();
                frame.dispose();
                g1.EkranCiz(TasCount,KagitCount,MakasCount);
            }
        });

        frame.add(Tas1);
        frame.add(Tas2);
        frame.add(Tas3);
        frame.add(Tas4);
        frame.add(Tas5);

        frame.add(Kagit1);
        frame.add(Kagit2);
        frame.add(Kagit3);
        frame.add(Kagit4);
        frame.add(Kagit5);

        frame.add(Makas1);
        frame.add(Makas2);
        frame.add(Makas3);
        frame.add(Makas4);
        frame.add(Makas5);

        frame.add(Baslat);

    }
    public void SetVisible(){
        if(GlobalCount == 5){
            Tas1.setVisible(false);
            Tas2.setVisible(false);
            Tas3.setVisible(false);
            Tas4.setVisible(false);
            Tas5.setVisible(false);
            Kagit1.setVisible(false);
            Kagit2.setVisible(false);
            Kagit3.setVisible(false);
            Kagit4.setVisible(false);
            Kagit5.setVisible(false);
            Makas1.setVisible(false);
            Makas2.setVisible(false);
            Makas3.setVisible(false);
            Makas4.setVisible(false);
            Makas5.setVisible(false);

            Baslat.setVisible(true);


        }
    }

}
