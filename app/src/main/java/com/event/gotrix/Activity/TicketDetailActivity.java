package com.event.gotrix.Activity;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.event.gotrix.Model.Flight;
import com.event.gotrix.R;
import com.event.gotrix.databinding.ActivityTicketDetailBinding;

public class TicketDetailActivity extends BaseActivity {
private ActivityTicketDetailBinding binding;
private Flight flight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding=ActivityTicketDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       getIntentExtra();
       setVariable();

    }

    private void setVariable() {
        binding.backBtn.setOnClickListener(v -> finish());
        binding.fromTxt.setText(flight.getFromShort());
        binding.fromSmallTxt.setText(flight.getFrom());
        binding.toTxt.setText(flight.getTo());
        binding.toShortTxt.setText(flight.getToShort());
        binding.toSmallTxt.setText(flight.getTo());
        binding.dateTxt.setText(flight.getDate());
        binding.timeTxt.setText(flight.getTime());
        binding.arrivalTxt.setText(flight.getArriveTime());
        binding.classTxt.setText(flight.getClassSeat());
        binding.priceTxt.setText("₹"+flight.getPrice());
        binding.airlines.setText(flight.getAirlineName());
        binding.seatsTxt.setText(flight.getPassenger());

        Glide.with(TicketDetailActivity.this)
                .load(flight.getAirlineLogo())
                .into(binding.logo);
    }

    private void getIntentExtra() {
        flight= (Flight) getIntent().getSerializableExtra("flight");
    }
}