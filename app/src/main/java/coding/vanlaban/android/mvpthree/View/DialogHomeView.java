package coding.vanlaban.android.mvpthree.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

import coding.vanlaban.android.mvpthree.R;

public class DialogHomeView implements HomeView {
    private Context context;
    private View view;

    public DialogHomeView(Context context) {
        this.context = context;
        FrameLayout parent = new FrameLayout(context);
        parent.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        view = LayoutInflater.from(context).inflate(R.layout.activity_two, parent, true);
    }

    @Override
    public View constructHomeView() {
        return this.view;
    }

    @Override
    public void render(String[] names) {
        ListView listView = view.findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(context, R.layout.activity_listview, R.id.textView, names);
        listView.setAdapter(arrayAdapter);
    }

    }





