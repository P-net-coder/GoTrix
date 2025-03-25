package com.event.gotrix.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.event.gotrix.R;
import com.event.gotrix.databinding.ActivityIntroBinding;
import com.event.gotrix.databinding.ActivitySearchBinding;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class SearchActivity extends BaseActivity {
private ActivitySearchBinding binding;
private String from,to,date;
private int numPassenger;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding=ActivitySearchBinding.inflate(getLayoutInflater())
       setContentView(binding.getRoot());
       getIntentExtra();
       initList();

    }

    private void initList() {
        DatabaseReference myRef= database.getReference("Flights");
        ArrayList<>
    }

    private void getIntentExtra() {
        from=getIntent().getStringExtra("from");
        to=getIntent().getStringExtra("to");
        date=getIntent().getStringExtra("date");
    }
}