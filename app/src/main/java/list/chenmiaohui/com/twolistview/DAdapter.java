package list.chenmiaohui.com.twolistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * 封装的adapter(泛型) 抽象类
 * Created by cmh on 2018/1/8.
 */
public abstract class DAdapter<T> extends BaseAdapter {

    private Context context;
    private List<T> datalist;

    public DAdapter(Context context) {
        this.context = context;
    }
    //其他地方可以调用context
    public Context getContext() {
        return context;
    }

    public List<T> getDatalist() {
        return datalist;
    }

    public void setDatalist(List<T> datalist) {
        this.datalist = datalist;
    }

    @Override
    public int getCount() {
        if (datalist!=null){
            return datalist.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    //抽象方法
    @Override
    public abstract View getView(int position, View convertView, ViewGroup parent);
}
