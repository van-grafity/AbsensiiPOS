package coding.vanlaban.android.mvpthree.Presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import coding.vanlaban.android.mvpthree.Activities.Main.MainActivity;
import coding.vanlaban.android.mvpthree.Infrastruktur.UserStore;
import coding.vanlaban.android.mvpthree.View.HomeView;


public class HomePresenterImpl implements HomePresenter{
    private HomeView homeView;
    private UserStore store;
    private Context context;
    private Activity activity;

    public HomePresenterImpl(HomeView homeView, UserStore store) {
        this.store = store;
        this.homeView = homeView;
    }
    @Override
    public void loadData() {

        homeView.render(this.store.getUserNames());
    }
    @Override
    public void comeBack(){
        Intent intent = new Intent(context.getApplicationContext(), MainActivity.class);
        activity.startActivity(intent);
    }

    public View constructHomeView() {
        return this.homeView.constructHomeView();
    }
}
