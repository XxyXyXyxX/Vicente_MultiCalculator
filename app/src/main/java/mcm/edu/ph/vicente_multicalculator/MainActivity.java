package mcm.edu.ph.vicente_multicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                int selectedArea = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selectedArea);
                switch (selectedArea) {
                    case R.id.radioArea:
                        startActivity(new Intent(MainActivity.this, Area.class));
                        break;
                    case R.id.radioVolume:
                        startActivity(new Intent(MainActivity.this, Volume.class));
                        break;
                }
        }
    }
}