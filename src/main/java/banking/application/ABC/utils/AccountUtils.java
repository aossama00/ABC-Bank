package banking.application.ABC.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_CREATION_MESSAGE = "Your account is created successfully.";
    public static final String ACCOUNT_SUCCESS_CODE = "002";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user has an already created account!";
    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static String generateIban(){
        Year currentYear = Year.now();
        int min = 1000000;
        int max = 9999999;

        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        String year = String.valueOf(currentYear);

        String randomYear = String.valueOf(randNumber);

        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randNumber).toString();
    }
}
