package com.example.wuxiahuihezhiyouxi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webview)
        val webSettings: WebSettings = webView.getSettings()
        webSettings.setJavaScriptEnabled(true)
        webSettings.setDomStorageEnabled(true)


        // 加载本地HTML文件
        webView.loadUrl("file:///android_asset/index.html")


        // 处理页面导航
        webView.setWebViewClient(WebViewClient())
    }

  override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()

        } else {
            super.onBackPressed()
        }
    }
}