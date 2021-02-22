package com.example.mysummary.ui.fragment.chapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.example.mysummary.R;
import com.example.mysummary.databinding.FragmentChaptersBinding;
public class chaptersFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private FragmentChaptersBinding binding;
    private String mParam1;
    private String mParam2;
    public chaptersFragment() {
    }
    public static chaptersFragment newInstance(String param1, String param2) {
        chaptersFragment fragment = new chaptersFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentChaptersBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();


        return view;
    }
}