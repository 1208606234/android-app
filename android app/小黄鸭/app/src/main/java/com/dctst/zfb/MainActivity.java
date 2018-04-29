package com.dctst.zfb;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    MediaPlayer mediaPlayer;  //加载播放器

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

}
    public void PlayMusic1(View v){  //加上 view v才可以被框架调用
        mediaPlayer=MediaPlayer.create(this,R.raw.main_music);
        mediaPlayer.start();
    }
    public void PlayMusic2(View v){  //加上 view v才可以被框架调用
        mediaPlayer=MediaPlayer.create(this,R.raw.yiyi_music);
        mediaPlayer.start();
    }
    public void PlayMusic3(View v){  //加上 view v才可以被框架调用
        mediaPlayer=MediaPlayer.create(this,R.raw.gua);
        mediaPlayer.start();
    }
    public void PlayMusic4(View v){  //加上 view v才可以被框架调用
        mediaPlayer=MediaPlayer.create(this,R.raw.wxzf);
        mediaPlayer.start();
    }
    public void PlayMusic5(View v){  //加上 view v才可以被框架调用
        mediaPlayer=MediaPlayer.create(this,R.raw.stopphone);
        mediaPlayer.start();
    }
    public void PlayMusic6(View v){  //加上 view v才可以被框架调用
        mediaPlayer=MediaPlayer.create(this,R.raw.yiwan);
        mediaPlayer.start();
    }
    public void PlayMusic7(View v){  //加上 view v才可以被框架调用
        mediaPlayer=MediaPlayer.create(this,R.raw.shiwan);
        mediaPlayer.start();
    }
    public void PlayMusic8(View v){  //加上 view v才可以被框架调用
        mediaPlayer=MediaPlayer.create(this,R.raw.yiqianwan);
        mediaPlayer.start();
    }





}
