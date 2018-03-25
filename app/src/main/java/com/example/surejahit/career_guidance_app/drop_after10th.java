package com.example.surejahit.career_guidance_app;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckedTextView;
        import android.widget.ImageView;

/**
 * Created by dwije on 25-03-18.
 */

public class drop_after10th extends Activity {

    Button btn;
    CheckedTextView ans1, ans2, ans3, ans4;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        btn = (Button) findViewById(R.id.submit);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drop_after10th);
        ans1 = (CheckedTextView) findViewById(R.id.ans1);
        ans2 = (CheckedTextView) findViewById(R.id.ans2);
        ans3 = (CheckedTextView) findViewById(R.id.ans3);
        ans4 = (CheckedTextView) findViewById(R.id.ans4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ans1.isChecked() || ans2.isChecked()) {
                    Intent intent = new Intent("com.example.surejahit.career_guidance_app.science11_12th");
                    startActivity(intent);
                } else if (ans2.isChecked()) {
                    Intent intent = new Intent("com.example.surejahit.career_guidance_app.science11_12th");
                    startActivity(intent);
                } else if (ans2.isChecked() || ans3.isChecked()) {
                    Intent intent = new Intent("com.example.surejahit.career_guidance_app.science11_12t");
                    startActivity(intent);
                } else if (ans4.isChecked()) {
                    Intent intent = new Intent("com.example.surejahit.career_guidance_app.arts11_12th");
                    startActivity(intent);
                }
                else if(ans1.isChecked() && ans2.isChecked() && ans3.isChecked() && ans4.isChecked())
                {
                    Intent intent = new Intent("com.example.surejahit.career_guidance_app.Guidance_Fragment");
                    startActivity(intent);
                }

            }
        });

    }
}
