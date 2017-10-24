package com.project.david.mvpbasis.Interactors;

import com.project.david.mvpbasis.Interfaces.LoginPresenter;

/**
 * Created by leswil on 24/10/2017.
 */

public class LoginInteractorImp {
    LoginPresenter loginPresenter;

    public LoginInteractorImp(LoginPresenter loginPresenter) {
        this.loginPresenter = loginPresenter;
    }
}
