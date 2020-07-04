package op.appcoding.learn.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {

    private TextView T;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        T = (TextView)findViewById(R.id.message);

        T.setText(getIntent().getStringExtra("MESSAGE"));

    }
}