package com.example.allclasscompletproject;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NewsMainActivity2 extends AppCompatActivity {
    TextView edText1,edText2;
    FloatingActionButton edFab;
    ImageView edImage;

    public static String TITLE="";
    public static String DESCRIPTION="";
    public static Bitmap MY_BITMAP=null;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_news_main2);
        edText1=findViewById(R.id.edText1);
        edText2=findViewById(R.id.edText2);
        edFab=findViewById(R.id.edFab);
        edImage=findViewById(R.id.edImage);


        edText1.setText(TITLE);
        edText2.setText(DESCRIPTION);


        if (MY_BITMAP!=null)edImage.setImageBitmap(MY_BITMAP);


        textToSpeech=new TextToSpeech(NewsMainActivity2.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {


            }
        });


        edFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String text=edText2.getText().toString();
               textToSpeech.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}