import java.util.ArrayList;

public class Kullanici extends Oyuncu{

    public int kulSkor = 0;
    public int bilSkor = 0;

    public Kullanici() {

    }

    public Kullanici(int oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
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

        return kulSkor;
    }

    @Override
    public ArrayList<Integer> nesneSec() {
        super.nesneSec();
        return new ArrayList<Integer>();
    }
}
