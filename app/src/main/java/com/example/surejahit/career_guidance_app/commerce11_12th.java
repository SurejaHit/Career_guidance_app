package com.example.surejahit.career_guidance_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;

public class commerce11_12th extends AppCompatActivity {
    ImageButton mImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerce11_12th);
        WebView webViewcom = (WebView)findViewById(R.id.webVideoViewcomm);
        webViewcom.setVisibility(View.VISIBLE);
        String html ="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/OulDtdkc2wg\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";

        webViewcom.getSettings().setJavaScriptEnabled(true);
        webViewcom.setWebChromeClient(new WebChromeClient() {
        });

        webViewcom.loadData(html, "text/html", "utf-8");


        WebView webViewcom2 = (WebView)findViewById(R.id.webVideoViewcomm2);
        webViewcom.setVisibility(View.VISIBLE);
        String html2 ="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Lmh4tPDYP9Q\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";

        webViewcom2.getSettings().setJavaScriptEnabled(true);
        webViewcom2.setWebChromeClient(new WebChromeClient() {
        });

        webViewcom2.loadData(html2, "text/html", "utf-8");
        TextView textView = (TextView)findViewById(R.id.textstudy);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
