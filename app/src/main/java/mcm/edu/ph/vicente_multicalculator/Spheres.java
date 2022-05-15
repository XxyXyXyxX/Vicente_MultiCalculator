package mcm.edu.ph.vicente_multicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Spheres extends AppCompatActivity implements View.OnClickListener {

    EditText radius;
    double inputSphere, sphere;
    TextView result;
    Button btnAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sphere);
        btnAnswer = findViewById(R.id.btnAnswerSphere);
        radius = findViewById(R.id.inputSphereRadius);
        result = findViewById(R.id.answer);
        btnAnswer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        inputSphere = Double.parseDouble(radius.getText().toString());
        sphere = Math.pow(inputSphere,3) * Math.PI * 4/3;
        result.setText("Result is " + sphere);
    }

}