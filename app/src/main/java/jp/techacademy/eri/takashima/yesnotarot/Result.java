package jp.techacademy.eri.takashima.yesnotarot;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Result extends AppCompatActivity {

    TextView mTextView;
    Button button1;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        mTextView = (TextView) findViewById(R.id.textView1);
        button1 = (Button) findViewById(R.id.button1);
        mImageView = (ImageView) findViewById(R.id.imageView2);


        Intent intent = getIntent();
        int value1 = intent.getIntExtra("VALUE1", 1);

        if(value1 == 1) {
            mTextView.setText("YES. 以前のことは忘れて、前向きに前進しましょう。");
            mImageView.setImageResource(R.drawable.light);
        } else if(value1 == 2) {
            mTextView.setText("YES. 行動力が、幸運を引き寄せる鍵になります。");
            mImageView.setImageResource(R.drawable.fallsone);
        } else if(value1 == 3) {
            mTextView.setText("NO. 心を落ち着かせて、静かな環境で決断しましょう。");
            mImageView.setImageResource(R.drawable.fallsthree);
        } else if(value1 == 4) {
            mTextView.setText("YES. 心を穏やかに保つと、本当の望みがわかります。");
            mImageView.setImageResource(R.drawable.fallstwo);
        } else if(value1 == 5) {
            mTextView.setText("YES. あなたが行動することで、周りも変わります。");
            mImageView.setImageResource(R.drawable.flower);
        } else if(value1 == 6) {
            mTextView.setText("NO. 冷静に起きたことを省みましょう。");
            mImageView.setImageResource(R.drawable.pantherlight);
        } else if(value1 == 7) {
            mTextView.setText("YES. 今決断すれば、ほしいものが手に入るでしょう。");
            mImageView.setImageResource(R.drawable.panthermeadowsone);
        } else if(value1 == 8) {
            mTextView.setText("YES. あなたが進もうとしている方向はあっています。");
            mImageView.setImageResource(R.drawable.panthermeadowsthree);
        } else if(value1 == 9) {
            mTextView.setText("YESですが、目的を達成するには、忍耐力が必要です。");
            mImageView.setImageResource(R.drawable.panthermeadowstwo);
        } else if(value1 == 10) {
            mTextView.setText("YES. 静かな時間をもつと、進む方向が見えてきます。");
            mImageView.setImageResource(R.drawable.pantherstronglight);
        } else if(value1 == 11) {
            mTextView.setText("絶対にYESです。運気も、あなたを後押ししています。");
            mImageView.setImageResource(R.drawable.shastalake);
        } else if(value1 == 12) {
            mTextView.setText("NO. あなたが想像しているよりも、大変そうです。");
            mImageView.setImageResource(R.drawable.shastalakefour);
        } else if(value1 == 13) {
            mTextView.setText("NO. 一度立ち止まって、休むことも大切です。");
            mImageView.setImageResource(R.drawable.shastalakeone);
        } else if(value1 == 14) {
            mTextView.setText("NO. 体も心も健康を保てば、いい方向が見えてきます。");
            mImageView.setImageResource(R.drawable.shastalakethree);
        } else if(value1 == 15) {
            mTextView.setText("NO. 迷っているようですが、自分をしっかりもって。");
            mImageView.setImageResource(R.drawable.shastamount);
        } else if(value1 == 16) {
            mTextView.setText("NO. 夜明け前が一番暗いはず。希望をもって。");
            mImageView.setImageResource(R.drawable.shastamountain);
        } else if(value1 == 17) {
            mTextView.setText("YES. 希望の光が見えてきました。ゆっくり進みましょう。");
            mImageView.setImageResource(R.drawable.shastanature);
        } else if(value1 == 18) {
            mTextView.setText("NO. まず、不安な気持ちを落ち着かせましょう。");
            mImageView.setImageResource(R.drawable.shastariver);
        } else if(value1 == 19) {
            mTextView.setText("YES! 自信をもって、すぐに行動しましょう。");
            mImageView.setImageResource(R.drawable.shastatail);
        } else if(value1 == 20) {
            mTextView.setText("NO. 思い切って方向を変えた方が、結果が良くなります。");
            mImageView.setImageResource(R.drawable.shastatree);
        } else if(value1 == 21) {
            mTextView.setText("YES. もう一度、自信をもって、挑戦してみましょう。");
            mImageView.setImageResource(R.drawable.shastina);
        } else if(value1 == 22) {
            mTextView.setText("NO. さらなる飛躍を目指し、新しい扉を開けてください。");
            mImageView.setImageResource(R.drawable.stream);
        }

    }


    @Override

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}