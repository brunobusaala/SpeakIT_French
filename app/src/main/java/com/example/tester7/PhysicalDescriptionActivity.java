package com.example.tester7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;


public class PhysicalDescriptionActivity extends AppCompatActivity {

    ImageButton button58;
    ImageButton button59;
    ImageButton button60;
    ImageButton button61;
    ImageButton button62;
    ImageButton button63;
    ImageButton button64;
    ImageButton button65;
    ImageButton button66;
    ImageButton button67;
    ImageButton button68;
    TextView textView146;
    TextView textView148;
    TextView textView150;
    TextView textView152;
    TextView textView154;
    TextView textView156;
    TextView textView158;
    TextView textView160;
    TextView textView162;
    TextView textView164;
    TextView textView167;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physical_description_activity);

        textView146 = findViewById(R.id.textView146);
        textView148 = findViewById(R.id.textView148);
        textView150 = findViewById(R.id.textView150);
        textView152 = findViewById(R.id.textView152);
        textView154 = findViewById(R.id.textView154);
        textView156 = findViewById(R.id.textView156);
        textView158 = findViewById(R.id.textView158);
        textView160 = findViewById(R.id.textView160);
        textView162 = findViewById(R.id.textView162);
        textView164 = findViewById(R.id.textView164);
        textView167 = findViewById(R.id.textView167);
        button58 = findViewById(R.id.button58);
        button59 = findViewById(R.id.button59);
        button60 = findViewById(R.id.button60);
        button61 = findViewById(R.id.button61);
        button62 = findViewById(R.id.button62);
        button63 = findViewById(R.id.button63);
        button64 = findViewById(R.id.button64);
        button65 = findViewById(R.id.button65);
        button66 = findViewById(R.id.button66);
        button67 = findViewById(R.id.button67);
        button68 = findViewById(R.id.button68);




        // create an object textToSpeech and adding features into it
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

                // if No error is found then only it will run
                if(i!=TextToSpeech.ERROR){
                    // To Choose language of speech
                    textToSpeech.setLanguage(Locale.FRANCE);
                }
            }
        });

        // Adding OnClickListener
        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = textView146.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                textToSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        // Adding OnClickListener
        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = textView148.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                textToSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        // Adding OnClickListener
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = textView150.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                textToSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        // Adding OnClickListener
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = textView152.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                textToSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        // Adding OnClickListener
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = textView154.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                textToSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

            }
        });
        // Adding OnClickListener
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = textView156.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                textToSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        // Adding OnClickListener
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = textView158.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                textToSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        // Adding OnClickListener
        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = textView160.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                textToSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        // Adding OnClickListener
        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = textView162.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                textToSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        // Adding OnClickListener
        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = textView164.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                textToSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        // Adding OnClickListener
        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = textView167.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                textToSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    // this event will enable the back
    // function to the button on press
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
