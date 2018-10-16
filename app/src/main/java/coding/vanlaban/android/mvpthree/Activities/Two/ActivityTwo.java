package coding.vanlaban.android.mvpthree.Activities.Two;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import javax.inject.Inject;

import coding.vanlaban.android.mvpthree.Activities.Two.Dagger.DaggerHomeComponent;
import coding.vanlaban.android.mvpthree.Activities.Two.Dagger.HomeContextModule;
import coding.vanlaban.android.mvpthree.Application.Dagger.AppComponent;
import coding.vanlaban.android.mvpthree.Application.MyApplication;
import coding.vanlaban.android.mvpthree.Presenter.HomePresenter;
import coding.vanlaban.android.mvpthree.R;

public class ActivityTwo extends AppCompatActivity{

    @Inject
    HomePresenter homePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //pattern Singleton
        AppComponent appComp=((MyApplication)getApplication()).getAppComponent();
        DaggerHomeComponent.builder()
                .appComponent(appComp)
                .homeContextModule(new HomeContextModule(this))
                .build()
                .inject(this);
        this.setContentView(homePresenter.constructHomeView());
        this.homePresenter.loadData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);

        /*MenuItem searchItem = menu.findItem(R.id.app_bar_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);*/
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.idLogout) {
            homePresenter.comeBack();
        }
        return true;
    }

}