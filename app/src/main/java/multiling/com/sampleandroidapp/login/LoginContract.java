package multiling.com.sampleandroidapp.login;

class LoginContract {
    interface ILoginView {
        void onLogin();
    }

    interface ILoginPresenter {
        void addPresenter(ILoginView loginView);

        void removePresenter();

        void login();
    }
}
