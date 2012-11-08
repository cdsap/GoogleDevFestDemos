
package com.example.google.tv.remote.blackjack;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.google.tv.anymotelibrary.client.AnymoteClientService;
import com.example.google.tv.anymotelibrary.client.AnymoteClientService.ClientListener;
import com.example.google.tv.anymotelibrary.client.AnymoteSender;


public class BlackJackRemoteActivity extends Activity {
  
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
      }
}
