import javax.swing.*;

public class Usta_Makas extends Makas {

    private int direnc;

    public int getDirenc() {
        return direnc;
    }

    public void setDirenc(int direnc) {
        this.direnc = direnc;
    }

    public Usta_Makas() {
        setDirenc(2);
    }

    public Usta_Makas(int dayaniklilik, int seviyePuani, int keskinlik, int direnc) {
        super(dayaniklilik, seviyePuani, keskinlik);
        this.direnc = direnc;
    }

    @Override
    void nesnePuaniGoster(Usta_Makas usta_makas) {
        JOptionPane.showMessageDialog(null, "\n        Dayaniklilik: " + usta_makas.getDayaniklilik() +"\n\n        Seviye Puani: " + usta_makas.getSeviyePuani() + "\n\n\n");

    }

    @Override
    double etkiHesapla(Usta_Makas usta_makasKullanici, Tas t1) {
        Makas_Etki = (usta_makasKullanici.getDirenc() * usta_makasKullanici.getKeskinlik()) / ((1 - a) * t1.getKatilik());
        return Makas_Etki;
    }

    @Override
    double etkiHesapla(Usta_Makas usta_makasKullanici, Kagit k1) {
        Makas_Etki = (usta_makasKullanici.getDirenc() * usta_makasKullanici.getKeskinlik()) / ((a) * k1.getNufuz());
        return Makas_Etki;
    }

    @Override
    double etkiHesapla(Usta_Makas usta_makasKullanici, Makas m1) {
        Makas_Etki = (usta_makasKullanici.getDirenc() * usta_makasKullanici.getKeskinlik()) / (m1.getKeskinlik());
        return Makas_Etki;
    }

    @Override
    double etkiHesapla(Usta_Makas usta_makasKullanici, Agir_Tas agir_tasKullanici) {
        Makas_Etki = (usta_makasKullanici.getDirenc() * usta_makasKullanici.getKeskinlik()) / ((1 - a) * agir_tasKullanici.getKatilik() * agir_tasKullanici.getSicaklik());
        return Makas_Etki;
    }

    @Override
    double etkiHesapla(Usta_Makas usta_makasKullanici, Ozel_Kagit ozel_kagitKullanici) {
        Makas_Etki = (usta_makasKullanici.getDirenc() * usta_makasKullanici.getKeskinlik()) / ((a) * ozel_kagitKullanici.getNufuz() * ozel_kagitKullanici.getKalinlik());
        return Makas_Etki;
    }

    @Override
    double etkiHesapla(Usta_Makas usta_makasKullanici) {
        Makas_Etki = (usta_makasKullanici.getDirenc() * usta_makasKullanici.getKeskinlik());
        return Makas_Etki;
    }
}
