package com.example.mysummary.model.home;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mysummary.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


public  class UrlList  {
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
    public static  ArrayList<Url> mica1(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.mica1)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.mica1name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
    public static  ArrayList<Url> mica2(Context context){
        ArrayList<String> Url=new ArrayList<>();
        ArrayList<String> Name=new ArrayList<>();
        Url.addAll(Arrays.asList(context.getResources().getStringArray(R.array.mica2)));
        Name.addAll(Arrays.asList(context.getResources().getStringArray(R.array.mica2name)));
        ArrayList<Url> urls=new ArrayList<>();
        for(int i=0;i<Name.size();i++){
            urls.add(new Url(Name.get(i),Url.get(i)));

        }

        return urls;
    }//----------------------
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
    }//----------------------
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
        for(int i=0;i<Name.size();i++){
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
}




