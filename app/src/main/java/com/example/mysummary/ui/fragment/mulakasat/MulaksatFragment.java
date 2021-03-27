package com.example.mysummary.ui.fragment.mulakasat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.mysummary.R;
import com.example.mysummary.databinding.FragmentMula5satBinding;
import com.example.mysummary.model.home.Colleges;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MulaksatFragment extends Fragment {

    FragmentMula5satBinding binding;
    private List<Colleges> collegesList;
    private CollegesAdapter collegesAdapter;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getRemoteColleges();
        click();

        initRecyclerViewColleges();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMula5satBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    private void initRecyclerViewColleges() {
        collegesAdapter = new CollegesAdapter(collegesList);
        binding.rvCollege.setAdapter(collegesAdapter);
    }

    private void getRemoteColleges() {
        List<String> listName = new ArrayList<>();
        collegesList = new ArrayList<>();

        listName.addAll(Arrays.asList(getResources().getStringArray(R.array.colleges)));

        int[] icon = {
                R.drawable.ic_doctors,
                R.drawable.ic_eng,
                R.drawable.ic_nurse,
                R.drawable.ic_earth,
                R.drawable.ic_baby,
                R.drawable.ic_drags,
                R.drawable.ic_earth,
                R.drawable.ic_dollor,
                R.drawable.ic_poetry,
                R.drawable.ic_sport,
                R.drawable.ic_it,
                R.drawable.ic_mountain,
                R.drawable.ic_baby,
                R.drawable.ic_book,
                R.drawable.ic_flask,
                R.drawable.ic_flask,
        };



        Uri uri[]=new Uri[list.size()];
        for(int i=0;i<icon.length;i++) {
            uri[i] = Uri.parse(String.valueOf(icon[i]));
                R.drawable.ic_flask,
                R.drawable.ic_earth};

        for (int i = 0; i < 14; i++) {
            collegesList.add(new Colleges(icon[i], listName.get(i)));

        }

    }
   private void click(){
        collegesAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=collegesAdapter.getItemCount();
              switch(position){
                    case 1:
                        Uri uri=Uri.parse("https://etihadlibrary.azurewebsites.net/counting_gpa.aspx");
                        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                        startActivity(intent);
                        break;
                  case 2:
                      Uri uri1=Uri.parse("https://reg1.hu.edu.jo/");
                      Intent intent1=new Intent(Intent.ACTION_VIEW,uri1);
                      startActivity(intent1);
                      break;
                  case 3:
                      Uri uri2=Uri.parse("http://www.mlms.hu.edu.jo/");
                      Intent intent2=new Intent(Intent.ACTION_VIEW,uri2);
                      startActivity(intent2);
                      break;




                }
            }
        });
    }
}