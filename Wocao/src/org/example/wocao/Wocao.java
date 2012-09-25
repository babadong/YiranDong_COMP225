package org.example.wocao;


import org.example.wocao.Prefs;
import org.example.wocao.About;
import org.example.wocao.Video;
import org.example.wocao.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class Wocao extends Activity implements OnClickListener{
	 @Override
        public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	
	View playlistButton = findViewById(R.id.playlist_button);
    playlistButton.setOnClickListener(this);
    View pictureButton = findViewById(R.id.picture_button);
    pictureButton.setOnClickListener(this);
    View videoButton = findViewById(R.id.video_button);
    videoButton.setOnClickListener(this);
    View aboutButton = findViewById(R.id.about_button);
    aboutButton.setOnClickListener(this);
    View searchButton = findViewById(R.id.search_button);
    searchButton.setOnClickListener(this);
    View exitButton = findViewById(R.id.exit_button);
    exitButton.setOnClickListener(this);
	 }

   @Override
   protected void onResume() {
      super.onResume();
      Music.play(this, R.raw.deartv);
   }

   @Override
   protected void onPause() {
      super.onPause();
      Music.stop(this);
   }
	@Override
	public void onClick(View v) {
		switch (v.getId()) {

	      case R.id.about_button:
	         Intent i = new Intent(this, About.class);
	         startActivity(i);
	         break;
	      // More buttons go here (if any) ...
	      case R.id.video_button:
	          openNewVideoDialog();
	          break;
	      case R.id.exit_button:
	         finish();
	         break;
	      }
		
	}
	
	   @Override
	   public boolean onCreateOptionsMenu(Menu menu) {
	      super.onCreateOptionsMenu(menu);
	      MenuInflater inflater = getMenuInflater();
	      inflater.inflate(R.menu.menu, menu);
	      return true;
	   }

	   @Override
	   public boolean onOptionsItemSelected(MenuItem item) {
	      switch (item.getItemId()) {
	      case R.id.settings:
	         startActivity(new Intent(this, Prefs.class));
	         return true;
	      // More items go here (if any) ...
	      }
	      return false;
	   }
	   private void openNewVideoDialog() {
		      new AlertDialog.Builder(this)
		           .setTitle(R.string.video_title)
		           .setItems(R.array.videolist,
		            new DialogInterface.OnClickListener() {
		               public void onClick(DialogInterface dialoginterface,
		                     int i) {
		                  startVideo(i);
		               }
		            })
		           .show();
		   }

		   /** Start a new game with the given difficulty level */
		   private void startVideo(int i) {
		      Intent intent = new Intent(this, Video.class);
		      startActivity(intent);
		   }

}

