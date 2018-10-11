package coding.vanlaban.android.mvpthree.Presenter;

import android.view.View;

public interface HomePresenter {

    View constructHomeView();
    void comeBack();
    void loadData();

}
