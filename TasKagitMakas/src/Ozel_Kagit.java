import javax.swing.*;

public class Ozel_Kagit extends Kagit {

    private int kalinlik;

    public int getKalinlik() {
        return kalinlik;
    }

    public void setKalinlik(int kalinlik) {
        this.kalinlik = kalinlik;
    }

    public Ozel_Kagit() {
        setKalinlik(2);
    }

    public Ozel_Kagit(int dayaniklilik, int seviyePuani, int nufuz, int kalinlik) {
        super(dayaniklilik, seviyePuani, nufuz);
        this.kalinlik = kalinlik;
    }

    @Override
    void nesnePuaniGoster(Ozel_Kagit ozel_kagit) {
        JOptionPane.showMessageDialog(null, "\n        Dayaniklilik: " + ozel_kagit.getDayaniklilik() +"\n\n        Seviye Puani: " + ozel_kagit.getSeviyePuani() + "\n\n\n");

    }

    @Override
    double etkiHesapla(Ozel_Kagit ozel_kagitKullanici, Tas t1) {
        Kagit_Etki = (ozel_kagitKullanici.getNufuz() * ozel_kagitKullanici.getKalinlik()) / ((a) *t1.getKatilik());
        return Kagit_Etki;
    }

    @Override
    double etkiHesapla(Ozel_Kagit ozel_kagitKullanici, Kagit k1) {
        Kagit_Etki = (ozel_kagitKullanici.getNufuz() * ozel_kagitKullanici.getKalinlik()) / (k1.getNufuz());
        return Kagit_Etki;
    }

    @Override
    double etkiHesapla(Ozel_Kagit ozel_kagitKullanici, Makas m1) {
        Kagit_Etki = (ozel_kagitKullanici.getNufuz() * ozel_kagitKullanici.getKalinlik()) / ((1 - a) * m1.getKeskinlik());
        return Kagit_Etki;
    }

    @Override
    double etkiHesapla(Ozel_Kagit ozel_kagitKullanici, Agir_Tas agir_tasKullanici) {
        Kagit_Etki = (ozel_kagitKullanici.getNufuz() * ozel_kagitKullanici.getKalinlik()) / ((a) * agir_tasKullanici.getSicaklik() * agir_tasKullanici.getKatilik());
        return Kagit_Etki;
    }

    @Override
    double etkiHesapla(Ozel_Kagit ozel_kagitKullanici) {
        Kagit_Etki = (ozel_kagitKullanici.getNufuz() * ozel_kagitKullanici.getKalinlik());
        return Kagit_Etki;
    }

    @Override
    double etkiHesapla(Ozel_Kagit ozel_kagitKullanici, Usta_Makas usta_makasKullanici) {
        Kagit_Etki = (ozel_kagitKullanici.getNufuz() * ozel_kagitKullanici.getKalinlik()) / ((1 - a) *usta_makasKullanici.getKeskinlik() * usta_makasKullanici.getDirenc());
        return Kagit_Etki;
    }
}
