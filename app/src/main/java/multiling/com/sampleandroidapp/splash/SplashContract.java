package multiling.com.sampleandroidapp.splash;

class SplashContract {

    public interface ISplashView {
        void onInit();

        void onSplashComplete();
    }

    public interface ISplashPresenter {
        void addPresenter(ISplashView splashView);

        void removePresenter();

        void init();

        void splashTransitionComplete();
    }
}
