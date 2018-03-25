package com.example.surejahit.career_guidance_app.Engpackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.example.surejahit.career_guidance_app.R;

public class ComputerEng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        WebView webviewcomp = (WebView) findViewById(R.id.webv1);

        webviewcomp.setVisibility(View.VISIBLE);
        String html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/m8ZoxzX0hro\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";


        webviewcomp.getSettings().setJavaScriptEnabled(true);
        webviewcomp.setWebChromeClient(new WebChromeClient() {
        });

        webviewcomp.loadData(html, "text/html", "utf-8");

        WebView webviewcomp2 = (WebView) findViewById(R.id.webv2);

        webviewcomp2.setVisibility(View.VISIBLE);
        String html2 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/m1L1ui8so98\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";


        webviewcomp2.getSettings().setJavaScriptEnabled(true);
        webviewcomp2.setWebChromeClient(new WebChromeClient() {
        });

        webviewcomp2.loadData(html2, "text/html", "utf-8");

    }


}
