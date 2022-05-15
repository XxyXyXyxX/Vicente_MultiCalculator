package mcm.edu.ph.vicente_multicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;


public class Area extends AppCompatActivity implements View.OnClickListener {
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area);
        radioGroup = findViewById(R.id.radioGroupArea);
        button = findViewById(R.id.areaButton);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.areaButton:
                int selectedArea = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selectedArea);
                switch (selectedArea) {
                    case R.id.radioSquare:
                        startActivity(new Intent(Area.this, Squares.class));
                        break;
                    case R.id.radioRectangle:
                        startActivity(new Intent(Area.this, Rectangles.class));
                        break;
                    case R.id.radioTriangle:
                        startActivity(new Intent(Area.this, Triangles.class));
                        break;
                    case R.id.radioCircle:
                        startActivity(new Intent(Area.this, Circles.class));
                        break;
                }
        }
    }
}
