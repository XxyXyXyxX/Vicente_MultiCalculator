package mcm.edu.ph.vicente_multicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Volume extends AppCompatActivity implements View.OnClickListener {
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volume);
        radioGroup = findViewById(R.id.radioGroupVolume);
        button = findViewById(R.id.volumeButton);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.volumeButton:
                int selectedArea = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selectedArea);
                switch (selectedArea) {
                    case R.id.radioPyramid:
                        startActivity(new Intent(Volume.this, Pyramids.class));
                        break;
                    case R.id.radioCylinder:
                        startActivity(new Intent(Volume.this, Cylinders.class));
                        break;
                    case R.id.radioCube:
                        startActivity(new Intent(Volume.this, Cubes.class));
                        break;
                    case R.id.radioSphere:
                        startActivity(new Intent(Volume.this, Spheres.class));
                        break;

                }
        }
    }
}

