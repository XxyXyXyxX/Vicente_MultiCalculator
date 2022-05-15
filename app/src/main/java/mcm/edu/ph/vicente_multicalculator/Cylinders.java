package mcm.edu.ph.vicente_multicalculator;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cylinders extends AppCompatActivity implements View.OnClickListener {

    EditText radiusCylinder,heightCylinder;
    double inputCylinder,inputCylinder2,cylinder;
    TextView result;
    Button btnAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cylinder);
        btnAnswer = findViewById(R.id.btnAnswerCylinder);
        radiusCylinder = findViewById(R.id.inputCylinderRadius);
        heightCylinder = findViewById(R.id.inputCylinderHeight);
        result = findViewById(R.id.answer);
        btnAnswer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        inputCylinder = Double.parseDouble(radiusCylinder.getText().toString());
        inputCylinder2 = Double.parseDouble(heightCylinder.getText().toString());
        cylinder = Math.pow(inputCylinder,2)  * inputCylinder2 * Math.PI ;
        result.setText("Result is " + cylinder);
    }

}
