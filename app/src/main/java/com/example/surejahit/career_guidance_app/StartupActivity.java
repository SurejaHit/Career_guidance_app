package com.example.surejahit.career_guidance_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class StartupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);

        WebView webview = (WebView) findViewById(R.id.webVideoView1);

        webview.setVisibility(View.VISIBLE);
        String html = " <iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/bNpx7gpSqbY\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n";


        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebChromeClient(new WebChromeClient() {
        });

        webview.loadData(html, "text/html", "utf-8");

        WebView webview1 = (WebView) findViewById(R.id.webVideoView2);

        webview1.setVisibility(View.VISIBLE);
        String html1 = " <iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/sFri_5p0rGA\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n";


        webview1.getSettings().setJavaScriptEnabled(true);
        webview1.setWebChromeClient(new WebChromeClient() {
        });

        webview1.loadData(html1, "text/html1", "utf-8");
    }
}
