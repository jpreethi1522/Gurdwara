package com.example.gurdwaraapp;

// MainActivity.java

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find WebView by its id
        webView = findViewById(R.id.webView);

        // Configure WebView settings
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript

        // Set WebView client to handle interactions within the WebView
        webView.setWebViewClient(new WebViewClient());

        // Set WebChromeClient for handling progress and alerts
        webView.setWebChromeClient(new WebChromeClient());

        // Load a URL in the WebView
        webView.loadUrl("http://96.78.175.36:14061/");
    }
}
