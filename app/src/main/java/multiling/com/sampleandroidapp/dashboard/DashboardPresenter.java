package multiling.com.sampleandroidapp.dashboard;

import multiling.com.sampleandroidapp.main.BasePresenter;

public class DashboardPresenter extends BasePresenter implements DashboardContract.IDashboardPresenter {

    private DashboardContract.IDashboardView dashboardView;

    @Override
    public void addPresenter(DashboardContract.IDashboardView dashboardView) {
        this.dashboardView = dashboardView;
    }

    @Override
    public void removePresenter() {
    }
}
