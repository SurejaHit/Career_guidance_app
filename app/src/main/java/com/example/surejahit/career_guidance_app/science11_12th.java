package com.example.surejahit.career_guidance_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageButton;

/**
 * Created by dwije on 24-03-18.
 */

public class science11_12th extends Activity
{
    ImageButton eng;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.science11_12th);

        WebView webview = (WebView) findViewById(R.id.webVideoView1);

        webview.setVisibility(View.VISIBLE);
        String html = " <iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/U1Ka0eCWuKg\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";


        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebChromeClient(new WebChromeClient() {
        });

        webview.loadData(html, "text/html", "utf-8");

    }

}
