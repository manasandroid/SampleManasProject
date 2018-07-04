package multiling.com.sampleandroidapp.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.Objects;

import multiling.com.sampleandroidapp.R;
import multiling.com.sampleandroidapp.login.LoginActivity;
import multiling.com.sampleandroidapp.main.BaseActivity;

public class SplashActivity extends BaseActivity implements SplashContract.ISplashView {

    private Animation animFadeOut;
    private SplashContract.ISplashPresenter splashPresenter;
    private TextView splashTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Objects.requireNonNull(getSupportActionBar()).hide();
        splashTxt = findViewById(R.id.splashTxt);
        splashPresenter = new SplashPresenter();
        // Fading Animation
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.aim);
        animFadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                splashPresenter.splashTransitionComplete();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        splashPresenter.addPresenter(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        splashPresenter.removePresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
        splashPresenter.init();
    }

    @Override
    public void onInit() {
        splashTxt.setVisibility(View.VISIBLE);
        splashTxt.startAnimation(animFadeOut);
    }

    @Override
    public void onSplashComplete() {
        Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
