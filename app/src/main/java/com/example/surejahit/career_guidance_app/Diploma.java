package com.example.surejahit.career_guidance_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class Diploma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diploma);
        WebView webViewdip = (WebView)findViewById(R.id.webVideoViewdip);
        webViewdip.setVisibility(View.VISIBLE);
        String html ="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3ZDBdA4x86o\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";

        webViewdip.getSettings().setJavaScriptEnabled(true);
        webViewdip.setWebChromeClient(new WebChromeClient() {
        });

        webViewdip.loadData(html, "text/html", "utf-8");


        WebView webViewdip2 = (WebView)findViewById(R.id.webVideoViewdip2);
        webViewdip2.setVisibility(View.VISIBLE);
        String html2 ="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YHF8fJBX3Pg\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";

        webViewdip2.getSettings().setJavaScriptEnabled(true);
        webViewdip2.setWebChromeClient(new WebChromeClient() {
        });

        webViewdip2.loadData(html2, "text/html", "utf-8");
    }

}
