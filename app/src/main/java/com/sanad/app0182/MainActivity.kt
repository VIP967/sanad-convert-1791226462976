package com.sanad.app0182
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val w = WebView(this)
        w.settings.javaScriptEnabled = true
        setContentView(w)
        w.loadUrl("file:///android_asset/index.html")
    }
}