package list.chenmiaohui.com.twolistview;

import android.util.SparseArray;
import android.view.View;

/**
 * 封装的viewholder
 * Created by cmh on 2018/1/8.
 */
public class DViewHolder {

    public static <T extends View> T get(View view,int id){
        SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
        if (viewHolder==null){
            viewHolder = new SparseArray<>();
            view.setTag(viewHolder);
        }
        View childView = viewHolder.get(id);
        if (childView==null){
            childView = view.findViewById(id);
            viewHolder.put(id,childView);
        }
        return (T) childView;
    }
}
