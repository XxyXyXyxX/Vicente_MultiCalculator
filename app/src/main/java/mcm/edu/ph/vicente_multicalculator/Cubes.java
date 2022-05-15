package mcm.edu.ph.vicente_multicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cubes extends AppCompatActivity implements View.OnClickListener {

    EditText edgeCube;
    double inputCube, cube;
    TextView result;
    Button btnAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cube);
        btnAnswer = findViewById(R.id.btnAnswerCube);
        edgeCube = findViewById(R.id.inputCubeSides);
        result = findViewById(R.id.answer);
        btnAnswer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        inputCube = Double.parseDouble(edgeCube.getText().toString());
        cube = Math.pow(inputCube,3);
        result.setText("Result is " + cube);
    }

}