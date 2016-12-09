package com.hfad.bitsandpizzas;


//import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//import android.widget.ArrayAdapter;
//import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends android.app.Fragment implements View.OnClickListener{

    private Button loginButton;
    private View view;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.login_fragment, container, false);
        loginButton = (Button) view.findViewById(R.id.btn_login);

        loginButton.setOnClickListener(this);

        return view;
    }

    private void showText(String user, String pass) {
        Toast.makeText(this.getActivity(), "Username: "+user+ "\n password: " + pass, Toast.LENGTH_LONG).show();
    }


    @Override
    public void onClick(View v) {
        EditText username = (EditText) view.findViewById(R.id.input_email);
        EditText password = (EditText) view.findViewById(R.id.input_password);

        final String userText = username.getText().toString();
        final String passText = password.getText().toString();

        showText(userText, passText);

    }
}
