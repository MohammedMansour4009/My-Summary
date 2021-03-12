package com.example.mysummary.model.home;

import android.content.Context;
import com.example.mysummary.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;


public  class UrlList implements Serializable {
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





}
