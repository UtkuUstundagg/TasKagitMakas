import java.util.ArrayList;

public abstract class Oyuncu {
    private int oyuncuID;
    private String oyuncuAdi;
    private int skor;

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public Oyuncu() {

    }

    public Oyuncu(int oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }

    void nesneListesi(){

    }
    void SkorGoster(){

    }
    int SkorGoster(double kullaniciDayaniklilik, double bilgisayarDayaniklilik){
        return skor;
    }
    public ArrayList<Integer> nesneSec(){
        return new ArrayList<Integer>();
    }
}
