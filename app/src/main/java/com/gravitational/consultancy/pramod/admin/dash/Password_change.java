package com.gravitational.consultancy.pramod.admin.dash;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.gravitational.consultancy.pramod.admin.R;

public class Password_change extends AppCompatActivity implements View.OnClickListener {
    private EditText current_password;
    private EditText new_password;
    private EditText  confirm_password;
    private Button submit_button;
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_change);





        progressDialog = new ProgressDialog(this);

        progressDialog.setMessage("Please wait...");


        current_password = findViewById(R.id.current_pass);

        new_password = findViewById(R.id.new_pass);

        confirm_password = findViewById(R.id.confirm_pa);

        submit_button = findViewById(R.id.password_button);


        submit_button.setOnClickListener(this);


    }
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {    int id = menuItem.getItemId();

        if(id== android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
    @Override
    public void onClick(View v) {

    }
}
