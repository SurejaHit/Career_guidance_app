package com.example.surejahit.career_guidance_app.jobpackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.example.surejahit.career_guidance_app.R;

public class MbaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mba);
        WebView webview1 = (WebView) findViewById(R.id.webVideoView1mba);

        webview1.setVisibility(View.VISIBLE);
        String html1 = " <iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/_kHGOENffoQ\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";


        webview1.getSettings().setJavaScriptEnabled(true);
        webview1.setWebChromeClient(new WebChromeClient() {
        });

        webview1.loadData(html1, "text/html", "utf-8");

        WebView webview2 = (WebView) findViewById(R.id.webVideoView2mba);

        webview2.setVisibility(View.VISIBLE);
        String html2 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/0C4QBIxsCiI\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";


        webview2.getSettings().setJavaScriptEnabled(true);
        webview2.setWebChromeClient(new WebChromeClient() {
        });

        webview2.loadData(html2, "text/html", "utf-8");


        WebView webview3 = (WebView) findViewById(R.id.webVideoView3mba);

        webview3.setVisibility(View.VISIBLE);
        String html3 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YFf2vWDkVkY\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";


        webview3.getSettings().setJavaScriptEnabled(true);
        webview3.setWebChromeClient(new WebChromeClient() {
        });

        webview3.loadData(html3, "text/html", "utf-8");

    }
}
