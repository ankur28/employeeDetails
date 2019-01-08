package org.mav_proj.services;

public class UserAuthenticatorServiceImpl implements UserAuthenticatorService {


    @Override
    public boolean isValid(String userName, String password) {
        if(userName.equals("abc")&& password.equals("pass"))
            return true;
        else
        return false;
    }}





