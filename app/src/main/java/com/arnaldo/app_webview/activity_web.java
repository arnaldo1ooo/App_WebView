package com.arnaldo.app_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activity_web extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wv1 = (WebView) findViewById(R.id.wv1);

        String URLRecibida = getIntent().getStringExtra("sitioWeb");

        wv1.setWebViewClient(new WebViewClient()); //Para que abra dentro de la app, para que no abra en chrome etc
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.loadUrl("http://" + URLRecibida);
    }

    public void Cerrar (View view){
        finish();
    }
}
