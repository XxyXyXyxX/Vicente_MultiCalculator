package mcm.edu.ph.vicente_multicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Circles extends AppCompatActivity implements View.OnClickListener {

    EditText radius;
    double inputCircle, circle;
    TextView result;
    Button btnAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle);
        btnAnswer = findViewById(R.id.btnAnswerCircle);
        radius = findViewById(R.id.inputTriangleHeight);
        result = findViewById(R.id.answer);
        btnAnswer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        inputCircle = Double.parseDouble(radius.getText().toString());
        circle = Math.pow(inputCircle,2)* Math.PI;
        result.setText("Result is " + circle);
    }

}
