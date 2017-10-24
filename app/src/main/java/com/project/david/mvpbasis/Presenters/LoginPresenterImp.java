package com.project.david.mvpbasis.Presenters;

import com.project.david.mvpbasis.Interfaces.LoginInteractor;
import com.project.david.mvpbasis.Interfaces.LoginView;

/**
 * Created by David on 24/10/2017.
 */

public class LoginPresenterImp {
    LoginView loginView;
    LoginInteractor loginInteractor;

    public LoginPresenterImp(LoginView loginView) {
        this.loginView = loginView;
        //this.loginInteractor = new LoginPresenterImp();
    }
}
