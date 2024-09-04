import javax.swing.*;

public class Tas extends Nesne {

    double Tas_Etki;
    private int katilik;

    public int getKatilik() {
        return katilik;
    }
    public void setKatilik(int katilik) {
        this.katilik = katilik;
    }

    public Tas(){
        setKatilik(2);
    }

    public Tas(int dayaniklilik, int seviyePuani, int katilik) {
        super(dayaniklilik, seviyePuani);
        this.katilik = katilik;
    }

    @Override
    void nesnePuaniGoster(Tas t1) {
        JOptionPane.showMessageDialog(null, "\n        Dayaniklilik: " + t1.getDayaniklilik() +"\n\n        Seviye Puani: " + t1.getSeviyePuani() + "\n\n\n");

    }

    @Override
    double etkiHesapla(Tas t1) {
        Tas_Etki = t1.getKatilik();
        return Tas_Etki;
    }
    @Override
    double etkiHesapla(Tas t1, Kagit k1) {
        Tas_Etki = t1.getKatilik() / ((1 - a) * k1.getNufuz());
        return Tas_Etki;
    }
    @Override
    double etkiHesapla(Tas t1, Makas m1) {
        Tas_Etki = t1.getKatilik() / (a * m1.getKeskinlik());
        return Tas_Etki;
    }

    @Override
    void durumGuncelle(double sonuc, Tas t1) {
        t1.setDayaniklilik(t1.getDayaniklilik() - sonuc);
        if(t1.getDayaniklilik() <= 0){
            t1.setOyunaDevamEdebilirMi(false);
            //System.out.println("Nesne oyundan cikaritliyor");
        }

        super.durumGuncelle(sonuc, t1);
    }

    void durumGuncelle(){
        this.setSeviyePuani(this.getSeviyePuani() + 20);
        if(this.getSeviyePuani() >= 30){
            this.setNesneDonusum(true);
        }
    }

}
