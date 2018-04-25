package tw.edu.ntut.csie.app01_105590005;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText edscore;
    private Button btok;
    private TextView grade;
    private TextView out;
    private TextView mTxtR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edscore = (EditText) findViewById(R.id.editText);
        btok = (Button) findViewById(R.id.button);
        grade = (TextView) findViewById(R.id.textView2);
        btok.setOnClickListener(btokOnClick);
        mTxtR = (TextView) findViewById(R.id.textView3);
    }

    private View.OnClickListener btokOnClick;

    {
        btokOnClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = getString(R.string.out);
                int grade = Integer.parseInt(edscore.getText().toString());
                if (grade > 100) ans += getString(R.string.X);
                else if (grade >= 90 && grade <= 100) ans += getString(R.string.A);
                else if (grade >= 80 && grade <= 89) ans += getString(R.string.B);
                else if (grade >= 70 && grade <= 79) ans += getString(R.string.C);
                else if (grade >= 60 && grade <= 69) ans += getString(R.string.D);
                else if (grade >= 0 && grade <= 59) ans += getString(R.string.F);
                else ans += getString(R.string.X);
                mTxtR.setText(ans);
            }
        };
    }
}

