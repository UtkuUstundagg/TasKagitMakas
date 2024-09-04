import javax.swing.*;

public class Kagit extends Nesne {

    double Kagit_Etki;
    private int nufuz;

    public int getNufuz() {
        return nufuz;
    }

    public void setNufuz(int nufuz) {
        this.nufuz = nufuz;
    }

    public Kagit() {
        setNufuz(2);
    }

    public Kagit(int dayaniklilik, int seviyePuani, int nufuz) {
        super(dayaniklilik, seviyePuani);
        this.nufuz = nufuz;
    }

    @Override
    void nesnePuaniGoster(Kagit k1) {
        JOptionPane.showMessageDialog(null, "\n        Dayaniklilik: " + k1.getDayaniklilik() +"\n\n        Seviye Puani: " + k1.getSeviyePuani() + "\n\n\n");

    }

    @Override
    double etkiHesapla(Kagit k1) {
        Kagit_Etki = k1.getNufuz();
        return Kagit_Etki;
    }
    @Override
    double etkiHesapla(Kagit k1, Tas t1) {
        Kagit_Etki = k1.getNufuz() / (a * t1.getKatilik());
        return Kagit_Etki;
    }
    @Override
    double etkiHesapla(Kagit k1, Makas m1) {
        Kagit_Etki = k1.getNufuz() / ((1 - a) * m1.getKeskinlik());
        return Kagit_Etki;
    }


    @Override
    void durumGuncelle(double sonuc, Kagit k1) {
        k1.setDayaniklilik(k1.getDayaniklilik() -sonuc);
        if(k1.getDayaniklilik() <= 0){
            k1.setOyunaDevamEdebilirMi(false);
            //System.out.println("Nesne oyundan cikaritliyor");
        }

        super.durumGuncelle(sonuc, k1);
    }

    void durumGuncelle(){
        this.setSeviyePuani(this.getSeviyePuani() + 20);
        if(this.getSeviyePuani() >= 30){
            this.setNesneDonusum(true);
        }
    }

}
