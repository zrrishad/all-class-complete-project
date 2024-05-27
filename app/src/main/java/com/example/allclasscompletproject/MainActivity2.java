package com.example.allclasscompletproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    CardView PdfId,NewsId,audioId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        PdfId=findViewById(R.id.PdfId);
        NewsId=findViewById(R.id.NewsId);
        audioId=findViewById(R.id.audioId);



     PdfId.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent myIntent=new Intent(MainActivity2.this,fdf_main_Activity3.class);
             startActivity(myIntent);
         }
     });

        NewsId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(MainActivity2.this,NewsMainActivity.class);
                startActivity(myIntent);

            }
        });



        audioId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(MainActivity2.this,AudioActivity.class);
                startActivity(myIntent);

            }
        });




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}