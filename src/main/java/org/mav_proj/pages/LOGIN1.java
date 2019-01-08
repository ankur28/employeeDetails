package org.mav_proj.pages;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.ioc.annotations.Inject;


public class LOGIN1{
    @Property
    private String userName;

    @Property
    private String password;


    @InjectComponent("password")
    private PasswordField passwordField;

    @Component
    private Form loginForm;

    /**
     * Do the cross-field validation
     */

}

