package com.project.david.mvpbasis.Presenters;

import com.project.david.mvpbasis.Interactors.LoginInteractorImp;
import com.project.david.mvpbasis.Interfaces.LoginInteractor;
import com.project.david.mvpbasis.Interfaces.LoginPresenter;
import com.project.david.mvpbasis.Interfaces.LoginView;
import com.project.david.mvpbasis.Interfaces.OperationStatus;

/**
 * Created by David on 24/10/2017.
 */

public class LoginPresenterImp implements LoginPresenter, OperationStatus {
    LoginView loginView;
    LoginInteractor loginInteractor;

    public LoginPresenterImp(LoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginInteractorImp(this);
    }

    @Override
    public void evaluateInputData(String user, String pass) {
        loginInteractor.ValidateData(user,pass);
    }

    @Override
    public void onSucess() {

    }

    @Override
    public void onError(String message) {

    }
}
