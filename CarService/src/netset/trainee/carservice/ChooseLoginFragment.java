package netset.trainee.carservice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ChooseLoginFragment extends Fragment{

	Button continueCustomerButton, continuewServiceProviderButton;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v=inflater.inflate(R.layout.choose_login_fragment_layout,container,false);
		initViews(v);
		setListeners();
		return v;
		
	}
	
	  public void initViews(View v){
	    	continueCustomerButton=(Button) v.findViewById(R.id.continueCustomerButton);
	    	continuewServiceProviderButton=(Button) v.findViewById(R.id.continueServiceProviderButton);
	    }

	    public void setListeners(){
	    	continueCustomerButton.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					final FragmentTransaction ft= getFragmentManager().beginTransaction().setCustomAnimations(R.animator.zoom_in, R.animator.slide_down,R.animator.zoom_in, R.animator.slide_down);
					ft.replace(R.id.loginFragment, new LoginScreenFragment(), "LoginScreen").addToBackStack(null).commit();
				}
			});
	    	continuewServiceProviderButton.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
				}
			});
	    }
}
