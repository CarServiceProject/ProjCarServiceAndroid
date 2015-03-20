package netset.trainee.carservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class LoginScreenFragment extends Fragment{

	EditText usernameEditText,PasswordEditText;
	Button loginButton,signUpButton;
	CheckBox rememberPasswordCheckbox;
	RelativeLayout.LayoutParams loginFragmentLayoutParams;
	RelativeLayout loginLayout;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v= inflater.inflate(R.layout.login_screen_fragment_layout, container,false);
		initViews(v);
		setListeners();
//		loginLayout=(RelativeLayout) v.findViewById(R.id.loginScreenLayout);
//		loginFragmentLayoutParams=(RelativeLayout.LayoutParams) loginLayout.getLayoutParams();
		return v;
	}
	public void initViews(View v){
//		usernameEditText=(EditText) v.findViewById(R.id.username_edt_txt);
//		PasswordEditText=(EditText) v.findViewById(R.id.paassword_edt_txt);
		loginButton=(Button) v.findViewById(R.id.login_btn);
		signUpButton=(Button) v.findViewById(R.id.signup_btn);
	}
	public void setListeners(){
		loginButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getActivity(),AppFragmentActivity.class));
			}
		});
	}
	
}
