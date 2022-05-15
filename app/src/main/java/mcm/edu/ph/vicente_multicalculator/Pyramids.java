package mcm.edu.ph.vicente_multicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Pyramids extends AppCompatActivity implements View.OnClickListener {

    EditText length,width,height;
    double inputPyramid1,inputPyramid2,inputPyramid3, pyramid;
    TextView result;
    Button btnAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pyramid);
        btnAnswer = findViewById(R.id.btnAnswerPyramid);
        length = findViewById(R.id.inputPyramidLength);
        width = findViewById(R.id.inputPyramidWidth);
        height = findViewById(R.id.inputPyramidHeight);
        result = findViewById(R.id.answer);
        btnAnswer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        inputPyramid1 = Double.parseDouble(length.getText().toString());
        inputPyramid2 = Double.parseDouble(width.getText().toString());
        inputPyramid3 = Double.parseDouble(height.getText().toString());
        pyramid = (inputPyramid1*inputPyramid2*inputPyramid3)/3;
        result.setText("Result is " + pyramid);
    }

}