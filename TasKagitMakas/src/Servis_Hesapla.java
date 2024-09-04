import java.util.ArrayList;

public class Servis_Hesapla {

    double kulSonuc;
    double bilSonuc;
    public Servis_Hesapla() {

    }

    public void Hesapla(Tas t1,Kagit k1,Makas m1 ,String kullaniciSecim , String bilgisayarSecim , Tas tasBilgisayar, Kagit kagitBilgisayar, Makas makasBilgisayar , Bilgisayar bilgisayar){

        if(kullaniciSecim =="Tas" && bilgisayarSecim == "Tas"){
            kulSonuc = t1.etkiHesapla(t1);
            bilSonuc = tasBilgisayar.etkiHesapla(tasBilgisayar);

            t1.durumGuncelle(bilSonuc,t1);
            tasBilgisayar.durumGuncelle(kulSonuc,tasBilgisayar);
            if(t1.isOyunaDevamEdebilirMi() && !tasBilgisayar.isOyunaDevamEdebilirMi()){
                t1.durumGuncelle();
            }
            if(tasBilgisayar.isOyunaDevamEdebilirMi() && !t1.isOyunaDevamEdebilirMi()){
                tasBilgisayar.durumGuncelle();
            }
            if(!tasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Tas" && bilgisayarSecim == "Kagit"){
            kulSonuc = t1.etkiHesapla(t1,kagitBilgisayar);
            bilSonuc = kagitBilgisayar.etkiHesapla(kagitBilgisayar,t1);

            t1.durumGuncelle(bilSonuc,t1);
            kagitBilgisayar.durumGuncelle(kulSonuc,kagitBilgisayar);
            if(t1.isOyunaDevamEdebilirMi() && !kagitBilgisayar.isOyunaDevamEdebilirMi()){
                t1.durumGuncelle();
            }
            if(kagitBilgisayar.isOyunaDevamEdebilirMi() && !t1.isOyunaDevamEdebilirMi()){
                kagitBilgisayar.durumGuncelle();
            }
            if(!kagitBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Tas" && bilgisayarSecim == "Makas"){
            kulSonuc = t1.etkiHesapla(t1,makasBilgisayar);
            bilSonuc = makasBilgisayar.etkiHesapla(makasBilgisayar,t1);

            t1.durumGuncelle(bilSonuc,t1);
            makasBilgisayar.durumGuncelle(kulSonuc,makasBilgisayar);
            if(t1.isOyunaDevamEdebilirMi() && !makasBilgisayar.isOyunaDevamEdebilirMi()){
                t1.durumGuncelle();
            }
            if(makasBilgisayar.isOyunaDevamEdebilirMi() && !t1.isOyunaDevamEdebilirMi()){
                makasBilgisayar.durumGuncelle();
            }
            if(!makasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Kagit" && bilgisayarSecim == "Tas"){
            kulSonuc = k1.etkiHesapla(k1,tasBilgisayar);
            bilSonuc = tasBilgisayar.etkiHesapla(tasBilgisayar,k1);

            k1.durumGuncelle(bilSonuc,k1);
            tasBilgisayar.durumGuncelle(kulSonuc,tasBilgisayar);
            if(k1.isOyunaDevamEdebilirMi() && !tasBilgisayar.isOyunaDevamEdebilirMi()){
                k1.durumGuncelle();
            }
            if(tasBilgisayar.isOyunaDevamEdebilirMi() && !k1.isOyunaDevamEdebilirMi()){
                tasBilgisayar.durumGuncelle();
            }
            if(!tasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }

        }

        else if(kullaniciSecim =="Kagit" && bilgisayarSecim == "Kagit"){
            kulSonuc = k1.etkiHesapla(k1);
            bilSonuc = kagitBilgisayar.etkiHesapla(kagitBilgisayar);

            k1.durumGuncelle(bilSonuc,k1);
            kagitBilgisayar.durumGuncelle(kulSonuc,kagitBilgisayar);
            if(k1.isOyunaDevamEdebilirMi() && !kagitBilgisayar.isOyunaDevamEdebilirMi()){
                k1.durumGuncelle();
            }
            if(kagitBilgisayar.isOyunaDevamEdebilirMi() && !k1.isOyunaDevamEdebilirMi()){
                kagitBilgisayar.durumGuncelle();
            }
            if(!kagitBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Kagit" && bilgisayarSecim == "Makas"){
            kulSonuc = k1.etkiHesapla(k1, makasBilgisayar);
            bilSonuc = makasBilgisayar.etkiHesapla(makasBilgisayar,k1);

            k1.durumGuncelle(bilSonuc,k1);
            makasBilgisayar.durumGuncelle(kulSonuc,makasBilgisayar);
            if(k1.isOyunaDevamEdebilirMi() && !makasBilgisayar.isOyunaDevamEdebilirMi()){
                k1.durumGuncelle();
            }
            if(makasBilgisayar.isOyunaDevamEdebilirMi() && !k1.isOyunaDevamEdebilirMi()){
                makasBilgisayar.durumGuncelle();
            }
            if(!makasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Makas" && bilgisayarSecim == "Tas"){
            kulSonuc = m1.etkiHesapla(m1,tasBilgisayar);
            bilSonuc = tasBilgisayar.etkiHesapla(tasBilgisayar,m1);

            m1.durumGuncelle(bilSonuc,m1);
            tasBilgisayar.durumGuncelle(kulSonuc,tasBilgisayar);
            if(m1.isOyunaDevamEdebilirMi() && !tasBilgisayar.isOyunaDevamEdebilirMi()){
                m1.durumGuncelle();
            }
            if(tasBilgisayar.isOyunaDevamEdebilirMi() && !m1.isOyunaDevamEdebilirMi()){
                tasBilgisayar.durumGuncelle();
            }
            if(!tasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Makas" && bilgisayarSecim == "Kagit"){
            kulSonuc = m1.etkiHesapla(m1,kagitBilgisayar);
            bilSonuc = kagitBilgisayar.etkiHesapla(kagitBilgisayar,m1);

            m1.durumGuncelle(bilSonuc,m1);
            kagitBilgisayar.durumGuncelle(kulSonuc,kagitBilgisayar);
            if(m1.isOyunaDevamEdebilirMi() && !kagitBilgisayar.isOyunaDevamEdebilirMi()){
                m1.durumGuncelle();
            }
            if(kagitBilgisayar.isOyunaDevamEdebilirMi() && !m1.isOyunaDevamEdebilirMi()){
                kagitBilgisayar.durumGuncelle();
            }
            if(!kagitBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Makas" && bilgisayarSecim == "Makas"){
            kulSonuc = m1.etkiHesapla(m1);
            bilSonuc = makasBilgisayar.etkiHesapla(makasBilgisayar);

            m1.durumGuncelle(bilSonuc,m1);
            makasBilgisayar.durumGuncelle(kulSonuc,makasBilgisayar);
            if(m1.isOyunaDevamEdebilirMi() && !makasBilgisayar.isOyunaDevamEdebilirMi()){
                m1.durumGuncelle();
            }
            if(makasBilgisayar.isOyunaDevamEdebilirMi() && !m1.isOyunaDevamEdebilirMi()){
                makasBilgisayar.durumGuncelle();
            }
            if(!makasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }
    }

    public void OzelHesapla(Agir_Tas agir_tasKullanici, Ozel_Kagit ozel_kagitKullanici, Usta_Makas usta_makasKullanici, String kullaniciSecim,
                            String bilgisayarSecim , Tas tasBilgisayar, Kagit kagitBilgisayar, Makas makasBilgisayar , Bilgisayar bilgisayar){

        if(kullaniciSecim =="Agir_Tas" && bilgisayarSecim == "Tas"){
            kulSonuc = agir_tasKullanici.etkiHesapla(agir_tasKullanici);
            bilSonuc = tasBilgisayar.etkiHesapla(tasBilgisayar);

            agir_tasKullanici.durumGuncelle(bilSonuc, agir_tasKullanici);
            tasBilgisayar.durumGuncelle(kulSonuc,tasBilgisayar);
            if(agir_tasKullanici.isOyunaDevamEdebilirMi() && !tasBilgisayar.isOyunaDevamEdebilirMi()){
                agir_tasKullanici.durumGuncelle();
            }
            if(tasBilgisayar.isOyunaDevamEdebilirMi() && !agir_tasKullanici.isOyunaDevamEdebilirMi()){
                tasBilgisayar.durumGuncelle();
            }
            if(!tasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Agir_Tas" && bilgisayarSecim == "Kagit"){
            kulSonuc = agir_tasKullanici.etkiHesapla(agir_tasKullanici,kagitBilgisayar);
            bilSonuc = kagitBilgisayar.etkiHesapla(kagitBilgisayar, agir_tasKullanici);

            agir_tasKullanici.durumGuncelle(bilSonuc, agir_tasKullanici);
            kagitBilgisayar.durumGuncelle(kulSonuc,kagitBilgisayar);
            if(agir_tasKullanici.isOyunaDevamEdebilirMi() && !kagitBilgisayar.isOyunaDevamEdebilirMi()){
                agir_tasKullanici.durumGuncelle();
            }
            if(kagitBilgisayar.isOyunaDevamEdebilirMi() && !agir_tasKullanici.isOyunaDevamEdebilirMi()){
                kagitBilgisayar.durumGuncelle();
            }
            if(!kagitBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Agir_Tas" && bilgisayarSecim == "Makas"){
            kulSonuc = agir_tasKullanici.etkiHesapla(agir_tasKullanici,makasBilgisayar);
            bilSonuc = makasBilgisayar.etkiHesapla(makasBilgisayar, agir_tasKullanici);

            agir_tasKullanici.durumGuncelle(bilSonuc, agir_tasKullanici);
            makasBilgisayar.durumGuncelle(kulSonuc,makasBilgisayar);
            if(agir_tasKullanici.isOyunaDevamEdebilirMi() && !makasBilgisayar.isOyunaDevamEdebilirMi()){
                agir_tasKullanici.durumGuncelle();
            }
            if(makasBilgisayar.isOyunaDevamEdebilirMi() && !agir_tasKullanici.isOyunaDevamEdebilirMi()){
                makasBilgisayar.durumGuncelle();
            }
            if(!makasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Ozel_Kagit" && bilgisayarSecim == "Tas"){
            kulSonuc = ozel_kagitKullanici.etkiHesapla(ozel_kagitKullanici,tasBilgisayar);
            bilSonuc = tasBilgisayar.etkiHesapla(tasBilgisayar, ozel_kagitKullanici);

            ozel_kagitKullanici.durumGuncelle(bilSonuc, ozel_kagitKullanici);
            tasBilgisayar.durumGuncelle(kulSonuc,tasBilgisayar);
            if(ozel_kagitKullanici.isOyunaDevamEdebilirMi() && !tasBilgisayar.isOyunaDevamEdebilirMi()){
                ozel_kagitKullanici.durumGuncelle();
            }
            if(tasBilgisayar.isOyunaDevamEdebilirMi() && !ozel_kagitKullanici.isOyunaDevamEdebilirMi()){
                tasBilgisayar.durumGuncelle();
            }
            if(!tasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }

        }

        else if(kullaniciSecim =="Ozel_Kagit" && bilgisayarSecim == "Kagit"){
            kulSonuc = ozel_kagitKullanici.etkiHesapla(ozel_kagitKullanici);
            bilSonuc = kagitBilgisayar.etkiHesapla(kagitBilgisayar);

            ozel_kagitKullanici.durumGuncelle(bilSonuc, ozel_kagitKullanici);
            kagitBilgisayar.durumGuncelle(kulSonuc,kagitBilgisayar);
            if(ozel_kagitKullanici.isOyunaDevamEdebilirMi() && !kagitBilgisayar.isOyunaDevamEdebilirMi()){
                ozel_kagitKullanici.durumGuncelle();
            }
            if(kagitBilgisayar.isOyunaDevamEdebilirMi() && !ozel_kagitKullanici.isOyunaDevamEdebilirMi()){
                kagitBilgisayar.durumGuncelle();
            }
            if(!kagitBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Ozel_Kagit" && bilgisayarSecim == "Makas"){
            kulSonuc = ozel_kagitKullanici.etkiHesapla(ozel_kagitKullanici, makasBilgisayar);
            bilSonuc = makasBilgisayar.etkiHesapla(makasBilgisayar, ozel_kagitKullanici);

            ozel_kagitKullanici.durumGuncelle(bilSonuc, ozel_kagitKullanici);
            makasBilgisayar.durumGuncelle(kulSonuc,makasBilgisayar);
            if(ozel_kagitKullanici.isOyunaDevamEdebilirMi() && !makasBilgisayar.isOyunaDevamEdebilirMi()){
                ozel_kagitKullanici.durumGuncelle();
            }
            if(makasBilgisayar.isOyunaDevamEdebilirMi() && !ozel_kagitKullanici.isOyunaDevamEdebilirMi()){
                makasBilgisayar.durumGuncelle();
            }
            if(!makasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Usta_Makas" && bilgisayarSecim == "Tas"){
            kulSonuc = usta_makasKullanici.etkiHesapla(usta_makasKullanici,tasBilgisayar);
            bilSonuc = tasBilgisayar.etkiHesapla(tasBilgisayar, usta_makasKullanici);

            usta_makasKullanici.durumGuncelle(bilSonuc, usta_makasKullanici);
            tasBilgisayar.durumGuncelle(kulSonuc,tasBilgisayar);
            if(usta_makasKullanici.isOyunaDevamEdebilirMi() && !tasBilgisayar.isOyunaDevamEdebilirMi()){
                usta_makasKullanici.durumGuncelle();
            }
            if(tasBilgisayar.isOyunaDevamEdebilirMi() && !usta_makasKullanici.isOyunaDevamEdebilirMi()){
                tasBilgisayar.durumGuncelle();
            }
            if(!tasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Usta_Makas" && bilgisayarSecim == "Kagit"){
            kulSonuc = usta_makasKullanici.etkiHesapla(usta_makasKullanici,kagitBilgisayar);
            bilSonuc = kagitBilgisayar.etkiHesapla(kagitBilgisayar, usta_makasKullanici);

            usta_makasKullanici.durumGuncelle(bilSonuc, usta_makasKullanici);
            kagitBilgisayar.durumGuncelle(kulSonuc,kagitBilgisayar);
            if(usta_makasKullanici.isOyunaDevamEdebilirMi() && !kagitBilgisayar.isOyunaDevamEdebilirMi()){
                usta_makasKullanici.durumGuncelle();
            }
            if(kagitBilgisayar.isOyunaDevamEdebilirMi() && !usta_makasKullanici.isOyunaDevamEdebilirMi()){
                kagitBilgisayar.durumGuncelle();
            }
            if(!kagitBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Usta_Makas" && bilgisayarSecim == "Makas"){
            kulSonuc = usta_makasKullanici.etkiHesapla(usta_makasKullanici);
            bilSonuc = makasBilgisayar.etkiHesapla(makasBilgisayar);

            usta_makasKullanici.durumGuncelle(bilSonuc, usta_makasKullanici);
            makasBilgisayar.durumGuncelle(kulSonuc,makasBilgisayar);
            if(usta_makasKullanici.isOyunaDevamEdebilirMi() && !makasBilgisayar.isOyunaDevamEdebilirMi()){
                usta_makasKullanici.durumGuncelle();
            }
            if(makasBilgisayar.isOyunaDevamEdebilirMi() && !usta_makasKullanici.isOyunaDevamEdebilirMi()){
                makasBilgisayar.durumGuncelle();
            }
            if(!makasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

    }


    public void OzelTasKagitMakasHesapla(Agir_Tas agir_tasKullanici, Ozel_Kagit ozel_kagitKullanici, Usta_Makas usta_makasKullanici, String kullaniciSecim,
                                         String bilgisayarSecim , Agir_Tas agir_tasBilgisayar, Ozel_Kagit ozel_kagitBilgisayar, Usta_Makas usta_makasBilgisayar , Bilgisayar bilgisayar){

        if(kullaniciSecim =="Agir_Tas" && bilgisayarSecim == "Agir_Tas"){
            kulSonuc = agir_tasKullanici.etkiHesapla(agir_tasKullanici);
            bilSonuc = agir_tasBilgisayar.etkiHesapla(agir_tasBilgisayar);

            agir_tasKullanici.durumGuncelle(bilSonuc, agir_tasKullanici);
            agir_tasBilgisayar.durumGuncelle(kulSonuc,agir_tasBilgisayar);
            if(agir_tasKullanici.isOyunaDevamEdebilirMi() && !agir_tasBilgisayar.isOyunaDevamEdebilirMi()){
                agir_tasKullanici.durumGuncelle();
            }
            if(agir_tasBilgisayar.isOyunaDevamEdebilirMi() && !agir_tasKullanici.isOyunaDevamEdebilirMi()){
                agir_tasBilgisayar.durumGuncelle();
            }
            if(!agir_tasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Agir_Tas" && bilgisayarSecim == "Ozel_Kagit"){
            kulSonuc = agir_tasKullanici.etkiHesapla(agir_tasKullanici,ozel_kagitBilgisayar);
            bilSonuc = ozel_kagitBilgisayar.etkiHesapla(ozel_kagitBilgisayar, agir_tasKullanici);

            agir_tasKullanici.durumGuncelle(bilSonuc, agir_tasKullanici);
            ozel_kagitBilgisayar.durumGuncelle(kulSonuc,ozel_kagitBilgisayar);
            if(agir_tasKullanici.isOyunaDevamEdebilirMi() && !ozel_kagitBilgisayar.isOyunaDevamEdebilirMi()){
                agir_tasKullanici.durumGuncelle();
            }
            if(ozel_kagitBilgisayar.isOyunaDevamEdebilirMi() && !agir_tasKullanici.isOyunaDevamEdebilirMi()){
                ozel_kagitBilgisayar.durumGuncelle();
            }
            if(!ozel_kagitBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Agir_Tas" && bilgisayarSecim == "Usta_Makas"){
            kulSonuc = agir_tasKullanici.etkiHesapla(agir_tasKullanici,usta_makasBilgisayar);
            bilSonuc = usta_makasBilgisayar.etkiHesapla(usta_makasBilgisayar, agir_tasKullanici);

            agir_tasKullanici.durumGuncelle(bilSonuc, agir_tasKullanici);
            usta_makasBilgisayar.durumGuncelle(kulSonuc,usta_makasBilgisayar);
            if(agir_tasKullanici.isOyunaDevamEdebilirMi() && !usta_makasBilgisayar.isOyunaDevamEdebilirMi()){
                agir_tasKullanici.durumGuncelle();
            }
            if(usta_makasBilgisayar.isOyunaDevamEdebilirMi() && !agir_tasKullanici.isOyunaDevamEdebilirMi()){
                usta_makasBilgisayar.durumGuncelle();
            }
            if(!usta_makasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Ozel_Kagit" && bilgisayarSecim == "Agir_Tas"){
            kulSonuc = ozel_kagitKullanici.etkiHesapla(ozel_kagitKullanici,agir_tasBilgisayar);
            bilSonuc = agir_tasBilgisayar.etkiHesapla(agir_tasBilgisayar, ozel_kagitKullanici);

            ozel_kagitKullanici.durumGuncelle(bilSonuc, ozel_kagitKullanici);
            agir_tasBilgisayar.durumGuncelle(kulSonuc,agir_tasBilgisayar);
            if(ozel_kagitKullanici.isOyunaDevamEdebilirMi() && !agir_tasBilgisayar.isOyunaDevamEdebilirMi()){
                ozel_kagitKullanici.durumGuncelle();
            }
            if(agir_tasBilgisayar.isOyunaDevamEdebilirMi() && !ozel_kagitKullanici.isOyunaDevamEdebilirMi()){
                agir_tasBilgisayar.durumGuncelle();
            }
            if(!agir_tasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }

        }

        else if(kullaniciSecim =="Ozel_Kagit" && bilgisayarSecim == "Ozel_Kagit"){
            kulSonuc = ozel_kagitKullanici.etkiHesapla(ozel_kagitKullanici);
            bilSonuc = ozel_kagitBilgisayar.etkiHesapla(ozel_kagitBilgisayar);

            ozel_kagitKullanici.durumGuncelle(bilSonuc, ozel_kagitKullanici);
            ozel_kagitBilgisayar.durumGuncelle(kulSonuc,ozel_kagitBilgisayar);
            if(ozel_kagitKullanici.isOyunaDevamEdebilirMi() && !ozel_kagitBilgisayar.isOyunaDevamEdebilirMi()){
                ozel_kagitKullanici.durumGuncelle();
            }
            if(ozel_kagitBilgisayar.isOyunaDevamEdebilirMi() && !ozel_kagitKullanici.isOyunaDevamEdebilirMi()){
                ozel_kagitBilgisayar.durumGuncelle();
            }
            if(!ozel_kagitBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Ozel_Kagit" && bilgisayarSecim == "Usta_Makas"){
            kulSonuc = ozel_kagitKullanici.etkiHesapla(ozel_kagitKullanici, usta_makasBilgisayar);
            bilSonuc = usta_makasBilgisayar.etkiHesapla(usta_makasBilgisayar, ozel_kagitKullanici);

            ozel_kagitKullanici.durumGuncelle(bilSonuc, ozel_kagitKullanici);
            usta_makasBilgisayar.durumGuncelle(kulSonuc,usta_makasBilgisayar);
            if(ozel_kagitKullanici.isOyunaDevamEdebilirMi() && !usta_makasBilgisayar.isOyunaDevamEdebilirMi()){
                ozel_kagitKullanici.durumGuncelle();
            }
            if(usta_makasBilgisayar.isOyunaDevamEdebilirMi() && !ozel_kagitKullanici.isOyunaDevamEdebilirMi()){
                usta_makasBilgisayar.durumGuncelle();
            }
            if(!usta_makasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Usta_Makas" && bilgisayarSecim == "Agir_Tas"){
            kulSonuc = usta_makasKullanici.etkiHesapla(usta_makasKullanici,agir_tasBilgisayar);
            bilSonuc = agir_tasBilgisayar.etkiHesapla(agir_tasBilgisayar, usta_makasKullanici);

            usta_makasKullanici.durumGuncelle(bilSonuc, usta_makasKullanici);
            agir_tasBilgisayar.durumGuncelle(kulSonuc,agir_tasBilgisayar);
            if(usta_makasKullanici.isOyunaDevamEdebilirMi() && !agir_tasBilgisayar.isOyunaDevamEdebilirMi()){
                usta_makasKullanici.durumGuncelle();
            }
            if(agir_tasBilgisayar.isOyunaDevamEdebilirMi() && !usta_makasKullanici.isOyunaDevamEdebilirMi()){
                agir_tasBilgisayar.durumGuncelle();
            }
            if(!agir_tasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Usta_Makas" && bilgisayarSecim == "Ozel_Kagit"){
            kulSonuc = usta_makasKullanici.etkiHesapla(usta_makasKullanici,ozel_kagitBilgisayar);
            bilSonuc = ozel_kagitBilgisayar.etkiHesapla(ozel_kagitBilgisayar, usta_makasKullanici);

            usta_makasKullanici.durumGuncelle(bilSonuc, usta_makasKullanici);
            ozel_kagitBilgisayar.durumGuncelle(kulSonuc,ozel_kagitBilgisayar);
            if(usta_makasKullanici.isOyunaDevamEdebilirMi() && !ozel_kagitBilgisayar.isOyunaDevamEdebilirMi()){
                usta_makasKullanici.durumGuncelle();
            }
            if(ozel_kagitBilgisayar.isOyunaDevamEdebilirMi() && !usta_makasKullanici.isOyunaDevamEdebilirMi()){
                ozel_kagitBilgisayar.durumGuncelle();
            }
            if(!ozel_kagitBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

        else if(kullaniciSecim =="Usta_Makas" && bilgisayarSecim == "Usta_Makas"){
            kulSonuc = usta_makasKullanici.etkiHesapla(usta_makasKullanici);
            bilSonuc = usta_makasBilgisayar.etkiHesapla(usta_makasBilgisayar);

            usta_makasKullanici.durumGuncelle(bilSonuc, usta_makasKullanici);
            usta_makasBilgisayar.durumGuncelle(kulSonuc,usta_makasBilgisayar);
            if(usta_makasKullanici.isOyunaDevamEdebilirMi() && !usta_makasBilgisayar.isOyunaDevamEdebilirMi()){
                usta_makasKullanici.durumGuncelle();
            }
            if(usta_makasBilgisayar.isOyunaDevamEdebilirMi() && !usta_makasKullanici.isOyunaDevamEdebilirMi()){
                usta_makasBilgisayar.durumGuncelle();
            }
            if(!usta_makasBilgisayar.isOyunaDevamEdebilirMi()){
                bilgisayar.bilgisayarHamleSil();
            }
        }

    }

}

