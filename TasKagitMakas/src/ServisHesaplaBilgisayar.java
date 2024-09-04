public class ServisHesaplaBilgisayar {

    double bilgisayar1Sonuc;
    double bilgisayar2Sonuc;
    public void BilgisayarHesapla(Tas tasBilgisayar1,Kagit kagitBilgisayar1,Makas makasBilgisayar1,Bilgisayar bilgisayar1,Tas tasBilgisayar2,Kagit kagitBilgisayar2,Makas makasBilgisayar2,Bilgisayar bilgisayar2){

        if(tasBilgisayar1 !=null){//tas

            if(tasBilgisayar2 !=null){//tas-tas
                tasEtkiHesabiYapveGuncelle(tasBilgisayar1,tasBilgisayar2);
                if(!tasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!tasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }
            else if(kagitBilgisayar2 !=null){//tas-kagit
                tasKagitEtkiHesabiYapveGuncelle(tasBilgisayar1,kagitBilgisayar2);
                if(!tasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!kagitBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }
            else{//tas-makas
                tasMakasEtkiHesabiYapveGuncelle(tasBilgisayar1,makasBilgisayar2);
                if(!tasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!makasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }
        }

        else if (kagitBilgisayar1 !=null){//kagit

            if (tasBilgisayar2 != null){//kagit-tas
                tasKagitEtkiHesabiYapveGuncelle(tasBilgisayar2,kagitBilgisayar1);
                if(!tasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!kagitBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }
            else if(kagitBilgisayar2 != null){//kagit-kagit
                kagitEtkiHesabiYapveGuncelle(kagitBilgisayar1, kagitBilgisayar2);
                if(!kagitBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!kagitBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }
            else{//kagit-makas
                kagitMakasEtkiHesabiYapveGuncelle(kagitBilgisayar1,makasBilgisayar2);

                if(!kagitBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!makasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }
        }

        else{//makas

            if(tasBilgisayar2 != null){//makas-tas
                tasMakasEtkiHesabiYapveGuncelle(tasBilgisayar2,makasBilgisayar1);
                if(!tasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!makasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }
            else if(kagitBilgisayar2 != null){//makas-kagit
                kagitMakasEtkiHesabiYapveGuncelle(kagitBilgisayar2 , makasBilgisayar1);
                if(!kagitBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!makasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }
            else {//makas-makas
                makasEtkiHesabiYapveGuncelle(makasBilgisayar1,makasBilgisayar2);
                if(!makasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!makasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }
        }
    }

    public void Bilgisayar1OzelHamleHesapla(Agir_Tas agirTasBilgisayar1  ,Ozel_Kagit ozelKagitBilgisayar1,Usta_Makas ustaMakasBilgisayar1,Bilgisayar bilgisayar1,Tas tasBilgisayar2,Kagit kagitBilgisayar2,Makas makasBilgisayar2,Bilgisayar bilgisayar2){
        if(agirTasBilgisayar1 != null){//agir tas
            if(tasBilgisayar2 != null){//agir tas-tas
                agirTasTasEtkiHesabiYapveGuncelle(agirTasBilgisayar1,tasBilgisayar2);
                if(!agirTasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();

                }
                if(!tasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();

                }
            }
            else if(kagitBilgisayar2 != null){//agir tas-kagit
                agirTasKagitEtkiHesabiYapveGuncelle(agirTasBilgisayar1,kagitBilgisayar2);
                if(!agirTasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!kagitBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }

            }
            else{//agir tas-makas
                agirTasMakasEtkiHesabiYapveGuncelle(agirTasBilgisayar1,makasBilgisayar2);
                if(!agirTasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!makasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }

        }
        else if (ozelKagitBilgisayar1 != null){//ozel kagit
            if(tasBilgisayar2 != null){//ozel kagit-tas
                ozelKagitTasEtkiHesabiYapveGuncelle(ozelKagitBilgisayar1,tasBilgisayar2);
                if(!ozelKagitBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!tasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }
            else if(kagitBilgisayar2 != null){//ozel kagit-kagit
                ozelKagitKagitEtkiHesabiYapveGuncelle(ozelKagitBilgisayar1,kagitBilgisayar2);
                if(!ozelKagitBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!kagitBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }

            }
            else {//ozel kagit-makas
                ozelKagitMakasEtkiHesabiYapveGuncelle(ozelKagitBilgisayar1,makasBilgisayar2);
                if(!ozelKagitBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!makasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }

            }
        }
        else{//usta makas
            if(tasBilgisayar2 != null){//usta makas-tas
                ustaMakasTasEtkiHesabiYapveGuncelle(ustaMakasBilgisayar1,tasBilgisayar2);
                if(!ustaMakasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!tasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }

            }
            else if(kagitBilgisayar2 != null){//usta makas-kagit
                ustaMakasKagitEtkiHesabiYapveGuncelle(ustaMakasBilgisayar1,kagitBilgisayar2);
                if(!ustaMakasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!kagitBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }

            }
            else {//usta makas-makas
                ustaMakasMakasEtkiHesabiYapveGuncelle(ustaMakasBilgisayar1,makasBilgisayar2);
                if(!ustaMakasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!makasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }

            }

        }
    }

    public void Bilgisayar2OzelHamleHesapla(Tas tasBilgisayar1  ,Kagit kagitBilgisayar1,Makas makasBilgisayar1,Bilgisayar bilgisayar1,Agir_Tas agirTasBilgisayar2,Ozel_Kagit ozelKagitBilgisayar2,Usta_Makas ustaMakasBilgisayar2,Bilgisayar bilgisayar2){
        if(agirTasBilgisayar2 != null){//agir tas
            if(tasBilgisayar1 != null){//agir tas-tas
                agirTasTasEtkiHesabiYapveGuncelle(agirTasBilgisayar2,tasBilgisayar1);
                if(!agirTasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
                if(!tasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
            }
            else if(kagitBilgisayar1 != null){//agir tas-kagit
                agirTasKagitEtkiHesabiYapveGuncelle(agirTasBilgisayar2,kagitBilgisayar1);
                if(!agirTasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
                if(!kagitBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }

            }
            else {//agir tas-makas
                agirTasMakasEtkiHesabiYapveGuncelle(agirTasBilgisayar2,makasBilgisayar1);
                if(!agirTasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
                if(!makasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
            }

        }
        else if (ozelKagitBilgisayar2 != null){//ozel kagit
            if(tasBilgisayar1 != null){//ozel kagit-tas
                ozelKagitTasEtkiHesabiYapveGuncelle(ozelKagitBilgisayar2,tasBilgisayar1);
                if(!ozelKagitBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
                if(!tasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
            }
            else if(kagitBilgisayar1 != null){//ozel kagit-kagit
                ozelKagitKagitEtkiHesabiYapveGuncelle(ozelKagitBilgisayar2,kagitBilgisayar1);
                if(!ozelKagitBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
                if(!kagitBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }

            }
            else {//ozel kagit-makas
                ozelKagitMakasEtkiHesabiYapveGuncelle(ozelKagitBilgisayar2,makasBilgisayar1);
                if(!ozelKagitBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
                if(!makasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }

            }
        }
        else{//usta makas
            if(tasBilgisayar1 != null){//usta makas-tas
                ustaMakasTasEtkiHesabiYapveGuncelle(ustaMakasBilgisayar2,tasBilgisayar1);
                if(!ustaMakasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
                if(!tasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }

            }
            else if(kagitBilgisayar1 != null){//usta makas-kagit
                ustaMakasKagitEtkiHesabiYapveGuncelle(ustaMakasBilgisayar2,kagitBilgisayar1);
                if(!ustaMakasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
                if(!kagitBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }

            }
            else {//usta makas-makas
                ustaMakasMakasEtkiHesabiYapveGuncelle(ustaMakasBilgisayar2,makasBilgisayar1);
                if(!ustaMakasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
                if(!makasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }

            }

        }
    }

    public void BilgisayarOzelTasKagitMakasHesapla(Agir_Tas agirTasBilgisayar1  ,Ozel_Kagit ozelKagitBilgisayar1,Usta_Makas ustaMakasBilgisayar1,Bilgisayar bilgisayar1,Agir_Tas agirTasBilgisayar2,Ozel_Kagit ozelKagitBilgisayar2,Usta_Makas ustaMakasBilgisayar2,Bilgisayar bilgisayar2){
        if(agirTasBilgisayar1 != null){//agir tas
            if(agirTasBilgisayar2 != null){//agir tas-agir tas
                agirTasEtkiHesabiYapveGuncelle(agirTasBilgisayar1,agirTasBilgisayar2);
                if(!agirTasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!agirTasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }
            else if(ozelKagitBilgisayar2 != null){//agir tas-ozel kagit
                agirTasozelKagitEtkiHesabiYapveGuncelle(agirTasBilgisayar1,ozelKagitBilgisayar2);
                if(!agirTasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!ozelKagitBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }

            }
            else {//agir tas-usta makas
                agirTasustaMakasEtkiHesabiYapveGuncelle(agirTasBilgisayar1,ustaMakasBilgisayar2);
                if(!agirTasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!ustaMakasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }

        }
        else if (ozelKagitBilgisayar1 != null){//ozel kagit
            if(agirTasBilgisayar2 != null){//ozel kagit-agir tas
                agirTasozelKagitEtkiHesabiYapveGuncelle(agirTasBilgisayar2,ozelKagitBilgisayar1);
                if(!ozelKagitBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!agirTasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }
            }
            else if(ozelKagitBilgisayar2 != null){//ozel kagit-ozel kagit
                ozelKagitEtkiHesabiYapveGuncelle(ozelKagitBilgisayar1,ozelKagitBilgisayar2);
                if(!ozelKagitBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!ozelKagitBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }

            }
            else {//ozel kagit-usta makas
                ozelKagitustaMakasEtkiHesabiYapveGuncelle(ozelKagitBilgisayar1,ustaMakasBilgisayar2);
                if(!ozelKagitBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!ustaMakasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }

            }
        }
        else{//usta makas
            if(agirTasBilgisayar2 != null){//usta makas-agir tas
                agirTasustaMakasEtkiHesabiYapveGuncelle(agirTasBilgisayar2,ustaMakasBilgisayar1);
                if(!ustaMakasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!agirTasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }

            }
            else if(ozelKagitBilgisayar2 != null){//usta makas-ozel kagit
                ozelKagitustaMakasEtkiHesabiYapveGuncelle(ozelKagitBilgisayar2,ustaMakasBilgisayar1);
                if(!ustaMakasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!ozelKagitBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }

            }
            else{//usta makas-usta makas
                ustaMakasEtkiHesabiYapveGuncelle(ustaMakasBilgisayar1,ustaMakasBilgisayar2);
                if(!ustaMakasBilgisayar1.isOyunaDevamEdebilirMi()){
                    bilgisayar1.bilgisayarHamleSil();
                }
                if(!ustaMakasBilgisayar2.isOyunaDevamEdebilirMi()){
                    bilgisayar2.bilgisayarHamleSil();
                }

            }

        }
    }


    private void tasEtkiHesabiYapveGuncelle(Tas tasBilgisayar1, Tas tasBilgisayar2){

        bilgisayar1Sonuc = tasBilgisayar1.etkiHesapla(tasBilgisayar1);
        bilgisayar2Sonuc = tasBilgisayar2.etkiHesapla(tasBilgisayar2);

        tasBilgisayar1.durumGuncelle(bilgisayar2Sonuc,tasBilgisayar1);
        tasBilgisayar2.durumGuncelle(bilgisayar1Sonuc,tasBilgisayar2);
        if(tasBilgisayar1.isOyunaDevamEdebilirMi() && !tasBilgisayar2.isOyunaDevamEdebilirMi()){
            tasBilgisayar1.durumGuncelle();
        }
        if(tasBilgisayar2.isOyunaDevamEdebilirMi() && !tasBilgisayar1.isOyunaDevamEdebilirMi()){
            tasBilgisayar2.durumGuncelle();
        }

    }

    private void kagitEtkiHesabiYapveGuncelle(Kagit kagitBilgisayar1, Kagit kagitBilgisayar2){

        bilgisayar1Sonuc = kagitBilgisayar1.etkiHesapla(kagitBilgisayar1);
        bilgisayar2Sonuc = kagitBilgisayar2.etkiHesapla(kagitBilgisayar2);

        kagitBilgisayar1.durumGuncelle(bilgisayar2Sonuc, kagitBilgisayar1);
        kagitBilgisayar2.durumGuncelle(bilgisayar1Sonuc,kagitBilgisayar2);

        if(kagitBilgisayar1.isOyunaDevamEdebilirMi() && !kagitBilgisayar2.isOyunaDevamEdebilirMi()){
            kagitBilgisayar1.durumGuncelle();
        }
        if(kagitBilgisayar2.isOyunaDevamEdebilirMi() && !kagitBilgisayar1.isOyunaDevamEdebilirMi()){
            kagitBilgisayar2.durumGuncelle();
        }


    }

    private void makasEtkiHesabiYapveGuncelle(Makas makasBilgisayar1, Makas makasBilgisayar2){

        bilgisayar1Sonuc = makasBilgisayar1.etkiHesapla(makasBilgisayar1);
        bilgisayar2Sonuc = makasBilgisayar2.etkiHesapla(makasBilgisayar2);

        makasBilgisayar1.durumGuncelle(bilgisayar2Sonuc, makasBilgisayar1);
        makasBilgisayar2.durumGuncelle(bilgisayar1Sonuc,makasBilgisayar2);

        if(makasBilgisayar1.isOyunaDevamEdebilirMi() && !makasBilgisayar2.isOyunaDevamEdebilirMi()){
            makasBilgisayar1.durumGuncelle();
        }
        if(makasBilgisayar2.isOyunaDevamEdebilirMi() && !makasBilgisayar1.isOyunaDevamEdebilirMi()){
            makasBilgisayar2.durumGuncelle();
        }

    }

    private void tasKagitEtkiHesabiYapveGuncelle(Tas tasBilgisayar, Kagit kagitBilgisayar){

        bilgisayar1Sonuc = tasBilgisayar.etkiHesapla(tasBilgisayar,kagitBilgisayar);
        bilgisayar2Sonuc = kagitBilgisayar.etkiHesapla(kagitBilgisayar ,tasBilgisayar);

        tasBilgisayar.durumGuncelle(bilgisayar2Sonuc,tasBilgisayar);
        kagitBilgisayar.durumGuncelle(bilgisayar1Sonuc,kagitBilgisayar);

        if(tasBilgisayar.isOyunaDevamEdebilirMi() && !kagitBilgisayar.isOyunaDevamEdebilirMi()){
            tasBilgisayar.durumGuncelle();
        }
        if(kagitBilgisayar.isOyunaDevamEdebilirMi() && !tasBilgisayar.isOyunaDevamEdebilirMi()){
            kagitBilgisayar.durumGuncelle();
        }

    }

    private void tasMakasEtkiHesabiYapveGuncelle(Tas tasBilgisayar , Makas makasBilgisayar){

        bilgisayar1Sonuc = makasBilgisayar.etkiHesapla(makasBilgisayar,tasBilgisayar);
        bilgisayar2Sonuc = tasBilgisayar.etkiHesapla(tasBilgisayar,makasBilgisayar);

        makasBilgisayar.durumGuncelle(bilgisayar2Sonuc, makasBilgisayar);
        tasBilgisayar.durumGuncelle(bilgisayar1Sonuc,tasBilgisayar);

        if(tasBilgisayar.isOyunaDevamEdebilirMi() && !makasBilgisayar.isOyunaDevamEdebilirMi()){
            tasBilgisayar.durumGuncelle();
        }
        if(makasBilgisayar.isOyunaDevamEdebilirMi() && !tasBilgisayar.isOyunaDevamEdebilirMi()){
            makasBilgisayar.durumGuncelle();
        }


    }

    private void kagitMakasEtkiHesabiYapveGuncelle(Kagit kagitBilgisayar , Makas makasBilgisayar){

        bilgisayar1Sonuc = makasBilgisayar.etkiHesapla(makasBilgisayar,kagitBilgisayar);
        bilgisayar2Sonuc = kagitBilgisayar.etkiHesapla(kagitBilgisayar,makasBilgisayar);

        makasBilgisayar.durumGuncelle(bilgisayar2Sonuc, makasBilgisayar);
        kagitBilgisayar.durumGuncelle(bilgisayar1Sonuc,kagitBilgisayar);

        if(kagitBilgisayar.isOyunaDevamEdebilirMi() && !makasBilgisayar.isOyunaDevamEdebilirMi()){
            kagitBilgisayar.durumGuncelle();
        }
        if(makasBilgisayar.isOyunaDevamEdebilirMi() && !kagitBilgisayar.isOyunaDevamEdebilirMi()){
            makasBilgisayar.durumGuncelle();
        }

    }


    private void agirTasTasEtkiHesabiYapveGuncelle(Agir_Tas agirTasBilgisayar,Tas tasBilgisayar){

        bilgisayar1Sonuc = agirTasBilgisayar.etkiHesapla(agirTasBilgisayar,tasBilgisayar);
        bilgisayar2Sonuc = tasBilgisayar.etkiHesapla(tasBilgisayar);

        agirTasBilgisayar.durumGuncelle(bilgisayar2Sonuc,agirTasBilgisayar);
        tasBilgisayar.durumGuncelle(bilgisayar1Sonuc,tasBilgisayar);

        if(agirTasBilgisayar.isOyunaDevamEdebilirMi() && !tasBilgisayar.isOyunaDevamEdebilirMi()){
            agirTasBilgisayar.durumGuncelle();
        }
        if(!agirTasBilgisayar.isOyunaDevamEdebilirMi() && tasBilgisayar.isOyunaDevamEdebilirMi()){
            tasBilgisayar.durumGuncelle();
        }

    }
    private void agirTasKagitEtkiHesabiYapveGuncelle(Agir_Tas agirTasBilgisayar,Kagit kagitBilgisayar){
        bilgisayar1Sonuc = agirTasBilgisayar.etkiHesapla(agirTasBilgisayar,kagitBilgisayar);
        bilgisayar2Sonuc = kagitBilgisayar.etkiHesapla(kagitBilgisayar ,agirTasBilgisayar);

        agirTasBilgisayar.durumGuncelle(bilgisayar2Sonuc,agirTasBilgisayar);
        kagitBilgisayar.durumGuncelle(bilgisayar1Sonuc,kagitBilgisayar);

        if(agirTasBilgisayar.isOyunaDevamEdebilirMi() && !kagitBilgisayar.isOyunaDevamEdebilirMi()){
            agirTasBilgisayar.durumGuncelle();
        }
        if(kagitBilgisayar.isOyunaDevamEdebilirMi() && !agirTasBilgisayar.isOyunaDevamEdebilirMi()){
            kagitBilgisayar.durumGuncelle();
        }
    }
    private void agirTasMakasEtkiHesabiYapveGuncelle(Agir_Tas agirTasBilgisayar,Makas makasBilgisayar){
        bilgisayar1Sonuc = agirTasBilgisayar.etkiHesapla(agirTasBilgisayar,makasBilgisayar);
        bilgisayar2Sonuc = makasBilgisayar.etkiHesapla(makasBilgisayar ,agirTasBilgisayar);

        agirTasBilgisayar.durumGuncelle(bilgisayar2Sonuc,agirTasBilgisayar);
        makasBilgisayar.durumGuncelle(bilgisayar1Sonuc,makasBilgisayar);

        if(agirTasBilgisayar.isOyunaDevamEdebilirMi() && !makasBilgisayar.isOyunaDevamEdebilirMi()){
            agirTasBilgisayar.durumGuncelle();
        }
        if(makasBilgisayar.isOyunaDevamEdebilirMi() && !agirTasBilgisayar.isOyunaDevamEdebilirMi()){
            makasBilgisayar.durumGuncelle();
        }
    }
    private void ozelKagitTasEtkiHesabiYapveGuncelle(Ozel_Kagit ozelKagitBilgisayar,Tas tasBilgisayar){

        bilgisayar1Sonuc = ozelKagitBilgisayar.etkiHesapla(ozelKagitBilgisayar,tasBilgisayar);
        bilgisayar2Sonuc = tasBilgisayar.etkiHesapla(tasBilgisayar,ozelKagitBilgisayar);

        ozelKagitBilgisayar.durumGuncelle(bilgisayar2Sonuc,ozelKagitBilgisayar);
        tasBilgisayar.durumGuncelle(bilgisayar1Sonuc,tasBilgisayar);

        if(ozelKagitBilgisayar.isOyunaDevamEdebilirMi() && !tasBilgisayar.isOyunaDevamEdebilirMi()){
            ozelKagitBilgisayar.durumGuncelle();
        }
        if(!ozelKagitBilgisayar.isOyunaDevamEdebilirMi() && tasBilgisayar.isOyunaDevamEdebilirMi()){
            tasBilgisayar.durumGuncelle();
        }
    }
    private void ozelKagitKagitEtkiHesabiYapveGuncelle(Ozel_Kagit ozelKagitBilgisayar,Kagit kagitBilgisayar){

        bilgisayar1Sonuc = ozelKagitBilgisayar.etkiHesapla(ozelKagitBilgisayar,kagitBilgisayar);
        bilgisayar2Sonuc = kagitBilgisayar.etkiHesapla(kagitBilgisayar);

        ozelKagitBilgisayar.durumGuncelle(bilgisayar2Sonuc,ozelKagitBilgisayar);
        kagitBilgisayar.durumGuncelle(bilgisayar1Sonuc,kagitBilgisayar);

        if(ozelKagitBilgisayar.isOyunaDevamEdebilirMi() && !kagitBilgisayar.isOyunaDevamEdebilirMi()){
            ozelKagitBilgisayar.durumGuncelle();
        }
        if(!ozelKagitBilgisayar.isOyunaDevamEdebilirMi() && kagitBilgisayar.isOyunaDevamEdebilirMi()){
            kagitBilgisayar.durumGuncelle();
        }
    }
    private void ozelKagitMakasEtkiHesabiYapveGuncelle(Ozel_Kagit ozelKagitBilgisayar,Makas makasBilgisayar){

        bilgisayar1Sonuc = ozelKagitBilgisayar.etkiHesapla(ozelKagitBilgisayar,makasBilgisayar);
        bilgisayar2Sonuc = makasBilgisayar.etkiHesapla(makasBilgisayar,ozelKagitBilgisayar);

        ozelKagitBilgisayar.durumGuncelle(bilgisayar2Sonuc,ozelKagitBilgisayar);
        makasBilgisayar.durumGuncelle(bilgisayar1Sonuc,makasBilgisayar);

        if(ozelKagitBilgisayar.isOyunaDevamEdebilirMi() && !makasBilgisayar.isOyunaDevamEdebilirMi()){
            ozelKagitBilgisayar.durumGuncelle();
        }
        if(!ozelKagitBilgisayar.isOyunaDevamEdebilirMi() && makasBilgisayar.isOyunaDevamEdebilirMi()){
            makasBilgisayar.durumGuncelle();
        }
    }
    private void ustaMakasTasEtkiHesabiYapveGuncelle(Usta_Makas ustaMakasBilgisayar,Tas tasBilgisayar){

        bilgisayar1Sonuc = ustaMakasBilgisayar.etkiHesapla(ustaMakasBilgisayar,tasBilgisayar);
        bilgisayar2Sonuc = tasBilgisayar.etkiHesapla(tasBilgisayar,ustaMakasBilgisayar);

        ustaMakasBilgisayar.durumGuncelle(bilgisayar2Sonuc,ustaMakasBilgisayar);
        tasBilgisayar.durumGuncelle(bilgisayar1Sonuc,tasBilgisayar);

        if(ustaMakasBilgisayar.isOyunaDevamEdebilirMi() && !tasBilgisayar.isOyunaDevamEdebilirMi()){
            ustaMakasBilgisayar.durumGuncelle();
        }
        if(!ustaMakasBilgisayar.isOyunaDevamEdebilirMi() && tasBilgisayar.isOyunaDevamEdebilirMi()){
            tasBilgisayar.durumGuncelle();
        }
    }
    private void ustaMakasKagitEtkiHesabiYapveGuncelle(Usta_Makas ustaMakasBilgisayar,Kagit kagitBilgisayar){

        bilgisayar1Sonuc = ustaMakasBilgisayar.etkiHesapla(ustaMakasBilgisayar,kagitBilgisayar);
        bilgisayar2Sonuc = kagitBilgisayar.etkiHesapla(kagitBilgisayar,ustaMakasBilgisayar);

        ustaMakasBilgisayar.durumGuncelle(bilgisayar2Sonuc,ustaMakasBilgisayar);
        kagitBilgisayar.durumGuncelle(bilgisayar1Sonuc,kagitBilgisayar);

        if(ustaMakasBilgisayar.isOyunaDevamEdebilirMi() && !kagitBilgisayar.isOyunaDevamEdebilirMi()){
            ustaMakasBilgisayar.durumGuncelle();
        }
        if(!ustaMakasBilgisayar.isOyunaDevamEdebilirMi() && kagitBilgisayar.isOyunaDevamEdebilirMi()){
            kagitBilgisayar.durumGuncelle();
        }
    }
    private void ustaMakasMakasEtkiHesabiYapveGuncelle(Usta_Makas ustaMakasBilgisayar,Makas makasBilgisayar){

        bilgisayar1Sonuc = ustaMakasBilgisayar.etkiHesapla(ustaMakasBilgisayar,makasBilgisayar);
        bilgisayar2Sonuc = makasBilgisayar.etkiHesapla(makasBilgisayar);

        ustaMakasBilgisayar.durumGuncelle(bilgisayar2Sonuc,ustaMakasBilgisayar);
        makasBilgisayar.durumGuncelle(bilgisayar1Sonuc,makasBilgisayar);

        if(ustaMakasBilgisayar.isOyunaDevamEdebilirMi() && !makasBilgisayar.isOyunaDevamEdebilirMi()){
            ustaMakasBilgisayar.durumGuncelle();
        }
        if(!ustaMakasBilgisayar.isOyunaDevamEdebilirMi() && makasBilgisayar.isOyunaDevamEdebilirMi()){
            makasBilgisayar.durumGuncelle();
        }
    }





    private void agirTasEtkiHesabiYapveGuncelle(Agir_Tas agirTasBilgisayar1,Agir_Tas agirTasBilgisayar2){

        bilgisayar1Sonuc = agirTasBilgisayar1.etkiHesapla(agirTasBilgisayar1);
        bilgisayar2Sonuc = agirTasBilgisayar2.etkiHesapla(agirTasBilgisayar2);

        agirTasBilgisayar1.durumGuncelle(bilgisayar2Sonuc,agirTasBilgisayar1);
        agirTasBilgisayar2.durumGuncelle(bilgisayar1Sonuc,agirTasBilgisayar2);
        if(agirTasBilgisayar1.isOyunaDevamEdebilirMi() && !agirTasBilgisayar2.isOyunaDevamEdebilirMi()){
            agirTasBilgisayar1.durumGuncelle();
        }
        if(agirTasBilgisayar2.isOyunaDevamEdebilirMi() && !agirTasBilgisayar1.isOyunaDevamEdebilirMi()){
            agirTasBilgisayar2.durumGuncelle();
        }
    }
    private void ozelKagitEtkiHesabiYapveGuncelle(Ozel_Kagit ozelKagitBilgisayar1,Ozel_Kagit ozelKagitBilgisayar2){

        bilgisayar1Sonuc = ozelKagitBilgisayar1.etkiHesapla(ozelKagitBilgisayar1);
        bilgisayar2Sonuc = ozelKagitBilgisayar2.etkiHesapla(ozelKagitBilgisayar2);

        ozelKagitBilgisayar1.durumGuncelle(bilgisayar2Sonuc, ozelKagitBilgisayar1);
        ozelKagitBilgisayar2.durumGuncelle(bilgisayar1Sonuc,ozelKagitBilgisayar2);

        if(ozelKagitBilgisayar1.isOyunaDevamEdebilirMi() && !ozelKagitBilgisayar2.isOyunaDevamEdebilirMi()){
            ozelKagitBilgisayar1.durumGuncelle();
        }
        if(ozelKagitBilgisayar2.isOyunaDevamEdebilirMi() && !ozelKagitBilgisayar1.isOyunaDevamEdebilirMi()){
            ozelKagitBilgisayar2.durumGuncelle();
        }

    }
    private void ustaMakasEtkiHesabiYapveGuncelle(Usta_Makas ustaMakasBilgisayar1,Usta_Makas ustaMakasBilgisayar2){

        bilgisayar1Sonuc = ustaMakasBilgisayar1.etkiHesapla(ustaMakasBilgisayar1);
        bilgisayar2Sonuc = ustaMakasBilgisayar2.etkiHesapla(ustaMakasBilgisayar2);

        ustaMakasBilgisayar1.durumGuncelle(bilgisayar2Sonuc, ustaMakasBilgisayar1);
        ustaMakasBilgisayar2.durumGuncelle(bilgisayar1Sonuc,ustaMakasBilgisayar2);

        if(ustaMakasBilgisayar1.isOyunaDevamEdebilirMi() && !ustaMakasBilgisayar2.isOyunaDevamEdebilirMi()){
            ustaMakasBilgisayar1.durumGuncelle();
        }
        if(ustaMakasBilgisayar2.isOyunaDevamEdebilirMi() && !ustaMakasBilgisayar1.isOyunaDevamEdebilirMi()){
            ustaMakasBilgisayar2.durumGuncelle();
        }
    }
    private void agirTasozelKagitEtkiHesabiYapveGuncelle(Agir_Tas agirTasBilgisayar,Ozel_Kagit ozelKagitBilgisayar){

        bilgisayar1Sonuc = agirTasBilgisayar.etkiHesapla(agirTasBilgisayar);
        bilgisayar2Sonuc = ozelKagitBilgisayar.etkiHesapla(ozelKagitBilgisayar);

        agirTasBilgisayar.durumGuncelle(bilgisayar2Sonuc,agirTasBilgisayar);
        ozelKagitBilgisayar.durumGuncelle(bilgisayar1Sonuc,ozelKagitBilgisayar);
        if(agirTasBilgisayar.isOyunaDevamEdebilirMi() && !ozelKagitBilgisayar.isOyunaDevamEdebilirMi()){
            agirTasBilgisayar.durumGuncelle();
        }
        if(ozelKagitBilgisayar.isOyunaDevamEdebilirMi() && !agirTasBilgisayar.isOyunaDevamEdebilirMi()){
            ozelKagitBilgisayar.durumGuncelle();
        }
    }
    private void agirTasustaMakasEtkiHesabiYapveGuncelle(Agir_Tas agirTasBilgisayar,Usta_Makas ustaMakasBilgisayar){

        bilgisayar1Sonuc = agirTasBilgisayar.etkiHesapla(agirTasBilgisayar);
        bilgisayar2Sonuc = ustaMakasBilgisayar.etkiHesapla(ustaMakasBilgisayar);

        agirTasBilgisayar.durumGuncelle(bilgisayar2Sonuc,agirTasBilgisayar);
        ustaMakasBilgisayar.durumGuncelle(bilgisayar1Sonuc,ustaMakasBilgisayar);
        if(agirTasBilgisayar.isOyunaDevamEdebilirMi() && !ustaMakasBilgisayar.isOyunaDevamEdebilirMi()){
            agirTasBilgisayar.durumGuncelle();
        }
        if(ustaMakasBilgisayar.isOyunaDevamEdebilirMi() && !agirTasBilgisayar.isOyunaDevamEdebilirMi()){
            ustaMakasBilgisayar.durumGuncelle();
        }
    }
    private void ozelKagitustaMakasEtkiHesabiYapveGuncelle(Ozel_Kagit ozelKagitBilgisayar,Usta_Makas ustaMakasBilgisayar){

        bilgisayar1Sonuc = ozelKagitBilgisayar.etkiHesapla(ozelKagitBilgisayar);
        bilgisayar2Sonuc = ustaMakasBilgisayar.etkiHesapla(ustaMakasBilgisayar);

        ozelKagitBilgisayar.durumGuncelle(bilgisayar2Sonuc,ozelKagitBilgisayar);
        ustaMakasBilgisayar.durumGuncelle(bilgisayar1Sonuc,ustaMakasBilgisayar);
        if(ozelKagitBilgisayar.isOyunaDevamEdebilirMi() && !ustaMakasBilgisayar.isOyunaDevamEdebilirMi()){
            ozelKagitBilgisayar.durumGuncelle();
        }
        if(ustaMakasBilgisayar.isOyunaDevamEdebilirMi() && !ozelKagitBilgisayar.isOyunaDevamEdebilirMi()){
            ustaMakasBilgisayar.durumGuncelle();
        }
    }
}
