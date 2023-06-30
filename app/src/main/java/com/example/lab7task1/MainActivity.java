package com.example.lab7task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText intxt,restxt;
    RadioButton c2frb1,f2crb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.b1);
        intxt = (EditText) findViewById(R.id.et1);
        restxt = (EditText) findViewById(R.id.et2);
        c2frb1 = (RadioButton) findViewById(R.id.c2fr);
        f2crb2 = (RadioButton) findViewById(R.id.f2cr);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if (intxt.getText().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "Please enter a valid number", Toast.LENGTH_LONG).show();
                }
                else
                {
                    float in = Float.parseFloat(intxt.getText().toString());
                    if (c2frb1.isChecked())
                    {
                        restxt.setText(String.valueOf(((in * 9) / 5) + 32));
                    }

                    else
                    {

                        restxt.setText(String.valueOf(((in - 32) * 5 / 9)));}

                }

            }

        });
    }
}
