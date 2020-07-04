package op.appcoding.learn.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void exp(View V) {

        //Explicit Intent for transfer data in apps.. MIME


        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/"));
        startActivity(intent);

        //EXPlICIT INTENT ARE HANDLED BY ANOTHER APPS WHICH ARE ASSCOCIATED WITH THAT DATA..
        // LIKE MAIL, AUDIO, ETC


    }


    public void imp(View V) {

        //This Is Implicit Intent - for changing app activities

        Intent intent = new Intent(getApplicationContext(), SecondPage.class);
        intent.putExtra("MESSAGE","Hi I AM ABHI");
        startActivity(intent);
        finish();

    }


}