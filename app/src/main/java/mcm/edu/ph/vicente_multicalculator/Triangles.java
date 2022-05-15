package mcm.edu.ph.vicente_multicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Triangles extends AppCompatActivity implements View.OnClickListener {

    EditText baseTriangle,heightTriangle;
    double inputTriangle,inputTriangle2,triangle;
    TextView result;
    Button btnAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangle);
        btnAnswer = findViewById(R.id.btnAnswerTriangle);
        baseTriangle = findViewById(R.id.inputTriangleBase);
        heightTriangle = findViewById(R.id.inputTriangleHeight);
        result = findViewById(R.id.answer);
        btnAnswer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        inputTriangle = Double.parseDouble(baseTriangle.getText().toString());
        inputTriangle2 = Double.parseDouble(heightTriangle.getText().toString());
        triangle =  inputTriangle * inputTriangle2 * 1/2  ;
        result.setText("Result is" + triangle);
    }

}