package mcm.edu.ph.vicente_multicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Squares extends AppCompatActivity implements View.OnClickListener {

    EditText edgeSquare;
    double inputSquare, square;
    TextView result;
    Button btnAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.square);
        btnAnswer = findViewById(R.id.btnAnswerSquare);
        edgeSquare = findViewById(R.id.edgeSquare);
        result = findViewById(R.id.answer);
        btnAnswer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        inputSquare = Double.parseDouble(edgeSquare.getText().toString());
        square = Math.pow(inputSquare,2);
        result.setText("Result is " + square);
    }

}