package com.event.gotrix.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.event.gotrix.R;
import com.event.gotrix.databinding.ActivityIntroBinding;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class IntroActivity extends BaseActivity {

private FirebaseAuth auth;
private EditText loginEmail, loginPassword;
private TextView signupRedirectText;
private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_intro);

        auth = FirebaseAuth.getInstance();
        loginEmail = findViewById(R.id.login_email);
        loginPassword = findViewById(R.id.login_password);
        loginButton = findViewById(R.id.login_button);
        signupRedirectText = findViewById(R.id.signup_RedirectText);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = loginEmail.getText().toString();
                String pass = loginPassword.getText().toString();
                if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    if(!pass.isEmpty()){
                        auth.signInWithEmailAndPassword(email, pass)
                                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                                    @Override
                                    public void onSuccess(AuthResult authResult) {
                                        Toast.makeText(IntroActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(
                                                IntroActivity.this, MainActivity.class));
                                        finish();

                                    }
                                })
                        .addOnFailureListener(e -> {
                        Toast.makeText(IntroActivity.this, "Login Failed: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    });
                }
            }
        }
    });


    signupRedirectText.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(IntroActivity.this, SignUpActivity.class));
            finish();
        }
    });
}
                    }




