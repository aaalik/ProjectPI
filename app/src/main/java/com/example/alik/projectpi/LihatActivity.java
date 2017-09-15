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

public class LihatActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener, TextToSpeech.OnInitListener{

    GridView gridView;
    GifImageView img;
    MediaPlayer mediaPlayer;
    TextToSpeech tts;
    Locale bahasa = new Locale("id","ID");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat);

        img = (GifImageView)findViewById(R.id.imgview_lht);
        img.setImageResource(R.drawable.a_gif);
        gridView = (GridView)findViewById(R.id.activity_lihat_grid);
        gridView.setAdapter(new ImageAdapter2(this));
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

    public LihatActivity() {
        super();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()){
            case R.id.activity_lihat_grid:
                switch (position){
                    case 0:
                        img.setImageResource(R.drawable.a_gif);
                        tts.speak("ini adalah huruf A kecil. melengkung ke kanan, lurus ke bawah, tarik ke atas, buat lengkungan lagi.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 1:
                        img.setImageResource(R.drawable.b_gif);
                        tts.speak("ini adalah huruf B kecil. garis lurus ke bawah lalu lingkaran ke dalam.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 2:
                        img.setImageResource(R.drawable.c_gif);
                        tts.speak("ini adalah huruf C kecil. melengkung seperti setengah lingkaran.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 3:
                        img.setImageResource(R.drawable.d_gif);
                        tts.speak("ini adalah huruf D kecil. garis lurus ke bawah lalu lingkaran ke luar",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 4:
                        img.setImageResource(R.drawable.e_gif);
                        tts.speak("ini adalah huruf E kecil. garis datar ditengah lalu buat setengah lingkaran seperti huruf C",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 5:
                        img.setImageResource(R.drawable.f_gif);
                        tts.speak("ini adalah huruf F kecil. melengkung ke kiri lalu tarik garis ke bawah, tarik garis datar",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 6:
                        img.setImageResource(R.drawable.g_gif);
                        tts.speak("ini adalah huruf G hecil. buat lingkaran, tarik garis ke bawah lalu melengkung",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 7:
                        img.setImageResource(R.drawable.h_gif);
                        tts.speak("ini adalah hurf H kecil. tarik garis lurus ke bawah, melengkung dari atas, garis ke bawah",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 8:
                        img.setImageResource(R.drawable.i_gif);
                        tts.speak("ini adalah I kecil. garis lurus ke bawah, tambahkan titik",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 9:
                        img.setImageResource(R.drawable.j_gif);
                        tts.speak("ini adalah J kecil. garis lurus ke bawah lalu melengkung, tambahkan titik",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 10:
                        img.setImageResource(R.drawable.k_gif);
                        tts.speak("ini adalah huruf K kecil. garis lurus ke bawah, garis miring, garis miring lagi",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 11:
                        img.setImageResource(R.drawable.l_kapgif);
                        tts.speak("ini adalah huruf L kecil. garis lurus dari atas ke bawah",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 12:
                        img.setImageResource(R.drawable.m_gif);
                        tts.speak("ini adalah huruf M kecil. garis lrus ke bawah, melengkung, garis ke bawah, melengkung lagi, garis ke bawah lagi",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 13:
                        img.setImageResource(R.drawable.n_gif);
                        tts.speak("ini adalah huruf N kecil. garis lurus ke bawah, melengkung, garis ke bawah lagi",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 14:
                        img.setImageResource(R.drawable.o_gif);
                        tts.speak("ini adalah huruf O kecil. buat lingkaran kecil",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 15:
                        img.setImageResource(R.drawable.p_gif);
                        tts.speak("ini adalah huruf P kecil. tarik garis ke bawah lalu buat lingkaran di atas ke arah kanan",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 16:
                        img.setImageResource(R.drawable.q_gif);
                        tts.speak("ini adalah huruf Q kecil. tarik garis ke bawah lalu buat lingkaran di atas ke arah kiri",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 17:
                        img.setImageResource(R.drawable.r_gif);
                        tts.speak("ini adalah huruf R kecil. tarik garis ke bawah lalu melengkung di atas",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 18:
                        img.setImageResource(R.drawable.s_gif);
                        tts.speak("ini adalah huruf S kecil. melengkung dari atas kemudian melengkung di bawah",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 19:
                        img.setImageResource(R.drawable.t_gif);
                        tts.speak("ini adalah huruf T kecil. tarik garis dari atas, melengkung di bawah, garis datar di tengah",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 20:
                        img.setImageResource(R.drawable.u_gif);
                        tts.speak("ini adalah huruf U kecil. garis ke bawah, melengkung, garis ke atas",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 21:
                        img.setImageResource(R.drawable.v_gif);
                        tts.speak("ini adalah huruf V kecil. garis meirig dari atas, garis miring lagi",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 22:
                        img.setImageResource(R.drawable.w_gif);
                        tts.speak("ini adalah huruf W kecil. garis ke bawah, melengkung, garis ke atas, melengkung di bawah, garis ke atas",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 23:
                        img.setImageResource(R.drawable.x_gif);
                        tts.speak("ini adalah huruf X kecil. garis miring, garis miring lagi, seperti tanda silang",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 24:
                        img.setImageResource(R.drawable.y_gif);
                        tts.speak("ini adalah huruf Y kecil. garis ke bawah, melengkung, garis ke bawah, melengkung di bawah",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 25:
                        img.setImageResource(R.drawable.z_gif);
                        tts.speak("ini adalah huruf Z kecil. garis datar di atas, garis miring, garis datar di bawah",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                }
        }

    }
}
