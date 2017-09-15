package com.example.alik.projectpi;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class VideoActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener, TextToSpeech.OnInitListener{

    GridView gridView;
    GifImageView img;
    TextToSpeech tts;
    Locale bahasa = new Locale("id","ID");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        img = (GifImageView)findViewById(R.id.imgview_vid);
        img.setImageResource(R.drawable.apel_gif);
        gridView = (GridView)findViewById(R.id.activity_video_grid);
        gridView.setAdapter(new ImageAdapter3(this));
        gridView.setOnItemClickListener(this);
        tts = new TextToSpeech(this,this);
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS){
            int result = tts.setLanguage(bahasa);
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){
                Log.e("TTS", "This language is not supported");
            }else{

            }
        }else{
            Log.e("TTS", "initation failed");
        }
    }

    @Override
    public void onClick(View v) {

    }

    public VideoActivity() {
        super();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()){
            case R.id.activity_video_grid:
                switch (position){
                    case 0:
                        img.setImageResource(R.drawable.apel_gif);
                        tts.speak("contoh kata dari huruf A adalah apel",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 1:
                        img.setImageResource(R.drawable.buku_gif);
                        tts.speak("contoh kata dari huruf B adalah buku",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 2:
                        img.setImageResource(R.drawable.cicak_gif);
                        tts.speak("contoh kata dari huruf C adalah cicak",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 3:
                        img.setImageResource(R.drawable.daun_gif);
                        tts.speak("contoh kata dari huruf D adalah daun",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 4:
                        img.setImageResource(R.drawable.ember_gif);
                        tts.speak("contoh kata dari huruf E adalah ember",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 5:
                        img.setImageResource(R.drawable.foto_gif);
                        tts.speak("contoh kata dari huruf F adalah foto",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 6:
                        img.setImageResource(R.drawable.gajah_gif);
                        tts.speak("contoh kata dari huruf G adalah gajah",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 7:
                        img.setImageResource(R.drawable.hujan_gif);
                        tts.speak("contoh kata dari huruf H adalah hujan",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 8:
                        img.setImageResource(R.drawable.ikan_gif);
                        tts.speak("contoh kata dari huruf I adalah ikan",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 9:
                        img.setImageResource(R.drawable.jari_gif);
                        tts.speak("contoh kata dari huruf J adalah jari",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 10:
                        img.setImageResource(R.drawable.kuda_gif);
                        tts.speak("contoh kata dari huruf K adalah kuda",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 11:
                        img.setImageResource(R.drawable.lidi_gif);
                        tts.speak("contoh kata dari huruf L adalah lidi",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 12:
                        img.setImageResource(R.drawable.mata_gif);
                        tts.speak("contoh kata dari huruf M adalah mata",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 13:
                        img.setImageResource(R.drawable.nanas_gif);
                        tts.speak("contoh kata dari huruf N adalah nanas",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 14:
                        img.setImageResource(R.drawable.obat_gif);
                        tts.speak("contoh kata dari huruf O adalah obat",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 15:
                        img.setImageResource(R.drawable.panda_gif);
                        tts.speak("contoh kata dari huruf P adalah panda",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 16:
                        img.setImageResource(R.drawable.roda_gif);
                        tts.speak("contoh kata dari huruf R adalah roda",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 17:
                        img.setImageResource(R.drawable.sapi_gif);
                        tts.speak("sontoh kata dari huruf S adalah sapi",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 18:
                        img.setImageResource(R.drawable.tikus_gif);
                        tts.speak("contoh kata dari huruf T adalah tikus",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 19:
                        img.setImageResource(R.drawable.ular_gif);
                        tts.speak("contoh kata dari huruf U adalah ular",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 20:
                        img.setImageResource(R.drawable.vas_gif);
                        tts.speak("contoh kata dari huruf V adalah vas",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 21:
                        img.setImageResource(R.drawable.wol_gif);
                        tts.speak("contoh kata dari huruf W adalah wol",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 22:
                        img.setImageResource(R.drawable.yoyo_gif);
                        tts.speak("contoh kata dari huruf Y adalah yoyo",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 23:
                        img.setImageResource(R.drawable.zebra_gif);
                        tts.speak("contoh kata dari huruf Z adalah zebra",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                }
        }

    }
}
