import java.lang.reflect.Array;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Bilgisayar extends Oyuncu{
    private ArrayList<Integer> bilgisayarHamleListesi = new ArrayList<Integer>();
    int kulSkor = 0;
    int bilSkor = 0;
    private int nesneNumber;
    private int hamleSayisi;
    private String secilenHamle;

    public String getSecilenHamle() {
        return secilenHamle;
    }

    public void setSecilenHamle(String secilenHamle) {
        this.secilenHamle = secilenHamle;
    }

    public int getHamleSayisi() {
        return hamleSayisi;
    }

    public void setHamleSayisi(int hamleSayisi) {
        this.hamleSayisi = hamleSayisi;
    }

    public int getNesneNumber() {
        return nesneNumber;
    }

    public void setNesneNumber(int nesneNumber) {
        this.nesneNumber = nesneNumber;
    }

    public ArrayList<Integer> getBilgisayarHamleListesi() {
        return bilgisayarHamleListesi;
    }

    public void setBilgisayarHamleListesi(ArrayList<Integer> bilgisayarHamleListesi) {
        this.bilgisayarHamleListesi = bilgisayarHamleListesi;
    }


    public Bilgisayar() {

    }

    @Override
    int SkorGoster(double kullaniciDayaniklilik, double bilgisayarDayaniklilik) {

        if(kullaniciDayaniklilik > bilgisayarDayaniklilik){
            kulSkor++;
        }
        else if(kullaniciDayaniklilik < bilgisayarDayaniklilik){
            bilSkor++;
        }
        else {

        }

        return bilSkor;
    }

    public Bilgisayar(int oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }

    @Override
   public ArrayList<Integer> nesneSec() {
        ArrayList<Integer> SecimList = new ArrayList<Integer>();
        for(int i = 1; i <= 15; i++){
            SecimList.add(i);
        }
        ArrayList<Integer> TempList = new ArrayList<Integer>();
        int count;


        Random r1 = new Random();
        //tas 1-5
        //kagit 6-10
        //makas 11-15
        for(count = 1; count <= 5; count++){
            int secim = (int) SecimList.get(r1.nextInt(SecimList.size()));
            TempList.add(secim);
            SecimList.remove(Integer.valueOf(secim));
        }

        System.out.println(TempList);//burası kapanacak
        return TempList;
    }

    public void bilgisayarHamleSil(){
        for (int i =0 ; i< this.bilgisayarHamleListesi.size() ; i++){
            if (this.bilgisayarHamleListesi.get(i) == this.nesneNumber){
                this.bilgisayarHamleListesi.remove(i);
                break;
            }
        }
    }
    public void oynanabilecekHamleSayisi(){
        this.hamleSayisi = this.bilgisayarHamleListesi.size() * 2;
    }
}
