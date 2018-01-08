package list.chenmiaohui.com.twolistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * by cmh
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button pButton;
    private Button fButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pButton = (Button) findViewById(R.id.pListview);
        fButton = (Button) findViewById(R.id.fListview);
        pButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
    }
    //按钮监听
    @Override
    public void onClick(View v) {
            if (v.getId()==R.id.pListview){
                Intent intent = new Intent(MainActivity.this,PListActivity.class);
                startActivity(intent);
            }else if (v.getId()==R.id.fListview){
                Intent intent = new Intent(MainActivity.this,FListActivity.class);
                startActivity(intent);
            }
    }
}
