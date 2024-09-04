import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class Gamescreen extends JFrame  {

    Tas tasKullanici1 = new Tas();
    Tas tasKullanici2 = new Tas();
    Tas tasKullanici3 = new Tas();
    Tas tasKullanici4 = new Tas();
    Tas tasKullanici5 = new Tas();

    Agir_Tas agir_tasKullanici1 = new Agir_Tas();
    Agir_Tas agir_tasKullanici2 = new Agir_Tas();
    Agir_Tas agir_tasKullanici3 = new Agir_Tas();
    Agir_Tas agir_tasKullanici4 = new Agir_Tas();
    Agir_Tas agir_tasKullanici5 = new Agir_Tas();

    Kagit kagitKullanici1 = new Kagit();
    Kagit kagitKullanici2 = new Kagit();
    Kagit kagitKullanici3 = new Kagit();
    Kagit kagitKullanici4 = new Kagit();
    Kagit kagitKullanici5 = new Kagit();

    Ozel_Kagit ozel_kagitKullanici1 = new Ozel_Kagit();
    Ozel_Kagit ozel_kagitKullanici2 = new Ozel_Kagit();
    Ozel_Kagit ozel_kagitKullanici3 = new Ozel_Kagit();
    Ozel_Kagit ozel_kagitKullanici4 = new Ozel_Kagit();
    Ozel_Kagit ozel_kagitKullanici5 = new Ozel_Kagit();

    Makas makasKullanici1 = new Makas();
    Makas makasKullanici2 = new Makas();
    Makas makasKullanici3 = new Makas();
    Makas makasKullanici4 = new Makas();
    Makas makasKullanici5 = new Makas();

    Usta_Makas usta_makasKullanici1 = new Usta_Makas();
    Usta_Makas usta_makasKullanici2 = new Usta_Makas();
    Usta_Makas usta_makasKullanici3 = new Usta_Makas();
    Usta_Makas usta_makasKullanici4 = new Usta_Makas();
    Usta_Makas usta_makasKullanici5 = new Usta_Makas();


    Tas tasBilgisayar1 = new Tas();
    Tas tasBilgisayar2 = new Tas();
    Tas tasBilgisayar3 = new Tas();
    Tas tasBilgisayar4 = new Tas();
    Tas tasBilgisayar5 = new Tas();

    Agir_Tas agir_tasBilgisayar1 = new Agir_Tas();
    Agir_Tas agir_tasBilgisayar2 = new Agir_Tas();
    Agir_Tas agir_tasBilgisayar3 = new Agir_Tas();
    Agir_Tas agir_tasBilgisayar4 = new Agir_Tas();
    Agir_Tas agir_tasBilgisayar5 = new Agir_Tas();

    Kagit kagitBilgisayar1 = new Kagit();
    Kagit kagitBilgisayar2 = new Kagit();
    Kagit kagitBilgisayar3 = new Kagit();
    Kagit kagitBilgisayar4 = new Kagit();
    Kagit kagitBilgisayar5 = new Kagit();

    Ozel_Kagit ozel_kagitBilgisayar1 = new Ozel_Kagit();
    Ozel_Kagit ozel_kagitBilgisayar2 = new Ozel_Kagit();
    Ozel_Kagit ozel_kagitBilgisayar3 = new Ozel_Kagit();
    Ozel_Kagit ozel_kagitBilgisayar4 = new Ozel_Kagit();
    Ozel_Kagit ozel_kagitBilgisayar5 = new Ozel_Kagit();

    Makas makasBilgisayar1 = new Makas();
    Makas makasBilgisayar2 = new Makas();
    Makas makasBilgisayar3 = new Makas();
    Makas makasBilgisayar4 = new Makas();
    Makas makasBilgisayar5 = new Makas();

    Usta_Makas usta_makasBilgisayar1 = new Usta_Makas();
    Usta_Makas usta_makasBilgisayar2 = new Usta_Makas();
    Usta_Makas usta_makasBilgisayar3 = new Usta_Makas();
    Usta_Makas usta_makasBilgisayar4 = new Usta_Makas();
    Usta_Makas usta_makasBilgisayar5 = new Usta_Makas();


    JFrame frame;
    JButton tasButton1;
    JButton tasButton2;
    JButton tasButton3;
    JButton tasButton4;
    JButton tasButton5;

    JButton kagitButton1;
    JButton kagitButton2;
    JButton kagitButton3;
    JButton kagitButton4;
    JButton kagitButton5;

    JButton makasButton1;
    JButton makasButton2;
    JButton makasButton3;
    JButton makasButton4;
    JButton makasButton5;

    JLabel kullaniciLabel;
    JLabel bilgisayarLabel;
    JLabel label;
    JTextField tf;
    String value;
    String sonHamle = "";
    int oncekiHamle;
    int secim;
    Bilgisayar bil1 = new Bilgisayar();
    Kullanici kul1 = new Kullanici();
    int islemSayaci = 0;

    double toplamDayaniklilikKullanici = 0;
    double toplamDayaniklilikBilgisayar = 0;

    void Gamescreen(){
    }

    public String EkranCiz(int TasCount, int KagitCount, int MakasCount){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        kullaniciLabel = new JLabel();
        kullaniciLabel.setBounds(100,450,200,200);
        kullaniciLabel.setText("Hamle: " + islemSayaci);

        bilgisayarLabel = new JLabel();
        bilgisayarLabel.setBounds(400,450,200,200);
        bilgisayarLabel.setText("Hamle: " + islemSayaci);

        tf = new JTextField();

        bil1.setBilgisayarHamleListesi(bil1.nesneSec());
        bil1.oynanabilecekHamleSayisi();

        tasButonlariniOlustur();
        kagitButonlariniOlustur();
        makasButonlariniOlustur();
        butonGorunurlukAyarla(TasCount,KagitCount,MakasCount);


        frame.add(tasButton1);
        frame.add(tasButton2);
        frame.add(tasButton3);
        frame.add(tasButton4);
        frame.add(tasButton5);

        frame.add(kagitButton1);
        frame.add(kagitButton2);
        frame.add(kagitButton3);
        frame.add(kagitButton4);
        frame.add(kagitButton5);

        frame.add(makasButton1);
        frame.add(makasButton2);
        frame.add(makasButton3);
        frame.add(makasButton4);
        frame.add(makasButton5);

        frame.add(kullaniciLabel);
        frame.add(bilgisayarLabel);

        return value;

    }

    public String BilgisayarHareketBul(){
        String sonuc = null;
        if(bil1.getBilgisayarHamleListesi() != null) {

            Random r1 = new Random();
            secim = bil1.getBilgisayarHamleListesi().get(r1.nextInt(bil1.getBilgisayarHamleListesi().size()));
            while(secim == oncekiHamle){
                secim = bil1.getBilgisayarHamleListesi().get(r1.nextInt(bil1.getBilgisayarHamleListesi().size()));
                if(secim != oncekiHamle){
                    oncekiHamle =secim;
                    break;
                }
            }
            if(oncekiHamle != secim) {
                oncekiHamle = secim;
            }
            switch (secim) {
                case 1, 2, 3, 4, 5 -> sonuc = "Tas";
                case 6, 7, 8, 9, 10 -> sonuc = "Kagit";
                case 11, 12, 13, 14, 15 -> sonuc = "Makas";
                default -> {
                }
            }

        }

        return sonuc;
    }

    public void tasButonlariniOlustur(){

        tasButton1 = new JButton();
        tasButton1.setBounds(50,25,200,75);
        tasButton1.setText("Tas1");
        tasButton1.setVisible(false);
        tasButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(tasKullanici1.isOyunaDevamEdebilirMi() && agir_tasKullanici1.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, tasButton1.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Tas1";
                    islemSayaci++;
                    value = "Tas";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(tasKullanici1.isNesneDonusum() && !tasKullanici1.isNesneDonusumuGerceklestiMi()){
                        tasKullanici1.setNesneDonusumuGerceklestiMi(true);
                        agir_tasKullanici1 = nesneDonusumTas(tasKullanici1);
                        tasButton1.setText("Agir Tas1");
                    }
                    if (!tasKullanici1.isNesneDonusum() && bilgisayarHamle.equals("Tas")){
                        s1.Hesapla(tasKullanici1, null, null, "Tas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici1.etkiHesapla(tasKullanici1) + "<html> <br>Dayaniklilik: " + tasKullanici1.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!tasKullanici1.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(tasKullanici1, null, null, "Tas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici1.etkiHesapla(tasKullanici1,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + tasKullanici1.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),tasKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!tasKullanici1.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(tasKullanici1, null, null, "Tas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici1.etkiHesapla(tasKullanici1,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + tasKullanici1.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),tasKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(tasKullanici1.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici1, null, null, "Agir_Tas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici1.etkiHesapla(agir_tasKullanici1) + "<html> <br>Dayaniklilik: " + agir_tasKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici1, null, null, "Agir_Tas", bilgisayarHamle, bilgisayarAgirTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici1.etkiHesapla(agir_tasKullanici1) + "<html> <br>Dayaniklilik: " + agir_tasKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(tasKullanici1.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici1, null, null, "Agir_Tas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici1.etkiHesapla(agir_tasKullanici1,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),agir_tasKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici1, null, null, "Agir_Tas", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici1.etkiHesapla(agir_tasKullanici1,bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul(),agir_tasKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(tasKullanici1.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici1, null, null, "Agir_Tas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici1.etkiHesapla(agir_tasKullanici1,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),agir_tasKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici1, null, null, "Agir_Tas", bilgisayarHamle, null, null, bilgisayarUstaMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici1.etkiHesapla(agir_tasKullanici1,bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul(),agir_tasKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }
                    if(tasKullanici1.isNesneDonusumuGerceklestiMi()){
                        agir_tasKullanici1.nesnePuaniGoster(agir_tasKullanici1);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton1.getText(),agir_tasKullanici1,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton1.getText(),agir_tasKullanici1,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazTas(islemSayaci,tasButton1.getText(),agir_tasKullanici1,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!tasKullanici1.isNesneDonusumuGerceklestiMi()){
                        tasKullanici1.nesnePuaniGoster(tasKullanici1);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton1.getText(),tasKullanici1,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton1.getText(),tasKullanici1,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazTas(islemSayaci,tasButton1.getText(),tasKullanici1,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!tasKullanici1.isOyunaDevamEdebilirMi() || !agir_tasKullanici1.isOyunaDevamEdebilirMi()){
                        tasButton1.setVisible(false);
                    }

                    oyunSonuKontrolu(islemSayaci);
                }

            }
        });
        tasButton2 = new JButton();
        tasButton2.setBounds(50,125,200,75);
        tasButton2.setText("Tas2");
        tasButton2.setVisible(false);
        tasButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(tasKullanici2.isOyunaDevamEdebilirMi() && agir_tasKullanici2.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, tasButton2.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Tas2";
                    islemSayaci++;
                    value = "Tas";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(tasKullanici2.isNesneDonusum() && !tasKullanici2.isNesneDonusumuGerceklestiMi()){
                        agir_tasKullanici2 = nesneDonusumTas(tasKullanici2);
                        tasKullanici2.setNesneDonusumuGerceklestiMi(true);
                        tasButton2.setText("Agir Tas2");
                    }
                    if (!tasKullanici2.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(tasKullanici2, null, null, "Tas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici2.etkiHesapla(tasKullanici2) + "<html> <br>Dayaniklilik: " + tasKullanici2.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(tasKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!tasKullanici2.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(tasKullanici2, null, null, "Tas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici2.etkiHesapla(tasKullanici2,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + tasKullanici2.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),tasKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!tasKullanici2.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(tasKullanici2, null, null, "Tas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici2.etkiHesapla(tasKullanici2,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + tasKullanici2.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),tasKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(tasKullanici2.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici2, null, null, "Agir_Tas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici2.etkiHesapla(agir_tasKullanici2) + "<html> <br>Dayaniklilik: " + agir_tasKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici2, null, null, "Agir_Tas", bilgisayarHamle, bilgisayarAgirTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici2.etkiHesapla(agir_tasKullanici2) + "<html> <br>Dayaniklilik: " + agir_tasKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(tasKullanici2.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici2, null, null, "Agir_Tas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici2.etkiHesapla(agir_tasKullanici2,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),agir_tasKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici2, null, null, "Agir_Tas", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici2.etkiHesapla(agir_tasKullanici2, bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul(), agir_tasKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(tasKullanici2.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici2, null, null, "Agir_Tas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici2.etkiHesapla(agir_tasKullanici2, bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(), agir_tasKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        } else{
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici2, null, null, "Agir_Tas", bilgisayarHamle, null, null, bilgisayarUstaMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici2.etkiHesapla(agir_tasKullanici2, bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul(), agir_tasKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }
                    if(tasKullanici2.isNesneDonusumuGerceklestiMi()){
                        agir_tasKullanici2.nesnePuaniGoster(agir_tasKullanici2);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton2.getText(),agir_tasKullanici2,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton2.getText(),agir_tasKullanici2,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazTas(islemSayaci,tasButton2.getText(),agir_tasKullanici2,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!tasKullanici2.isNesneDonusumuGerceklestiMi()){
                        tasKullanici2.nesnePuaniGoster(tasKullanici2);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton2.getText(),tasKullanici2,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton2.getText(),tasKullanici2,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazTas(islemSayaci,tasButton2.getText(),tasKullanici2,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!tasKullanici2.isOyunaDevamEdebilirMi() || !agir_tasKullanici2.isOyunaDevamEdebilirMi()){
                        tasButton2.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }
            }
        });

        tasButton3 = new JButton();
        tasButton3.setBounds(50,225,200,75);
        tasButton3.setText("Tas3");
        tasButton3.setVisible(false);
        tasButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(tasKullanici3.isOyunaDevamEdebilirMi() && agir_tasKullanici3.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, tasButton3.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Tas3";
                    islemSayaci++;
                    value = "Tas";
                    String bilgisayarHamle = BilgisayarHareketBul();
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    if(tasKullanici3.isNesneDonusum() && !tasKullanici3.isNesneDonusumuGerceklestiMi()){
                        tasKullanici3.setNesneDonusumuGerceklestiMi(true);
                        agir_tasKullanici3 = nesneDonusumTas(tasKullanici3);
                        tasButton3.setText("Agir Tas3");
                    }if (!tasKullanici3.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(tasKullanici3, null, null, "Tas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici3.etkiHesapla(tasKullanici3) + "<html> <br>Dayaniklilik: " + tasKullanici3.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!tasKullanici3.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(tasKullanici3, null, null, "Tas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici3.etkiHesapla(tasKullanici3,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + tasKullanici3.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),tasKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!tasKullanici3.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(tasKullanici3, null, null, "Tas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici3.etkiHesapla(tasKullanici3,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + tasKullanici3.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),tasKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(tasKullanici3.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici3, null, null, "Agir_Tas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici3.etkiHesapla(agir_tasKullanici3) + "<html> <br>Dayaniklilik: " + agir_tasKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici3, null, null, "Agir_Tas", bilgisayarHamle, bilgisayarAgirTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici3.etkiHesapla(agir_tasKullanici3) + "<html> <br>Dayaniklilik: " + agir_tasKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(tasKullanici3.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici3, null, null, "Agir_Tas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici3.etkiHesapla(agir_tasKullanici3,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),agir_tasKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici3, null, null, "Agir_Tas", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici3.etkiHesapla(agir_tasKullanici3, bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul(), agir_tasKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(tasKullanici3.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici3, null, null, "Agir_Tas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici3.etkiHesapla(agir_tasKullanici3,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),agir_tasKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else{
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici3,null,null,"Agir_Tas",bilgisayarHamle,null,null,bilgisayarUstaMakasHamleBul(),bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici3.etkiHesapla(agir_tasKullanici3, bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul(), agir_tasKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }

                    }

                    if(tasKullanici3.isNesneDonusumuGerceklestiMi()){
                        agir_tasKullanici3.nesnePuaniGoster(agir_tasKullanici3);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton3.getText(),agir_tasKullanici3,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton3.getText(),agir_tasKullanici3,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazTas(islemSayaci,tasButton3.getText(),agir_tasKullanici3,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!tasKullanici3.isNesneDonusumuGerceklestiMi()){
                        tasKullanici3.nesnePuaniGoster(tasKullanici3);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton3.getText(),tasKullanici3,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton3.getText(),tasKullanici3,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazTas(islemSayaci,tasButton3.getText(),tasKullanici3,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!tasKullanici3.isOyunaDevamEdebilirMi() || !agir_tasKullanici3.isOyunaDevamEdebilirMi()){
                        tasButton3.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }
            }
        });

        tasButton4 = new JButton();
        tasButton4.setBounds(50,325,200,75);
        tasButton4.setText("Tas4");
        tasButton4.setVisible(false);
        tasButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(tasKullanici4.isOyunaDevamEdebilirMi() && agir_tasKullanici4.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, tasButton4.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Tas4";
                    islemSayaci++;
                    value = "Tas";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(tasKullanici4.isNesneDonusum() && !tasKullanici4.isNesneDonusumuGerceklestiMi()){
                        tasKullanici4.setNesneDonusumuGerceklestiMi(true);
                        agir_tasKullanici4 = nesneDonusumTas(tasKullanici4);
                        tasButton4.setText("Agir Tas4");
                    }
                    if (!tasKullanici4.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(tasKullanici4, null, null, "Tas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici4.etkiHesapla(tasKullanici4) + "<html> <br>Dayaniklilik: " + tasKullanici4.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!tasKullanici4.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(tasKullanici4, null, null, "Tas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici4.etkiHesapla(tasKullanici4,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + tasKullanici4.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),tasKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!tasKullanici4.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(tasKullanici4, null, null, "Tas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici4.etkiHesapla(tasKullanici4,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + tasKullanici4.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),tasKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(tasKullanici4.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici4, null, null, "Agir_Tas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici4.etkiHesapla(agir_tasKullanici4) + "<html> <br>Dayaniklilik: " + agir_tasKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici4, null, null, "Agir_Tas", bilgisayarHamle, bilgisayarAgirTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici4.etkiHesapla(agir_tasKullanici4) + "<html> <br>Dayaniklilik: " + agir_tasKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(tasKullanici4.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici4, null, null, "Agir_Tas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici4.etkiHesapla(agir_tasKullanici4,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),agir_tasKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici4, null, null, "Agir_Tas", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici4.etkiHesapla(agir_tasKullanici4, bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul(), agir_tasKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(tasKullanici4.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici4, null, null, "Agir_Tas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici4.etkiHesapla(agir_tasKullanici4,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),agir_tasKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else{
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici4,null,null,"Agir_Tas",bilgisayarHamle,null,null,bilgisayarUstaMakasHamleBul(),bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici4.etkiHesapla(agir_tasKullanici4, bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul(), agir_tasKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }

                    if(!tasKullanici4.isNesneDonusumuGerceklestiMi()) {
                        tasKullanici4.nesnePuaniGoster(tasKullanici4);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton4.getText(),tasKullanici4,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton4.getText(),tasKullanici4,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazTas(islemSayaci,tasButton4.getText(),tasKullanici4,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(tasKullanici4.isNesneDonusumuGerceklestiMi()){
                        agir_tasKullanici4.nesnePuaniGoster(agir_tasKullanici4);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton4.getText(),agir_tasKullanici4,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton4.getText(),agir_tasKullanici4,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazTas(islemSayaci,tasButton4.getText(),agir_tasKullanici4,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!tasKullanici4.isOyunaDevamEdebilirMi() || !agir_tasKullanici4.isOyunaDevamEdebilirMi()){
                        tasButton4.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }
            }
        });

        tasButton5 = new JButton();
        tasButton5.setBounds(50,425,200,75);
        tasButton5.setText("Tas5");
        tasButton5.setVisible(false);
        tasButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(tasKullanici5.isOyunaDevamEdebilirMi() && agir_tasKullanici5.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, tasButton5.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Tas5";
                    islemSayaci++;
                    value = "Tas";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(tasKullanici5.isNesneDonusum() && !tasKullanici5.isNesneDonusumuGerceklestiMi()){
                        tasKullanici5.setNesneDonusumuGerceklestiMi(true);
                        agir_tasKullanici5 = nesneDonusumTas(tasKullanici5);
                        tasButton5.setText("Agir Tas5");
                    }
                    if (!tasKullanici5.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(tasKullanici5, null, null, "Tas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici5.etkiHesapla(tasKullanici5) + "<html> <br>Dayaniklilik: " + tasKullanici5.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!tasKullanici5.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(tasKullanici5, null, null, "Tas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici5.etkiHesapla(tasKullanici5,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + tasKullanici5.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),tasKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!tasKullanici5.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(tasKullanici5, null, null, "Tas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + tasKullanici5.etkiHesapla(tasKullanici5,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + tasKullanici5.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),tasKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(tasKullanici5.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici5, null, null, "Agir_Tas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici5.etkiHesapla(agir_tasKullanici5) + "<html> <br>Dayaniklilik: " + agir_tasKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici5, null, null, "Agir_Tas", bilgisayarHamle, bilgisayarAgirTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici5.etkiHesapla(agir_tasKullanici5) + "<html> <br>Dayaniklilik: " + agir_tasKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(tasKullanici5.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici5, null, null, "Agir_Tas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici5.etkiHesapla(agir_tasKullanici5,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),agir_tasKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici5, null, null, "Agir_Tas", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici5.etkiHesapla(agir_tasKullanici5, bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul(), agir_tasKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(tasKullanici5.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(agir_tasKullanici5, null, null, "Agir_Tas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici5.etkiHesapla(agir_tasKullanici5,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),agir_tasKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(agir_tasKullanici5, null, null, "Agir_Tas", bilgisayarHamle, null, null, bilgisayarUstaMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + agir_tasKullanici5.etkiHesapla(agir_tasKullanici5, bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + agir_tasKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul(), agir_tasKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }

                    if(tasKullanici5.isNesneDonusumuGerceklestiMi()){
                        agir_tasKullanici5.nesnePuaniGoster(agir_tasKullanici5);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton5.getText(),agir_tasKullanici5,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton5.getText(),agir_tasKullanici5,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazTas(islemSayaci,tasButton5.getText(),agir_tasKullanici5,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!tasKullanici5.isNesneDonusumuGerceklestiMi()){
                        tasKullanici5.nesnePuaniGoster(tasKullanici5);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton5.getText(),tasKullanici5,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazTas(islemSayaci,tasButton5.getText(),tasKullanici5,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazTas(islemSayaci,tasButton5.getText(),tasKullanici5,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!tasKullanici5.isOyunaDevamEdebilirMi() || !agir_tasKullanici5.isOyunaDevamEdebilirMi()){
                        tasButton5.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }
            }
        });
    }

    public void kagitButonlariniOlustur(){

        kagitButton1 = new JButton();
        kagitButton1.setBounds(250,25,200,75);
        kagitButton1.setText("Kagit1");
        kagitButton1.setVisible(false);
        kagitButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(kagitKullanici1.isOyunaDevamEdebilirMi() && ozel_kagitKullanici1.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, kagitButton1.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Kagit1";
                    islemSayaci++;
                    value = "Kagit";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(kagitKullanici1.isNesneDonusum() && !kagitKullanici1.isNesneDonusumuGerceklestiMi()){
                        kagitKullanici1.setNesneDonusumuGerceklestiMi(true);
                        ozel_kagitKullanici1 = nesneDonusumKagit(kagitKullanici1);
                        kagitButton1.setText("Ozel Kagit1");
                    }
                    if (!kagitKullanici1.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(null, kagitKullanici1, null, "Kagit",bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici1.etkiHesapla(kagitKullanici1,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + kagitKullanici1.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),kagitKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!kagitKullanici1.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(null, kagitKullanici1, null, "Kagit", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici1.etkiHesapla(kagitKullanici1) + "<html> <br>Dayaniklilik: " + kagitKullanici1.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!kagitKullanici1.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(null, kagitKullanici1, null, "Kagit", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici1.etkiHesapla(kagitKullanici1,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + kagitKullanici1.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),kagitKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(kagitKullanici1.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici1, null, "Ozel_Kagit", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici1.etkiHesapla(ozel_kagitKullanici1,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),ozel_kagitKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici1, null, "Ozel_Kagit", bilgisayarHamle, bilgisayarAgirTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici1.etkiHesapla(ozel_kagitKullanici1,bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul(),ozel_kagitKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(kagitKullanici1.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici1, null, "Ozel_Kagit", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici1.etkiHesapla(ozel_kagitKullanici1) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici1, null, "Ozel_Kagit", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici1.etkiHesapla(ozel_kagitKullanici1) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(kagitKullanici1.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici1, null, "Ozel_Kagit", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici1.etkiHesapla(ozel_kagitKullanici1,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),ozel_kagitKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici1, null, "Ozel_Kagit", bilgisayarHamle, null, null, bilgisayarUstaMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici1.etkiHesapla(ozel_kagitKullanici1,bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul(),ozel_kagitKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }
                    if(kagitKullanici1.isNesneDonusumuGerceklestiMi()){
                        ozel_kagitKullanici1.nesnePuaniGoster(ozel_kagitKullanici1);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton1.getText(),ozel_kagitKullanici1,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton1.getText(),ozel_kagitKullanici1,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton1.getText(),ozel_kagitKullanici1,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!kagitKullanici1.isNesneDonusumuGerceklestiMi()){
                        kagitKullanici1.nesnePuaniGoster(kagitKullanici1);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton1.getText(),kagitKullanici1,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton1.getText(),kagitKullanici1,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton1.getText(),kagitKullanici1,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!kagitKullanici1.isOyunaDevamEdebilirMi() || !ozel_kagitKullanici1.isOyunaDevamEdebilirMi()){
                        kagitButton1.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }

            }
        });

        kagitButton2 = new JButton();
        kagitButton2.setBounds(250,125,200,75);
        kagitButton2.setText("Kagit2");
        kagitButton2.setVisible(false);
        kagitButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(kagitKullanici2.isOyunaDevamEdebilirMi() && ozel_kagitKullanici2.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, kagitButton2.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Kagit2";
                    islemSayaci++;
                    value = "Kagit";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(kagitKullanici2.isNesneDonusum() && !kagitKullanici2.isNesneDonusumuGerceklestiMi()){
                        kagitKullanici2.setNesneDonusumuGerceklestiMi(true);
                        ozel_kagitKullanici2 = nesneDonusumKagit(kagitKullanici2);
                        kagitButton2.setText("Ozel Kagit2");
                    }
                    if (!kagitKullanici2.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(null, kagitKullanici2, null, "Kagit", bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici2.etkiHesapla(kagitKullanici2,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + kagitKullanici2.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),kagitKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!kagitKullanici2.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(null, kagitKullanici2, null, "Kagit", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici2.etkiHesapla(kagitKullanici2) + "<html> <br>Dayaniklilik: " + kagitKullanici2.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!kagitKullanici2.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(null, kagitKullanici2, null, "Kagit", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici2.etkiHesapla(kagitKullanici2,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + kagitKullanici2.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),kagitKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(kagitKullanici2.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici2, null, "Ozel_Kagit", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici2.etkiHesapla(ozel_kagitKullanici2,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),ozel_kagitKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici2, null, "Ozel_Kagit", bilgisayarHamle, bilgisayarAgirTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici2.etkiHesapla(ozel_kagitKullanici2,bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul(),ozel_kagitKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }

                    }
                    else if(kagitKullanici2.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici2, null, "Ozel_Kagit", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici2.etkiHesapla(ozel_kagitKullanici2) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici2, null, "Ozel_Kagit", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici2.etkiHesapla(ozel_kagitKullanici2) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(kagitKullanici2.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici2, null, "Ozel_Kagit", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici2.etkiHesapla(ozel_kagitKullanici2,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),ozel_kagitKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici2, null, "Ozel_Kagit", bilgisayarHamle, null, null, bilgisayarUstaMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici2.etkiHesapla(ozel_kagitKullanici2,bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul(),ozel_kagitKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }
                    if(kagitKullanici2.isNesneDonusumuGerceklestiMi()){
                        ozel_kagitKullanici2.nesnePuaniGoster(ozel_kagitKullanici2);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton2.getText(),ozel_kagitKullanici2,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton2.getText(),ozel_kagitKullanici2,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton2.getText(),ozel_kagitKullanici2,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!kagitKullanici2.isNesneDonusumuGerceklestiMi()){
                        kagitKullanici2.nesnePuaniGoster(kagitKullanici2);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton2.getText(),kagitKullanici2,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton2.getText(),kagitKullanici2,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton2.getText(),kagitKullanici2,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!kagitKullanici2.isOyunaDevamEdebilirMi() || !ozel_kagitKullanici2.isOyunaDevamEdebilirMi()){
                        kagitButton2.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }
            }
        });

        kagitButton3 = new JButton();
        kagitButton3.setBounds(250,225,200,75);
        kagitButton3.setText("Kagit3");
        kagitButton3.setVisible(false);
        kagitButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(kagitKullanici3.isOyunaDevamEdebilirMi() && ozel_kagitKullanici3.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, kagitButton3.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Kagit3";
                    islemSayaci++;
                    value = "Kagit";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(kagitKullanici3.isNesneDonusum() && !kagitKullanici3.isNesneDonusumuGerceklestiMi()){
                        kagitKullanici3.setNesneDonusumuGerceklestiMi(true);
                        ozel_kagitKullanici3 = nesneDonusumKagit(kagitKullanici3);
                        kagitButton3.setText("Ozel Kagit3");
                    }
                    if (!kagitKullanici3.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(null, kagitKullanici3, null, "Kagit", bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici3.etkiHesapla(kagitKullanici3,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + kagitKullanici3.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),kagitKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!kagitKullanici3.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(null, kagitKullanici3, null, "Kagit", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici3.etkiHesapla(kagitKullanici3) + "<html> <br>Dayaniklilik: " + kagitKullanici3.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!kagitKullanici3.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(null, kagitKullanici3, null, "Kagit", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici3.etkiHesapla(kagitKullanici3,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + kagitKullanici3.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),kagitKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(kagitKullanici3.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici3, null, "Ozel_Kagit", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici3.etkiHesapla(ozel_kagitKullanici3, bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(), ozel_kagitKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        } else{
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici3, null, "Ozel_Kagit", bilgisayarHamle, bilgisayarAgirTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici3.etkiHesapla(ozel_kagitKullanici3,bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul(),ozel_kagitKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(kagitKullanici3.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici3, null, "Ozel_Kagit", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici3.etkiHesapla(ozel_kagitKullanici3) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici3, null, "Ozel_Kagit", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici3.etkiHesapla(ozel_kagitKullanici3) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(kagitKullanici3.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici3, null, "Ozel_Kagit", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici3.etkiHesapla(ozel_kagitKullanici3,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),ozel_kagitKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici3, null, "Ozel_Kagit", bilgisayarHamle, null, null, bilgisayarUstaMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici3.etkiHesapla(ozel_kagitKullanici3,bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul(),ozel_kagitKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }
                    if(kagitKullanici3.isNesneDonusumuGerceklestiMi()){
                        ozel_kagitKullanici3.nesnePuaniGoster(ozel_kagitKullanici3);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton3.getText(),ozel_kagitKullanici3,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton3.getText(),ozel_kagitKullanici3,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton3.getText(),ozel_kagitKullanici3,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!kagitKullanici3.isNesneDonusumuGerceklestiMi()){
                        kagitKullanici3.nesnePuaniGoster(kagitKullanici3);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton3.getText(),kagitKullanici3,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton3.getText(),kagitKullanici3,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton3.getText(),kagitKullanici3,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!kagitKullanici3.isOyunaDevamEdebilirMi() || !ozel_kagitKullanici3.isOyunaDevamEdebilirMi()){
                        kagitButton3.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }
            }
        });

        kagitButton4 = new JButton();
        kagitButton4.setBounds(250,325,200,75);
        kagitButton4.setText("Kagit4");
        kagitButton4.setVisible(false);
        kagitButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(kagitKullanici4.isOyunaDevamEdebilirMi() && ozel_kagitKullanici4.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, kagitButton4.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Kagit4";
                    islemSayaci++;
                    value = "Kagit";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(kagitKullanici4.isNesneDonusum() && !kagitKullanici4.isNesneDonusumuGerceklestiMi()){
                        kagitKullanici4.setNesneDonusumuGerceklestiMi(true);
                        ozel_kagitKullanici4 = nesneDonusumKagit(kagitKullanici4);
                        kagitButton4.setText("Ozel Kagit 4");
                    }
                    if (!kagitKullanici4.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(null, kagitKullanici4, null, "Kagit", bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici4.etkiHesapla(kagitKullanici4,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + kagitKullanici4.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),kagitKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!kagitKullanici4.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(null, kagitKullanici4, null, "Kagit", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici4.etkiHesapla(kagitKullanici4) + "<html> <br>Dayaniklilik: " + kagitKullanici4.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!kagitKullanici4.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(null, kagitKullanici4, null, "Kagit", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici4.etkiHesapla(kagitKullanici4,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + kagitKullanici4.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),kagitKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(kagitKullanici4.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici4, null, "Ozel_Kagit", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici4.etkiHesapla(ozel_kagitKullanici4,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),ozel_kagitKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici4, null, "Ozel_Kagit", bilgisayarHamle, bilgisayarAgirTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici4.etkiHesapla(ozel_kagitKullanici4,bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul(),ozel_kagitKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(kagitKullanici4.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici4, null, "Ozel_Kagit", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici4.etkiHesapla(ozel_kagitKullanici4) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici4, null, "Ozel_Kagit", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici4.etkiHesapla(ozel_kagitKullanici4) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(kagitKullanici4.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici4, null, "Ozel_Kagit", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici4.etkiHesapla(ozel_kagitKullanici4,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),ozel_kagitKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici4, null, "Ozel_Kagit", bilgisayarHamle, null, null, bilgisayarUstaMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici4.etkiHesapla(ozel_kagitKullanici4,bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul(),ozel_kagitKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }
                    if(kagitKullanici4.isNesneDonusumuGerceklestiMi()){
                        ozel_kagitKullanici4.nesnePuaniGoster(ozel_kagitKullanici4);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton4.getText(),ozel_kagitKullanici4,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton4.getText(),ozel_kagitKullanici4,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton4.getText(),ozel_kagitKullanici4,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!kagitKullanici4.isNesneDonusumuGerceklestiMi()){
                        kagitKullanici4.nesnePuaniGoster(kagitKullanici4);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton4.getText(),kagitKullanici4,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton4.getText(),kagitKullanici4,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton4.getText(),kagitKullanici4,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!kagitKullanici4.isOyunaDevamEdebilirMi() || !ozel_kagitKullanici4.isOyunaDevamEdebilirMi()){
                        kagitButton4.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }
            }
        });

        kagitButton5 = new JButton();
        kagitButton5.setBounds(250,425,200,75);
        kagitButton5.setText("Kagit5");
        kagitButton5.setVisible(false);
        kagitButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(kagitKullanici5.isOyunaDevamEdebilirMi() && ozel_kagitKullanici5.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, kagitButton5.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Kagit5";
                    islemSayaci++;
                    value = "Kagit";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(kagitKullanici5.isNesneDonusum() && !kagitKullanici5.isNesneDonusumuGerceklestiMi()){
                        kagitKullanici5.setNesneDonusumuGerceklestiMi(true);
                        ozel_kagitKullanici5 = nesneDonusumKagit(kagitKullanici5);
                        kagitButton5.setText("Ozel Kagit5");
                    }
                    if (!kagitKullanici5.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(null, kagitKullanici5, null, "Kagit", bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici5.etkiHesapla(kagitKullanici5,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + kagitKullanici5.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),kagitKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!kagitKullanici5.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(null, kagitKullanici5, null, "Kagit", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici5.etkiHesapla(kagitKullanici5) + "<html> <br>Dayaniklilik: " + kagitKullanici5.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!kagitKullanici5.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(null, kagitKullanici5, null, "Kagit", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + kagitKullanici5.etkiHesapla(kagitKullanici5,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + kagitKullanici5.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),kagitKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(kagitKullanici5.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici5, null, "Ozel_Kagit", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici5.etkiHesapla(ozel_kagitKullanici5,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),ozel_kagitKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici5, null, "Ozel_Kagit", bilgisayarHamle, bilgisayarAgirTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici5.etkiHesapla(ozel_kagitKullanici5,bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul(),ozel_kagitKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(kagitKullanici5.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici5, null, "Ozel_Kagit", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici5.etkiHesapla(ozel_kagitKullanici5) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici5, null, "Ozel_Kagit", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici5.etkiHesapla(ozel_kagitKullanici5) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(kagitKullanici5.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, ozel_kagitKullanici5, null, "Ozel_Kagit", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici5.etkiHesapla(ozel_kagitKullanici5,bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul(),ozel_kagitKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, ozel_kagitKullanici5, null, "Ozel_Kagit", bilgisayarHamle, null, null, bilgisayarUstaMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + ozel_kagitKullanici5.etkiHesapla(ozel_kagitKullanici5, bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + ozel_kagitKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul(), ozel_kagitKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }
                    if(kagitKullanici5.isNesneDonusumuGerceklestiMi()){
                        ozel_kagitKullanici5.nesnePuaniGoster(ozel_kagitKullanici5);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton5.getText(),ozel_kagitKullanici5,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton5.getText(),ozel_kagitKullanici5,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton5.getText(),ozel_kagitKullanici5,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!kagitKullanici5.isNesneDonusumuGerceklestiMi()) {
                        kagitKullanici5.nesnePuaniGoster(kagitKullanici5);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton5.getText(),kagitKullanici5,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton5.getText(),kagitKullanici5,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazKagit(islemSayaci,kagitButton5.getText(),kagitKullanici5,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!kagitKullanici5.isOyunaDevamEdebilirMi() ||!ozel_kagitKullanici5.isOyunaDevamEdebilirMi()){
                        kagitButton5.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }
            }
        });

    }

    public void makasButonlariniOlustur(){

        makasButton1 = new JButton();
        makasButton1.setBounds(450,25,200,75);
        makasButton1.setText("Makas1");
        makasButton1.setVisible(false);
        makasButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(makasKullanici1.isOyunaDevamEdebilirMi() && usta_makasKullanici1.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, makasButton1.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Makas1";
                    islemSayaci++;
                    value = "Makas";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(makasKullanici1.isNesneDonusum() && !makasKullanici1.isNesneDonusumuGerceklestiMi()){
                        makasKullanici1.setNesneDonusumuGerceklestiMi(true);
                        usta_makasKullanici1 = nesneDonusumMakas(makasKullanici1);
                        makasButton1.setText("Usta Makas1");
                    }
                    if (!makasKullanici1.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(null, null, makasKullanici1, "Makas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null ,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici1.etkiHesapla(makasKullanici1,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + makasKullanici1.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),makasKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!makasKullanici1.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(null, null, makasKullanici1, "Makas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici1.etkiHesapla(makasKullanici1,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + makasKullanici1.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),makasKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!makasKullanici1.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(null, null, makasKullanici1, "Makas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici1.etkiHesapla(makasKullanici1) + "<html> <br>Dayaniklilik: " + makasKullanici1.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(makasKullanici1.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici1, "Usta_Makas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici1.etkiHesapla(usta_makasKullanici1,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),usta_makasKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else{
                            s1.OzelTasKagitMakasHesapla(null,null,usta_makasKullanici1,"Usta_Makas",bilgisayarHamle,bilgisayarAgirTasHamleBul(),null,null,bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici1.etkiHesapla(usta_makasKullanici1,bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul(),usta_makasKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(makasKullanici1.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici1, "Usta_Makas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici1.etkiHesapla(usta_makasKullanici1,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),usta_makasKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, null, usta_makasKullanici1, "Usta_Makas", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici1.etkiHesapla(usta_makasKullanici1, bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul(), usta_makasKullanici1) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(makasKullanici1.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici1, "Usta_Makas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici1.etkiHesapla(usta_makasKullanici1) + "<html> <br>Dayaniklilik: " + usta_makasKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, null, usta_makasKullanici1, "Usta_Makas", bilgisayarHamle, null, null, bilgisayarUstaMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici1.etkiHesapla(usta_makasKullanici1) + "<html> <br>Dayaniklilik: " + usta_makasKullanici1.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }
                    if(makasKullanici1.isNesneDonusumuGerceklestiMi()){
                        usta_makasKullanici1.nesnePuaniGoster(usta_makasKullanici1);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton1.getText(),usta_makasKullanici1,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton1.getText(),usta_makasKullanici1,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton1.getText(),usta_makasKullanici1,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!makasKullanici1.isNesneDonusumuGerceklestiMi()){
                        makasKullanici1.nesnePuaniGoster(makasKullanici1);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton1.getText(),makasKullanici1,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton1.getText(),makasKullanici1,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton1.getText(),makasKullanici1,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!makasKullanici1.isOyunaDevamEdebilirMi() || !usta_makasKullanici1.isOyunaDevamEdebilirMi()){
                        makasButton1.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }
            }
        });

        makasButton2 = new JButton();
        makasButton2.setBounds(450,125,200,75);
        makasButton2.setText("Makas2");
        makasButton2.setVisible(false);
        makasButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(makasKullanici2.isOyunaDevamEdebilirMi() && usta_makasKullanici2.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, makasButton2.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Makas2";
                    islemSayaci++;
                    value = "Makas";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(makasKullanici2.isNesneDonusum() && !makasKullanici2.isNesneDonusumuGerceklestiMi()){
                        makasKullanici2.setNesneDonusumuGerceklestiMi(true);
                        usta_makasKullanici2 = nesneDonusumMakas(makasKullanici2);
                        makasButton2.setText("Usta Makas2");
                    }
                    if (!makasKullanici2.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(null, null, makasKullanici2, "Makas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici2.etkiHesapla(makasKullanici2,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + makasKullanici2.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),makasKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!makasKullanici2.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(null, null, makasKullanici2, "Makas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici2.etkiHesapla(makasKullanici2,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + makasKullanici2.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),makasKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!makasKullanici2.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(null, null, makasKullanici2, "Makas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici2.etkiHesapla(makasKullanici2) + "<html> <br>Dayaniklilik: " + makasKullanici2.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(makasKullanici2.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici2, "Usta_Makas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici2.etkiHesapla(usta_makasKullanici2,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),usta_makasKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, null, usta_makasKullanici2, "Usta_Makas", bilgisayarHamle, bilgisayarAgirTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici2.etkiHesapla(usta_makasKullanici2, bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul(), usta_makasKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(makasKullanici2.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici2, "Usta_Makas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici2.etkiHesapla(usta_makasKullanici2,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),usta_makasKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, null, usta_makasKullanici2, "Usta_Makas", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici2.etkiHesapla(usta_makasKullanici2, bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul(), usta_makasKullanici2) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(makasKullanici2.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici2, "Usta_Makas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici2.etkiHesapla(usta_makasKullanici2) + "<html> <br>Dayaniklilik: " + usta_makasKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, null, usta_makasKullanici2, "Usta_Makas", bilgisayarHamle, null, null, bilgisayarUstaMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici2.etkiHesapla(usta_makasKullanici2) + "<html> <br>Dayaniklilik: " + usta_makasKullanici2.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }
                    if(makasKullanici2.isNesneDonusumuGerceklestiMi()){
                        usta_makasKullanici2.nesnePuaniGoster(usta_makasKullanici2);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton2.getText(),usta_makasKullanici2,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton2.getText(),usta_makasKullanici2,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton2.getText(),usta_makasKullanici2,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!makasKullanici2.isNesneDonusumuGerceklestiMi()){
                        makasKullanici2.nesnePuaniGoster(makasKullanici2);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton2.getText(),makasKullanici2,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton2.getText(),makasKullanici2,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton2.getText(),makasKullanici2,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!makasKullanici2.isOyunaDevamEdebilirMi() || !usta_makasKullanici2.isOyunaDevamEdebilirMi()){
                        makasButton2.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }
            }
        });

        makasButton3 = new JButton();
        makasButton3.setBounds(450,225,200,75);
        makasButton3.setText("Makas3");
        makasButton3.setVisible(false);
        makasButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(makasKullanici3.isOyunaDevamEdebilirMi() && usta_makasKullanici5.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, makasButton3.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Makas3";
                    islemSayaci++;
                    value = "Makas";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(makasKullanici3.isNesneDonusum() && !makasKullanici3.isNesneDonusumuGerceklestiMi()){
                        makasKullanici3.setNesneDonusumuGerceklestiMi(true);
                        usta_makasKullanici3 = nesneDonusumMakas(makasKullanici3);
                        makasButton3.setText("Usta Makas3");
                    }
                    if (!makasKullanici3.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(null, null, makasKullanici3, "Makas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici3.etkiHesapla(makasKullanici3,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + makasKullanici3.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),makasKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!makasKullanici3.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(null, null, makasKullanici3, "Makas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici3.etkiHesapla(makasKullanici3,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + makasKullanici3.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),makasKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!makasKullanici3.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(null, null, makasKullanici3, "Makas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici3.etkiHesapla(makasKullanici3) + "<html> <br>Dayaniklilik: " + makasKullanici3.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(makasKullanici3.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici3, "Usta_Makas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici3.etkiHesapla(usta_makasKullanici3,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),usta_makasKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else{
                            s1.OzelTasKagitMakasHesapla(null,null,usta_makasKullanici3,"Usta_Makas",bilgisayarHamle,bilgisayarAgirTasHamleBul(),null,null,bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici3.etkiHesapla(usta_makasKullanici3,bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul(),usta_makasKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(makasKullanici3.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici3, "Usta_Makas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici3.etkiHesapla(usta_makasKullanici3,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),usta_makasKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, null, usta_makasKullanici3, "Usta_Makas", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici3.etkiHesapla(usta_makasKullanici3, bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul(), usta_makasKullanici3) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(makasKullanici3.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici3, "Usta_Makas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici3.etkiHesapla(usta_makasKullanici3) + "<html> <br>Dayaniklilik: " + usta_makasKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, null, usta_makasKullanici3, "Usta_Makas", bilgisayarHamle, null, null, bilgisayarUstaMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici3.etkiHesapla(usta_makasKullanici3) + "<html> <br>Dayaniklilik: " + usta_makasKullanici3.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }
                    if(makasKullanici3.isNesneDonusumuGerceklestiMi()){
                        usta_makasKullanici3.nesnePuaniGoster(usta_makasKullanici3);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton3.getText(),usta_makasKullanici3,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton3.getText(),usta_makasKullanici3,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton3.getText(),usta_makasKullanici3,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!makasKullanici3.isNesneDonusumuGerceklestiMi()){
                        makasKullanici3.nesnePuaniGoster(makasKullanici3);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton3.getText(),makasKullanici3,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton3.getText(),makasKullanici3,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton3.getText(),makasKullanici3,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!makasKullanici3.isOyunaDevamEdebilirMi() || !usta_makasKullanici3.isOyunaDevamEdebilirMi()){
                        makasButton3.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }
            }
        });
        makasButton4 = new JButton();
        makasButton4.setBounds(450,325,200,75);
        makasButton4.setText("Makas4");
        makasButton4.setVisible(false);
        makasButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(makasKullanici4.isOyunaDevamEdebilirMi() && usta_makasKullanici4.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, makasButton4.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Makas4";
                    islemSayaci++;
                    value = "Makas";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(makasKullanici4.isNesneDonusum() && !makasKullanici4.isNesneDonusumuGerceklestiMi()){
                        makasKullanici4.setNesneDonusumuGerceklestiMi(true);
                        usta_makasKullanici4 = nesneDonusumMakas(makasKullanici4);
                        makasButton4.setText("Usta Makas4");
                    }
                    if (!makasKullanici4.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(null, null, makasKullanici4, "Makas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici4.etkiHesapla(makasKullanici4,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + makasKullanici4.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),makasKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!makasKullanici4.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(null, null, makasKullanici4, "Makas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici4.etkiHesapla(makasKullanici4,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + makasKullanici4.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),makasKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!makasKullanici4.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(null, null, makasKullanici4, "Makas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici4.etkiHesapla(makasKullanici4) + "<html> <br>Dayaniklilik: " + makasKullanici4.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(makasKullanici4.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici4, "Usta_Makas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici4.etkiHesapla(usta_makasKullanici4,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),usta_makasKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, null, usta_makasKullanici4, "Usta_Makas", bilgisayarHamle, bilgisayarAgirTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici4.etkiHesapla(usta_makasKullanici4, bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul(), usta_makasKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(makasKullanici4.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici4, "Usta_Makas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici4.etkiHesapla(usta_makasKullanici4,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),usta_makasKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, null, usta_makasKullanici4, "Usta_Makas", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici4.etkiHesapla(usta_makasKullanici4, bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul(), usta_makasKullanici4) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(makasKullanici4.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici4, "Usta_Makas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici4.etkiHesapla(usta_makasKullanici4) + "<html> <br>Dayaniklilik: " + usta_makasKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, null, usta_makasKullanici4, "Usta_Makas", bilgisayarHamle, null, null, bilgisayarUstaMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici4.etkiHesapla(usta_makasKullanici4) + "<html> <br>Dayaniklilik: " + usta_makasKullanici4.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }
                    if(makasKullanici4.isNesneDonusumuGerceklestiMi()){
                        usta_makasKullanici4.nesnePuaniGoster(usta_makasKullanici4);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton4.getText(),usta_makasKullanici4,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton4.getText(),usta_makasKullanici4,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton4.getText(),usta_makasKullanici4,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!makasKullanici4.isNesneDonusumuGerceklestiMi()){
                        makasKullanici4.nesnePuaniGoster(makasKullanici4);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton4.getText(),makasKullanici4,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton4.getText(),makasKullanici4,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton4.getText(),makasKullanici4,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }


                    if(!makasKullanici4.isOyunaDevamEdebilirMi() || !usta_makasKullanici4.isOyunaDevamEdebilirMi()){
                        makasButton4.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }
            }
        });
        makasButton5 = new JButton();
        makasButton5.setBounds(450,425,200,75);
        makasButton5.setText("Makas5");
        makasButton5.setVisible(false);
        makasButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(makasKullanici5.isOyunaDevamEdebilirMi() && usta_makasKullanici5.isOyunaDevamEdebilirMi()) {
                    if(gorunenButonSayisi() == 1){
                        sonHamle = "";
                    }
                    if (!butonTiklamaKontrol(sonHamle, makasButton5.getText())) {
                        JOptionPane.showMessageDialog(null, "Ayni nesneye iki kere arka arkaya kullanamazsiniz");
                        return;
                    }
                    sonHamle = "Makas5";
                    islemSayaci++;
                    value = "Makas";
                    Servis_Hesapla s1 = new Servis_Hesapla();
                    String bilgisayarHamle = BilgisayarHareketBul();
                    if(makasKullanici5.isNesneDonusum() && !makasKullanici5.isNesneDonusumuGerceklestiMi()){
                        makasKullanici5.setNesneDonusumuGerceklestiMi(true);
                        usta_makasKullanici5 = nesneDonusumMakas(makasKullanici5);
                        makasButton5.setText("Usta Makas5");
                    }
                    if (!makasKullanici5.isNesneDonusum() && bilgisayarHamle == "Tas") {
                        s1.Hesapla(null, null, makasKullanici5, "Makas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici5.etkiHesapla(makasKullanici5,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + makasKullanici5.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),makasKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                    } else if (!makasKullanici5.isNesneDonusum() && bilgisayarHamle == "Kagit") {
                        s1.Hesapla(null, null, makasKullanici5, "Makas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null,bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici5.etkiHesapla(makasKullanici5,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + makasKullanici5.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),makasKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                    } else if (!makasKullanici5.isNesneDonusum() && bilgisayarHamle == "Makas") {
                        s1.Hesapla(null, null, makasKullanici5, "Makas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(),bil1);
                        kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + makasKullanici5.etkiHesapla(makasKullanici5) + "<html> <br>Dayaniklilik: " + makasKullanici5.getDayaniklilik());
                        bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                    }


                    else if(makasKullanici5.isNesneDonusum() && bilgisayarHamle.equals("Tas")) {
                        if (!bilgisayarTasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici5, "Usta_Makas", bilgisayarHamle, bilgisayarTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici5.etkiHesapla(usta_makasKullanici5,bilgisayarTasHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarTasHamleBul().etkiHesapla(bilgisayarTasHamleBul(),usta_makasKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarTasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, null, usta_makasKullanici5, "Usta_Makas", bilgisayarHamle, bilgisayarAgirTasHamleBul(), null, null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici5.etkiHesapla(usta_makasKullanici5,bilgisayarAgirTasHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarAgirTasHamleBul().etkiHesapla(bilgisayarAgirTasHamleBul(),usta_makasKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarAgirTasHamleBul().getDayaniklilik());
                        }
                    }
                    else if(makasKullanici5.isNesneDonusum() && bilgisayarHamle.equals("Kagit")) {
                        if (!bilgisayarKagitHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici5, "Usta_Makas", bilgisayarHamle, null, bilgisayarKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici5.etkiHesapla(usta_makasKullanici5,bilgisayarKagitHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarKagitHamleBul().etkiHesapla(bilgisayarKagitHamleBul(),usta_makasKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarKagitHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, null, usta_makasKullanici5, "Usta_Makas", bilgisayarHamle, null, bilgisayarOzelKagitHamleBul(), null, bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici5.etkiHesapla(usta_makasKullanici5, bilgisayarOzelKagitHamleBul()) + "<html> <br>Dayaniklilik: " + usta_makasKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarOzelKagitHamleBul().etkiHesapla(bilgisayarOzelKagitHamleBul(), usta_makasKullanici5) + "<html> <br>Dayaniklilik: " + bilgisayarOzelKagitHamleBul().getDayaniklilik());
                        }
                    }
                    else if(makasKullanici5.isNesneDonusum() && bilgisayarHamle.equals("Makas")) {
                        if (!bilgisayarMakasHamleBul().isNesneDonusum()) {
                            s1.OzelHesapla(null, null, usta_makasKullanici5, "Usta_Makas", bilgisayarHamle, null, null, bilgisayarMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici5.etkiHesapla(usta_makasKullanici5) + "<html> <br>Dayaniklilik: " + usta_makasKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarMakasHamleBul().etkiHesapla(bilgisayarMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarMakasHamleBul().getDayaniklilik());
                        }
                        else {
                            s1.OzelTasKagitMakasHesapla(null, null, usta_makasKullanici5, "Usta_Makas", bilgisayarHamle, null, null, bilgisayarUstaMakasHamleBul(), bil1);
                            kullaniciLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + usta_makasKullanici5.etkiHesapla(usta_makasKullanici5) + "<html> <br>Dayaniklilik: " + usta_makasKullanici5.getDayaniklilik());
                            bilgisayarLabel.setText("<html> <br>Hamle: " + islemSayaci + "<html> <br>Hasar: " + bilgisayarUstaMakasHamleBul().etkiHesapla(bilgisayarUstaMakasHamleBul()) + "<html> <br>Dayaniklilik: " + bilgisayarUstaMakasHamleBul().getDayaniklilik());
                        }
                    }
                    if(makasKullanici5.isNesneDonusumuGerceklestiMi()){
                        usta_makasKullanici5.nesnePuaniGoster(usta_makasKullanici5);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton5.getText(),usta_makasKullanici5,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton5.getText(),usta_makasKullanici5,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton5.getText(),usta_makasKullanici5,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }

                    }
                    if(!makasKullanici5.isNesneDonusumuGerceklestiMi()){
                        makasKullanici5.nesnePuaniGoster(makasKullanici5);
                        if(bilgisayarHamle.equals("Tas")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton5.getText(),makasKullanici5,bilgisayarTasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else if(bilgisayarHamle.equals("Kagit")){
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton5.getText(),makasKullanici5,bilgisayarKagitHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                            try {
                                dosyayaYazMakas(islemSayaci,makasButton5.getText(),makasKullanici5,bilgisayarMakasHamleBul());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                    if(!makasKullanici5.isOyunaDevamEdebilirMi() || !usta_makasKullanici5.isOyunaDevamEdebilirMi()){
                        makasButton5.setVisible(false);
                    }
                    oyunSonuKontrolu(islemSayaci);
                }
            }
        });

    }

    public void butonGorunurlukAyarla(int TasCount, int KagitCount, int MakasCount){

        if(TasCount == 1){
            tasButton1.setVisible(true);
        }
        if(TasCount == 2){
            tasButton1.setVisible(true);
            tasButton2.setVisible(true);
        }
        if(TasCount == 3){
            tasButton1.setVisible(true);
            tasButton2.setVisible(true);
            tasButton3.setVisible(true);
        }
        if(TasCount == 4){
            tasButton1.setVisible(true);
            tasButton2.setVisible(true);
            tasButton3.setVisible(true);
            tasButton4.setVisible(true);
        }
        if(TasCount == 5){
            tasButton1.setVisible(true);
            tasButton2.setVisible(true);
            tasButton3.setVisible(true);
            tasButton4.setVisible(true);
            tasButton5.setVisible(true);
        }

        if(KagitCount == 1){
            kagitButton1.setVisible(true);
        }
        if(KagitCount == 2){
            kagitButton1.setVisible(true);
            kagitButton2.setVisible(true);
        }
        if(KagitCount == 3){
            kagitButton1.setVisible(true);
            kagitButton2.setVisible(true);
            kagitButton3.setVisible(true);
        }
        if(KagitCount == 4){
            kagitButton1.setVisible(true);
            kagitButton2.setVisible(true);
            kagitButton3.setVisible(true);
            kagitButton4.setVisible(true);
        }
        if(KagitCount == 5){
            kagitButton1.setVisible(true);
            kagitButton2.setVisible(true);
            kagitButton3.setVisible(true);
            kagitButton4.setVisible(true);
            kagitButton5.setVisible(true);
        }

        if(MakasCount == 1){
            makasButton1.setVisible(true);
        }
        if(MakasCount == 2){
            makasButton1.setVisible(true);
            makasButton2.setVisible(true);
        }
        if(MakasCount == 3){
            makasButton1.setVisible(true);
            makasButton2.setVisible(true);
            makasButton3.setVisible(true);
        }
        if(MakasCount == 4){
            makasButton1.setVisible(true);
            makasButton2.setVisible(true);
            makasButton3.setVisible(true);
            makasButton4.setVisible(true);
        }
        if(MakasCount == 5){
            makasButton1.setVisible(true);
            makasButton2.setVisible(true);
            makasButton3.setVisible(true);
            makasButton4.setVisible(true);
            makasButton5.setVisible(true);
        }
    }

    public boolean butonTiklamaKontrol(String sonHamle, String guncelHamle){

        if(sonHamle == guncelHamle){
            return false;
        }
        return true;
    }

    public Tas bilgisayarTasHamleBul(){
        int bilgisayarHamleSirasi = secim;
        if(bilgisayarHamleSirasi == 1){
            bil1.setNesneNumber(1);
            return tasBilgisayar1;
        }
        else if(bilgisayarHamleSirasi == 2){
            bil1.setNesneNumber(2);
            return  tasBilgisayar2;
        }
        else if(bilgisayarHamleSirasi == 3){
            bil1.setNesneNumber(3);
            return  tasBilgisayar3;
        }
        else if(bilgisayarHamleSirasi == 4){
            bil1.setNesneNumber(4);
            return  tasBilgisayar4;
        }
        else if(bilgisayarHamleSirasi == 5){
            bil1.setNesneNumber(5);
            return  tasBilgisayar5;
        }
        return new Tas();
    }

    public Agir_Tas bilgisayarAgirTasHamleBul(){
        int bilgisayarHamleSirasi = secim;
        if(bilgisayarHamleSirasi == 1){
            bil1.setNesneNumber(1);
            return agir_tasBilgisayar1;
        }
        else if(bilgisayarHamleSirasi == 2){
            bil1.setNesneNumber(2);
            return  agir_tasBilgisayar2;
        }
        else if(bilgisayarHamleSirasi == 3){
            bil1.setNesneNumber(3);
            return  agir_tasBilgisayar3;
        }
        else if(bilgisayarHamleSirasi == 4){
            bil1.setNesneNumber(4);
            return  agir_tasBilgisayar4;
        }
        else if(bilgisayarHamleSirasi == 5){
            bil1.setNesneNumber(5);
            return  agir_tasBilgisayar5;
        }
        return new Agir_Tas();
    }

    public Kagit bilgisayarKagitHamleBul(){
        int bilgisayarHamleSirasi = secim;
        if(bilgisayarHamleSirasi == 6){
            bil1.setNesneNumber(6);
            return kagitBilgisayar1;
        }
        else if(bilgisayarHamleSirasi == 7){
            bil1.setNesneNumber(7);
            return  kagitBilgisayar2;
        }
        else if(bilgisayarHamleSirasi == 8){
            bil1.setNesneNumber(8);
            return  kagitBilgisayar3;
        }
        else if(bilgisayarHamleSirasi == 9){
            bil1.setNesneNumber(9);
            return  kagitBilgisayar4;
        }
        else if(bilgisayarHamleSirasi == 10){
            bil1.setNesneNumber(10);
            return  kagitBilgisayar5;
        }
        return new Kagit();
    }

    public Ozel_Kagit bilgisayarOzelKagitHamleBul(){
        int bilgisayarHamleSirasi = secim;
        if(bilgisayarHamleSirasi == 6){
            bil1.setNesneNumber(6);
            return ozel_kagitBilgisayar1;
        }
        else if(bilgisayarHamleSirasi == 7){
            bil1.setNesneNumber(7);
            return  ozel_kagitBilgisayar2;
        }
        else if(bilgisayarHamleSirasi == 8){
            bil1.setNesneNumber(8);
            return  ozel_kagitBilgisayar3;
        }
        else if(bilgisayarHamleSirasi == 9){
            bil1.setNesneNumber(9);
            return  ozel_kagitBilgisayar4;
        }
        else if(bilgisayarHamleSirasi == 10){
            bil1.setNesneNumber(10);
            return  ozel_kagitBilgisayar5;
        }
        return new Ozel_Kagit();
    }
    public Makas bilgisayarMakasHamleBul(){
        int bilgisayarHamleSirasi = secim;
        if(bilgisayarHamleSirasi == 11){
            bil1.setNesneNumber(11);
            return makasBilgisayar1;
        }
        else if(bilgisayarHamleSirasi == 12){
            bil1.setNesneNumber(12);
            return  makasBilgisayar2;
        }
        else if(bilgisayarHamleSirasi == 13){
            bil1.setNesneNumber(13);
            return  makasBilgisayar3;
        }
        else if(bilgisayarHamleSirasi == 14){
            bil1.setNesneNumber(14);
            return  makasBilgisayar4;
        }
        else if(bilgisayarHamleSirasi == 15){
            bil1.setNesneNumber(15);
            return  makasBilgisayar5;
        }
        return new Makas();
    }
    public Usta_Makas bilgisayarUstaMakasHamleBul(){
        int bilgisayarHamleSirasi = secim;
        if(bilgisayarHamleSirasi == 11){
            bil1.setNesneNumber(11);
            return usta_makasBilgisayar1;
        }
        else if(bilgisayarHamleSirasi == 12){
            bil1.setNesneNumber(12);
            return  usta_makasBilgisayar2;
        }
        else if(bilgisayarHamleSirasi == 13){
            bil1.setNesneNumber(13);
            return  usta_makasBilgisayar3;
        }
        else if(bilgisayarHamleSirasi == 14){
            bil1.setNesneNumber(14);
            return  usta_makasBilgisayar4;
        }
        else if(bilgisayarHamleSirasi == 15){
            bil1.setNesneNumber(15);
            return  usta_makasBilgisayar5;
        }
        return new Usta_Makas();
    }

    public void oyunSonuKontrolu(int islemSayaci){
        if(bil1.getBilgisayarHamleListesi().size() == 0){
            JOptionPane.showMessageDialog(null, "Bilgisayarın Nesneleri Bitti Kullanici Kazandi");
            Buton b1 = new Buton();
            frame.dispose();
            b1.BaslangicEkranCiz();
        }

        if(islemSayaci == bil1.getHamleSayisi()){
            JOptionPane.showMessageDialog(null, "Hamleler bitti menüye dönülüyor");
            kullaniciDayaniklilikTopla();
            bilgisayarDayaniklilikTopla();

            if(toplamDayaniklilikKullanici > toplamDayaniklilikBilgisayar ){
                JOptionPane.showMessageDialog(null, "Kullanici Kazandi\n" + "Kullanici Toplam Dayaniklilik: " + toplamDayaniklilikKullanici + "\nBilgisayar Toplam Dayaniklilik: " + toplamDayaniklilikBilgisayar + "\nKullanici Skor: " + kul1.SkorGoster(toplamDayaniklilikKullanici, toplamDayaniklilikBilgisayar));
            }
            if(toplamDayaniklilikKullanici < toplamDayaniklilikBilgisayar){
                JOptionPane.showMessageDialog(null, "Bilgisayar Kazandi\n" + "Bilgisayar Toplam Dayaniklilik: " + toplamDayaniklilikBilgisayar + "\nKullanici Toplam Dayaniklilik: " + toplamDayaniklilikKullanici + "\nBilgisayar Skor: " + bil1.SkorGoster(toplamDayaniklilikKullanici, toplamDayaniklilikBilgisayar));
            }
            if(toplamDayaniklilikKullanici == toplamDayaniklilikBilgisayar) {
                JOptionPane.showMessageDialog(null, "Berabere Kalindi\n" + "Kullanici Toplam Dayaniklilik: " + toplamDayaniklilikKullanici + "\nBilgisayar Toplam Dayaniklilik: " + toplamDayaniklilikBilgisayar);
            }

            Buton b1 = new Buton();
            frame.dispose();
            b1.BaslangicEkranCiz();
        }

        if(!tasButton1.isVisible() &&
                !tasButton2.isVisible() &&
                !tasButton3.isVisible() &&
                !tasButton4.isVisible() &&
                !tasButton5.isVisible() &&

                !kagitButton1.isVisible() &&
                !kagitButton2.isVisible() &&
                !kagitButton3.isVisible() &&
                !kagitButton4.isVisible() &&
                !kagitButton5.isVisible() &&

                !makasButton1.isVisible() &&
                !makasButton2.isVisible() &&
                !makasButton3.isVisible() &&
                !makasButton4.isVisible() &&
                !makasButton5.isVisible()){

                    JOptionPane.showMessageDialog(null, "Kullanıcının Nesneleri Bitti Bilgisayar Kazandi");
                    Buton b1 = new Buton();
                    frame.dispose();
                    b1.BaslangicEkranCiz();
        }
    }

    public double kullaniciDayaniklilikTopla(){
        if(tasButton1.isVisible()){
            if(!tasKullanici1.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += tasKullanici1.getDayaniklilik();
            else
                toplamDayaniklilikKullanici +=agir_tasKullanici1.getDayaniklilik();
        }
        if(tasButton2.isVisible()){
            if(!tasKullanici2.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += tasKullanici2.getDayaniklilik();
            else
                toplamDayaniklilikKullanici +=agir_tasKullanici2.getDayaniklilik();
        }
        if(tasButton3.isVisible()){
            if(!tasKullanici3.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += tasKullanici3.getDayaniklilik();
            else
                toplamDayaniklilikKullanici +=agir_tasKullanici3.getDayaniklilik();
        }
        if(tasButton4.isVisible()){
            if(!tasKullanici4.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += tasKullanici4.getDayaniklilik();
            else
                toplamDayaniklilikKullanici +=agir_tasKullanici4.getDayaniklilik();
        }
        if(tasButton5.isVisible()){
            if(!tasKullanici5.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += tasKullanici5.getDayaniklilik();
            else
                toplamDayaniklilikKullanici +=agir_tasKullanici5.getDayaniklilik();
        }
        if(kagitButton1.isVisible()){
            if(!kagitKullanici1.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += kagitKullanici1.getDayaniklilik();
            else
                toplamDayaniklilikKullanici += ozel_kagitKullanici1.getDayaniklilik();
        }
        if(kagitButton2.isVisible()){
            if(!kagitKullanici2.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += kagitKullanici2.getDayaniklilik();
            else
                toplamDayaniklilikKullanici += ozel_kagitKullanici2.getDayaniklilik();
        }
        if(kagitButton3.isVisible()){
            if(!kagitKullanici3.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += kagitKullanici3.getDayaniklilik();
            else
                toplamDayaniklilikKullanici += ozel_kagitKullanici3.getDayaniklilik();
        }
        if(kagitButton4.isVisible()){
            if(!kagitKullanici4.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += kagitKullanici4.getDayaniklilik();
            else
                toplamDayaniklilikKullanici += ozel_kagitKullanici4.getDayaniklilik();
        }
        if(kagitButton5.isVisible()){
            if(!kagitKullanici5.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += kagitKullanici5.getDayaniklilik();
            else
                toplamDayaniklilikKullanici += ozel_kagitKullanici5.getDayaniklilik();
        }
        if(makasButton1.isVisible()){
            if(!makasKullanici1.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += makasKullanici1.getDayaniklilik();
            else
                toplamDayaniklilikKullanici += usta_makasKullanici1.getDayaniklilik();
        }
        if(makasButton2.isVisible()){
            if(!makasKullanici2.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += makasKullanici2.getDayaniklilik();
            else
                toplamDayaniklilikKullanici += usta_makasKullanici2.getDayaniklilik();
        }
        if(makasButton3.isVisible()){
            if(!makasKullanici3.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += makasKullanici3.getDayaniklilik();
            else
                toplamDayaniklilikKullanici += usta_makasKullanici3.getDayaniklilik();
        }
        if(makasButton4.isVisible()){
            if(!makasKullanici4.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += makasKullanici4.getDayaniklilik();
            else
                toplamDayaniklilikKullanici += usta_makasKullanici4.getDayaniklilik();
        }
        if(makasButton5.isVisible()){
            if(!makasKullanici5.isNesneDonusumuGerceklestiMi())
                toplamDayaniklilikKullanici += makasKullanici5.getDayaniklilik();
            else
                toplamDayaniklilikKullanici += usta_makasKullanici5.getDayaniklilik();
        }

        return toplamDayaniklilikKullanici;
    }

    public double bilgisayarDayaniklilikTopla(){
        int nesne;
        for(int b = 0; b <= bil1.getBilgisayarHamleListesi().size() - 1; b++){
            nesne = bil1.getBilgisayarHamleListesi().get(b);

        if(nesne == 1 && tasBilgisayar1.isOyunaDevamEdebilirMi()){
            if(tasBilgisayar1.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += agir_tasBilgisayar1.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += tasBilgisayar1.getDayaniklilik();
        }
        else if(nesne == 2 && tasBilgisayar2.isOyunaDevamEdebilirMi()){
            if(tasBilgisayar2.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += agir_tasBilgisayar2.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += tasBilgisayar2.getDayaniklilik();
        }
        else if(nesne == 3 && tasBilgisayar3.isOyunaDevamEdebilirMi()){
            if(tasBilgisayar3.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += agir_tasBilgisayar3.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += tasBilgisayar2.getDayaniklilik();
        }
        else if(nesne == 4 && tasBilgisayar4.isOyunaDevamEdebilirMi()){
            if(tasBilgisayar4.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += agir_tasBilgisayar4.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += tasBilgisayar2.getDayaniklilik();
        }
        else if(nesne == 5 && tasBilgisayar5.isOyunaDevamEdebilirMi()){
            if(tasBilgisayar5.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += agir_tasBilgisayar5.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += tasBilgisayar2.getDayaniklilik();
        }
        else if(nesne == 6 && kagitBilgisayar1.isOyunaDevamEdebilirMi()){
            if(kagitBilgisayar1.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += ozel_kagitBilgisayar1.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += kagitBilgisayar1.getDayaniklilik();
        }
        else if(nesne == 7 && kagitBilgisayar2.isOyunaDevamEdebilirMi()){
            if(kagitBilgisayar2.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += ozel_kagitBilgisayar2.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += kagitBilgisayar2.getDayaniklilik();
        }
        else if(nesne == 8 && kagitBilgisayar3.isOyunaDevamEdebilirMi()){
            if(kagitBilgisayar3.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += ozel_kagitBilgisayar3.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += kagitBilgisayar3.getDayaniklilik();
        }
        else if(nesne == 9 && kagitBilgisayar4.isOyunaDevamEdebilirMi()){
            if(kagitBilgisayar4.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += ozel_kagitBilgisayar4.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += kagitBilgisayar4.getDayaniklilik();
        }
        else if(nesne == 10 && kagitBilgisayar5.isOyunaDevamEdebilirMi()){
            if(kagitBilgisayar5.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += ozel_kagitBilgisayar5.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += kagitBilgisayar5.getDayaniklilik();
        }
        else if(nesne == 11 && makasBilgisayar1.isOyunaDevamEdebilirMi()){
            if(makasBilgisayar1.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += usta_makasBilgisayar1.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += makasBilgisayar1.getDayaniklilik();
        }
        else if(nesne == 12 && makasBilgisayar2.isOyunaDevamEdebilirMi()){
            if(makasBilgisayar2.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += usta_makasBilgisayar2.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += makasBilgisayar2.getDayaniklilik();
        }
        else if(nesne == 13 && makasBilgisayar3.isOyunaDevamEdebilirMi()){
            if(makasBilgisayar3.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += usta_makasBilgisayar3.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += makasBilgisayar3.getDayaniklilik();
        }
        else if(nesne == 14 && makasBilgisayar4.isOyunaDevamEdebilirMi()){
            if(makasBilgisayar4.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += usta_makasBilgisayar4.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += makasBilgisayar4.getDayaniklilik();
        }
        else if(nesne == 15 && makasBilgisayar5.isOyunaDevamEdebilirMi()){
            if(makasBilgisayar5.isNesneDonusum()){
                toplamDayaniklilikBilgisayar += usta_makasBilgisayar5.getDayaniklilik();
            }
            else
                toplamDayaniklilikBilgisayar += makasBilgisayar5.getDayaniklilik();
        }
        }

        return toplamDayaniklilikBilgisayar;
    }

    public Agir_Tas nesneDonusumTas(Tas tasKullanici){
        Agir_Tas agir_tas = new Agir_Tas();

        agir_tas.setDayaniklilik(tasKullanici.getDayaniklilik());
        agir_tas.setSeviyePuani(tasKullanici.getSeviyePuani());
        agir_tas.setKatilik(tasKullanici.getKatilik());

        return agir_tas;
    }
    public Ozel_Kagit nesneDonusumKagit(Kagit kagitKullanici){
        Ozel_Kagit ozel_kagit = new Ozel_Kagit();
        ozel_kagit.setDayaniklilik(kagitKullanici.getDayaniklilik());
        ozel_kagit.setSeviyePuani(kagitKullanici.getSeviyePuani());
        ozel_kagit.setNufuz(kagitKullanici.getNufuz());

        return ozel_kagit;
    }

    public Usta_Makas nesneDonusumMakas(Makas makasKullanici){
        Usta_Makas usta_makas = new Usta_Makas();
        usta_makas.setDayaniklilik(makasKullanici.getDayaniklilik());
        usta_makas.setSeviyePuani(makasKullanici.getSeviyePuani());
        usta_makas.setKeskinlik(makasKullanici.getKeskinlik());

        return usta_makas;
    }

    private int gorunenButonSayisi(){
        int butonSayisi = 0;
        if(tasButton1.isVisible()){
            butonSayisi++;}
        if(tasButton2.isVisible()){
            butonSayisi++;}
        if(tasButton3.isVisible()){
            butonSayisi++;}
        if(tasButton4.isVisible()){
            butonSayisi++;}
        if(tasButton5.isVisible()){
            butonSayisi++;}
        if(kagitButton1.isVisible()){
            butonSayisi++;}
        if(kagitButton2.isVisible()){
            butonSayisi++;}
        if(kagitButton3.isVisible()){
            butonSayisi++;}
        if(kagitButton4.isVisible()){
            butonSayisi++;}
        if(kagitButton5.isVisible()){
            butonSayisi++;}
        if(makasButton1.isVisible()){
            butonSayisi++;}
        if(makasButton2.isVisible()){
            butonSayisi++;}
        if(makasButton3.isVisible()){
            butonSayisi++;}
        if(makasButton4.isVisible()){
            butonSayisi++;}
        if(makasButton5.isVisible()){
            butonSayisi++;}

        return butonSayisi;
    }

    public void dosyayaYazTas(int islemSayaci, String butonadi, Tas kullaniciNesne, Tas bilgisayarNesne) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        //if(output.exists()){//düzeltme gerek
        //    output.delete();
        //}
        FileWriter f1 = new FileWriter(output,true);
        if(kullaniciNesne.isOyunaDevamEdebilirMi()){
            f1.write("Hamle: " + islemSayaci + "\n");
            f1.write("Kullanıcı nesnesi: " + butonadi + "\n");
            f1.write("Hasar: " + kullaniciNesne.etkiHesapla(kullaniciNesne) + "\n");//düzeltilecek
            f1.write("Dayaniklilik: " + kullaniciNesne.getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + kullaniciNesne.getSeviyePuani() + "\n");
        }
        else
            f1.write(butonadi + "nesnesi oyundan cıkartıldı");

        f1.write("Hamle: " + islemSayaci + "\n");
        f1.write("Bilgisayar nesnesi: " + bilgisayarNesne + "\n");
        f1.write("Hasar: " + bilgisayarNesne.etkiHesapla(bilgisayarNesne) + "\n");//düzeltilecek
        f1.write("Dayaniklilik: " + bilgisayarNesne.getDayaniklilik() + "\n");
        f1.write("Seviye Puani: " + bilgisayarNesne.getSeviyePuani() + "\n");
        f1.write("\n");
        f1.close();
    }
    public void dosyayaYazTas(int islemSayaci, String butonadi, Tas kullaniciNesne, Kagit bilgisayarNesne) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        //if(output.exists()){//düzeltme gerek
        //    output.delete();
        //}
        FileWriter f1 = new FileWriter(output,true);
        if(kullaniciNesne.isOyunaDevamEdebilirMi()){
            f1.write("Hamle: " + islemSayaci + "\n");
            f1.write("Kullanıcı nesnesi: " + butonadi + "\n");
            f1.write("Hasar: " + kullaniciNesne.etkiHesapla(kullaniciNesne,bilgisayarNesne) + "\n");//düzeltilecek
            f1.write("Dayaniklilik: " + kullaniciNesne.getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + kullaniciNesne.getSeviyePuani() + "\n");
        }
        else
            f1.write(butonadi + "nesnesi oyundan cıkartıldı");

        f1.write("Hamle: " + islemSayaci + "\n");
        f1.write("Bilgisayar nesnesi: " + bilgisayarNesne + "\n");
        f1.write("Hasar: " + bilgisayarNesne.etkiHesapla(bilgisayarNesne,kullaniciNesne) + "\n");//düzeltilecek
        f1.write("Dayaniklilik: " + bilgisayarNesne.getDayaniklilik() + "\n");
        f1.write("Seviye Puani: " + bilgisayarNesne.getSeviyePuani() + "\n");
        f1.write("\n");
        f1.close();
    }
    public void dosyayaYazTas(int islemSayaci, String butonadi, Tas kullaniciNesne, Makas bilgisayarNesne) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        //if(output.exists()){//düzeltme gerek
        //    output.delete();
        //}
        FileWriter f1 = new FileWriter(output,true);
        if(kullaniciNesne.isOyunaDevamEdebilirMi()){
            f1.write("Hamle: " + islemSayaci + "\n");
            f1.write("Kullanıcı nesnesi: " + butonadi + "\n");
            f1.write("Hasar: " + kullaniciNesne.etkiHesapla(kullaniciNesne,bilgisayarNesne) + "\n");//düzeltilecek
            f1.write("Dayaniklilik: " + kullaniciNesne.getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + kullaniciNesne.getSeviyePuani() + "\n");
        }
        else
            f1.write(butonadi + "nesnesi oyundan cıkartıldı");

        f1.write("Hamle: " + islemSayaci + "\n");
        f1.write("Bilgisayar nesnesi: " + bilgisayarNesne + "\n");
        f1.write("Hasar: " + bilgisayarNesne.etkiHesapla(bilgisayarNesne,kullaniciNesne) + "\n");//düzeltilecek
        f1.write("Dayaniklilik: " + bilgisayarNesne.getDayaniklilik() + "\n");
        f1.write("Seviye Puani: " + bilgisayarNesne.getSeviyePuani() + "\n");
        f1.write("\n");
        f1.close();
    }
    public void dosyayaYazKagit(int islemSayaci, String butonadi, Kagit kullaniciNesne, Tas bilgisayarNesne) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        //if(output.exists()){//düzeltme gerek
        //    output.delete();
        //}
        FileWriter f1 = new FileWriter(output,true);
        if(kullaniciNesne.isOyunaDevamEdebilirMi()){
            f1.write("Hamle: " + islemSayaci + "\n");
            f1.write("Kullanıcı nesnesi: " + butonadi + "\n");
            f1.write("Hasar: " + kullaniciNesne.etkiHesapla(kullaniciNesne,bilgisayarNesne) + "\n");//düzeltilecek
            f1.write("Dayaniklilik: " + kullaniciNesne.getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + kullaniciNesne.getSeviyePuani() + "\n");
        }
        else
            f1.write(butonadi + "nesnesi oyundan cıkartıldı");

        f1.write("Hamle: " + islemSayaci + "\n");
        f1.write("Bilgisayar nesnesi: " + bilgisayarNesne + "\n");
        f1.write("Hasar: " + bilgisayarNesne.etkiHesapla(bilgisayarNesne,kullaniciNesne) + "\n");//düzeltilecek
        f1.write("Dayaniklilik: " + bilgisayarNesne.getDayaniklilik() + "\n");
        f1.write("Seviye Puani: " + bilgisayarNesne.getSeviyePuani() + "\n");
        f1.write("\n");
        f1.close();
    }
    public void dosyayaYazKagit(int islemSayaci, String butonadi, Kagit kullaniciNesne, Kagit bilgisayarNesne) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        //if(output.exists()){//düzeltme gerek
        //    output.delete();
        //}
        FileWriter f1 = new FileWriter(output,true);
        if(kullaniciNesne.isOyunaDevamEdebilirMi()){
            f1.write("Hamle: " + islemSayaci + "\n");
            f1.write("Kullanıcı nesnesi: " + butonadi + "\n");
            f1.write("Hasar: " + kullaniciNesne.etkiHesapla(kullaniciNesne) + "\n");//düzeltilecek
            f1.write("Dayaniklilik: " + kullaniciNesne.getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + kullaniciNesne.getSeviyePuani() + "\n");
        }
        else
            f1.write(butonadi + "nesnesi oyundan cıkartıldı");

        f1.write("Hamle: " + islemSayaci + "\n");
        f1.write("Bilgisayar nesnesi: " + bilgisayarNesne + "\n");
        f1.write("Hasar: " + bilgisayarNesne.etkiHesapla(bilgisayarNesne) + "\n");//düzeltilecek
        f1.write("Dayaniklilik: " + bilgisayarNesne.getDayaniklilik() + "\n");
        f1.write("Seviye Puani: " + bilgisayarNesne.getSeviyePuani() + "\n");
        f1.write("\n");
        f1.close();
    }
    public void dosyayaYazKagit(int islemSayaci, String butonadi, Kagit kullaniciNesne, Makas bilgisayarNesne) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        //if(output.exists()){//düzeltme gerek
        //    output.delete();
        //}
        FileWriter f1 = new FileWriter(output,true);
        if(kullaniciNesne.isOyunaDevamEdebilirMi()){
            f1.write("Hamle: " + islemSayaci + "\n");
            f1.write("Kullanıcı nesnesi: " + butonadi + "\n");
            f1.write("Hasar: " + kullaniciNesne.etkiHesapla(kullaniciNesne,bilgisayarNesne) + "\n");//düzeltilecek
            f1.write("Dayaniklilik: " + kullaniciNesne.getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + kullaniciNesne.getSeviyePuani() + "\n");
        }
        else
            f1.write(butonadi + "nesnesi oyundan cıkartıldı");

        f1.write("Hamle: " + islemSayaci + "\n");
        f1.write("Bilgisayar nesnesi: " + bilgisayarNesne + "\n");
        f1.write("Hasar: " + bilgisayarNesne.etkiHesapla(bilgisayarNesne,kullaniciNesne) + "\n");//düzeltilecek
        f1.write("Dayaniklilik: " + bilgisayarNesne.getDayaniklilik() + "\n");
        f1.write("Seviye Puani: " + bilgisayarNesne.getSeviyePuani() + "\n");
        f1.write("\n");
        f1.close();
    }
    public void dosyayaYazMakas(int islemSayaci, String butonadi, Makas kullaniciNesne, Tas bilgisayarNesne) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        //if(output.exists()){//düzeltme gerek
        //    output.delete();
        //}
        FileWriter f1 = new FileWriter(output,true);
        if(kullaniciNesne.isOyunaDevamEdebilirMi()) {
            f1.write("Hamle: " + islemSayaci + "\n");
            f1.write("Kullanıcı nesnesi: " + butonadi + "\n");
            f1.write("Hasar: " + kullaniciNesne.etkiHesapla(kullaniciNesne,bilgisayarNesne) + "\n");//düzeltilecek
            f1.write("Dayaniklilik: " + kullaniciNesne.getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + kullaniciNesne.getSeviyePuani() + "\n");
        }
        else
            f1.write(butonadi + "nesnesi oyundan cıkartıldı");

        f1.write("Hamle: " + islemSayaci + "\n");
        f1.write("Bilgisayar nesnesi: " + bilgisayarNesne + "\n");
        f1.write("Hasar: " + bilgisayarNesne.etkiHesapla(bilgisayarNesne,kullaniciNesne) + "\n");//düzeltilecek
        f1.write("Dayaniklilik: " + bilgisayarNesne.getDayaniklilik() + "\n");
        f1.write("Seviye Puani: " + bilgisayarNesne.getSeviyePuani() + "\n");
        f1.write("\n");
        f1.close();
    }
    public void dosyayaYazMakas(int islemSayaci, String butonadi, Makas kullaniciNesne, Kagit bilgisayarNesne) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        //if(output.exists()){//düzeltme gerek
        //    output.delete();
        //}
        FileWriter f1 = new FileWriter(output,true);
        if(kullaniciNesne.isOyunaDevamEdebilirMi()) {
            f1.write("Hamle: " + islemSayaci + "\n");
            f1.write("Kullanıcı nesnesi: " + butonadi + "\n");
            f1.write("Hasar: " + kullaniciNesne.etkiHesapla(kullaniciNesne,bilgisayarNesne) + "\n");//düzeltilecek
            f1.write("Dayaniklilik: " + kullaniciNesne.getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + kullaniciNesne.getSeviyePuani() + "\n");
        }
        else
            f1.write(butonadi + "nesnesi oyundan cıkartıldı");

        f1.write("Hamle: " + islemSayaci + "\n");
        f1.write("Bilgisayar nesnesi: " + bilgisayarNesne + "\n");
        f1.write("Hasar: " + bilgisayarNesne.etkiHesapla(bilgisayarNesne,kullaniciNesne) + "\n");//düzeltilecek
        f1.write("Dayaniklilik: " + bilgisayarNesne.getDayaniklilik() + "\n");
        f1.write("Seviye Puani: " + bilgisayarNesne.getSeviyePuani() + "\n");
        f1.write("\n");
        f1.close();
    }
    public void dosyayaYazMakas(int islemSayaci, String butonadi, Makas kullaniciNesne, Makas bilgisayarNesne) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        //if(output.exists()){//düzeltme gerek
        //    output.delete();
        //}
        FileWriter f1 = new FileWriter(output,true);
        if(kullaniciNesne.isOyunaDevamEdebilirMi()) {
            f1.write("Hamle: " + islemSayaci + "\n");
            f1.write("Kullanıcı nesnesi: " + butonadi + "\n");
            f1.write("Hasar: " + kullaniciNesne.etkiHesapla(kullaniciNesne) + "\n");//düzeltilecek
            f1.write("Dayaniklilik: " + kullaniciNesne.getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + kullaniciNesne.getSeviyePuani() + "\n");
        }
        else
            f1.write(butonadi + "nesnesi oyundan cıkartıldı");

        f1.write("Hamle: " + islemSayaci + "\n");
        f1.write("Bilgisayar nesnesi: " + bilgisayarNesne + "\n");
        f1.write("Hasar: " + bilgisayarNesne.etkiHesapla(bilgisayarNesne) + "\n");//düzeltilecek
        f1.write("Dayaniklilik: " + bilgisayarNesne.getDayaniklilik() + "\n");
        f1.write("Seviye Puani: " + bilgisayarNesne.getSeviyePuani() + "\n");
        f1.write("\n");
        f1.close();
    }

}
