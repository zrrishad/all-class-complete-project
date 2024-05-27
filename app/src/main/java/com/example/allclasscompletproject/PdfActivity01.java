package com.example.allclasscompletproject;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PdfActivity01 extends AppCompatActivity {

    PDFView pdfView;

    FloatingActionButton pdFab;
    TextToSpeech textToSpeech;

    LottieAnimationView myLotti;

 public static    String assetName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pdf01);
        myLotti=findViewById(R.id.myLotti);

        pdFab=findViewById(R.id.pdFab);

        pdfView=findViewById(R.id.pdfView);

        pdfView.setVisibility(View.INVISIBLE);
        myLotti.setVisibility(View.VISIBLE);

        pdfView.fromAsset( assetName)
                .onLoad(new OnLoadCompleteListener() {
                    @Override
                    public void loadComplete(int nbPages) {
                        pdfView.setVisibility(View.VISIBLE);
                        myLotti.setVisibility(View.GONE);


                       /// Toast.makeText(PdfActivity01.this, "Loaded", Toast.LENGTH_LONG).show();
                    }
                })
                        .load();




        textToSpeech=new TextToSpeech(PdfActivity01.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        pdFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              
            }
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}