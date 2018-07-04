package multiling.com.sampleandroidapp.login;

import multiling.com.sampleandroidapp.main.BasePresenter;

public class LoginPresenter extends BasePresenter implements LoginContract.ILoginPresenter {

    private LoginContract.ILoginView loginView;

    @Override
    public void addPresenter(LoginContract.ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void removePresenter() {
        this.loginView = null;
    }

    @Override
    public void login() {
        if (loginView != null) {
            loginView.onLogin();
        }
    }
}
