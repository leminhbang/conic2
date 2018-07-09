package jp.co.conic.conic2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import jp.co.conic.conic2.activity.MainActivity;

public class IntroductionActivity extends AppCompatActivity {
    Thread splashTread;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        imageView = (ImageView)findViewById(R.id.imgSplashScreen);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        showAnimation();

        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 2500) {
                        sleep(100);
                        waited += 100;
                    }
                    Intent intent = new Intent(IntroductionActivity.this,
                            MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    finish();
                }
            }
        };
        splashTread.start();
    }

    private void showAnimation() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        LinearLayout ln = findViewById(R.id.lnl_splash_screen);
        anim.reset();
        ln.clearAnimation();
        ln.setAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        imageView.clearAnimation();
        imageView.setAnimation(anim);
    }
}
