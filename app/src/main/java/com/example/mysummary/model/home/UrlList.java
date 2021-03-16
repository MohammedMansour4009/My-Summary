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


public  class UrlList implements Serializable, Collection<Url> {

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


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(@Nullable Object o) {
        return false;
    }

    @NonNull
    @Override
    public Iterator<Url> iterator() {
        return null;
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NonNull
    @Override
    public <T> T[] toArray(@NonNull T[] a) {
        return null;
    }

    @Override
    public boolean add(Url url) {
        return false;
    }

    @Override
    public boolean remove(@Nullable Object o) {
        return false;
    }

    @Override
    public boolean containsAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(@NonNull Collection<? extends Url> c) {
        return false;
    }

    @Override
    public boolean removeAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
