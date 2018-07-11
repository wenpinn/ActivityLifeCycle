package tools.wpfang.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.i("SECONDACTIVITY","onCreate 2");
            Toast.makeText(this,"onCreate 2",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.i("SECONDACTIVITY","onStart 2");
            Toast.makeText(this,"onStart 2",Toast.LENGTH_SHORT).show();


        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.i("SECONDACTIVITY","onResume 2");
            Toast.makeText(this,"onResume 2",Toast.LENGTH_SHORT).show();


        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.i("SECONDACTIVITY","onPause 2");
            Toast.makeText(this,"onPause 2",Toast.LENGTH_SHORT).show();


        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.i("SECONDACTIVITY","onRestart 2");
            Toast.makeText(this,"onRestart 2",Toast.LENGTH_SHORT).show();


        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.i("SECONDACTIVITY","onSTop 2");
            Toast.makeText(this,"onStop 2",Toast.LENGTH_SHORT).show();


        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.i("SECONDACTIVITY","onDestory2");
            Toast.makeText(this,"onDestory 2",Toast.LENGTH_SHORT).show();

        }
    }

