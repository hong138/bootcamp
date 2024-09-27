package com.bootcamp.demo.matcher;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class PasswordMatcher extends TypeSafeMatcher<String> {
  @Override
  protected boolean matchesSafely(String item) {
    // 8-16 characters
    // contains at least one Captial letter
    // contains at least one small letter
    // contains at least one number
    // contains at least one special character !@#$
    return item.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#\\$])[A-Za-z\\d!@#\\$]{8,16}$");
    // (?=.*[A-Z]) asserts that there must be at least one uppercase letter.
    // (?=.*[a-z]) asserts that there must be at least one lowercase letter.
    // (?=.*\\d) asserts that there must be at least one digit.
    // (?=.*[!@#\\$]) asserts that there must be at least one of the special characters !@#$.
    // [A-Za-z\\d!@#\\$]{8,16} matches any combination of uppercase letters, 
    // lowercase letters, digits, and the specified special characters with a length between 8 and 16 characters.
  }

  @Override
  public void describeTo(Description errorMsg) {
    errorMsg.appendText("Invaild Email Address Format.");
  }

  public static PasswordMatcher create(){
    return new PasswordMatcher();
  }
}
