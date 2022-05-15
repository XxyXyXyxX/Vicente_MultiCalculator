package mcm.edu.ph.vicente_multicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rectangles extends AppCompatActivity implements View.OnClickListener {

    EditText lengthRectangle,widthRectangle;
    double inputRectangle,inputRectangle2,rectangle;
    TextView result;
    Button btnAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangle);
        btnAnswer = findViewById(R.id.btnAnswerRectangle);
        lengthRectangle = findViewById(R.id.inputPyramidWidth);
        widthRectangle = findViewById(R.id.inputRectangleHeight);
        result = findViewById(R.id.answer);
        btnAnswer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        inputRectangle = Double.parseDouble(lengthRectangle.getText().toString());
        inputRectangle2 = Double.parseDouble(widthRectangle.getText().toString());
        rectangle = inputRectangle  * inputRectangle2 ;
        result.setText("Result is " + rectangle);
    }

}