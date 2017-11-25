package com.thiman.android.miwok2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      TextView numbers = (TextView)findViewById(R.id.numbers);
//      numbers.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View view) {
//              Toast.makeText(view.getContext(),"Open Number List",Toast.LENGTH_SHORT).show();
//          }
//      });

    }

    public void numberList(View view){
       Intent i = new Intent(this,NumbersActivity.class );
       startActivity(i);

    }

    public void familyList(View view){

    }

    public void colorsList(View view){

    }

    public void phrasersList(View view){

    }
}
