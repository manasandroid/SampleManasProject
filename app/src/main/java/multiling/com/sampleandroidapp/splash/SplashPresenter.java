package multiling.com.sampleandroidapp.splash;


import android.os.Handler;

import multiling.com.sampleandroidapp.main.BasePresenter;

public class SplashPresenter extends BasePresenter implements SplashContract.ISplashPresenter {

    private static int SPLASH_TIME_OUT = 3000;

    private SplashContract.ISplashView splashView;

    @Override
    public void addPresenter(SplashContract.ISplashView splashView) {
        this.splashView = splashView;
    }

    @Override
    public void removePresenter() {
        this.splashView = null;
    }

    @Override
    public void init() {
        new Handler().postDelayed(() -> {
            if (splashView != null) {
                splashView.onInit();
            }
        }, SPLASH_TIME_OUT);
    }

    @Override
    public void splashTransitionComplete() {
        if (splashView != null) {
            splashView.onSplashComplete();
        }
    }

}
