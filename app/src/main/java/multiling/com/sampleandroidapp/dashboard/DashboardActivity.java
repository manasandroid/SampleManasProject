package multiling.com.sampleandroidapp.dashboard;

import android.os.Bundle;

import multiling.com.sampleandroidapp.R;
import multiling.com.sampleandroidapp.main.BaseActivity;

public class DashboardActivity extends BaseActivity implements DashboardContract.IDashboardView {

    private DashboardContract.IDashboardPresenter dashboardPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        dashboardPresenter = new DashboardPresenter();
    }

    @Override
    protected void onStart() {
        super.onStart();
        dashboardPresenter.addPresenter(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        dashboardPresenter.removePresenter();
    }
}
