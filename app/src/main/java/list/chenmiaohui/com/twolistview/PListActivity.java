package list.chenmiaohui.com.twolistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * 普通的listview
 * Created by cmh on 2018/1/8.
 */

public class PListActivity extends AppCompatActivity{

    private ListView mListview;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plist);
        mListview = (ListView) findViewById(R.id.listview);
        PMyAdapter adapter = new PMyAdapter(this);
        List<Hore> lists = new ArrayList<>();
        for (int i=0;i<30;i++){
            lists.add(new Hore("我是第"+i+"个",R.mipmap.ic_launcher));
        }
        adapter.setDateLists(lists);
        mListview.setAdapter(adapter);
        mListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PListActivity.this,"我点了第"+(position+1)+"个",Toast.LENGTH_LONG).show();
            }
        });
    }
}
