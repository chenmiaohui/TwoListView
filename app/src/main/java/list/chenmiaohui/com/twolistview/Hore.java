package list.chenmiaohui.com.twolistview;

/**
 * set get
 * Created by cmh on 2018/1/8.
 */

public class Hore {
    private String name;
    private int resId;

    public Hore(String name, int resId) {
        this.name = name;
        this.resId = resId;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
