package list.chenmiaohui.com.twolistview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装的Listview
 * Created by 陈苗辉  on 2018/1/8.
 */
public class FListActivity extends AppCompatActivity{

    private ListView mlistview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plist);
        mlistview = (ListView) findViewById(R.id.listview);
        FMyAdapter adapter = new FMyAdapter(this);
        List<Hore> flists = new ArrayList<>();
        for (int i=0;i<50;i++){
            flists.add(new Hore("我是封装的第"+i+"个",R.mipmap.ic_launcher_round));
        }
        adapter.setDatalist(flists);
        mlistview.setAdapter(adapter);
    }
}
