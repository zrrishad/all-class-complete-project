package com.example.allclasscompletproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

public class fdf_main_Activity3 extends AppCompatActivity {

    GridView edGrid;

    HashMap<String,String>hashMap;
    ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fdf_main3);

        edGrid=findViewById(R.id.edGrid);

        My_Adapter myAdapter=new My_Adapter();
        edGrid.setAdapter(myAdapter);

        creatTable();





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    private class My_Adapter extends BaseAdapter{

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {

            LayoutInflater layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View myView=    layoutInflater .inflate(R.layout.layout_pdf,viewGroup,false);



        HashMap<String,String>hashMap1=arrayList.get(position);

            CardView pdCard=myView.findViewById(R.id.pdCard);
            ImageView pdCover=myView.findViewById(R.id.pdCover);
            TextView pdCat=myView.findViewById(R.id.pdCat);


            String Image_url=hashMap1.get("Image_url");
            String Cat=hashMap1.get("Cat");


            Picasso.get().load(Image_url)
                    .placeholder(R.drawable.pic1)
                    .into(pdCover);

            pdCat.setText(Cat);



            pdCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (Cat.contains("Book 1")){
                        PdfActivity01.assetName="my_pdf01.pdf";
                        Intent myIntent=new Intent(fdf_main_Activity3.this,PdfActivity01.class);
                        startActivity(myIntent);




                    } else if (Cat.contains("Book 2")) {
                        PdfActivity01.assetName="my_pdf02.pdf";

                        Intent myIntent=new Intent(fdf_main_Activity3.this,PdfActivity01.class);
                        startActivity(myIntent);



                    } else if (Cat.contains("Book 3")) {
                        PdfActivity01.assetName="my_pdf03.pdf";
                                Intent myIntent=new Intent(fdf_main_Activity3.this,PdfActivity01.class);
                        startActivity(myIntent);


                    }


                }
            });









            return myView;
        }
    }



    private void creatTable(){

       hashMap=new HashMap<>();
       hashMap.put("Cat","Book 1");
       hashMap.put("Image_url","https://i.pinimg.com/736x/c5/5c/43/c55c433333665e754ae17393b9dba800.jpg");
       arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Cat","Book 2");
        hashMap.put("Image_url","https://img.freepik.com/free-vector/gradient-stock-market-concept_23-2149166910.jpg?size=626&ext=jpg");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Cat","Book 3");
        hashMap.put("Image_url","https://img.etimg.com/thumb/width-1600,height-900,imgsize-224178,resizemode-75,msid-90842014/markets/stocks/news/do-you-want-to-master-the-art-of-short-term-trading-here-are-3-ways.jpg");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Cat","Book 4");
        hashMap.put("Image_url","https://i.pinimg.com/736x/c5/5c/43/c55c433333665e754ae17393b9dba800.jpg");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Cat","Book 4");
        hashMap.put("Image_url","https://i.pinimg.com/736x/c5/5c/43/c55c433333665e754ae17393b9dba800.jpg");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Cat","Book 4");
        hashMap.put("Image_url","https://i.pinimg.com/736x/c5/5c/43/c55c433333665e754ae17393b9dba800.jpg");
        arrayList.add(hashMap);

    }

}