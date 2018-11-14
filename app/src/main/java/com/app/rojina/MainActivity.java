package com.app.rojina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button recetnEvents=(Button)findViewById(R.id.recentEvents);
        Button futureEvents=(Button)findViewById(R.id.comingEvents);

        recetnEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent event= new Intent(MainActivity.this,RecentEvents.class);
                startActivity(event);
            }
        });
        futureEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent futureEvent= new Intent(MainActivity.this,FutureEvents.class);
                startActivity(futureEvent);
            }
        });
    }
}
