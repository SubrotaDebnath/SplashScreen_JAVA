package subrota.shuvro.splashscreenjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    private final int DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /*new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Splash.this.startActivity(new Intent(Splash.this, MainActivity.class));
                Splash.this.finish();

            }
        }, DURATION);*/

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this, MainActivity.class));
                finish();
            }
        }, 1000);
    }
}