import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GamescreenComputer extends JFrame {

    //region Nesne Tanımları
    JFrame frame;
    private Bilgisayar bilgisayar1;
    private Bilgisayar bilgisayar2;
    private int bilgisayar1Secim;
    private int bilgisayar2Secim;
    private int hamleSayisi;

    private Tas tasBilgisayar11 = new Tas();
    private Tas tasBilgisayar12 = new Tas();
    private Tas tasBilgisayar13 = new Tas();
    private Tas tasBilgisayar14 = new Tas();
    private Tas tasBilgisayar15 = new Tas();

    private Tas tasBilgisayar21 = new Tas();
    private Tas tasBilgisayar22 = new Tas();
    private Tas tasBilgisayar23 = new Tas();
    private Tas tasBilgisayar24 = new Tas();
    private Tas tasBilgisayar25 = new Tas();

    Kagit kagitBilgisayar11 = new Kagit();
    Kagit kagitBilgisayar12 = new Kagit();
    Kagit kagitBilgisayar13 = new Kagit();
    Kagit kagitBilgisayar14 = new Kagit();
    Kagit kagitBilgisayar15 = new Kagit();

    Kagit kagitBilgisayar21 = new Kagit();
    Kagit kagitBilgisayar22 = new Kagit();
    Kagit kagitBilgisayar23 = new Kagit();
    Kagit kagitBilgisayar24 = new Kagit();
    Kagit kagitBilgisayar25 = new Kagit();

    Makas makasBilgisayar11 = new Makas();
    Makas makasBilgisayar12 = new Makas();
    Makas makasBilgisayar13 = new Makas();
    Makas makasBilgisayar14 = new Makas();
    Makas makasBilgisayar15 = new Makas();

    Makas makasBilgisayar21 = new Makas();
    Makas makasBilgisayar22 = new Makas();
    Makas makasBilgisayar23 = new Makas();
    Makas makasBilgisayar24 = new Makas();
    Makas makasBilgisayar25 = new Makas();

    Agir_Tas agirTasBilgisayar11 =  new Agir_Tas();
    Agir_Tas agirTasBilgisayar12 =  new Agir_Tas();
    Agir_Tas agirTasBilgisayar13 =  new Agir_Tas();
    Agir_Tas agirTasBilgisayar14 =  new Agir_Tas();
    Agir_Tas agirTasBilgisayar15 =  new Agir_Tas();

    Agir_Tas agirTasBilgisayar21 =  new Agir_Tas();
    Agir_Tas agirTasBilgisayar22 =  new Agir_Tas();
    Agir_Tas agirTasBilgisayar23 =  new Agir_Tas();
    Agir_Tas agirTasBilgisayar24 =  new Agir_Tas();
    Agir_Tas agirTasBilgisayar25 =  new Agir_Tas();

    Ozel_Kagit ozelKagitBilgisayar11 = new Ozel_Kagit();
    Ozel_Kagit ozelKagitBilgisayar12 = new Ozel_Kagit();
    Ozel_Kagit ozelKagitBilgisayar13 = new Ozel_Kagit();
    Ozel_Kagit ozelKagitBilgisayar14 = new Ozel_Kagit();
    Ozel_Kagit ozelKagitBilgisayar15 = new Ozel_Kagit();

    Ozel_Kagit ozelKagitBilgisayar21 = new Ozel_Kagit();
    Ozel_Kagit ozelKagitBilgisayar22 = new Ozel_Kagit();
    Ozel_Kagit ozelKagitBilgisayar23 = new Ozel_Kagit();
    Ozel_Kagit ozelKagitBilgisayar24 = new Ozel_Kagit();
    Ozel_Kagit ozelKagitBilgisayar25 = new Ozel_Kagit();

    Usta_Makas ustaMakasBilgisayar11 = new Usta_Makas();
    Usta_Makas ustaMakasBilgisayar12 = new Usta_Makas();
    Usta_Makas ustaMakasBilgisayar13 = new Usta_Makas();
    Usta_Makas ustaMakasBilgisayar14 = new Usta_Makas();
    Usta_Makas ustaMakasBilgisayar15 = new Usta_Makas();

    Usta_Makas ustaMakasBilgisayar21 = new Usta_Makas();
    Usta_Makas ustaMakasBilgisayar22 = new Usta_Makas();
    Usta_Makas ustaMakasBilgisayar23 = new Usta_Makas();
    Usta_Makas ustaMakasBilgisayar24 = new Usta_Makas();
    Usta_Makas ustaMakasBilgisayar25 = new Usta_Makas();
    double bilgisayar1ToplamDayaniklilik;
    int bilgisayar1Nesne;
    double bilgisayar2ToplamDayaniklilik;
    int bilgisayar2Nesne;


    //endregion

    //region Public Operasyonlar
    public void BilgisayarOyunEkranCiz(){

        frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        bilgisayar1 = new Bilgisayar();
        bilgisayar2 = new Bilgisayar();
        hamleSayisi = 0;

//dayanıklılık ve seviye puanı setlemeleri yapmak gerek

        /*tasBilgisayar11.setNesneDonusum(true);
        tasBilgisayar12.setNesneDonusum(true);
        tasBilgisayar13.setNesneDonusum(true);
        tasBilgisayar14.setNesneDonusum(true);
        tasBilgisayar15.setNesneDonusum(true);
        kagitBilgisayar11.setNesneDonusum(true);
        kagitBilgisayar12.setNesneDonusum(true);
        kagitBilgisayar13.setNesneDonusum(true);
        kagitBilgisayar14.setNesneDonusum(true);
        kagitBilgisayar15.setNesneDonusum(true);
        makasBilgisayar11.setNesneDonusum(true);
        makasBilgisayar12.setNesneDonusum(true);
        makasBilgisayar13.setNesneDonusum(true);
        makasBilgisayar14.setNesneDonusum(true);
        makasBilgisayar15.setNesneDonusum(true);

        tasBilgisayar21.setNesneDonusum(true);
        tasBilgisayar22.setNesneDonusum(true);
        tasBilgisayar23.setNesneDonusum(true);
        tasBilgisayar24.setNesneDonusum(true);
        tasBilgisayar25.setNesneDonusum(true);
        kagitBilgisayar21.setNesneDonusum(true);
        kagitBilgisayar22.setNesneDonusum(true);
        kagitBilgisayar23.setNesneDonusum(true);
        kagitBilgisayar24.setNesneDonusum(true);
        kagitBilgisayar25.setNesneDonusum(true);
        makasBilgisayar21.setNesneDonusum(true);
        makasBilgisayar22.setNesneDonusum(true);
        makasBilgisayar23.setNesneDonusum(true);
        makasBilgisayar24.setNesneDonusum(true);
        makasBilgisayar25.setNesneDonusum(true);*/


        BilgisayarHamleBelirle();
        BilgisayarOyunOynat();

    }

    //Bilgisayarların hamle havuzunu ve seçilen hamleyi belirler
    public void BilgisayarHamleBelirle(){

        bilgisayar1.setBilgisayarHamleListesi(bilgisayar1.nesneSec());
        bilgisayar1.oynanabilecekHamleSayisi();

        bilgisayar2.setBilgisayarHamleListesi(bilgisayar2.nesneSec());
        bilgisayar2.oynanabilecekHamleSayisi();
    }
    //oyunun başlayacağı ve oyunun bitme koşulları sağlanana kadar kendini tekrar çağıran oyun fonksiyonudur
    public void BilgisayarOyunOynat(){

        if(bilgisayar1.getBilgisayarHamleListesi().size() > 0 && bilgisayar2.getBilgisayarHamleListesi().size() > 0) {
            BilgisayarSecimBul(1);
            BilgisayarSecimBul(2);
            BilgisayarSecimKarsilikBelirleVeHesapYap(bilgisayar1 , bilgisayar2);
        }

        //tekrar kendini çağırması lazım

        if(hamleSayisi <=10 && (bilgisayar1.getBilgisayarHamleListesi().size() > 0 && bilgisayar2.getBilgisayarHamleListesi().size() > 0)) {
            BilgisayarOyunOynat();
        }
        else{
            //fonksiyona alalım bunu
            for(int i = 0; i <= bilgisayar1.getBilgisayarHamleListesi().size() - 1; i++){
                bilgisayar1Nesne = bilgisayar1.getBilgisayarHamleListesi().get(i);

                if(bilgisayar1Nesne >0 && bilgisayar1Nesne <6){//tas demektir
                    if(Bilgisayar1TasSecimBelirle(bilgisayar1Nesne).isNesneDonusum()){
                        bilgisayar1ToplamDayaniklilik += Bilgisayar1AgirTasSecimBelirle(bilgisayar1Nesne).getDayaniklilik();
                    }
                    else
                        bilgisayar1ToplamDayaniklilik += Bilgisayar1TasSecimBelirle(bilgisayar1Nesne).getDayaniklilik();
                }
                else if(bilgisayar1Nesne > 5 && bilgisayar1Nesne < 11){//kagit demektir
                    if(Bilgisayar1KagitSecimBelirle(bilgisayar1Nesne).isNesneDonusum()){
                        bilgisayar1ToplamDayaniklilik += Bilgisayar1OzelKagitSecimBelirle(bilgisayar1Nesne).getDayaniklilik();
                    }
                    else
                        bilgisayar1ToplamDayaniklilik += Bilgisayar1KagitSecimBelirle(bilgisayar1Nesne).getDayaniklilik();
                }
                else {//makas demektir
                    if(Bilgisayar1MakasSecimBelirle(bilgisayar1Nesne).isNesneDonusum()){
                        bilgisayar1ToplamDayaniklilik += Bilgisayar1UstaMakasSecimBelirle(bilgisayar1Nesne).getDayaniklilik();
                    }
                    else
                        bilgisayar1ToplamDayaniklilik += Bilgisayar1MakasSecimBelirle(bilgisayar1Nesne).getDayaniklilik();
                }

            }

            for(int i = 0; i <= bilgisayar2.getBilgisayarHamleListesi().size() - 1; i++){
                bilgisayar2Nesne = bilgisayar2.getBilgisayarHamleListesi().get(i);

                if(bilgisayar2Nesne >0 && bilgisayar2Nesne <6){//tas demektir
                    if(Bilgisayar2TasSecimBelirle(bilgisayar2Nesne).isNesneDonusum()){
                        bilgisayar2ToplamDayaniklilik += Bilgisayar2AgirTasSecimBelirle(bilgisayar2Nesne).getDayaniklilik();
                    }
                    else
                        bilgisayar2ToplamDayaniklilik += Bilgisayar2TasSecimBelirle(bilgisayar2Nesne).getDayaniklilik();
                }
                else if(bilgisayar2Nesne > 5 && bilgisayar2Nesne < 11){//kagit demektir
                    if(Bilgisayar2KagitSecimBelirle(bilgisayar2Nesne).isNesneDonusum()){
                        bilgisayar2ToplamDayaniklilik += Bilgisayar2OzelKagitSecimBelirle(bilgisayar2Nesne).getDayaniklilik();
                    }
                    else
                        bilgisayar2ToplamDayaniklilik += Bilgisayar2KagitSecimBelirle(bilgisayar2Nesne).getDayaniklilik();
                }
                else {//makas demektir
                    if(Bilgisayar2MakasSecimBelirle(bilgisayar2Nesne).isNesneDonusum()){
                        bilgisayar2ToplamDayaniklilik += Bilgisayar2UstaMakasSecimBelirle(bilgisayar2Nesne).getDayaniklilik();
                    }
                    else
                        bilgisayar2ToplamDayaniklilik += Bilgisayar2MakasSecimBelirle(bilgisayar2Nesne).getDayaniklilik();
                }
            }

            if(bilgisayar1ToplamDayaniklilik > bilgisayar2ToplamDayaniklilik){
                JOptionPane.showMessageDialog(null, "Bilgisayar 1 Kazandi" + "\nBilgisayar 1 Dayaniklilik: " + bilgisayar1ToplamDayaniklilik + "\nBilgisayar 2 Dayaniklilik: " + bilgisayar2ToplamDayaniklilik);
            }
            else if(bilgisayar2ToplamDayaniklilik > bilgisayar1ToplamDayaniklilik){
                JOptionPane.showMessageDialog(null, "Bilgisayar 2 Kazandi" + "\nBilgisayar 2 Dayaniklilik: " + bilgisayar2ToplamDayaniklilik + "\nBilgisayar 1 Dayaniklilik: " + bilgisayar1ToplamDayaniklilik);
            }
            else{
                JOptionPane.showMessageDialog(null, "Berabere" + "\n Bilgisayar 1 Dayaniklilik: " + bilgisayar1ToplamDayaniklilik + "\nBilgisayar 2 Dayaniklilik: " + bilgisayar2ToplamDayaniklilik);
            }
            JOptionPane.showMessageDialog(null, "Menüye Dönülüyor");
            Buton b1 = new Buton();
            frame.dispose();
            b1.BaslangicEkranCiz();
        }
    }

    public void BilgisayarSecimBul(int kullaniciSirasi){
        Random r1 = new Random();
        int birOncekiSecim = 0;
        if (kullaniciSirasi == 1) {
            bilgisayar1Secim = bilgisayar1.getBilgisayarHamleListesi().get(r1.nextInt(bilgisayar1.getBilgisayarHamleListesi().size()));
            while(bilgisayar1Secim == birOncekiSecim){
                bilgisayar1Secim = bilgisayar1.getBilgisayarHamleListesi().get(r1.nextInt(bilgisayar1.getBilgisayarHamleListesi().size()));
                if(bilgisayar1Secim != birOncekiSecim){
                    birOncekiSecim =bilgisayar1Secim;
                    break;
                }
            }
            if(birOncekiSecim != bilgisayar1Secim) {
                birOncekiSecim = bilgisayar1Secim;
            }
            switch (bilgisayar1Secim) {
                case 1, 2, 3, 4, 5 -> bilgisayar1.setSecilenHamle("Tas");
                case 6, 7, 8, 9, 10 -> bilgisayar1.setSecilenHamle("Kagit");
                case 11, 12, 13, 14, 15 -> bilgisayar1.setSecilenHamle("Makas");
                default -> {
                }
            }
        }
        else {
            bilgisayar2Secim = bilgisayar2.getBilgisayarHamleListesi().get(r1.nextInt(bilgisayar2.getBilgisayarHamleListesi().size()));
            while(bilgisayar2Secim == birOncekiSecim){
                bilgisayar2Secim = bilgisayar1.getBilgisayarHamleListesi().get(r1.nextInt(bilgisayar1.getBilgisayarHamleListesi().size()));
                if(bilgisayar2Secim != birOncekiSecim){
                    birOncekiSecim =bilgisayar2Secim;
                    break;
                }
            }
            if(birOncekiSecim != birOncekiSecim) {
                birOncekiSecim = bilgisayar1Secim;
            }
            switch (bilgisayar2Secim) {
                case 1, 2, 3, 4, 5 -> bilgisayar2.setSecilenHamle("Tas");
                case 6, 7, 8, 9, 10 -> bilgisayar2.setSecilenHamle("Kagit");
                case 11, 12, 13, 14, 15 -> bilgisayar2.setSecilenHamle("Makas");
                default -> {
                }
            }
        }
    }

    public void BilgisayarSecimKarsilikBelirleVeHesapYap(Bilgisayar bilgisayarIlk , Bilgisayar bilgisayarIkinci){

        ServisHesaplaBilgisayar servisHesaplaBilgisayar =  new ServisHesaplaBilgisayar();
        hamleSayisi++;
        if(bilgisayarIlk.getSecilenHamle().equals("Tas")){
            if(bilgisayarIkinci.getSecilenHamle().equals("Tas")){//tas-tas
                if(Bilgisayar1TasSecimBelirle(bilgisayar1Secim).isNesneDonusum() && !Bilgisayar2TasSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar1OzelHamleHesapla(Bilgisayar1AgirTasSecimBelirle(bilgisayar1Secim),null,null,bilgisayar1,Bilgisayar2TasSecimBelirle(bilgisayar2Secim),null,null,bilgisayar2);
                }
                else if (!Bilgisayar1TasSecimBelirle(bilgisayar1Secim).isNesneDonusum() && Bilgisayar2TasSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar2OzelHamleHesapla(Bilgisayar1TasSecimBelirle(bilgisayar1Secim),null,null,bilgisayar1,Bilgisayar2AgirTasSecimBelirle(bilgisayar2Secim),null,null,bilgisayar2);
                }
                else if(Bilgisayar1TasSecimBelirle(bilgisayar1Secim).isNesneDonusum() && Bilgisayar2TasSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.BilgisayarOzelTasKagitMakasHesapla(Bilgisayar1AgirTasSecimBelirle(bilgisayar1Secim),null,null,bilgisayar1,Bilgisayar2AgirTasSecimBelirle(bilgisayar2Secim),null,null,bilgisayar2);
                }
                else
                    servisHesaplaBilgisayar.BilgisayarHesapla(Bilgisayar1TasSecimBelirle(bilgisayar1Secim) , null, null,bilgisayar1,Bilgisayar2TasSecimBelirle(bilgisayar2Secim),null,null,bilgisayar2);

                try {
                    dosyayaYazBilgisayarTasTas(hamleSayisi,bilgisayar1Secim,bilgisayar2Secim);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else if(bilgisayarIkinci.getSecilenHamle().equals("Kagit")){//tas-kagit
                if(Bilgisayar1TasSecimBelirle(bilgisayar1Secim).isNesneDonusum() && !Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar1OzelHamleHesapla(Bilgisayar1AgirTasSecimBelirle(bilgisayar1Secim),null,null,bilgisayar1,null,Bilgisayar2KagitSecimBelirle(bilgisayar2Secim),null,bilgisayar2);
                }
                else if (Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).isNesneDonusum() && !Bilgisayar1TasSecimBelirle(bilgisayar1Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar2OzelHamleHesapla(Bilgisayar1TasSecimBelirle(bilgisayar1Secim),null,null,bilgisayar1,null,Bilgisayar2OzelKagitSecimBelirle(bilgisayar2Secim),null,bilgisayar2);
                }
                else if(Bilgisayar1TasSecimBelirle(bilgisayar1Secim).isNesneDonusum() && Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.BilgisayarOzelTasKagitMakasHesapla(Bilgisayar1AgirTasSecimBelirle(bilgisayar1Secim),null,null,bilgisayar1,null,Bilgisayar2OzelKagitSecimBelirle(bilgisayar2Secim),null,bilgisayar2);
                }
                else
                    servisHesaplaBilgisayar.BilgisayarHesapla(Bilgisayar1TasSecimBelirle(bilgisayar1Secim) , null, null,bilgisayar1,null,Bilgisayar2KagitSecimBelirle(bilgisayar2Secim),null,bilgisayar2);

                try {
                    dosyayaYazBilgisayarTasKagit(hamleSayisi,bilgisayar1Secim,bilgisayar2Secim);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else{//tas-makas
                if(Bilgisayar1TasSecimBelirle(bilgisayar1Secim).isNesneDonusum() && !Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar1OzelHamleHesapla(Bilgisayar1AgirTasSecimBelirle(bilgisayar1Secim),null,null,bilgisayar1,null,null,Bilgisayar2MakasSecimBelirle(bilgisayar2Secim),bilgisayar2);
                }
                else if (Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).isNesneDonusum() && !Bilgisayar1TasSecimBelirle(bilgisayar1Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar2OzelHamleHesapla(Bilgisayar1TasSecimBelirle(bilgisayar1Secim),null,null,bilgisayar1,null,null,Bilgisayar2UstaMakasSecimBelirle(bilgisayar2Secim),bilgisayar2);
                }
                else if(Bilgisayar1TasSecimBelirle(bilgisayar1Secim).isNesneDonusum() && Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.BilgisayarOzelTasKagitMakasHesapla(Bilgisayar1AgirTasSecimBelirle(bilgisayar1Secim),null,null,bilgisayar1,null,null,Bilgisayar2UstaMakasSecimBelirle(bilgisayar2Secim),bilgisayar2);
                }
                else
                    servisHesaplaBilgisayar.BilgisayarHesapla(Bilgisayar1TasSecimBelirle(bilgisayar1Secim) , null, null,bilgisayar1,null,null,Bilgisayar2MakasSecimBelirle(bilgisayar2Secim),bilgisayar2);

                try {
                    dosyayaYazBilgisayarTasMakas(hamleSayisi,bilgisayar1Secim,bilgisayar2Secim);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        else if (bilgisayarIlk.getSecilenHamle().equals("Kagit")){
            if(bilgisayarIkinci.getSecilenHamle().equals("Tas")){//kagit-tas
                if(Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).isNesneDonusum() && !Bilgisayar2TasSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar1OzelHamleHesapla(null,Bilgisayar1OzelKagitSecimBelirle(bilgisayar1Secim),null,bilgisayar1,Bilgisayar2TasSecimBelirle(bilgisayar2Secim),null,null,bilgisayar2);
                }
                else if(Bilgisayar2TasSecimBelirle(bilgisayar2Secim).isNesneDonusum() && !Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar2OzelHamleHesapla(null,Bilgisayar1KagitSecimBelirle(bilgisayar1Secim),null,bilgisayar1,Bilgisayar2AgirTasSecimBelirle(bilgisayar2Secim),null,null,bilgisayar2);
                }
                else if(Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).isNesneDonusum() && Bilgisayar2TasSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.BilgisayarOzelTasKagitMakasHesapla(null,Bilgisayar1OzelKagitSecimBelirle(bilgisayar1Secim),null,bilgisayar1,Bilgisayar2AgirTasSecimBelirle(bilgisayar2Secim),null,null,bilgisayar2);
                }
                else
                    servisHesaplaBilgisayar.BilgisayarHesapla(null , Bilgisayar1KagitSecimBelirle(bilgisayar1Secim), null,bilgisayar1,Bilgisayar2TasSecimBelirle(bilgisayar2Secim),null,null,bilgisayar2);

                try {
                    dosyayaYazBilgisayarTasKagit(hamleSayisi,bilgisayar2Secim,bilgisayar1Secim);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else if(bilgisayarIkinci.getSecilenHamle().equals("Kagit")){//kagit-kagit
                if(Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).isNesneDonusum() && !Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar1OzelHamleHesapla(null,Bilgisayar1OzelKagitSecimBelirle(bilgisayar1Secim),null,bilgisayar1,null,Bilgisayar2KagitSecimBelirle(bilgisayar2Secim),null,bilgisayar2);
                }
                else if(Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).isNesneDonusum() && !Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar2OzelHamleHesapla(null,Bilgisayar1KagitSecimBelirle(bilgisayar1Secim),null,bilgisayar1,null,Bilgisayar2OzelKagitSecimBelirle(bilgisayar2Secim),null,bilgisayar2);
                }
                else if(Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).isNesneDonusum() && Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.BilgisayarOzelTasKagitMakasHesapla(null,Bilgisayar1OzelKagitSecimBelirle(bilgisayar1Secim),null,bilgisayar1,null,Bilgisayar2OzelKagitSecimBelirle(bilgisayar2Secim),null,bilgisayar2);
                }
                else
                    servisHesaplaBilgisayar.BilgisayarHesapla(null, Bilgisayar1KagitSecimBelirle(bilgisayar1Secim), null,bilgisayar1,null,Bilgisayar2KagitSecimBelirle(bilgisayar2Secim),null,bilgisayar2);

                try {
                    dosyayaYazBilgisayarKagitKagit(hamleSayisi,bilgisayar1Secim,bilgisayar2Secim);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else{//kagit-makas
                if(Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).isNesneDonusum() && !Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar1OzelHamleHesapla(null,Bilgisayar1OzelKagitSecimBelirle(bilgisayar1Secim),null,bilgisayar1,null,null,Bilgisayar2MakasSecimBelirle(bilgisayar2Secim),bilgisayar2);
                }
                else if(Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).isNesneDonusum() && !Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar2OzelHamleHesapla(null,Bilgisayar1KagitSecimBelirle(bilgisayar1Secim),null,bilgisayar1,null,null,Bilgisayar2UstaMakasSecimBelirle(bilgisayar2Secim),bilgisayar2);
                }
                else if(Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).isNesneDonusum() && Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.BilgisayarOzelTasKagitMakasHesapla(null,Bilgisayar1OzelKagitSecimBelirle(bilgisayar1Secim),null,bilgisayar1,null,null,Bilgisayar2UstaMakasSecimBelirle(bilgisayar2Secim),bilgisayar2);
                }
                else
                    servisHesaplaBilgisayar.BilgisayarHesapla(null, Bilgisayar1KagitSecimBelirle(bilgisayar1Secim), null,bilgisayar1,null,null,Bilgisayar2MakasSecimBelirle(bilgisayar2Secim),bilgisayar2);

                try {
                    dosyayaYazBilgisayarKagitMakas(hamleSayisi,bilgisayar1Secim,bilgisayar2Secim);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        else{

            if(bilgisayarIkinci.getSecilenHamle().equals("Tas")){//makas-tas

                if(Bilgisayar1MakasSecimBelirle(bilgisayar1Secim).isNesneDonusum() && !Bilgisayar2TasSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    //makas setleme operasyonunu cağırman lazım
                    servisHesaplaBilgisayar.Bilgisayar1OzelHamleHesapla(null,null,Bilgisayar1UstaMakasSecimBelirle(bilgisayar1Secim),bilgisayar1,Bilgisayar2TasSecimBelirle(bilgisayar2Secim),null,null,bilgisayar1);
                }
                else if(Bilgisayar2TasSecimBelirle(bilgisayar2Secim).isNesneDonusum() && !Bilgisayar1MakasSecimBelirle(bilgisayar1Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar2OzelHamleHesapla(null,null,Bilgisayar1MakasSecimBelirle(bilgisayar1Secim),bilgisayar1,Bilgisayar2AgirTasSecimBelirle(bilgisayar2Secim),null,null,bilgisayar1);
                }
                else if(Bilgisayar1MakasSecimBelirle(bilgisayar1Secim).isNesneDonusum() && Bilgisayar2TasSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.BilgisayarOzelTasKagitMakasHesapla(null,null,Bilgisayar1UstaMakasSecimBelirle(bilgisayar1Secim),bilgisayar1,Bilgisayar2AgirTasSecimBelirle(bilgisayar2Secim),null,null,bilgisayar2);
                }
                else
                    servisHesaplaBilgisayar.BilgisayarHesapla(null, null, Bilgisayar1MakasSecimBelirle(bilgisayar1Secim),bilgisayar1,Bilgisayar2TasSecimBelirle(bilgisayar2Secim),null,null,bilgisayar2);

                try {
                    dosyayaYazBilgisayarTasMakas(hamleSayisi,bilgisayar2Secim,bilgisayar1Secim);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else if(bilgisayarIkinci.getSecilenHamle().equals("Kagit")){//makas-kagit
                if(Bilgisayar1MakasSecimBelirle(bilgisayar1Secim).isNesneDonusum() && !Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar1OzelHamleHesapla(null,null,Bilgisayar1UstaMakasSecimBelirle(bilgisayar1Secim),bilgisayar1,null,Bilgisayar2KagitSecimBelirle(bilgisayar2Secim),null,bilgisayar1);
                }
                else if(Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).isNesneDonusum() && !Bilgisayar1MakasSecimBelirle(bilgisayar1Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar2OzelHamleHesapla(null,null,Bilgisayar1MakasSecimBelirle(bilgisayar1Secim),bilgisayar1,null,Bilgisayar2OzelKagitSecimBelirle(bilgisayar2Secim),null,bilgisayar1);
                }
                else if(Bilgisayar1MakasSecimBelirle(bilgisayar1Secim).isNesneDonusum() && Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.BilgisayarOzelTasKagitMakasHesapla(null,null,Bilgisayar1UstaMakasSecimBelirle(bilgisayar1Secim),bilgisayar1,null,Bilgisayar2OzelKagitSecimBelirle(bilgisayar2Secim),null,bilgisayar2);
                }
                else
                    servisHesaplaBilgisayar.BilgisayarHesapla(null, null, Bilgisayar1MakasSecimBelirle(bilgisayar1Secim),bilgisayar1,null,Bilgisayar2KagitSecimBelirle(bilgisayar2Secim),null,bilgisayar2);

                try {
                    dosyayaYazBilgisayarKagitMakas(hamleSayisi,bilgisayar2Secim,bilgisayar1Secim);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else{//makas-makas
                if(Bilgisayar1MakasSecimBelirle(bilgisayar1Secim).isNesneDonusum() && !Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar1OzelHamleHesapla(null,null,Bilgisayar1UstaMakasSecimBelirle(bilgisayar1Secim),bilgisayar1,null,null,Bilgisayar2MakasSecimBelirle(bilgisayar2Secim),bilgisayar1);
                }
                else if(Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).isNesneDonusum() && !Bilgisayar1MakasSecimBelirle(bilgisayar1Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.Bilgisayar2OzelHamleHesapla(null,null,Bilgisayar1MakasSecimBelirle(bilgisayar1Secim),bilgisayar1,null,null,Bilgisayar2UstaMakasSecimBelirle(bilgisayar2Secim),bilgisayar1);
                }
                else if(Bilgisayar1MakasSecimBelirle(bilgisayar1Secim).isNesneDonusum() && Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).isNesneDonusum()){
                    servisHesaplaBilgisayar.BilgisayarOzelTasKagitMakasHesapla(null,null,Bilgisayar1UstaMakasSecimBelirle(bilgisayar1Secim),bilgisayar1,null,null,Bilgisayar2UstaMakasSecimBelirle(bilgisayar2Secim),bilgisayar2);
                }
                else
                    servisHesaplaBilgisayar.BilgisayarHesapla(null, null, Bilgisayar1MakasSecimBelirle(bilgisayar1Secim),bilgisayar1,null,null,Bilgisayar2MakasSecimBelirle(bilgisayar2Secim),bilgisayar2);

                try {
                    dosyayaYazBilgisayarMakasMakas(hamleSayisi,bilgisayar1Secim,bilgisayar2Secim);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    //endregion

    //region Private Operasyonlar
    private Tas Bilgisayar1TasSecimBelirle(int secim){
        Tas bilgisayarTas = new Tas();

        //tasBilgisayar11.setNesneDonusum(true);
        //  tasBilgisayar12.setNesneDonusum(true);
        // tasBilgisayar13.setNesneDonusum(true);
        //tasBilgisayar14.setNesneDonusum(true);
        //tasBilgisayar15.setNesneDonusum(true);

        switch (secim) {
            case 1:
                bilgisayarTas = tasBilgisayar11;
                bilgisayar1.setNesneNumber(1);

                break;
            case 2:
                bilgisayarTas = tasBilgisayar12;
                bilgisayar1.setNesneNumber(2);

                break;
            case 3:
                bilgisayarTas = tasBilgisayar13;
                bilgisayar1.setNesneNumber(3);

                break;
            case 4:
                bilgisayarTas = tasBilgisayar14;
                bilgisayar1.setNesneNumber(4);

                break;
            case 5:
                bilgisayarTas = tasBilgisayar15;
                bilgisayar1.setNesneNumber(5);
                break;
            default: {
            }
        }

        return bilgisayarTas;
    }

    private Tas Bilgisayar2TasSecimBelirle(int secim){
        Tas bilgisayarTas = new Tas();
        switch (secim) {
            case 1:
                bilgisayarTas = tasBilgisayar21;
                bilgisayar2.setNesneNumber(1);
                break;
            case 2:
                bilgisayarTas = tasBilgisayar22;
                bilgisayar2.setNesneNumber(2);
                break;
            case 3:
                bilgisayarTas = tasBilgisayar23;
                bilgisayar2.setNesneNumber(3);
                break;
            case 4:
                bilgisayarTas = tasBilgisayar24;
                bilgisayar2.setNesneNumber(4);
                break;
            case 5:
                bilgisayarTas = tasBilgisayar25;
                bilgisayar2.setNesneNumber(5);
                break;
            default: {
            }
        }

        return bilgisayarTas;
    }

    private Kagit Bilgisayar1KagitSecimBelirle(int secim){
        Kagit bilgisayarKagit = new Kagit();
        switch (secim) {
            case 6:
                bilgisayarKagit = kagitBilgisayar11;
                bilgisayar1.setNesneNumber(6);
                break;
            case 7:
                bilgisayarKagit = kagitBilgisayar12;
                bilgisayar1.setNesneNumber(7);
                break;
            case 8:
                bilgisayarKagit = kagitBilgisayar13;
                bilgisayar1.setNesneNumber(8);
                break;
            case 9:
                bilgisayarKagit = kagitBilgisayar14;
                bilgisayar1.setNesneNumber(9);
                break;
            case 10:
                bilgisayarKagit = kagitBilgisayar15;
                bilgisayar1.setNesneNumber(10);
                break;
            default: {
            }
        }

        return bilgisayarKagit;
    }

    private Kagit Bilgisayar2KagitSecimBelirle(int secim){
        Kagit bilgisayarKagit = new Kagit();
        switch (secim) {
            case 6:
                bilgisayarKagit = kagitBilgisayar21;
                bilgisayar2.setNesneNumber(6);
                break;
            case 7:
                bilgisayarKagit = kagitBilgisayar22;
                bilgisayar2.setNesneNumber(7);
                break;
            case 8:
                bilgisayarKagit = kagitBilgisayar23;
                bilgisayar2.setNesneNumber(8);
                break;
            case 9:
                bilgisayarKagit = kagitBilgisayar24;
                bilgisayar2.setNesneNumber(9);
                break;
            case 10:
                bilgisayarKagit = kagitBilgisayar25;
                bilgisayar2.setNesneNumber(10);
                break;
            default: {
            }
        }
        return bilgisayarKagit;
    }

    private Makas Bilgisayar1MakasSecimBelirle(int secim){
        Makas bilgisayarMakas = new Makas();
        switch (secim) {
            case 11:
                bilgisayarMakas = makasBilgisayar11;
                bilgisayar1.setNesneNumber(11);
                break;
            case 12:
                bilgisayarMakas = makasBilgisayar12;
                bilgisayar1.setNesneNumber(12);
                break;
            case 13:
                bilgisayarMakas = makasBilgisayar13;
                bilgisayar1.setNesneNumber(13);
                break;
            case 14:
                bilgisayarMakas = makasBilgisayar14;
                bilgisayar1.setNesneNumber(14);
                break;
            case 15:
                bilgisayarMakas = makasBilgisayar15;
                bilgisayar1.setNesneNumber(15);
                break;
            default: {
            }
        }

        return bilgisayarMakas;
    }

    private Makas Bilgisayar2MakasSecimBelirle(int secim){
        Makas bilgisayarMakas = new Makas();
        switch (secim) {
            case 11:
                bilgisayarMakas = makasBilgisayar21;
                bilgisayar2.setNesneNumber(11);
                break;
            case 12:
                bilgisayarMakas = makasBilgisayar22;
                bilgisayar2.setNesneNumber(12);
                break;
            case 13:
                bilgisayarMakas = makasBilgisayar23;
                bilgisayar2.setNesneNumber(13);
                break;
            case 14:
                bilgisayarMakas = makasBilgisayar24;
                bilgisayar2.setNesneNumber(14);
                break;
            case 15:
                bilgisayarMakas = makasBilgisayar25;
                bilgisayar2.setNesneNumber(15);
                break;
            default: {
            }
        }

        return bilgisayarMakas;
    }

    private Agir_Tas Bilgisayar1AgirTasSecimBelirle(int secim){

        Agir_Tas bilgisayarAgirTas = new Agir_Tas();
        switch (secim) {
            case 1:
                if(!tasBilgisayar11.isNesneDonusumuGerceklestiMi()) {
                    tasBilgisayar11.setNesneDonusumuGerceklestiMi(true);
                    agirTasBilgisayar11 = nesneDonusumAgirTas(tasBilgisayar11);
                }
                bilgisayarAgirTas = agirTasBilgisayar11;
                bilgisayar1.setNesneNumber(1);
                break;
            case 2:
                if(!tasBilgisayar12.isNesneDonusumuGerceklestiMi()) {
                    tasBilgisayar12.setNesneDonusumuGerceklestiMi(true);
                    agirTasBilgisayar12 = nesneDonusumAgirTas(tasBilgisayar12);
                }
                bilgisayarAgirTas = agirTasBilgisayar12;
                bilgisayar1.setNesneNumber(2);
                break;
            case 3:
                if(!tasBilgisayar13.isNesneDonusumuGerceklestiMi()) {
                    tasBilgisayar13.setNesneDonusumuGerceklestiMi(true);
                    agirTasBilgisayar13 = nesneDonusumAgirTas(tasBilgisayar13);
                }
                bilgisayarAgirTas = agirTasBilgisayar13;
                bilgisayar1.setNesneNumber(3);
                break;
            case 4:
                if(!tasBilgisayar14.isNesneDonusumuGerceklestiMi()) {
                    tasBilgisayar14.setNesneDonusumuGerceklestiMi(true);
                    agirTasBilgisayar14 = nesneDonusumAgirTas(tasBilgisayar14);
                }
                bilgisayarAgirTas = agirTasBilgisayar14;
                bilgisayar1.setNesneNumber(4);
                break;
            case 5:
                if(!tasBilgisayar15.isNesneDonusumuGerceklestiMi()) {
                    tasBilgisayar15.setNesneDonusumuGerceklestiMi(true);
                    agirTasBilgisayar15 = nesneDonusumAgirTas(tasBilgisayar15);
                }
                bilgisayarAgirTas = agirTasBilgisayar15;
                bilgisayar1.setNesneNumber(5);
                break;
            default: {
            }
        }
        return bilgisayarAgirTas;
    }

    private Agir_Tas Bilgisayar2AgirTasSecimBelirle(int secim){

        Agir_Tas bilgisayarAgirTas = new Agir_Tas();
        switch (secim) {
            case 1:
                if(!tasBilgisayar21.isNesneDonusumuGerceklestiMi()) {
                    tasBilgisayar21.setNesneDonusumuGerceklestiMi(true);
                    agirTasBilgisayar21 = nesneDonusumAgirTas(tasBilgisayar21);
                }
                bilgisayarAgirTas = agirTasBilgisayar21;
                bilgisayar2.setNesneNumber(1);
                break;
            case 2:
                if(!tasBilgisayar22.isNesneDonusumuGerceklestiMi()) {
                    tasBilgisayar22.setNesneDonusumuGerceklestiMi(true);
                    agirTasBilgisayar22 = nesneDonusumAgirTas(tasBilgisayar22);
                }
                bilgisayarAgirTas = agirTasBilgisayar22;
                bilgisayar2.setNesneNumber(2);
                break;
            case 3:
                if(!tasBilgisayar23.isNesneDonusumuGerceklestiMi()) {
                    tasBilgisayar23.setNesneDonusumuGerceklestiMi(true);
                    agirTasBilgisayar23 = nesneDonusumAgirTas(tasBilgisayar23);
                }
                bilgisayarAgirTas = agirTasBilgisayar23;
                bilgisayar2.setNesneNumber(3);
                break;
            case 4:
                if(!tasBilgisayar24.isNesneDonusumuGerceklestiMi()) {
                    tasBilgisayar24.setNesneDonusumuGerceklestiMi(true);
                    agirTasBilgisayar24 = nesneDonusumAgirTas(tasBilgisayar24);
                }
                bilgisayarAgirTas = agirTasBilgisayar24;
                bilgisayar2.setNesneNumber(4);
                break;
            case 5:
                if(!tasBilgisayar25.isNesneDonusumuGerceklestiMi()) {
                    tasBilgisayar25.setNesneDonusumuGerceklestiMi(true);
                    agirTasBilgisayar25 = nesneDonusumAgirTas(tasBilgisayar25);
                }
                bilgisayarAgirTas = agirTasBilgisayar25;
                bilgisayar2.setNesneNumber(5);
                break;
            default: {
            }
        }
        return bilgisayarAgirTas;
    }

    private Ozel_Kagit Bilgisayar1OzelKagitSecimBelirle(int secim){

        Ozel_Kagit bilgisayarOzelKagit = new Ozel_Kagit();
        switch (secim) {
            case 6:
                if(!kagitBilgisayar11.isNesneDonusumuGerceklestiMi()) {
                    kagitBilgisayar11.setNesneDonusumuGerceklestiMi(true);
                    ozelKagitBilgisayar11 = nesneDonusumOzelKagit(kagitBilgisayar11);
                }
                bilgisayarOzelKagit = ozelKagitBilgisayar11;
                bilgisayar1.setNesneNumber(6);
                break;
            case 7:
                if(!kagitBilgisayar12.isNesneDonusumuGerceklestiMi()) {
                    kagitBilgisayar12.setNesneDonusumuGerceklestiMi(true);
                    ozelKagitBilgisayar12 = nesneDonusumOzelKagit(kagitBilgisayar12);
                }
                bilgisayarOzelKagit = ozelKagitBilgisayar12;
                bilgisayar1.setNesneNumber(7);
                break;
            case 8:
                if(!kagitBilgisayar13.isNesneDonusumuGerceklestiMi()) {
                    kagitBilgisayar13.setNesneDonusumuGerceklestiMi(true);
                    ozelKagitBilgisayar13 = nesneDonusumOzelKagit(kagitBilgisayar13);
                }
                bilgisayarOzelKagit = ozelKagitBilgisayar13;
                bilgisayar1.setNesneNumber(8);
                break;
            case 9:
                if(!kagitBilgisayar14.isNesneDonusumuGerceklestiMi()) {
                    kagitBilgisayar14.setNesneDonusumuGerceklestiMi(true);
                    ozelKagitBilgisayar14 = nesneDonusumOzelKagit(kagitBilgisayar14);
                }
                bilgisayarOzelKagit = ozelKagitBilgisayar14;
                bilgisayar1.setNesneNumber(9);
                break;
            case 10:
                if(!kagitBilgisayar15.isNesneDonusumuGerceklestiMi()) {
                    kagitBilgisayar15.setNesneDonusumuGerceklestiMi(true);
                    ozelKagitBilgisayar15 = nesneDonusumOzelKagit(kagitBilgisayar15);
                }
                bilgisayarOzelKagit = ozelKagitBilgisayar15;
                bilgisayar1.setNesneNumber(10);
                break;
            default: {
            }
        }
        return bilgisayarOzelKagit;
    }

    private Ozel_Kagit Bilgisayar2OzelKagitSecimBelirle(int secim){

        Ozel_Kagit bilgisayarOzelKagit = new Ozel_Kagit();
        switch (secim) {
            case 6:
                if(!kagitBilgisayar21.isNesneDonusumuGerceklestiMi()) {
                    kagitBilgisayar21.setNesneDonusumuGerceklestiMi(true);
                    ozelKagitBilgisayar21= nesneDonusumOzelKagit(kagitBilgisayar21);
                }
                bilgisayarOzelKagit = ozelKagitBilgisayar21;
                bilgisayar2.setNesneNumber(6);
                break;
            case 7:
                if(!kagitBilgisayar22.isNesneDonusumuGerceklestiMi()) {
                    kagitBilgisayar22.setNesneDonusumuGerceklestiMi(true);
                    ozelKagitBilgisayar22 = nesneDonusumOzelKagit(kagitBilgisayar22);
                }
                bilgisayarOzelKagit = ozelKagitBilgisayar22;
                bilgisayar2.setNesneNumber(7);
                break;
            case 8:
                if(!kagitBilgisayar23.isNesneDonusumuGerceklestiMi()) {
                    kagitBilgisayar23.setNesneDonusumuGerceklestiMi(true);
                    ozelKagitBilgisayar23 = nesneDonusumOzelKagit(kagitBilgisayar23);
                }
                bilgisayarOzelKagit = ozelKagitBilgisayar23;
                bilgisayar2.setNesneNumber(8);
                break;
            case 9:
                if(!kagitBilgisayar24.isNesneDonusumuGerceklestiMi()) {
                    kagitBilgisayar24.setNesneDonusumuGerceklestiMi(true);
                    ozelKagitBilgisayar24 = nesneDonusumOzelKagit(kagitBilgisayar24);
                }
                bilgisayarOzelKagit = ozelKagitBilgisayar24;
                bilgisayar2.setNesneNumber(9);
                break;
            case 10:
                if(!kagitBilgisayar25.isNesneDonusumuGerceklestiMi()) {
                    kagitBilgisayar25.setNesneDonusumuGerceklestiMi(true);
                    ozelKagitBilgisayar25 = nesneDonusumOzelKagit(kagitBilgisayar25);
                }
                bilgisayarOzelKagit = ozelKagitBilgisayar25;
                bilgisayar2.setNesneNumber(10);
                break;
            default: {
            }
        }
        return bilgisayarOzelKagit;
    }

    private Usta_Makas Bilgisayar1UstaMakasSecimBelirle(int secim){

        Usta_Makas bilgisayarUstaMakas= new Usta_Makas();
        switch (secim) {
            case 11:
                if(!makasBilgisayar11.isNesneDonusumuGerceklestiMi()) {
                    makasBilgisayar11.setNesneDonusumuGerceklestiMi(true);
                    ustaMakasBilgisayar11 = nesneDonusumUstaMakas(makasBilgisayar11);
                }
                bilgisayarUstaMakas = ustaMakasBilgisayar11;
                bilgisayar1.setNesneNumber(11);
                break;
            case 12:
                if(!makasBilgisayar12.isNesneDonusumuGerceklestiMi()) {
                    makasBilgisayar12.setNesneDonusumuGerceklestiMi(true);
                    ustaMakasBilgisayar12 = nesneDonusumUstaMakas(makasBilgisayar12);
                }
                bilgisayarUstaMakas = ustaMakasBilgisayar12;
                bilgisayar1.setNesneNumber(12);
                break;
            case 13:
                if(!makasBilgisayar13.isNesneDonusumuGerceklestiMi()) {
                    makasBilgisayar13.setNesneDonusumuGerceklestiMi(true);
                    ustaMakasBilgisayar13 = nesneDonusumUstaMakas(makasBilgisayar13);
                }
                bilgisayarUstaMakas = ustaMakasBilgisayar13;
                bilgisayar1.setNesneNumber(13);
                break;
            case 14:
                if(!makasBilgisayar14.isNesneDonusumuGerceklestiMi()) {
                    makasBilgisayar14.setNesneDonusumuGerceklestiMi(true);
                    ustaMakasBilgisayar14 = nesneDonusumUstaMakas(makasBilgisayar14);
                }
                bilgisayarUstaMakas = ustaMakasBilgisayar14;
                bilgisayar1.setNesneNumber(14);
                break;
            case 15:
                if(!makasBilgisayar15.isNesneDonusumuGerceklestiMi()) {
                    makasBilgisayar15.setNesneDonusumuGerceklestiMi(true);
                    ustaMakasBilgisayar15 = nesneDonusumUstaMakas(makasBilgisayar15);
                }
                bilgisayarUstaMakas = ustaMakasBilgisayar15;
                bilgisayar1.setNesneNumber(15);
                break;
            default: {
            }
        }
        return bilgisayarUstaMakas;
    }

    private Usta_Makas Bilgisayar2UstaMakasSecimBelirle(int secim){

        Usta_Makas bilgisayarUstaMakas= new Usta_Makas();
        switch (secim) {
            case 11:
                if(!makasBilgisayar21.isNesneDonusumuGerceklestiMi()) {
                    makasBilgisayar21.setNesneDonusumuGerceklestiMi(true);
                    ustaMakasBilgisayar21 = nesneDonusumUstaMakas(makasBilgisayar21);
                }
                bilgisayarUstaMakas = ustaMakasBilgisayar21;
                bilgisayar2.setNesneNumber(11);
                break;
            case 12:
                if(!makasBilgisayar22.isNesneDonusumuGerceklestiMi()) {
                    makasBilgisayar22.setNesneDonusumuGerceklestiMi(true);
                    ustaMakasBilgisayar22 = nesneDonusumUstaMakas(makasBilgisayar22);
                }
                bilgisayarUstaMakas = ustaMakasBilgisayar22;
                bilgisayar2.setNesneNumber(12);
                break;
            case 13:
                if(!makasBilgisayar23.isNesneDonusumuGerceklestiMi()) {
                    makasBilgisayar23.setNesneDonusumuGerceklestiMi(true);
                    ustaMakasBilgisayar23 = nesneDonusumUstaMakas(makasBilgisayar23);
                }
                bilgisayarUstaMakas = ustaMakasBilgisayar23;
                bilgisayar2.setNesneNumber(13);
                break;
            case 14:
                if(!makasBilgisayar24.isNesneDonusumuGerceklestiMi()) {
                    makasBilgisayar24.setNesneDonusumuGerceklestiMi(true);
                    ustaMakasBilgisayar24 = nesneDonusumUstaMakas(makasBilgisayar24);
                }
                bilgisayarUstaMakas = ustaMakasBilgisayar24;
                bilgisayar2.setNesneNumber(14);
                break;
            case 15:
                if(!makasBilgisayar25.isNesneDonusumuGerceklestiMi()) {
                    makasBilgisayar25.setNesneDonusumuGerceklestiMi(true);
                    ustaMakasBilgisayar25 = nesneDonusumUstaMakas(makasBilgisayar25);
                }
                bilgisayarUstaMakas = ustaMakasBilgisayar25;
                bilgisayar2.setNesneNumber(15);
                break;
            default: {
            }
        }
        return bilgisayarUstaMakas;
    }

    public Agir_Tas nesneDonusumAgirTas(Tas bilgisayarTas){
        Agir_Tas agir_tas = new Agir_Tas();

        agir_tas.setDayaniklilik(bilgisayarTas.getDayaniklilik());
        agir_tas.setSeviyePuani(bilgisayarTas.getSeviyePuani());
        agir_tas.setKatilik(bilgisayarTas.getKatilik());

        return agir_tas;
    }
    public Ozel_Kagit nesneDonusumOzelKagit(Kagit kagitKullanici){
        Ozel_Kagit ozel_kagit = new Ozel_Kagit();
        ozel_kagit.setDayaniklilik(kagitKullanici.getDayaniklilik());
        ozel_kagit.setSeviyePuani(kagitKullanici.getSeviyePuani());
        ozel_kagit.setNufuz(kagitKullanici.getNufuz());

        return ozel_kagit;
    }
    public Usta_Makas nesneDonusumUstaMakas(Makas makasKullanici){
        Usta_Makas usta_makas = new Usta_Makas();
        usta_makas.setDayaniklilik(makasKullanici.getDayaniklilik());
        usta_makas.setSeviyePuani(makasKullanici.getSeviyePuani());
        usta_makas.setKeskinlik(makasKullanici.getKeskinlik());

        return usta_makas;
    }

    public void dosyayaYazBilgisayarTasTas(int hamleSayisi, int bilgisayar1Secim, int bilgisayar2Secim) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        FileWriter f1 = new FileWriter(output,true);
        if(Bilgisayar1TasSecimBelirle(bilgisayar1Secim).isOyunaDevamEdebilirMi()){
            f1.write("Hamle: " + hamleSayisi + "\n");
            f1.write("Bilgisayar nesnesi: " + Bilgisayar1TasSecimBelirle(bilgisayar1Secim) + "\n");
            f1.write("Dayaniklilik: " + Bilgisayar1TasSecimBelirle(bilgisayar1Secim).getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + Bilgisayar1TasSecimBelirle(bilgisayar1Secim).getSeviyePuani() + "\n");
        }
        else
            f1.write(Bilgisayar1TasSecimBelirle(bilgisayar1Secim) + "nesnesi oyundan cıkartıldı");

        if(Bilgisayar2TasSecimBelirle(bilgisayar2Secim).isOyunaDevamEdebilirMi()){
            f1.write("Bilgisayar nesnesi: " + Bilgisayar2TasSecimBelirle(bilgisayar2Secim) + "\n");
            f1.write("Dayaniklilik: " + Bilgisayar2TasSecimBelirle(bilgisayar2Secim).getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + Bilgisayar2TasSecimBelirle(bilgisayar2Secim).getSeviyePuani() + "\n");
        }
        else
            f1.write(Bilgisayar2TasSecimBelirle(bilgisayar2Secim) + "nesnesi oyundan cıkartıldı");

        f1.write("\n");
        f1.close();
    }

    public void dosyayaYazBilgisayarTasKagit(int hamleSayisi, int bilgisayar1Secim, int bilgisayar2Secim) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        FileWriter f1 = new FileWriter(output,true);
        if(Bilgisayar1TasSecimBelirle(bilgisayar1Secim).isOyunaDevamEdebilirMi()){
            f1.write("Hamle: " + hamleSayisi + "\n");
            f1.write("Bilgisayar nesnesi: " + Bilgisayar1TasSecimBelirle(bilgisayar1Secim) + "\n");
            f1.write("Dayaniklilik: " + Bilgisayar1TasSecimBelirle(bilgisayar1Secim).getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + Bilgisayar1TasSecimBelirle(bilgisayar1Secim).getSeviyePuani() + "\n");
        }
        else
            f1.write(Bilgisayar1TasSecimBelirle(bilgisayar1Secim) + "nesnesi oyundan cıkartıldı");

        if(Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).isOyunaDevamEdebilirMi()){
            f1.write("Bilgisayar nesnesi: " + Bilgisayar2KagitSecimBelirle(bilgisayar2Secim) + "\n");
            f1.write("Dayaniklilik: " + Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).getSeviyePuani() + "\n");
        }
        else
            f1.write(Bilgisayar2KagitSecimBelirle(bilgisayar2Secim) + "nesnesi oyundan cıkartıldı");

        f1.write("\n");
        f1.close();
    }

    public void dosyayaYazBilgisayarTasMakas(int hamleSayisi, int bilgisayar1Secim, int bilgisayar2Secim) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        FileWriter f1 = new FileWriter(output,true);
        if(Bilgisayar1TasSecimBelirle(bilgisayar1Secim).isOyunaDevamEdebilirMi()){
            f1.write("Hamle: " + hamleSayisi + "\n");
            f1.write("Bilgisayar nesnesi: " + Bilgisayar1TasSecimBelirle(bilgisayar1Secim) + "\n");
            f1.write("Dayaniklilik: " + Bilgisayar1TasSecimBelirle(bilgisayar1Secim).getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + Bilgisayar1TasSecimBelirle(bilgisayar1Secim).getSeviyePuani() + "\n");
        }
        else
            f1.write(Bilgisayar1TasSecimBelirle(bilgisayar1Secim) + "nesnesi oyundan cıkartıldı");

        if(Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).isOyunaDevamEdebilirMi()){
            f1.write("Bilgisayar nesnesi: " + Bilgisayar2MakasSecimBelirle(bilgisayar2Secim) + "\n");
            f1.write("Dayaniklilik: " + Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).getSeviyePuani() + "\n");
        }
        else
            f1.write(Bilgisayar2MakasSecimBelirle(bilgisayar2Secim) + "nesnesi oyundan cıkartıldı");

        f1.write("\n");
        f1.close();
    }

    public void dosyayaYazBilgisayarKagitKagit(int hamleSayisi, int bilgisayar1Secim, int bilgisayar2Secim) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        FileWriter f1 = new FileWriter(output,true);
        if(Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).isOyunaDevamEdebilirMi()){
            f1.write("Hamle: " + hamleSayisi + "\n");
            f1.write("Bilgisayar nesnesi: " + Bilgisayar1KagitSecimBelirle(bilgisayar1Secim) + "\n");
            f1.write("Dayaniklilik: " + Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).getSeviyePuani() + "\n");
        }
        else
            f1.write(Bilgisayar1KagitSecimBelirle(bilgisayar1Secim) + "nesnesi oyundan cıkartıldı");

        if(Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).isOyunaDevamEdebilirMi()){
            f1.write("Bilgisayar nesnesi: " + Bilgisayar2KagitSecimBelirle(bilgisayar2Secim) + "\n");
            f1.write("Dayaniklilik: " + Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + Bilgisayar2KagitSecimBelirle(bilgisayar2Secim).getSeviyePuani() + "\n");
        }
        else
            f1.write(Bilgisayar2KagitSecimBelirle(bilgisayar2Secim) + "nesnesi oyundan cıkartıldı");

        f1.write("\n");
        f1.close();
    }

    public void dosyayaYazBilgisayarKagitMakas(int hamleSayisi, int bilgisayar1Secim, int bilgisayar2Secim) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        FileWriter f1 = new FileWriter(output,true);
        if(Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).isOyunaDevamEdebilirMi()){
            f1.write("Hamle: " + hamleSayisi + "\n");
            f1.write("Bilgisayar nesnesi: " + Bilgisayar1KagitSecimBelirle(bilgisayar1Secim) + "\n");
            f1.write("Dayaniklilik: " + Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + Bilgisayar1KagitSecimBelirle(bilgisayar1Secim).getSeviyePuani() + "\n");
        }
        else
            f1.write(Bilgisayar1KagitSecimBelirle(bilgisayar1Secim) + "nesnesi oyundan cıkartıldı");

        if(Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).isOyunaDevamEdebilirMi()){
            f1.write("Bilgisayar nesnesi: " + Bilgisayar2MakasSecimBelirle(bilgisayar2Secim) + "\n");
            f1.write("Dayaniklilik: " + Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).getSeviyePuani() + "\n");
        }
        else
            f1.write(Bilgisayar2MakasSecimBelirle(bilgisayar2Secim) + "nesnesi oyundan cıkartıldı");

        f1.write("\n");
        f1.close();
    }

    public void dosyayaYazBilgisayarMakasMakas(int hamleSayisi, int bilgisayar1Secim, int bilgisayar2Secim) throws IOException {
        File output =new File("C:\\Users\\90553\\Desktop\\yazdir\\output.txt");
        FileWriter f1 = new FileWriter(output,true);
        if(Bilgisayar1MakasSecimBelirle(bilgisayar1Secim).isOyunaDevamEdebilirMi()){
            f1.write("Hamle: " + hamleSayisi + "\n");
            f1.write("Bilgisayar nesnesi: " + Bilgisayar1MakasSecimBelirle(bilgisayar1Secim) + "\n");
            f1.write("Dayaniklilik: " + Bilgisayar1MakasSecimBelirle(bilgisayar1Secim).getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + Bilgisayar1MakasSecimBelirle(bilgisayar1Secim).getSeviyePuani() + "\n");
        }
        else
            f1.write(Bilgisayar1MakasSecimBelirle(bilgisayar1Secim) + "nesnesi oyundan cıkartıldı");

        if(Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).isOyunaDevamEdebilirMi()){
            f1.write("Bilgisayar nesnesi: " + Bilgisayar2MakasSecimBelirle(bilgisayar2Secim) + "\n");
            f1.write("Dayaniklilik: " + Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).getDayaniklilik() + "\n");
            f1.write("Seviye Puani: " + Bilgisayar2MakasSecimBelirle(bilgisayar2Secim).getSeviyePuani() + "\n");
        }
        else
            f1.write(Bilgisayar2MakasSecimBelirle(bilgisayar2Secim) + "nesnesi oyundan cıkartıldı");

        f1.write("\n");
        f1.close();
    }

    //endregion
}