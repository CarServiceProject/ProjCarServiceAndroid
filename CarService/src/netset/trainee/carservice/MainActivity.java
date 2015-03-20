package netset.trainee.carservice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Display;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends FragmentActivity {
	
	FrameLayout frameLayout;
	Button continueCustomerButton,continuewServiceProviderButton;
    FrameLayout.LayoutParams fragmentLayoutParams;
	@SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
		WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
		Display display = wm.getDefaultDisplay();
		Point size = new Point();
		display.getSize(size);
		Constants.windowWidth= size.x;
		Constants.windowHeight=size.y;
   // 	fragmentLayoutParams=new FrameLayout.LayoutParams(Constants.windowWidth,(Constants.windowHeight)/2);
		
		initViews();
        setListeners();
       
        
        getSupportFragmentManager().beginTransaction().replace(R.id.loginFragment,new ChooseLoginFragment()).setCustomAnimations(R.animator.zoom_in,R.animator.slide_down, R.animator.zoom_in,R.animator.slide_down).addToBackStack(null).commit();
    }
    
    public void initViews(){
    	
    }

    public void setListeners(){
    	
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
