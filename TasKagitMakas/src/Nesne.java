public abstract class Nesne {

    private double dayaniklilik;
    private int seviyePuani;
    private boolean nesneDonusum = false;
    private boolean oyunaDevamEdebilirMi = true;

    private boolean nesneDonusumuGerceklestiMi = false;

    public boolean isNesneDonusumuGerceklestiMi() {
        return nesneDonusumuGerceklestiMi;
    }

    public void setNesneDonusumuGerceklestiMi(boolean nesneDonusumuGerceklestiMi) {
        this.nesneDonusumuGerceklestiMi = nesneDonusumuGerceklestiMi;
    }

    public boolean isNesneDonusum() {
        return nesneDonusum;
    }

    public void setNesneDonusum(boolean nesneDonusum) {
        this.nesneDonusum = nesneDonusum;
    }

    public boolean isOyunaDevamEdebilirMi() {
        return oyunaDevamEdebilirMi;
    }

    public void setOyunaDevamEdebilirMi(boolean oyunaDevamEdebilirMi) {
        this.oyunaDevamEdebilirMi = oyunaDevamEdebilirMi;
    }

    public double getDayaniklilik() {

        return dayaniklilik;
    }

    public void setDayaniklilik(double dayaniklilik) {

        this.dayaniklilik = dayaniklilik;
    }

    public int getSeviyePuani() {

        return seviyePuani;
    }

    public void setSeviyePuani(int seviyePuani) {

        this.seviyePuani = seviyePuani;
    }

    double a = 0.2;

    Nesne(){
        setSeviyePuani(0);
        setDayaniklilik(20);

    }

    Nesne(int dayaniklilik,int seviyePuani){
        this.dayaniklilik = dayaniklilik;
        this.seviyePuani = seviyePuani;

    }

    void nesnePuaniGoster(Tas t1){
    }
    void nesnePuaniGoster(Agir_Tas agir_tas){
    }
    void nesnePuaniGoster(Kagit k1){
    }
    void nesnePuaniGoster(Ozel_Kagit ozel_kagit){
    }
    void nesnePuaniGoster(Makas m1){
    }
    void nesnePuaniGoster(Usta_Makas usta_makas){
    }

    double etkiHesapla(){

        return 0;
    }
    double etkiHesapla(Tas t1){

        return 0;
    }
    double etkiHesapla(Tas t1,Kagit k1){

        return 0;
    }
    double etkiHesapla(Tas t1,Makas m1){

        return 0;
    }

    double etkiHesapla(Agir_Tas agir_tasKullanici,Tas t1){

        return 0;
    }
    double etkiHesapla(Agir_Tas agir_tasKullanici,Kagit k1){

        return 0;
    }
    double etkiHesapla(Agir_Tas agir_tasKullanici,Makas m1){

        return 0;
    }

    double etkiHesapla(Agir_Tas agir_tasKullanici){

        return 0;
    }
    double etkiHesapla(Agir_Tas agir_tasKullanici,Ozel_Kagit ozel_kagitKullanici){

        return 0;
    }
    double etkiHesapla(Agir_Tas agir_tasKullanici,Usta_Makas usta_makasKullanici){

        return 0;
    }


    double etkiHesapla(Kagit k1){

        return 0;
    }
    double etkiHesapla(Kagit k1,Tas t1){

        return 0;
    }
    double etkiHesapla(Kagit k1,Makas m1){

        return 0;
    }


    double etkiHesapla(Ozel_Kagit ozel_kagitKullanici,Tas t1){

        return 0;
    }
    double etkiHesapla(Ozel_Kagit ozel_kagitKullanici,Kagit k1){

        return 0;
    }
    double etkiHesapla(Ozel_Kagit ozel_kagitKullanici,Makas m1){

        return 0;
    }


    double etkiHesapla(Ozel_Kagit ozel_kagitKullanici,Agir_Tas agir_tasKullanici){

        return 0;
    }
    double etkiHesapla(Ozel_Kagit ozel_kagitKullanici){

        return 0;
    }
    double etkiHesapla(Ozel_Kagit ozel_kagitKullanici,Usta_Makas usta_makasKullanici){

        return 0;
    }


    double etkiHesapla(Makas m1){

        return 0;
    }
    double etkiHesapla(Makas m1 , Tas t1){

        return 0;
    }
    double etkiHesapla(Makas m1 , Kagit k1){

        return 0;
    }
    double etkiHesapla(Usta_Makas usta_makasKullanici,Tas t1){

        return 0;
    }
    double etkiHesapla(Usta_Makas usta_makasKullanici,Kagit k1){

        return 0;
    }
    double etkiHesapla(Usta_Makas usta_makasKullanici,Makas m1){

        return 0;
    }


    double etkiHesapla(Usta_Makas usta_makasKullanici,Agir_Tas agir_tasKullanici){

        return 0;
    }
    double etkiHesapla(Usta_Makas usta_makasKullanici,Ozel_Kagit ozel_kagitKullanici){

        return 0;
    }
    double etkiHesapla(Usta_Makas usta_makasKullanici){

        return 0;
    }



    void durumGuncelle(double sonuc,Tas t1) {

    }
    void durumGuncelle(double sonuc,Kagit k1) {

    }
    void durumGuncelle(double sonuc,Makas m1) {

    }
}




