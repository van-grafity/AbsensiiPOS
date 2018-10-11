package coding.vanlaban.android.mvpthree.View;

import android.view.View;

public interface HomeView {
    View constructHomeView();
    void render(String[] names);
}
