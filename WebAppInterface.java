package com.example.xuluxi.bridge;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by xuluxi on 16/8/30.
 */
public class WebAppInterface {
    Context mContext;

    /** Instantiate the interface and set the context */
    WebAppInterface(Context c) {
        mContext = c;
    }

    /** set value from web page */
    @JavascriptInterface
    public void messageHandler(String value) {
        Toast.makeText(mContext, value, Toast.LENGTH_SHORT).show();
    }

    /** get value from web page */
    @JavascriptInterface
    public static String getMsg() {
        return "this is hello from Android";
    }
}
