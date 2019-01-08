package org.mav_proj.pages;


import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.ioc.Messages;
import org.mav_proj.services.UserAuthenticatorService;

import javax.inject.Inject;


public class Index {
  @Persist
  @Property
  private String userName;

  @Property
  private String password;

  @Inject
  private UserAuthenticatorService authenticator;


  @InjectComponent("password")
  private PasswordField passwordField;

  @InjectComponent("userName")
  private TextField userNameField;
  @Component
  private Form loginForm;

  @Inject
private Messages messages;

  @InjectPage
    private ManageEmployee manageEmployee;

void onValidateFromLoginForm() {
    if (!authenticator.isValid(userName, password)) {
      loginForm.recordError(passwordField,messages.get("error"));
    }
  }

  Object onSuccessFromloginForm() {

    return manageEmployee;
  }

}









