package codylab.cwliu.tryrobo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String getHelloWorldString(Context context){
        return context.getString(R.string.hello_world);
    }
}
