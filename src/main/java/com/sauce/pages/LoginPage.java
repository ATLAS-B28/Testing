package com.sauce.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By userField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginBtn = By.id("login-button");
    private final By errorMsg = By.cssSelector("#login_button_container h3");

    public void setUsername(String username) {
        set(userField, username);
    }

    public void setPasswordField(String password) {
        set(passwordField, password);
    }

    public ProductPage clickLoginBtn() {
        click(loginBtn);
        return new ProductPage();
    }

    public ProductPage logIntoApplication(String user, String password) {
        setUsername(user);
        setPasswordField(password);
        return clickLoginBtn();
    }

    public String getErrorMsg() {
        return find(errorMsg).getText();
    }
}
