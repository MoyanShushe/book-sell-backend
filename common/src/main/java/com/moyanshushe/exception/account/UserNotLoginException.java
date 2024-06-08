package com.moyanshushe.exception.account;

import com.moyanshushe.constant.AccountConstant;
import com.moyanshushe.exception.BaseException;

/*
 * Author: Hacoj
 * Version: 1.0
 */
public class UserNotLoginException extends BaseException {

    public UserNotLoginException() {
        super(AccountConstant.USER_NOT_LOGIN);
    }

    public UserNotLoginException(String msg) {
        super(msg);
    }

}