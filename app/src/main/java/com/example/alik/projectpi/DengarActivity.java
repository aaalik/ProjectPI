package com.example.alik.projectpi;

import android.app.Activity;
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

public class DengarActivity extends Activity implements View.OnClickListener, TextToSpeech.OnInitListener,AdapterView.OnItemClickListener{
    GridView gridView;
    GifImageView img;
    TextToSpeech tts;
    Locale bahasa = new Locale("id","ID");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dengar);

        img = (GifImageView)findViewById(R.id.imgview_dgr);
        img.setImageResource(R.drawable.a_kapgif);
        gridView = (GridView)findViewById(R.id.activity_dengar_grid);
        gridView.setAdapter(new ImageAdapter(this));
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

    public DengarActivity() {
        super();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()){
            case R.id.activity_dengar_grid:
                switch (position){
                    case 0:
                        img.setImageResource(R.drawable.a_kapgif);
                        tts.speak("Ini adalah huruf A besar. Tarik garis meiring. Tarik lagi garis miring. Lalu garis lurus.",TextToSpeech.QUEUE_FLUSH, null); //variable text(input dri user)
                        break;
                    case 1:
                        img.setImageResource(R.drawable.b_kapgif);
                        tts.speak("Ini adalah huruf B besar. Tarik garis lurus kemudian melengkung di atas kemudian melengkung di bawah.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 2:
                        img.setImageResource(R.drawable.c_kapgif);
                        tts.speak("Ini adalah huruf C besar. Cukup buat garis melengkung.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 3:
                        img.setImageResource(R.drawable.d_kapgif);
                        tts.speak("Ini adalah huruf D besar. Buat garis lurus lalu buat garis melengkung.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 4:
                        img.setImageResource(R.drawable.e_kapgif);
                        tts.speak("Ini adalah huruf E besar. Buat garis lurus ke bawah lalu buat garis datar di atas di tengah dan di bawah.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 5:
                        img.setImageResource(R.drawable.f_kapgif);
                        tts.speak("Ini adalah huruf F besar. Tarik garis lurus ke bawah kemudian dua garis datar di atas dan di tengah.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 6:
                        img.setImageResource(R.drawable.g_kapgif);
                        tts.speak("Ini adalah huruf G besar. buat garis melengkung kemudian tambahkan garis datar.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 7:
                        img.setImageResource(R.drawable.h_kapgif);
                        tts.speak("ini adalah huruf H besar. Buat dua garis lurus ke bawah kemudian sambungkan dengan garis datar di tengah.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 8:
                        img.setImageResource(R.drawable.i_kapgif);
                        tts.speak("ini adalah huruf I besar. Hanya buat satu garis lurus ke bawah.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 9:
                        img.setImageResource(R.drawable.j_kapgif);
                        tts.speak("ini adalah J besar. tarik garis dari atas lalu melengkung ke kiri.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 10:
                        img.setImageResource(R.drawable.k_kapgif);
                        tts.speak("ini adalah huruf K besar. tarik garis lurus kemudian buat garis miring ke bawah dan ke bawah.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 11:
                        img.setImageResource(R.drawable.l_kapgif);
                        tts.speak("ini adalah huruf L besar. tarik garis lurus ke bawah lalu garis datar di paling bawah.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 12:
                        img.setImageResource(R.drawable.m_kapgif);
                        tts.speak("ini adalah huruf M besar. tarik garis ke bawah lalu sambung dengan dua garis miring lalu buat lagi garis lurus ke bawah",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 13:
                        img.setImageResource(R.drawable.n_kapgif);
                        tts.speak("ini adalah huruf N besar. tarik garis lurus ke bawah lalu garis miring dari atas dan garis lurus ke bawah lagi",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 14:
                        img.setImageResource(R.drawable.o_kapgif);
                        tts.speak("ini adalah huruf O besar. buat suatu lingkaran.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 15:
                        img.setImageResource(R.drawable.p_kapgif);
                        tts.speak("ini adalah huruf P besar. tarik garis lurus ke bawah kemudian buat garis melengkung di atas.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 16:
                        img.setImageResource(R.drawable.q_kapgif);
                        tts.speak("ini adalah huruf Q besar. buat lingkaran kemudian tambahkan garis di bawah kanan",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 17:
                        img.setImageResource(R.drawable.r_kapgif);
                        tts.speak("ini adalah huruf R besar. tarik garis lurus ke bawah lalu buat melengkung di atas dan garis miring ke bawah.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 18:
                        img.setImageResource(R.drawable.s_kapgif);
                        tts.speak("ini adalah huruf S besar. garis melengkung dari atas kiri kemudian melengkung lagi ke kanan.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 19:
                        img.setImageResource(R.drawable.t_kapgif);
                        tts.speak("ini adalah huruf T besar. buat garis datar di atas lalu tarik garis lurus ke bawah dari tengah.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 20:
                        img.setImageResource(R.drawable.u_kapgif);
                        tts.speak("ini adalah huruf U besar. tarik garis lurus ke bawah kemudian melengkung dan tarik garis ke atas.",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 21:
                        img.setImageResource(R.drawable.v_kapgif);
                        tts.speak("ini adalah huruf V besar. tarik garis miring ke bawah lalu ke atas",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 22:
                        img.setImageResource(R.drawable.w_kapgif);
                        tts.speak("ini adalah huruf W besar. tarik garis miring ke bawah, ke atas, ke bawah, lalu ke atas",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 23:
                        img.setImageResource(R.drawable.x_kapgif);
                        tts.speak("ini adalah huruf X besar. tarik garis meiring ke bawah lalu buat lagi garis miring",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 24:
                        img.setImageResource(R.drawable.y_kapgif);
                        tts.speak("ini adalah huruf Y besar. tarik garis miring kemudian garis miring lagi",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 25:
                        img.setImageResource(R.drawable.z_kapgif);
                        tts.speak("ini adalah huruf Z besar. garis datar di atas kemudian garis miring lalu garis datar lagi",TextToSpeech.QUEUE_FLUSH, null);
                        break;
                }
        }

    }
}
