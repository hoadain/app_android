package com.example.appweb;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        VideoView videoView = findViewById(R.id.videoView);
        Button btnPlayAudio = findViewById(R.id.btnPlayAudio);

        // Phát video
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
        videoView.setVideoURI(Uri.parse(videoPath));
        videoView.start();

        // Phát âm thanh
        btnPlayAudio.setOnClickListener(view -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sound);
            mediaPlayer.start();
        });
    }
}