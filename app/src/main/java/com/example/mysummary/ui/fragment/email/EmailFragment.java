package com.example.mysummary.ui.fragment.email;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mysummary.databinding.FragmentEmailBinding;


public class EmailFragment extends Fragment {
    FragmentEmailBinding binding;

    public EmailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEmailBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "أرسلها عن طريق ال Email", Toast.LENGTH_SHORT).show();
                sendMail();
            }
        });
    }

    private void sendMail() {
        String recipientList = binding.editTextTo.getText().toString();
        String[] recipients = recipientList.split(",");
        String subject = binding.editTextSubject.getText().toString();
        String message = binding.editTextMessage.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.setType("message/");
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }
}