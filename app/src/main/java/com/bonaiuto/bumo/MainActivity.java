package com.bonaiuto.bumo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("fail", "nothing failed");
        setTitle("Home");
    }

    public void handleInputText(View view){
        EditText viewById = findViewById(R.id.sourceName);
        String input = viewById.getText().toString();
        TextView viewById1 = findViewById(R.id.outputText);
        viewById1.setVisibility(View.VISIBLE);
        viewById1.setText(String.format("The input was: %s", input));
        Toast.makeText(this, "alert", Toast.LENGTH_LONG).show();

    }

    public void disable(View v) {


        v.setEnabled(false);
        Log.d("ok", "message");
        if (v instanceof Button) {
            Button v1 = (Button) v;
            v1.setText("Hola morena bella");
        }

        TextView viewById = findViewById(R.id.hello);
        viewById.setText("oh no, you are moren\naaaa");
    }

    public void nextPage(View view) {
        //launch the activity
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);

    }
}