package bonatakis.tuts;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{
	MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		ourSong = MediaPlayer.create(Splash.this, R.raw.rain);
		ourSong.start();
		Thread timer=new Thread(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					
					sleep(5000);
					
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openApp=new Intent("bonatakis.tuts.Menu");
					startActivity(openApp);
				}
			}
			
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}
	
}
