package com.example.jniactivity;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class backgroundservice extends Service {

    private MediaPlayer player;



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player= MediaPlayer.create(this,R.raw.sunshine);
        player.setLooping(true);
        player.start();
        return START_STICKY;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
