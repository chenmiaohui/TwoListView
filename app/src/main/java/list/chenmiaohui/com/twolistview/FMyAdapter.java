package list.chenmiaohui.com.twolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 继承封装好的adapter
 * Created by cmh on 2018/1/8.
 */

public class FMyAdapter extends DAdapter<Hore>{

    public FMyAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (null==convertView){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.plist_item,null);
        }
        ImageView imageView = DViewHolder.get(convertView,R.id.img);
        TextView textView = DViewHolder.get(convertView,R.id.tv);
        Hore hore = getDatalist().get(position);
        imageView.setImageResource(hore.getResId());
        textView.setText(hore.getName());
        return convertView;
    }
}
