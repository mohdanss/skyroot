package haqnawaz.org.kids_learner;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txt1;
    TextView txtResult;

    Button btsky;
    Button btgrass;
    Button btroot;
    Button btreload;
    public int num;

    public char[] skyletters = {'b', 'd', 'f', 'h', 'k', 'l', 't'};
    public char[] grassletters = {'a', 'c', 'e', 'i', 'm', 'n', 'o','r', 's', 'u', 'v','w', 'x', 'z'};
    public char[] rootlettetrs = {'g','q','j','p' ,'y'};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // binding
        txt1 = findViewById(R.id.txtView1);
        txtResult = findViewById(R.id.TxtViewResult);

        btsky = findViewById(R.id.btnsky);
        btgrass = findViewById(R.id.btgrass);
        btroot = findViewById(R.id.btnroot);
        btreload = findViewById(R.id.btnreloadid);

        num = 5;

        // button listners
        btreload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //generate random number
                Random rand = new Random();
                int i;
                num = rand.nextInt(3);
                if(num == 0)
                {
                    i = rand.nextInt(skyletters.length);
                    txt1.setText(Character.toString(skyletters[i]));
                }
                else {
                    if (num == 1) {
                        i = rand.nextInt(grassletters.length);
                        txt1.setText(Character.toString(grassletters[i]));
                    } else {
                        i = rand.nextInt(rootlettetrs.length);
                        txt1.setText(Character.toString(rootlettetrs[i]));
                    }
                }
            }
        });

        btsky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num == 0)
                {
                    txtResult.setText("Correct!");
                }
                else
                {
                    txtResult.setText("Oops!");
                }
            }
        });

            btgrass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num == 1)
                {
                    txtResult.setText("Correct!");
                }
                else
                {
                    txtResult.setText("Oops!");
                }
            }
        });


        btroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num == 2)
                {
                    txtResult.setText("Correct!");
                }
                else
                {
                    txtResult.setText("Oops!");
                }
            }
        });
    }

}