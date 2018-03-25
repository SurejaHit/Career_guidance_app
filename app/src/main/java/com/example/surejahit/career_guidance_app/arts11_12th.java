package com.example.surejahit.career_guidance_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class arts11_12th extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts11_12th);
        WebView webViewart = (WebView)findViewById(R.id.webVideoViewart);
        webViewart.setVisibility(View.VISIBLE);
        String html ="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/39fKWmnw_L4\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";

        webViewart.getSettings().setJavaScriptEnabled(true);
        webViewart.setWebChromeClient(new WebChromeClient() {
        });

        webViewart.loadData(html, "text/html", "utf-8");


        WebView webViewart2 = (WebView)findViewById(R.id.webVideoViewart2);
        webViewart2.setVisibility(View.VISIBLE);
        String html2 ="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/bShvahYhEuI\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";

        webViewart2.getSettings().setJavaScriptEnabled(true);
        webViewart2.setWebChromeClient(new WebChromeClient() {
        });

        webViewart2.loadData(html2, "text/html", "utf-8");
    }
}
