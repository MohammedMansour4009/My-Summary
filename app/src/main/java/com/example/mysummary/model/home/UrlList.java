package com.example.mysummary.model.home;

import android.content.Context;
import android.util.Log;

import com.example.mysummary.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public  class UrlList  {
    public static List<ArrayList<Url>> nurse;
    public static List<ArrayList<Url>> baby;
    public static List<ArrayList<Url>> eco;
    public static List<ArrayList<Url>> it;
    public static List<ArrayList<Url>> aplied;
    public static List<ArrayList<Url>> math;
    public static List<ArrayList<Url>> e5teary;
    public static List<ArrayList<Url>> e5tyari;
    public static List<ArrayList<Url>> Civil;
    public static List<ArrayList<Url>> indes;
    public static List<ArrayList<Url>> elec;
    public static List<ArrayList<Url>> mica;
    public static List<ArrayList<Url>> midc;
    public static List<ArrayList<Url>> computrer;
    public static List<ArrayList<Url>> English;
    public static List<ArrayList<Url>> tor;
    public static List<ArrayList<Url>> arabic;
    public static List<ArrayList<Url>> sport;
    public static List<ArrayList<Url>> doctor;
    public UrlList(Context context) {
        nurse=new ArrayList<>();
        baby=new ArrayList<>();
        eco=new ArrayList<>();
        it=new ArrayList<>();
        e5teary=new ArrayList<>();
        aplied=new ArrayList<>();
        math=new ArrayList<>();
        Civil=new ArrayList<>();
        indes=new ArrayList<>();
        elec=new ArrayList<>();
        mica=new ArrayList<>();
        midc=new ArrayList<>();
        English=new ArrayList<>();
        e5tyari=new ArrayList<>();
        sport=new ArrayList<>();
        doctor=new ArrayList<>();
        doctor.add(doctor1(context));
        doctor.add(doctor2(context));
        doctor.add(doctor3(context));
        doctor.add(doctor4(context));
        doctor.add(doctor5(context));
        doctor.add(doctor6(context));
        sport.add(sport1(context));
        sport.add(sport2(context));
        sport.add(sport3(context));
        sport.add(sport4(context));
        sport.add(sport5(context));
        sport.add(sport6(context));
        sport.add(sport7(context));
        sport.add(sport8(context));
        sport.add(sport9(context));
        sport.add(sport10(context));
        sport.add(sport11(context));
        e5tyari.add(e5tyari1(context));
        e5tyari.add(e5tyari2(context));
        e5tyari.add(e5tyari3(context));
        e5tyari.add(e5tyari4(context));
        e5tyari.add(e5tyari5(context));
        e5tyari.add(e5tyari6(context));
        e5tyari.add(e5tyari7(context));
        e5tyari.add(e5tyari8(context));
        e5tyari.add(e5tyari9(context));
        e5tyari.add(e5tyari10(context));
        e5tyari.add(e5tyari11(context));
        e5tyari.add(e5tyari12(context));
        computrer=new ArrayList<>();
        computrer.add(computrer1(context));
        computrer.add(computrer2(context));
        //--------------------
        arabic= new ArrayList<>();
        arabic.add(arabic1(context));
        arabic.add(arabic2(context));
        arabic.add(arabic3(context));
        arabic.add(arabic4(context));
        arabic.add(arabic5(context));
        arabic.add(arabic6(context));
        arabic.add(arabic7(context));
        arabic.add(arabic8(context));
        //-------------------
        English.add(English1(context));
        English.add(English2(context));
        English.add(English3(context));
        English.add(English4(context));
        English.add(English5(context));
        English.add(English6(context));
        English.add(English7(context));
        English.add(English8(context));
        English.add(English9(context));
        English.add(English10(context));

        midc.add(midc1(context));
        midc.add(midc2(context));
        midc.add(midc3(context));
        midc.add(midc4(context));
        midc.add(midc5(context));
        midc.add(midc6(context));
        midc.add(midc7(context));
        midc.add(midc8(context));
        midc.add(midc9(context));
        midc.add(midc10(context));
        midc.add(midc11(context));
        midc.add(midc12(context));
        midc.add(midc13(context));
        midc.add(midc14(context));
        midc.add(midc15(context));
        //--------------------
        mica.add(computrer1(context));
        mica.add(computrer2(context));
        //--------------------
        tor=new ArrayList<>();
        tor.add(tor1(context));
        tor.add(tor2(context));
        tor.add(tor3(context));
        tor.add(tor4(context));
        tor.add(tor5(context));
        tor.add(tor6(context));
        tor.add(tor7(context));
        tor.add(tor8(context));
        elec.add(elec1(context));
        elec.add(elec2(context));
        elec.add(elec3(context));
        elec.add(elec4(context));
        elec.add(elec5(context));
        elec.add(elec6(context));
        elec.add(elec7(context));
        elec.add(elec8(context));
        elec.add(elec9(context));
        elec.add(elec10(context));
        elec.add(elec11(context));
        elec.add(elec12(context));
        elec.add(elec13(context));
        elec.add(elec14(context));
        elec.add(elec15(context));
        elec.add(elec16(context));
        elec.add(elec17(context));
        elec.add(elec18(context));
        elec.add(elec19(context));
        elec.add(elec20(context));
        elec.add(elec21(context));
        elec.add(elec22(context));
        elec.add(elec23(context));
        elec.add(elec24(context));
        elec.add(elec25(context));
        elec.add(elec26(context));
        elec.add(elec27(context));
        elec.add(elec28(context));
//--------------------
        indes.add(indes1(context));
        indes.add(indes2(context));
        indes.add(indes3(context));
        indes.add(indes4(context));
        indes.add(indes5(context));
        indes.add(indes6(context));
        indes.add(indes7(context));
        indes.add(indes8(context));
        indes.add(indes9(context));
        indes.add(indes10(context));
        indes.add(indes11(context));
        indes.add(indes12(context));
        indes.add(indes13(context));
        indes.add(indes14(context));
        indes.add(indes15(context));
//--------------------
        Civil.add(Civil1(context));
        Civil.add(Civil2(context));
        Civil.add(Civil3(context));
        Civil.add(Civil4(context));
        Civil.add(Civil5(context));
        Civil.add(Civil6(context));
        Civil.add(Civil7(context));
        Civil.add(Civil8(context));
        Civil.add(Civil9(context));
        Civil.add(Civil10(context));
        Civil.add(Civil11(context));
        Civil.add(Civil12(context));
        Civil.add(Civil13(context));
        Civil.add(Civil14(context));
        Civil.add(Civil15(context));
        Civil.add(Civil16(context));
        Civil.add(Civil17(context));
        Civil.add(Civil18(context));
        Civil.add(Civil19(context));
        Civil.add(Civil20(context));
        Civil.add(Civil21(context));
        Civil.add(Civil22(context));
        Civil.add(Civil23(context));
        Civil.add(Civil24(context));
        Civil.add(Civil25(context));
        Civil.add(Civil26(context));
        Civil.add(Civil27(context));
        Civil.add(Civil28(context));
        //--------------------
        e5teary.add(Arabic101(context));
        e5teary.add(English101(context));
        e5teary.add(Askaria(context));
            nurse.add(nurse1(context));
            nurse.add(nurse2(context));
            nurse.add(nurse3(context));
            nurse.add(nurse4(context));
            nurse.add(nurse5(context));
            nurse.add(nurse6(context));
            nurse.add(nurse7(context));
            nurse.add(nurse8(context));
            nurse.add(nurse9(context));
            nurse.add(nurse10(context));
            nurse.add(nurse11(context));
            nurse.add(nurse12(context));
            nurse.add(nurse13(context));
            nurse.add(nurse14(context));
            nurse.add(nurse15(context));
            nurse.add(nurse16(context));
            nurse.add(nurse17(context));
            nurse.add(nurse18(context));
            nurse.add(nurse19(context));
            nurse.add(nurse20(context));
            nurse.add(nurse21(context));
            nurse.add(nurse22(context));
            nurse.add(nurse23(context));
            baby.add(baby1(context));
            baby.add(baby2(context));
            baby.add(baby3(context));
            baby.add(baby4(context));
            baby.add(baby5(context));
            baby.add(baby6(context));
            baby.add(baby7(context));
            eco.add(eco1(context));
            eco.add(eco2(context));
            eco.add(eco3(context));
            eco.add(eco4(context));
            eco.add(eco5(context));
            eco.add(eco6(context));
            eco.add(eco7(context));
            eco.add(eco8(context));
            eco.add(eco9(context));
            eco.add(eco10(context));
            eco.add(eco11(context));
            eco.add(eco12(context));
            eco.add(eco13(context));
            eco.add(eco14(context));
            eco.add(eco15(context));
            eco.add(eco16(context));
            eco.add(eco17(context));
            eco.add(eco18(context));
            eco.add(eco19(context));
            eco.add(eco20(context));
            eco.add(eco21(context));
            eco.add(eco22(context));
            eco.add(eco23(context));
            eco.add(eco24(context));
            eco.add(eco25(context));
            eco.add(eco26(context));
            eco.add(eco27(context));
            eco.add(eco28(context));
            eco.add(eco29(context));
            eco.add(eco30(context));
            eco.add(eco31(context));

            it.add(it1(context));
            it.add(it2(context));
            it.add(it3(context));
            it.add(it4(context));
            it.add(it5(context));
            it.add(it6(context));
            it.add(it7(context));
            it.add(it8(context));
            it.add(it9(context));
            it.add(it10(context));
            it.add(it11(context));
            it.add(it12(context));
            it.add(it13(context));
            it.add(it14(context));
            it.add(it15(context));
            it.add(it16(context));
            it.add(it17(context));
            it.add(it18(context));
            it.add(it19(context));
            it.add(it20(context));
            it.add(it21(context));
            it.add(it22(context));
            it.add(it23(context));
            it.add(it24(context));
            it.add(it25(context));
            it.add(it26(context));
            it.add(it27(context));
            it.add(it28(context));
            it.add(it29(context));
            it.add(it30(context));
            it.add(it31(context));
            it.add(it32(context));
            it.add(it33(context));
            it.add(it34(context));
            it.add(it35(context));
            it.add(it36(context));
            it.add(it37(context));
            aplied.add(aplied1(context));
            aplied.add(aplied2(context));
            aplied.add(aplied3(context));
            aplied.add(aplied4(context));
            aplied.add(aplied5(context));
            aplied.add(aplied6(context));
            aplied.add(aplied7(context));
            aplied.add(aplied8(context));
            aplied.add(aplied9(context));
            aplied.add(aplied10(context));
            aplied.add(aplied11(context));
            aplied.add(aplied12(context));
            aplied.add(aplied13(context));
            aplied.add(aplied14(context));
            aplied.add(aplied15(context));
            aplied.add(aplied16(context));
            aplied.add(aplied17(context));
            aplied.add(aplied18(context));
            aplied.add(aplied19(context));
            aplied.add(aplied20(context));
            aplied.add(aplied21(context));
            aplied.add(aplied22(context));
            aplied.add(aplied23(context));
            math.add(math1(context));
            math.add(math2(context));
            math.add(math3(context));
            math.add(math4(context));
            math.add(math5(context));
            math.add(math6(context));
            math.add(math7(context));
            math.add(math8(context));
            math.add(math9(context));
            math.add(math10(context));
            math.add(math11(context));
            math.add(math12(context));
            math.add(math13(context));
            math.add(math14(context));
            math.add(math15(context));
            math.add(math16(context));
            math.add(math17(context));
            math.add(math18(context));
            math.add(math19(context));
            math.add(math20(context));
            math.add(math21(context));
    }

    public static ArrayList<Url> Arabic101(Context context){

        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.Arabic101)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.Arabic101Name)));

        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));
        }



        return urls; }
    public static ArrayList<Url> English101(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.english101)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.english101Name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));
        }
        return urls; }
    public static ArrayList<Url> Askaria(Context context){

        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.askarih)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.askarihName)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));
        }
        return urls; }


    public static  ArrayList<Url> Civil1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil9(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil9)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil9name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil10(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil10)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil10name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil11(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil11)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil11name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil12(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil12)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil12name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil13(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil13)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil13name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil14(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil14)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil14name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil15(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil15)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil15name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil16(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil16)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil16name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil17(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil17)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil17name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil18(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil18)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil18name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil19(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil19)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil19name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil20(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil20)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil20name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil21(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil21)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil21name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil22(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil22)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil22name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil23(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil23)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil23name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil24(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil24)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil24name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil25(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil25)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil25name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil26(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil26)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil26name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil27(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil27)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil27name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> Civil28(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil28)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.civil28name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> baby1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> baby2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> baby3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> baby4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> baby5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> baby6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> baby7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.baby7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied9(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied9)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied9name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied10(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied10)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied10name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied11(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied11)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied11name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied12(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied12)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied12name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied13(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied13)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied13name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied14(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied14)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied14name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied15(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied15)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied15name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied16(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied16)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied16name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied17(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied17)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied17name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied18(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied18)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied18name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied19(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied19)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied19name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied20(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied20)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied20name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied21(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied21)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied21name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied22(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied22)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied22name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> aplied23(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied23)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.aplied23name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------


    public static  ArrayList<Url> eco1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco9(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco9)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco9name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco10(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco10)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco10name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco11(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco11)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco11name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco12(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco12)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco12name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco13(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco13)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco13name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco14(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco14)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco14name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco15(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco15)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco15name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco16(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco16)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco16name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco17(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco17)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco17name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco18(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco18)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco18name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco19(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco19)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco19name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco20(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco20)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco20name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco21(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco21)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco21name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco22(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco22)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco22name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco23(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco23)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco23name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco24(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco24)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco24name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco25(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco25)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco25name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco26(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco26)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco26name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco27(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco27)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco27name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco28(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco28)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco28name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco29(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco29)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco29name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco30(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco30)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco30name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> eco31(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco31)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.eco31name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------

    public static  ArrayList<Url> computrer1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.computer1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.computrer1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> computrer2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.computrer2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.computrer2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec9(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec9)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec9name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec10(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec10)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec10name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec11(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec11)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec11name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec12(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec12)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec12name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec13(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec13)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec13name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec14(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec14)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec14name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec15(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec15)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec15name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec16(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec16)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec16name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec17(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec17)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec17name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec18(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec18)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec18name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec19(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec19)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec19name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec20(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec20)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec20name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec21(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec21)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec21name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec22(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec22)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec22name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec23(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec23)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec23name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec24(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec24)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec24name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec25(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec25)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec25name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec26(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec26)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec26name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec27(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec27)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec27name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> elec28(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec28)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.elec28name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------

    public static  ArrayList<Url> indes1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes9(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes9)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes9name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes10(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes10)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes10name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes11(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes11)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes11name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes12(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes12)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes12name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes13(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes13)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes13name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes14(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes14)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes14name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> indes15(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes15)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.indes15name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------

//    public static  ArrayList<Url> mica1(Context context){
//        ArrayList<String> Url=new ArrayList<>();
//        ArrayList<String> Name=new ArrayList<>();
//        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.mica1)));
//        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.mica1name)));
//        ArrayList<Url> urls=new ArrayList<>();
//        for(int i=0;i<Name.size();i++){
//            Url url=new Url(Name.get(i),Url.get(i));
//            urls.add(url);
//        }
//
//        return urls;
//    }
    //----------------------
//    public static  ArrayList<Url> mica2(Context context){
//        ArrayList<String> Url=new ArrayList<>();
//        ArrayList<String> Name=new ArrayList<>();
//        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.mica2)));
//        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.mica2name)));
//        ArrayList<Url> urls=new ArrayList<>();
//        for(int i=0;i<Name.size();i++){
//            urls.add(new Url(Name.get(i),Url.get(i)));
//
//        }
//
//        return urls;
//    }//----------------------
    public static  ArrayList<Url> midc1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc1name)));
        ArrayList<Url> urls=new ArrayList<>();
             for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }
        return urls;
    }
    //----------------------
    public static  ArrayList<Url> midc2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> midc3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> midc4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> midc5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> midc6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> midc7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Url.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> midc8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> midc9(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc9)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc9name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> midc10(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc10)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc10name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> midc11(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc11)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc11name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> midc12(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc12)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc12name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> midc13(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc13)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc13name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> midc14(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc14)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc14name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> midc15(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc15)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.midc15name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it9(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it9)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it9name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it10(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it10)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it10name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it11(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it11)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it11name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it12(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it12)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it12name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it13(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it13)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it13name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it14(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it14)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it14name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it15(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it15)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it15name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it16(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it16)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it16name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it17(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it17)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it17name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it18(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it18)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it18name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it19(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it19)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it19name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it20(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it20)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it20name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it21(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it21)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it21name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it22(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it22)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it22name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it23(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it23)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it23name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it24(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it24)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it24name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it25(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it25)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it25name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it26(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it26)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it26name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it27(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it27)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it27name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it28(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it28)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it28name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it29(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it29)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it29name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it30(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it30)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it30name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it31(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it31)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it31name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it32(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it32)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it32name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it33(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it33)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it33name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it34(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it34)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it34name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it35(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it35)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it35name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it36(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it36)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it36name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> it37(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it37)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.it37name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math9(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math9)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math9name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math10(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math10)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math10name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math11(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math11)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math11name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math12(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math12)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math12name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math13(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math13)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math13name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math14(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math14)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math14name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math15(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math15)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math15name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math16(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math16)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math16name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math17(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math17)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math17name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math18(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math18)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math18name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math19(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math19)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math19name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math20(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math20)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math20name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> math21(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math21)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.math21name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse9(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse9)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse9name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse10(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse10)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse10name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse11(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse11)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse11name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse12(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse12)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse12name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse13(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse13)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse13name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse14(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse14)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse14name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse15(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse15)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse15name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse16(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse16)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse16name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse17(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse17)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse17name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse18(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse18)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse18name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse19(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse19)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse19name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse20(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse20)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse20name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse21(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse21)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse21name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse22(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse22)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse22name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> nurse23(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse23)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.nurse23name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> arabic1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> arabic2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> arabic3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> arabic4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> arabic5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> arabic6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> arabic7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> arabic8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.arabic8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------


    public static  ArrayList<Url> tor1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> tor2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> tor3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> tor4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> tor5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> tor6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> tor7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> tor8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.tor8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> English1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> English2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> English3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> English4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> English5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> English6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> English7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> English8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> English9(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English9)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English9name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> English10(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English10)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.English10name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> e5tyari1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> e5tyari2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> e5tyari3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> e5tyari4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> e5tyari5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> e5tyari6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> e5tyari7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> e5tyari8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> e5tyari9(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari9)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari9name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> e5tyari10(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari10)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari10name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> e5tyari11(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari11)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari11name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> e5tyari12(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari12)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.e5tyari12name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------

    public static  ArrayList<Url> sport1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> sport2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> sport3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> sport4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> sport5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> sport6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> sport7(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport7)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport7name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> sport8(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport8)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport8name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> sport9(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport9)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport9name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> sport10(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport10)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport10name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> sport11(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport11)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.sport11name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> doctor1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.doctor1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.doctor1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> doctor2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.doctor2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.doctor2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> doctor3(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.doctor3)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.doctor3name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> doctor4(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.doctor4)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.doctor4name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> doctor5(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.doctor5)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.doctor5name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> doctor6(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.doctor6)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.doctor6name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
}




