package com.example.upiqrhandoff;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String UPI =
        "upi://pay?pa=vyom101292@icici&pn=VISHNU%20SHARMA&cu=INR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView payload = findViewById(R.id.payload);
        payload.setText(UPI);

        Button phonePe = findViewById(R.id.phonepe);
        Button generic = findViewById(R.id.generic);

        phonePe.setOnClickListener(v -> launch(true));
        generic.setOnClickListener(v -> launch(false));
    }

    private void launch(boolean phonePeOnly) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(UPI));
        if (phonePeOnly) {
            intent.setPackage("com.phonepe.app");
        }
        try {
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this,
                phonePeOnly ? "PhonePe intent not available" : "No UPI app can handle this link",
                Toast.LENGTH_LONG).show();
        }
    }
}
