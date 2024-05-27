package com.random.zikirmatik.Hisnulmuslim;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.random.zikirmatik.databinding.FragmentHisnulmuslimBinding;

import java.util.ArrayList;

public class HisnulMuslimFarm extends Fragment {

    ArrayList<LandMark> landMarkArrayList;
    private FragmentHisnulmuslimBinding binding;

    RecyclerView recyclerView;
    LandMarkAdapter adapter;
    SearchView searchView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHisnulmuslimBinding.inflate(inflater, container, false);



        recyclerView = binding.recyclerView;
        searchView = binding.serchView;

        searchView.clearFocus();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Serching(newText);
                return false;
            }
        });

        View view = binding.getRoot();

        landMarkArrayList = new ArrayList<>();

        LandMark sifir1 = new LandMark("ZİKRİN FAZİLETİ ", "sakın bana nankörlük etmeyin!" , "");
        LandMark sifir2 = new LandMark("UYKUDAN UYANINCA YAPILAN DUÂLAR: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir3 = new LandMark("ELBİSE GİYERKEN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir4 = new LandMark("YENİ ELBİSE GİYERKEN YAPILAN DUÂ: ", "","");
        LandMark sifir5 = new LandMark("ELBİSE ÇIKARIRKEN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir6 = new LandMark("TUVALETE GİRMEDEN ÖNCE YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir7 = new LandMark("TUVALETTEN ÇIKTIKTAN SONRA YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir8 = new LandMark("ABDESTTEN ÖNCE YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir9 = new LandMark("ABDESTTEN SONRA YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir10 = new LandMark("EVDEN ÇIKARKEN YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir11 = new LandMark("EVE GİRERKEN YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir12 = new LandMark("CÂMİYE GİDERKEN YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir13 = new LandMark("CÂMİYE GİRERKEN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir14 = new LandMark("CÂMİDEN ÇIKARKEN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir15 = new LandMark("EZÂN İLE İLGİLİ DUÂ VE ZİKİRLER: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir16 = new LandMark("(TEKBİRDEN SONRA OKUNAN) İFTİTAH DUÂSI: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir17 = new LandMark("RÜKÛDA YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir18 = new LandMark("RÜKÛDAN DOĞRULURKEN YAPILAN DUÂ: ", "sakın bana nankörlük etmeyin!" , "");
        LandMark sifir19 = new LandMark("SECDEDE YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir20 = new LandMark("İKİ SECDE ARASINDAKİ OTURUŞTA YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir21 = new LandMark("TİLÂVET SECDESİNDE YAPILAN DUÂ: ", "","");
        LandMark sifir22 = new LandMark("TEŞEHHÜDDEN SONRA OKUNAN SALAVÂT:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir23= new LandMark("NAMAZDA SELÂMDAN ÖNCE YAPILAN DUÂLAR:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir24 = new LandMark("SELÂMDAN SONRA YAPILAN DUÂLAR:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir25 = new LandMark("İSTİHÂRE DUÂSI:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir26 = new LandMark("SABAH VE AKŞAM YAPILAN DUÂLAR: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir27 = new LandMark("UYKUDAN ÖNCE YAPILAN DUÂLAR:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir28 = new LandMark("UYKUDA BİR YANDAN DİĞER BİR YANA DÖNÜNCE YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir29 = new LandMark("UYKUDA KORKAN VEYA ÜRKÜTEN BİR ŞEYLE KARŞILAŞAN KİMSENİN \n" + "YAPACAĞI DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir30 = new LandMark("KÂBUS VEYA KÖTÜ RÜYÂ GÖRENİN YAPMASI GEREKEN ŞEYLER:  ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir31 = new LandMark("VİTİRDE KUNUT DUÂSI: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir32 = new LandMark("VİTİRDE SELÂMDAN SONRA YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir33 = new LandMark("ÜZÜNTÜ VE KEDER ANINDA YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir34 = new LandMark("SIKINTI ANINDA YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir35 = new LandMark("DÜŞMAN VEYA GÜÇ SAHİBİ BİRİSİYLE KARŞILAŞINCA YAPILAN DUÂ: ", "sakın bana nankörlük etmeyin!" , "");
        LandMark sifir36= new LandMark("GÜÇ VE KUVVET SAHİBİNİN ZULMÜNDEN KORKAN KİMSENİN \n" + "YAPACAĞI DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir37= new LandMark("DÜŞMANA KARŞI YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir38= new LandMark("BİR TOPLULUKTAN KORKAN KİMSENİN YAPACAĞI DUÂ:", "","");
        LandMark sifir39= new LandMark("ÎMÂNDA ŞÜPHEYE DÜŞEN KİMSENİN YAPACAĞI DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir40= new LandMark("BORCUN ÖDENMESİ İÇİN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir41= new LandMark("NAMAZ KILARKEN VE KUR'ÂN OKURKEN GELEN VESVESEYE KARŞI \n" + "YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir42= new LandMark("ZOR BİR İŞLE KARŞILAŞAN KİMSENİN YAPACAĞI DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir43= new LandMark("GÜNAH İŞLEYEN KİMSENİN YAPMASI GEREKEN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir44 = new LandMark("ŞEYTANI VE VESVESELERİNİ KOVMAK İÇİN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir45 = new LandMark("HOŞA GİTMEYEN BİR DURUM OLDUĞU VEYA İSTENİLEN ŞEY OLMADIĞI \n" + "ZAMAN YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir46 = new LandMark("ÇOCUĞU OLAN KİMSEYİ TEBRİK ETMEK İÇİN YAPILAN DUÂ VE \n" + "ONUN BUNA KARŞILIK YAPACAĞI DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir47 = new LandMark("TEBRİK EDİLEN KİMSE İSE ONA ŞÖYLE DUÂ EDER:  ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir48 = new LandMark("ÇOCUKLARIN KORUNMASI İÇİN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir49 = new LandMark("HASTA ZİYÂRETİNDE HASTAYA YAPILAN DUÂ:  ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir50 = new LandMark("HASTAYI ZİYÂRET ETMENİN FAZÎLETİ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir51 = new LandMark("HAYATINDAN ÜMİT KESİLEN HASTANIN YAPACAĞI DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir52 = new LandMark("VEFÂT ETMEK ÜZERE OLANA TELKİNDE BULUNMAK:  ", "sakın bana nankörlük etmeyin!" , "");
        LandMark sifir53 = new LandMark("BAŞINA BİR BELÂ GELEN KİMSENİN YAPACAĞI DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir54 = new LandMark("VEFÂT EDENİN GÖZLERİNİ KAPATIRKEN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir55 = new LandMark("CENÂZE NAMAZINDA ÖLÜ İÇİN YAPILAN DUÂ:", "","");
        LandMark sifir56 = new LandMark("BÜLÛĞA ERMEDEN ÖLEN ÇOCUĞUN CENÂZESİNDE YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir57= new LandMark("TAZİYE (BAŞSAĞLIĞI) DUÂSI: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir58 = new LandMark("CENÂZE KABRE KONULURKEN YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir59 = new LandMark("CENÂZE DEFNEDİLDİKTEN SONRA YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir60 = new LandMark("RÜZGÂR ESERKEN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir61 = new LandMark("GÖK GÜRLEDİĞİNDE YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir62 = new LandMark("BAZI İSTİSKÂ (YAĞMUR İSTEME) DUÂLARI: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir63 = new LandMark("YAĞMUR YAĞARKEN YAPILAN DUÂ: " , "R.drawable.artir", "R.drawable.artir");
        LandMark sifir64 = new LandMark("YAĞMURDAN SONRA YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir65 = new LandMark("YAĞMURUN KESİLMESİ İÇİN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir66 = new LandMark("HİLÂL GÖRÜLÜNCE YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir67 = new LandMark("ORUÇLUNUN İFTARINI AÇTIKTAN SONRA YAPACAĞI DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir68 = new LandMark("YEMEKTEN ÖNCE YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");

        LandMark sifir69 = new LandMark("YEMEKTEN SONRA YAPILAN DUÂ:  ", "sakın bana nankörlük etmeyin!" , "");
        LandMark sifir70= new LandMark("MİSÂFİRİN YEMEK SAHİBİ İÇİN YAPACAĞI DUÂ:  ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir71= new LandMark("KENDİSİNE SU İÇİREN VEYA İÇİRMEK İSTEYEN KİMSE İÇİN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir72= new LandMark("ORUÇLUNUN, İFTAR YEMEĞİ VEREN KİMSE İÇİN İFTARINI AÇTIKTAN \n" + "SONRA YAPACAĞI DUÂ:  ", ".", "");
        LandMark sifir73= new LandMark("ORUÇLU OLDUĞU HALDE YEMEĞE DÂVET EDİLEN VE ORUCUNU \n" + "BOZMAYANIN YEMEK SAHİBİ İÇİN YAPACAĞI DUÂ2: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir74= new LandMark("ORUÇLUNUN, KENDİSİNE SÖVEN VEYA KÖTÜ SÖZ SÖYLEYEN KİMSE \n" + "İÇİN NE SÖYLEYECEĞİ:  ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir75= new LandMark("MEVSİMİN İLK MEYVESİ GÖRÜLÜNCE YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir76= new LandMark("AKSIRINCA YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir77= new LandMark("KÂFİR, AKSIRDIRDIĞI ZAMAN ALLAH'A HAMD EDERSE, ONUN İÇİN \n" + "YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir78 = new LandMark("EVLENEN KİMSE İÇİN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir79 = new LandMark("EVLENEN VEYA YENİ BİNEK SATIN ALAN KİMSENİN YAPACAĞI DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir80 = new LandMark("EŞİYLE CİNSEL İLİŞKİYE GİRMEDEN ÖNCE YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir81 = new LandMark("ÖFKELENİNCE YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir82 = new LandMark("BELÂYA UĞRAYAN BİR KİMSEYİ GÖREN KİMSENİN YAPACAĞI DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir83 = new LandMark("HER OTURUMDA YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir84 = new LandMark("OTURUMUN SONUNDA (ORADAN AYRILMADAN ÖNCE) YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir85 = new LandMark("ALLAH SENİ BAĞIŞLASIN DİYEN KİMSE İÇİN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir86 = new LandMark("YİLİK YAPAN KİMSE İÇİN YAPILAN DUÂ: ", "sakın bana nankörlük etmeyin!" , "");
        LandMark sifir87 = new LandMark("DECCÂL'İN ŞERRİNDEN KORUNMAK İÇİN YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir88 = new LandMark("SENİ ALLAH İÇİN SEVİYORUM DİYEN KİMSE İÇİN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir89 = new LandMark("MALINI SANA SUNAN KİMSE İÇİN YAPACAĞIN DUÂ: ", " .", "");
        LandMark sifir90 = new LandMark("BORCU ÖDERKEN, BORÇ VEREN KİMSE İÇİN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir91 = new LandMark("ŞİRKE DÜŞMEKTEN KORKULDUĞU ZAMAN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir92 = new LandMark("ALLAH SENİ MÜBÂREK KILSIN DİYEN KİMSE İÇİN YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir93 = new LandMark("BİR ŞEYİ UĞURSUZ SAYMANIN ÇİRKİN OLUŞU İLE İLGİLİ DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir94 = new LandMark("BİNEĞE VEYA TAŞITA BİNERKEN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir95 = new LandMark("YOLCULUĞA ÇIKARKEN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir96 = new LandMark("BİR KÖY VEYA BELDEYE GİRERKEN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir97 = new LandMark("ÇARŞI VE PAZARA GİRERKEN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir98 = new LandMark("BİNEK TÖKEZLEYİNCE YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir99 = new LandMark("YOLCUNUN GERİDE KALANLAR İÇİN YAPACAĞI DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir100= new LandMark("GERİDE KALANLARIN YOLCU İÇİN YAPACAĞI DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir101= new LandMark("YOLCULUK SIRASINDA TEKBİR VE TESBİH GETİRMEK:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir102= new LandMark("YOLCUNUN, SEHER VAKTİNE GİRDİĞİNDE YAPACAĞI DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir103= new LandMark("YOLCULUK SIRASINDA VEYA BAŞKA ZAMANDA BİR YERDE \n" + "KONAKLAYINCA YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir104 = new LandMark("YOLCULUKTAN DÖNÜNCE YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir105 = new LandMark("HOŞA GİDEN VEYA GİTMEYEN BİR ŞEYLE KARŞILAŞINCA YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir106= new LandMark("NEBİ -sallallahu aleyhi ve sellem-’E SALÂT GETİRMENİN FAZÎLETİ: " , "R.drawable.artir", "R.drawable.artir");
        LandMark sifir107= new LandMark("SELÂMI YAYMAK: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir108= new LandMark("MÜSLÜMAN, KENDİSİNE SELÂM VEREN KÂFİRE NASIL KARŞILIK VERİR? ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir109= new LandMark("HOROZ ÖTTÜĞÜNDE VE EŞEK ANIRDIĞINDA YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir110= new LandMark("GECE KÖPEK HAVLADIĞINDA YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir111= new LandMark("KÖTÜLEDİĞİN KİMSE İÇİN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir112 = new LandMark("MÜSLÜMAN,MÜSLÜMANI ÖVDÜĞÜNDE YAPILAN DUÂ:", "sakın bana nankörlük etmeyin!" , "");
        LandMark sifir113= new LandMark("TEZKİYE EDİLEN (KENDİSİNE REFERANS VERİLEN) MÜSLÜMANIN \n" + "YAPACAĞI DUÂ:" , "R.drawable.artir", "R.drawable.artir");
        LandMark sifir114= new LandMark("İHRAMLI KİMSE HAC VEYA UMREDE NASIL TELBİYE GETİRİR? ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir115= new LandMark("TAVAFTA HACER-İ ESVED'E GELİNCE TEKBİR GETİRMEK: ", "", "");
        LandMark sifir116= new LandMark("TAVAFTA RÜKN-Ü YEMÂNÎ İLE HACER-İ ESVED ARASINDA YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir117= new LandMark("SAFA VE MERVE ÜZERİNDE DURUNCA YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir118= new LandMark("AREFE GÜNÜ YAPILAN DUÂ: " , "R.drawable.artir", "R.drawable.artir");
        LandMark sifir119= new LandMark("MEŞ'AR-İ HARAM'DA (MÜZDELİFE'DE) YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir120= new LandMark("CEMRELERE TAŞ ATARKEN TEKBİR GETİRMEK: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir121 = new LandMark("ŞAŞIRTAN VE SEVİNDİREN BİR DURUM KARŞISINDA YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir122= new LandMark("KENDİSİNE SEVİNDİRİCİ BİR HABER GELEN KİMSENİN YAPACAĞI \n" + "DUÂ: " , "R.drawable.artir", "R.drawable.artir");
        LandMark sifir123 = new LandMark("BEDENDE AĞRI HİSSEDİLİNCE YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir124 = new LandMark("NAZAR ETMEKTEN KORKAN KİMSENİN YAPACAĞI DUÂ:  ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir125= new LandMark("KORKU VE DEHŞET ANINDA YAPILAN DUÂ:", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir126= new LandMark("KURBAN KESERKEN YAPILAN DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir127= new LandMark("İNATÇI ŞEYTANLARIN HİLE VE TUZAĞINI BOŞA ÇIKARMAK İÇİN YAPILAN \n" + "DUÂ: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir128= new LandMark("TEVBE VE İSTİĞFAR HAKKINDA: ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir129= new LandMark("TESBÎH, TAHMÎD,TEHLÎL VE TEKBÎR GETİRMENİN FAZÎLETİ :", "sakın bana nankörlük etmeyin!" , "");
        LandMark sifir130= new LandMark("NEBİ -sallallahu aleyhi ve sellem- NASIL TESBİH ÇEKERDİ? ", "R.drawable.artir", "R.drawable.artir");
        LandMark sifir131= new LandMark("BAZI HAYIR VE ÂDÂB ÖRNEKLERİ: ", "R.drawable.artir", "R.drawable.artir");

        landMarkArrayList.add(sifir1);
        landMarkArrayList.add(sifir2);
        landMarkArrayList.add(sifir3);
        landMarkArrayList.add(sifir4);
        landMarkArrayList.add(sifir5);
        landMarkArrayList.add(sifir6);
        landMarkArrayList.add(sifir7);
        landMarkArrayList.add(sifir8);
        landMarkArrayList.add(sifir9);
        landMarkArrayList.add(sifir10);
        landMarkArrayList.add(sifir11);
        landMarkArrayList.add(sifir12);
        landMarkArrayList.add(sifir13);
        landMarkArrayList.add(sifir14);
        landMarkArrayList.add(sifir15);
        landMarkArrayList.add(sifir16);
        landMarkArrayList.add(sifir17);
        landMarkArrayList.add(sifir18);
        landMarkArrayList.add(sifir19);
        landMarkArrayList.add(sifir20);
        landMarkArrayList.add(sifir21);
        landMarkArrayList.add(sifir22);
        landMarkArrayList.add(sifir23);
        landMarkArrayList.add(sifir24);
        landMarkArrayList.add(sifir25);
        landMarkArrayList.add(sifir26);
        landMarkArrayList.add(sifir27);
        landMarkArrayList.add(sifir28);
        landMarkArrayList.add(sifir29);
        landMarkArrayList.add(sifir30);
        landMarkArrayList.add(sifir31);
        landMarkArrayList.add(sifir32);
        landMarkArrayList.add(sifir33);
        landMarkArrayList.add(sifir34);
        landMarkArrayList.add(sifir35);
        landMarkArrayList.add(sifir36);
        landMarkArrayList.add(sifir37);
        landMarkArrayList.add(sifir38);
        landMarkArrayList.add(sifir39);
        landMarkArrayList.add(sifir40);
        landMarkArrayList.add(sifir41);
        landMarkArrayList.add(sifir42);
        landMarkArrayList.add(sifir43);
        landMarkArrayList.add(sifir44);
        landMarkArrayList.add(sifir45);
        landMarkArrayList.add(sifir46);
        landMarkArrayList.add(sifir47);
        landMarkArrayList.add(sifir48);
        landMarkArrayList.add(sifir49);
        landMarkArrayList.add(sifir50);
        landMarkArrayList.add(sifir51);
        landMarkArrayList.add(sifir52);
        landMarkArrayList.add(sifir53);
        landMarkArrayList.add(sifir54);
        landMarkArrayList.add(sifir55);
        landMarkArrayList.add(sifir56);
        landMarkArrayList.add(sifir57);
        landMarkArrayList.add(sifir58);
        landMarkArrayList.add(sifir59);
        landMarkArrayList.add(sifir60);
        landMarkArrayList.add(sifir61);
        landMarkArrayList.add(sifir62);
        landMarkArrayList.add(sifir63);
        landMarkArrayList.add(sifir64);
        landMarkArrayList.add(sifir65);
        landMarkArrayList.add(sifir66);
        landMarkArrayList.add(sifir67);
        landMarkArrayList.add(sifir68);
        landMarkArrayList.add(sifir69);
        landMarkArrayList.add(sifir70);
        landMarkArrayList.add(sifir71);
        landMarkArrayList.add(sifir72);
        landMarkArrayList.add(sifir73);
        landMarkArrayList.add(sifir74);
        landMarkArrayList.add(sifir75);
        landMarkArrayList.add(sifir76);
        landMarkArrayList.add(sifir77);
        landMarkArrayList.add(sifir78);
        landMarkArrayList.add(sifir79);
        landMarkArrayList.add(sifir80);
        landMarkArrayList.add(sifir81);
        landMarkArrayList.add(sifir82);
        landMarkArrayList.add(sifir83);
        landMarkArrayList.add(sifir84);
        landMarkArrayList.add(sifir85);
        landMarkArrayList.add(sifir86);
        landMarkArrayList.add(sifir87);
        landMarkArrayList.add(sifir88);
        landMarkArrayList.add(sifir89);
        landMarkArrayList.add(sifir90);
        landMarkArrayList.add(sifir91);
        landMarkArrayList.add(sifir92);
        landMarkArrayList.add(sifir93);
        landMarkArrayList.add(sifir94);
        landMarkArrayList.add(sifir95);
        landMarkArrayList.add(sifir96);
        landMarkArrayList.add(sifir97);
        landMarkArrayList.add(sifir98);
        landMarkArrayList.add(sifir99);
        landMarkArrayList.add(sifir100);
        landMarkArrayList.add(sifir101);
        landMarkArrayList.add(sifir102);
        landMarkArrayList.add(sifir103);
        landMarkArrayList.add(sifir104);
        landMarkArrayList.add(sifir105);
        landMarkArrayList.add(sifir106);
        landMarkArrayList.add(sifir107);
        landMarkArrayList.add(sifir108);
        landMarkArrayList.add(sifir109);
        landMarkArrayList.add(sifir110);
        landMarkArrayList.add(sifir111);
        landMarkArrayList.add(sifir112);
        landMarkArrayList.add(sifir113);
        landMarkArrayList.add(sifir114);
        landMarkArrayList.add(sifir115);
        landMarkArrayList.add(sifir116);
        landMarkArrayList.add(sifir117);
        landMarkArrayList.add(sifir118);
        landMarkArrayList.add(sifir119);
        landMarkArrayList.add(sifir120);
        landMarkArrayList.add(sifir121);
        landMarkArrayList.add(sifir122);
        landMarkArrayList.add(sifir123);
        landMarkArrayList.add(sifir124);
        landMarkArrayList.add(sifir125);
        landMarkArrayList.add(sifir126);
        landMarkArrayList.add(sifir127);
        landMarkArrayList.add(sifir128);
        landMarkArrayList.add(sifir129);
        landMarkArrayList.add(sifir130);
        landMarkArrayList.add(sifir131);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        LandMarkAdapter lanMarkAdapter = new LandMarkAdapter(landMarkArrayList);
        binding.recyclerView.setAdapter(lanMarkAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new LandMarkAdapter(landMarkArrayList);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void Serching(String newText) {
        ArrayList<LandMark> filteredList = new ArrayList<>();

        for (LandMark landmark : landMarkArrayList) {
            if (landmark.getListeName().toLowerCase().contains(newText.toLowerCase())) {
                filteredList.add(landmark);
            }
        }

        adapter.filterList(filteredList);
    }

}