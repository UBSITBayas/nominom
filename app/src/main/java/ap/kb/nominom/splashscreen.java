package ap.kb.nominom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splashscreen extends AppCompatActivity {

    Animation zoom_out, zoom_in;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        getSupportActionBar().hide();

        zoom_in = AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        zoom_in = AnimationUtils.loadAnimation(this,R.anim.zoom_out);

        image = findViewById(R.id.logo);

        image.setAnimation(zoom_in);
        image.setAnimation(zoom_out);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent intent = new Intent(splashscreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}