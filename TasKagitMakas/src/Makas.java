import javax.swing.*;

public class Makas extends Nesne {

    double Makas_Etki;
    private int keskinlik;

    public int getKeskinlik() {
        return keskinlik;
    }

    public void setKeskinlik(int keskinlik) {
        this.keskinlik = keskinlik;
    }


    public Makas() {
        setKeskinlik(2);
    }

    public Makas(int dayaniklilik, int seviyePuani, int keskinlik) {
        super(dayaniklilik, seviyePuani);
        this.keskinlik = keskinlik;
    }

    @Override
    void nesnePuaniGoster(Makas m1) {
        JOptionPane.showMessageDialog(null, "\n        Dayaniklilik: " + m1.getDayaniklilik() +"\n\n        Seviye Puani: " + m1.getSeviyePuani() + "\n\n\n");

    }

    @Override
    double etkiHesapla(Makas m1) {
        Makas_Etki = m1.getKeskinlik();
        return Makas_Etki;
    }

    @Override
    double etkiHesapla(Makas m1, Tas t1) {
        Makas_Etki = m1.getKeskinlik() / ((1 - a) * t1.getKatilik());
        return Makas_Etki;
    }

    @Override
    double etkiHesapla(Makas m1, Kagit k1) {
        Makas_Etki = m1.getKeskinlik() / (a * k1.getNufuz());
        return Makas_Etki;
    }

    @Override
    void durumGuncelle(double sonuc, Makas m1) {
        m1.setDayaniklilik(m1.getDayaniklilik() - sonuc);
        if(m1.getDayaniklilik() <= 0){
            m1.setOyunaDevamEdebilirMi(false);
            //System.out.println("Nesne oyundan cikaritliyor");
        }

        super.durumGuncelle(sonuc, m1);
    }

    void durumGuncelle(){
        this.setSeviyePuani(this.getSeviyePuani() + 20);
        if(this.getSeviyePuani() >= 30){
            this.setNesneDonusum(true);
        }
    }

}



