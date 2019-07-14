package top.easelink.lcg.ui.main.about.viewmodel;

import top.easelink.framework.base.BaseViewModel;
import top.easelink.framework.utils.rx.SchedulerProvider;
import top.easelink.lcg.ui.main.about.view.AboutNavigator;

public class AboutViewModel extends BaseViewModel<AboutNavigator> {

    public AboutViewModel(SchedulerProvider schedulerProvider) {
        super(schedulerProvider);
    }

    public void onNavBackClick() {
        getNavigator().goBack();
    }
}