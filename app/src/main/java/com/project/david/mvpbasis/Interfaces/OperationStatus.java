package com.project.david.mvpbasis.Interfaces;

/**
 * Created by David on 25/10/2017.
 */

public interface OperationStatus {
    public void onSucess();

    public void onError(String message);
}
