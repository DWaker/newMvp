package com.project.david.mvpbasis.Interactors;

import com.project.david.mvpbasis.Interfaces.LoginInteractor;
import com.project.david.mvpbasis.Interfaces.LoginPresenter;

/**
 * Created by leswil on 24/10/2017.
 */

public class LoginInteractorImp implements LoginInteractor {
    LoginPresenter loginPresenter;

    public LoginInteractorImp(LoginPresenter loginPresenter) {
        this.loginPresenter = loginPresenter;
    }

    @Override
    public void ValidateData(String name, String password) {
        if(name.equals(" ") || password.equals(" ")){

        }
    }
}
