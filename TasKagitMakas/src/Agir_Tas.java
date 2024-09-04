import javax.swing.*;

public class Agir_Tas extends Tas {

    private int sicaklik;

    public int getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        this.sicaklik = sicaklik;
    }

    public Agir_Tas() {
        setSicaklik(2);
    }

    public Agir_Tas(int dayaniklilik, int seviyePuani, int katilik, int sicaklik) {
        super(dayaniklilik, seviyePuani, katilik);
        this.sicaklik = sicaklik;
    }

    @Override
    void nesnePuaniGoster(Agir_Tas agir_tas) {
        JOptionPane.showMessageDialog(null, "\n        Dayaniklilik: " + agir_tas.getDayaniklilik() +"\n\n        Seviye Puani: " + agir_tas.getSeviyePuani() + "\n\n\n");

    }

    @Override
    double etkiHesapla(Agir_Tas agir_tasKullanici, Tas t1) {
        Tas_Etki = (agir_tasKullanici.getKatilik() * agir_tasKullanici.getSicaklik()) / (t1.getKatilik());
        return Tas_Etki;
    }

    @Override
    double etkiHesapla(Agir_Tas agir_tasKullanici, Kagit k1) {
        Tas_Etki = (agir_tasKullanici.getKatilik() * agir_tasKullanici.getSicaklik()) / ((1 - a) *k1.getNufuz());
        return Tas_Etki;
    }

    @Override
    double etkiHesapla(Agir_Tas agir_tasKullanici, Makas m1) {
        Tas_Etki = (agir_tasKullanici.getKatilik() * agir_tasKullanici.getSicaklik()) / ((a) *m1.getKeskinlik());
        return Tas_Etki;
    }

    @Override
    double etkiHesapla(Agir_Tas agir_tasKullanici) {
        Tas_Etki = (agir_tasKullanici.getKatilik() * agir_tasKullanici.getSicaklik());
        return Tas_Etki;
    }

    @Override
    double etkiHesapla(Agir_Tas agir_tasKullanici, Ozel_Kagit ozel_kagitKullanici) {
        Tas_Etki = (agir_tasKullanici.getKatilik() * agir_tasKullanici.getSicaklik()) / ((1 - a) * ozel_kagitKullanici.getNufuz() * ozel_kagitKullanici.getKalinlik());
        return Tas_Etki;
    }

    @Override
    double etkiHesapla(Agir_Tas agir_tasKullanici, Usta_Makas usta_makasKullanici) {
        Tas_Etki = (agir_tasKullanici.getKatilik() * agir_tasKullanici.getSicaklik()) / ((a) * usta_makasKullanici.getKeskinlik() * usta_makasKullanici.getDirenc());
        return Tas_Etki;
    }

}
