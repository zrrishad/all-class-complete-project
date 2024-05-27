package com.example.allclasscompletproject;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AudioActivity extends AppCompatActivity {
    ImageView play1,play2,play3,play4;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_audio);
        play1=findViewById(R.id.play1);
        play2=findViewById(R.id.play2);
        play3=findViewById(R.id.play3);
        play4=findViewById(R.id.play4);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

if (play1.getTag()!=null&&play1.getTag().toString().contains("NOT_PLAYING")){


    if (mediaPlayer!=null)mediaPlayer.release();
    mediaPlayer=MediaPlayer.create(AudioActivity.this,R.raw.music_1);
    mediaPlayer.start();
    play1.setImageResource(R.drawable.stop);
    play1.setTag("PLAYING_NOW");
    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            play1.setImageResource(R.drawable.play_icon);
            play1.setTag("NOT_PLAYING");
        }
    });

}else {
    if (mediaPlayer!=null)mediaPlayer.release();
    play1.setImageResource(R.drawable.play_icon);
    play1.setTag("NOT_PLAYING");
}
            }
        });



        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (play2.getTag()!=null&&play2.getTag().toString().contains("NOT_PLAYING")){


                    if (mediaPlayer!=null)mediaPlayer.release();
                    mediaPlayer=MediaPlayer.create(AudioActivity.this,R.raw.music_1);
                    mediaPlayer.start();
                    play2.setImageResource(R.drawable.stop);
                    play2.setTag("PLAYING_NOW");
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            play2.setImageResource(R.drawable.play_icon);
                            play2.setTag("NOT_PLAYING");
                        }
                    });



                }else {
                    if (mediaPlayer!=null)mediaPlayer.release();
                    play2.setImageResource(R.drawable.play_icon);
                    play2.setTag("NOT_PLAYING");
                }







            }
        });



play3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (play3.getTag()!=null&&play3.getTag().toString().contains("NOT_PLAYING")){


            if (mediaPlayer!=null)mediaPlayer.release();
            mediaPlayer=MediaPlayer.create(AudioActivity.this,R.raw.music_1);
            mediaPlayer.start();
            play3.setImageResource(R.drawable.stop);
            play3.setTag("PLAYING_NOW");
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    play3.setImageResource(R.drawable.play_icon);
                    play3.setTag("NOT_PLAYING");
                }
            });



        }else {
            if (mediaPlayer!=null)mediaPlayer.release();
            play3.setImageResource(R.drawable.play_icon);
            play3.setTag("NOT_PLAYING");
        }



    }
});

play4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        if (play4.getTag()!=null&&play4.getTag().toString().contains("NOT_PLAYING")){


            if (mediaPlayer!=null)mediaPlayer.release();
            mediaPlayer=MediaPlayer.create(AudioActivity.this,R.raw.music_1);
            mediaPlayer.start();
            play4.setImageResource(R.drawable.stop);
            play4.setTag("PLAYING_NOW");
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    play4.setImageResource(R.drawable.play_icon);
                    play4.setTag("NOT_PLAYING ");
                }
            });



        }else {
            if (mediaPlayer!=null)mediaPlayer.release();
            play4.setImageResource(R.drawable.play_icon);
            play4.setTag("NOT_PLAYING");
        }




    }
});



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}