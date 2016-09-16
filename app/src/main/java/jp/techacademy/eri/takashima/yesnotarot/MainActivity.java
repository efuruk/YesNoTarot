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

            int n = (int) (Math.random() * 10);

            switch (n % 4) {
                case 0:
                    intent.putExtra("fortune", "Yes!前向きな姿勢を");
                    startActivity(intent);
                    break;
                case 1:
                    intent.putExtra("fortune", "YES. 不安もあるかもしれませんが、決断しましょう。");
                    startActivity(intent);
                    break;
                case 2:
                    intent.putExtra("fortune", "YES. いつしか心も晴れる日が来るはず。");
                    startActivity(intent);
                    break;
                case 3:
                    intent.putExtra("fortune", "Yes. 今は、夜明け前の暗さ、もうすぐ前は見えてくるはず。");
                    startActivity(intent);
                    break;
                default:
                    intent.putExtra("fortune", "No.今進もうとしている道よりも、もっと素敵な道が見つかります。");
                    startActivity(intent);
                    break;


            }

        }
    }
}
