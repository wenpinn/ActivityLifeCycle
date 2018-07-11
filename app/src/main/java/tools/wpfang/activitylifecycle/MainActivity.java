package tools.wpfang.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("FIRSTACTIVITY","onCreate 1");
        Toast.makeText(this,"onCreate 1",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("FIRSTACTIVITY","onStart 1");
        Toast.makeText(this,"onStart 1",Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("FIRSTACTIVITY","onResume 1");
        Toast.makeText(this,"onResume 1",Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("FIRSTACTIVITY","onPause 1");
        Toast.makeText(this,"onPause 1",Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("FIRSTACTIVITY","onRestart 1");
        Toast.makeText(this,"onRestart 1",Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("FIRSTACTIVITY","onSTop 1");
        Toast.makeText(this,"onStop 1",Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("FIRSTACTIVITY","onDestory");
        Toast.makeText(this,"onDestory 1",Toast.LENGTH_SHORT).show();

    }

    public void gonext(View view) {
        Intent it=new Intent(this,SecondActivity.class);
        startActivity(it);
    }
}
