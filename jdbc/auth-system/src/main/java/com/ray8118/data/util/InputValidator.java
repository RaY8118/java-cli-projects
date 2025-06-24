package com.ray8118.data.util;

import java.util.regex.Pattern;

public class InputValidator {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");

    public static boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }

    public static boolean isValidPassword(String password) {
        return password != null && password.length() >= 4;
    }

    public static boolean isValidName(String name) {
        return name != null && name.trim().length() >= 2;
    }
}
