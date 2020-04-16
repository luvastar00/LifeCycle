package vn.edu.ntu.leducbinh_59130126_lifecycle59cntt2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","OnCreater Called");
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat smf = new SimpleDateFormat("HH:mm:ss");
        String strDate = smf.format(new Date());
        txtTG.setText(strDate);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d("LifeCycle","OnCreater Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","OnDestroy Called");
    }
}
