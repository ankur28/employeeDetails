package org.mav_proj.services;

public interface UserAuthenticatorService {
    public boolean isValid(String userName, String password);

}
