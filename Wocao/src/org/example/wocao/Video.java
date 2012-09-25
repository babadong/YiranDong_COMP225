package org.example.wocao;

import org.example.wocao.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.VideoView;

public class Video extends Activity {
	   @Override
	   protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.video);
	      VideoView video=(VideoView) findViewById(R.id.video);
	      
	   video.setVideoPath("/sdcard/samplevideo.3gp");
	   video.start();
	   }
	}