package sg.edu.rp.c346.id22005564.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView txtview;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        txtview = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", 'a');
        txtview.setText("Character value received is: " + value);

    }
}