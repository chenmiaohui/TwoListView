package list.chenmiaohui.com.twolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by cmh on 2018/1/8.
 */

public class PMyAdapter extends BaseAdapter{

    private Context context;
    private List<Hore> dateLists;

    public PMyAdapter(Context context) {
        this.context = context;
    }

    public List<Hore> getDateLists() {
        return dateLists;
    }

    public void setDateLists(List<Hore> dateLists) {
        this.dateLists = dateLists;
    }
    //判断listview  item的个数 并判断是否为空
    @Override
    public int getCount() {
        if (null!=dateLists){
            return dateLists.size();
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
    //展示主要布局
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        //主要目的复用ConvertView
        if (null==convertView){
            convertView = LayoutInflater.from(context).inflate(R.layout.plist_item,null);
            viewHolder = new ViewHolder();
            viewHolder.img = (ImageView) convertView.findViewById(R.id.img);
            viewHolder.tv = (TextView) convertView.findViewById(R.id.tv);
            //为了不重复利用空间  把viewHolder和convertView进行绑定
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Hore hores = dateLists.get(position);
        viewHolder.tv.setText(hores.getName());
        viewHolder.img.setImageResource(hores.getResId());
        return convertView;
    }

    class ViewHolder{
        ImageView img;
        TextView tv;
    }
}
