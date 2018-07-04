package multiling.com.sampleandroidapp.dashboard;

public class DashboardContract {
    interface IDashboardView {

    }

    interface IDashboardPresenter {
        void addPresenter(IDashboardView dashboardView);

        void removePresenter();
    }
}
