package com.event.gotrix.Activity;

import android.content.Intent;
import android.os.Bundle;

import com.event.gotrix.databinding.ActivityIntroBinding;

public class IntroActivity extends BaseActivity {
private ActivityIntroBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    binding.button.setOnClickListener(v ->
        startActivity(new Intent(
                IntroActivity.this, MainActivity.class)));
    }
}