package vn.edu.ntu.leducbinh_59130126_lifecycle59cntt2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","OnCreater Called");

        Toast.makeText(getApplicationContext(), "onCreater.", Toast.LENGTH_SHORT).show();

        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat smf = new SimpleDateFormat("HH:mm:ss");
        String strDate = smf.format(new Date());
        txtTG.setText(strDate);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart Called");
        Toast.makeText(getApplicationContext(), "onRestart.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart Called");
        Toast.makeText(getApplicationContext(), "onStart.", Toast.LENGTH_SHORT).show();
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat smf = new SimpleDateFormat("HH:mm:ss");
        String strDate = smf.format(new Date());
        txtTG.setText(strDate);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop Called");
        Toast.makeText(getApplicationContext(), "onStop.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause Called");
        Toast.makeText(getApplicationContext(), "onPause.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","OnDestroy Called");
        Toast.makeText(getApplicationContext(), "onDestroy.", Toast.LENGTH_SHORT).show();
    }
}
