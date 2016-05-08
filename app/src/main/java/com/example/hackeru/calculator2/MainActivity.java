package com.example.hackeru.calculator2;


        import android.app.Activity;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Switch;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends Activity {
    String tempValue = "";
    String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 =(Button) findViewById(R.id.button0);
        Button button1 =(Button) findViewById(R.id.button1);
        Button button2 =(Button) findViewById(R.id.button2);
        Button button3 =(Button) findViewById(R.id.button3);

        Button button4 =(Button) findViewById(R.id.button4);
        Button button5 =(Button) findViewById(R.id.button5);
        Button button6 =(Button) findViewById(R.id.button6);

        Button button7 =(Button) findViewById(R.id.button7);
        Button button8 =(Button) findViewById(R.id.button8);
        Button button9 =(Button) findViewById(R.id.button9);

        Button buttonPlus     =(Button) findViewById(R.id.buttonPlus    );
        Button buttonMinus    =(Button) findViewById(R.id.buttonMinus   );
        Button buttonDivide   =(Button) findViewById(R.id.buttonDivide  );
        Button buttonMultiply =(Button) findViewById(R.id.buttonMultiply);
        Button buttonEquals   =(Button) findViewById(R.id.buttonEquals  );

        Button buttonPeriod =(Button) findViewById(R.id.buttonPeriod);


        button0.setOnClickListener( new Button.OnClickListener(){
            public void onClick (View v)
            {
                TextView output = (TextView)findViewById(R.id.textView2);
                output.append("0");
            }
        });

        button1.setOnClickListener( new Button.OnClickListener(){
            public void onClick (View v)
            {
                TextView output = (TextView)findViewById(R.id.textView2);
                output.append("1");
            }
        });
        button2.setOnClickListener( new Button.OnClickListener(){
            public void onClick (View v)
            {
                TextView output = (TextView)findViewById(R.id.textView2);
                output.append("2");
            }
        });
        button3.setOnClickListener( new Button.OnClickListener(){
            public void onClick (View v)
            {
                TextView output = (TextView)findViewById(R.id.textView2);
                output.append("3");
            }
        });
        button4.setOnClickListener( new Button.OnClickListener(){
            public void onClick (View v)
            {
                TextView output = (TextView)findViewById(R.id.textView2);
                output.append("4");
            }
        });
        button5.setOnClickListener( new Button.OnClickListener(){
            public void onClick (View v)
            {
                TextView output = (TextView)findViewById(R.id.textView2);
                output.append("5");
            }
        });
        button6.setOnClickListener( new Button.OnClickListener(){
            public void onClick (View v)
            {
                TextView output = (TextView)findViewById(R.id.textView2);
                output.append("6");
            }
        });
        button7.setOnClickListener( new Button.OnClickListener(){
            public void onClick (View v)
            {
                TextView output = (TextView)findViewById(R.id.textView2);
                output.append("7");
            }
        });
        button8.setOnClickListener( new Button.OnClickListener(){
            public void onClick (View v)
            {
                TextView output = (TextView)findViewById(R.id.textView2);
                output.append("8");
            }
        });
        button9.setOnClickListener( new Button.OnClickListener(){
            public void onClick (View v)
            {
                TextView output = (TextView)findViewById(R.id.textView2);
                output.append("9");
            }
        });

        buttonPlus.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                TextView output = (TextView)findViewById(R.id.textView2);
                tempValue = output.getText().toString();
                output.setText("");
                operation = "+";
                Toast.makeText(MainActivity.this, "You entered: " + tempValue, Toast.LENGTH_LONG).show();
            }
        });

        buttonMinus.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                TextView output = (TextView)findViewById(R.id.textView2);
                tempValue = output.getText().toString();
                output.setText("");
                operation = "-";
                Toast.makeText(MainActivity.this, "You entered: " + tempValue, Toast.LENGTH_LONG).show();
            }
        });

        buttonMultiply.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                TextView output = (TextView)findViewById(R.id.textView2);
                tempValue = output.getText().toString();
                output.setText("");
                operation = "x";
                Toast.makeText(MainActivity.this, "You entered: " + tempValue, Toast.LENGTH_LONG).show();
            }
        });

        buttonDivide.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                TextView output = (TextView)findViewById(R.id.textView2);
                tempValue = output.getText().toString();
                output.setText("");
                operation = "/";
                Toast.makeText(MainActivity.this, "You entered: " + tempValue, Toast.LENGTH_LONG).show();
            }
        });

        buttonEquals.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                switch(operation){
                    case "+": add();
                        break;
                    case "-": subtract();
                        break;
                    case "x": multiply();
                        break;
                    case "/": divide();
                        break;
                    default: break;
                }
            }});
    }

    private void divide() {
        TextView output = (TextView)findViewById(R.id.textView2);
        String  tempValue2 = output.getText().toString();
        double tmp1 = Double.parseDouble(tempValue);
        double tmp2 = Double.parseDouble(tempValue2);
        double result = tmp1 / tmp2;
        output.setText(Double.toString(result));
    }

    private void multiply() {
        TextView output = (TextView)findViewById(R.id.textView2);
        String  tempValue2 = output.getText().toString();
        double tmp1 = Double.parseDouble(tempValue);
        double tmp2 = Double.parseDouble(tempValue2);
        double result = tmp1 * tmp2;
        output.setText(Double.toString(result));
    }

    private void subtract() {
        TextView output = (TextView)findViewById(R.id.textView2);
        String  tempValue2 = output.getText().toString();
        double tmp1 = Double.parseDouble(tempValue);
        double tmp2 = Double.parseDouble(tempValue2);
        double result = tmp1 - tmp2;
        output.setText(Double.toString(result));
    }

    private void add() {
        TextView output = (TextView)findViewById(R.id.textView2);
        String  tempValue2 = output.getText().toString();
        double tmp1 = Double.parseDouble(tempValue);
        double tmp2 = Double.parseDouble(tempValue2);
        double result = tmp1 + tmp2;
        output.setText(Double.toString(result));
    }
}
