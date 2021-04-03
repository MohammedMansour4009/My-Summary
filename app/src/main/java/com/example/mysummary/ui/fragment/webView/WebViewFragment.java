package com.example.mysummary.ui.fragment.webView;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.mysummary.databinding.FragmentWebViewBinding;


public class WebViewFragment extends Fragment {
    private FragmentWebViewBinding binding;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        iniWebView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentWebViewBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    private void iniWebView() {
        binding.WV.getSettings().setJavaScriptEnabled(true);
        binding.WV.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                //when page Load
                binding.progressBar.setVisibility(view.GONE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                //when page finsed
                binding.progressBar.setVisibility(view.GONE);

            }
        });
        binding.WV.loadUrl(getURL());
        binding.WV.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    if (keyCode == KeyEvent.KEYCODE_BACK) {
                        if (binding.WV != null) {
                            if (binding.WV.canGoBack()) {

                                binding.WV.goBack();
                            } else
                                getActivity().onBackPressed();

                        }
                    }

                }
                return true;
            }
        });


    }

    private String getURL() {

        return WebViewFragmentArgs.fromBundle(getArguments()).getURL();
    }

}
