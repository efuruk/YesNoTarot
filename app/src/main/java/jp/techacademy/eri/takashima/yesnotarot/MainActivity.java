package jp.techacademy.eri.takashima.yesnotarot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        mTextView = (TextView) findViewById(R.id.textView1);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button1) {
            Intent intent = new Intent(this, Result.class);

            int n = (int) (Math.random() *22);

            switch (n % 22) {
                case 1:
                    intent.putExtra("VALUE1", 1);
                    startActivity(intent);
                    break;
                case 2:
                    intent.putExtra("VALUE1", 2);
                    startActivity(intent);
                    break;
                case 3:
                    intent.putExtra("VALUE1", 3);
                    startActivity(intent);
                    break;
                case 4:
                    intent.putExtra("VALUE1", 4);
                    startActivity(intent);
                    break;
                case 5:
                    intent.putExtra("VALUE1", 5);
                    startActivity(intent);
                    break;
                case 6:
                    intent.putExtra("VALUE1", 6);
                    startActivity(intent);
                    break;
                case 7:
                    intent.putExtra("VALUE1", 7);
                    startActivity(intent);
                    break;
                case 8:
                    intent.putExtra("VALUE1", 8);
                    startActivity(intent);
                    break;
                case 9:
                    intent.putExtra("VALUE1", 9);
                    startActivity(intent);
                    break;
                case 10:
                    intent.putExtra("VALUE1", 10);
                    startActivity(intent);
                    break;
                case 11:
                    intent.putExtra("VALUE1", 11);
                    startActivity(intent);
                    break;
                case 12:
                    intent.putExtra("VALUE1", 12);
                    startActivity(intent);
                    break;
                case 13:
                    intent.putExtra("VALUE1", 13);
                    startActivity(intent);
                    break;
                case 14:
                    intent.putExtra("VALUE1", 14);
                    startActivity(intent);
                    break;
                case 15:
                    intent.putExtra("VALUE1", 15);
                    startActivity(intent);
                    break;
                case 16:
                    intent.putExtra("VALUE1", 16);
                    startActivity(intent);
                    break;
                case 17:
                    intent.putExtra("VALUE1", 17);
                    startActivity(intent);
                    break;
                case 18:
                    intent.putExtra("VALUE1", 18);
                    startActivity(intent);
                    break;
                case 19:
                    intent.putExtra("VALUE1", 19);
                    startActivity(intent);
                    break;
                case 20:
                    intent.putExtra("VALUE1", 20);
                    startActivity(intent);
                    break;
                case 21:
                    intent.putExtra("VALUE1", 21);
                    startActivity(intent);
                    break;
                case 22:
                    intent.putExtra("VALUE1", 22);
                    startActivity(intent);
                    break;
                default:
                    intent.putExtra("VALUE1", 1);
                    startActivity(intent);
                    break;

            }
        }
    }
}
