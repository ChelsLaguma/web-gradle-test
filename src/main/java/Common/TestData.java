package Common;

import org.apache.commons.lang3.RandomStringUtils;

public class TestData {

    public static final String FIRSTNAME = "user" + RandomStringUtils.randomNumeric(4);
    public static final String LASTNAME = "user" + RandomStringUtils.randomNumeric(4);
    public static final String PHONE = "074" + RandomStringUtils.randomNumeric(7);
    public static final String EMAIL = "user" + RandomStringUtils.randomNumeric(3) + "@test.com";
    public static final String PASSWORD = "password";
    public static final String SUCCESS_MSG = "Signup successfull please login.";
}