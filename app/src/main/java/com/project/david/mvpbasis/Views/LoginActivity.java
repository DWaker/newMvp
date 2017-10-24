package com.project.david.mvpbasis.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.project.david.mvpbasis.Interfaces.LoginView;
import com.project.david.mvpbasis.R;

public class LoginActivity extends AppCompatActivity implements LoginView{
EditText editUserName, editPass;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seUpViews();
    }

    private void seUpViews() {
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        editUserName = (EditText) findViewById(R.id.edit_user);
        editPass = (EditText) findViewById(R.id.edit_pass);
    }

    @Override
    public void setOnErrorResult(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showPorgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hidePorgressBar() {
        progressBar.setVisibility(View.GONE);
    }

}
