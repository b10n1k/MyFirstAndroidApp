package bonatakis.tuts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class AppActivity extends Activity {
    /** Called when the activity is first created. */
	int counter;
	Button add;
	Button sub;
	TextView display;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        counter=0;
        add=(Button) findViewById(R.id.badd);
        sub=(Button) findViewById(R.id.bsub);
        display= (TextView) findViewById(R.id.tvDisplay);
        
        add.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
				display.setText("the total now is "+counter);
			}
        	
        });
        
        sub.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("the total now is "+counter);
			}
        	
        });
    }
}