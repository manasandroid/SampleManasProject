package multiling.com.sampleandroidapp.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import multiling.com.sampleandroidapp.R;
import multiling.com.sampleandroidapp.dashboard.DashboardActivity;
import multiling.com.sampleandroidapp.main.BaseActivity;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity implements LoginContract.ILoginView {

    // UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private LoginContract.ILoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginPresenter = new LoginPresenter();
        // Set up the login form.
        mEmailView = findViewById(R.id.email);
        mPasswordView = findViewById(R.id.password);
        Button mEmailSignInButton = findViewById(R.id.email_sign_in_button);
        mEmailSignInButton.setOnClickListener((View view) -> {
            if (mEmailView.getText().toString().equalsIgnoreCase("")) {
                mEmailView.setError("Please enter Email-ID");
            } else if (mPasswordView.getText().toString().equalsIgnoreCase("")) {
                mPasswordView.setError("Please enter Password");
            } else {
                loginPresenter.login();
            }

        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        loginPresenter.addPresenter(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        loginPresenter.removePresenter();
    }

    @Override
    public void onLogin() {
        Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
        startActivity(intent);
        finish();
    }
}

