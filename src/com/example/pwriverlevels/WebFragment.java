package com.example.pwriverlevels;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebFragment extends Fragment {
	
	public Uri url;
	
	public WebFragment(Intent intent) {
	    url = intent.getData();
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
	}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view, container, false);
       
        return rootView;
         }

    @Override
    public void onResume() {
    	super.onResume();
         WebView myWebView = (WebView) getView().findViewById(R.id.webview);
         myWebView.setWebViewClient(new WebViewClient());
         myWebView.loadUrl(url+"");
     }

}
