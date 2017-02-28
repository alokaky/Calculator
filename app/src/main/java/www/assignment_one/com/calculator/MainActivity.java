package www.assignment_one.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText vfval,vsval;
    TextView vres,vop;
    Button vadd,vsub,vmul,vdiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vfval=(EditText)findViewById(R.id.fval);
        vsval=(EditText)findViewById(R.id.sval);
        vres=(TextView)findViewById(R.id.res);
        vop=(TextView)findViewById(R.id.op);

        vadd=(Button)findViewById(R.id.add);
        vsub=(Button)findViewById(R.id.sub);
        vmul=(Button)findViewById(R.id.mul);
        vdiv=(Button)findViewById(R.id.div);

        vadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( !vfval.getText().toString().matches("") && !vsval.getText().toString().matches(""))
                {
                    double x = Double.parseDouble(vfval.getText().toString());
                    vop.setText("+");
                    double y = Double.parseDouble(vsval.getText().toString());
                    Double res=x+y;
                    vres.setText(String.valueOf(res));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Empty Box", Toast.LENGTH_SHORT).show();
                }
            }
        });

        vsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( !(vfval.getText().toString().matches("")) && !(vsval.getText().toString().matches("")) )
                {
                    double x = Double.parseDouble(vfval.getText().toString());
                    vop.setText("-");
                    double y = Double.parseDouble(vsval.getText().toString());
                    Double res = x - y;
                    vres.setText(String.valueOf(res));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Empty Box", Toast.LENGTH_SHORT).show();
                }
            }
        });

        vmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( !(vfval.getText().toString().matches("")) && !(vsval.getText().toString().matches("")) ) {
                    double x = Double.parseDouble(vfval.getText().toString());
                    vop.setText("x");
                    double y = Double.parseDouble(vsval.getText().toString());
                    Double res = x * y;
                    vres.setText(String.valueOf(res));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Empty Box", Toast.LENGTH_SHORT).show();
                }
            }
        });

        vdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!vfval.getText().toString().matches("") && !vsval.getText().toString().matches("")) {
                    double x = Double.parseDouble(vfval.getText().toString());
                    vop.setText("/");
                    double y = Double.parseDouble(vsval.getText().toString());
                    try {
                        Double res = x / y;
                        vres.setText(String.valueOf(res));
                    } catch (ArithmeticException e) {
                        vres.setText((CharSequence) e);
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Empty Box", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}