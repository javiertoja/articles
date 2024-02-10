package data.oriented.bank.users;


import java.util.regex.Pattern;

/**
 * Represents a user email within the system
 * @param value - email address
 */
public record Email(String value) {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
    public Email{
        if (!EMAIL_PATTERN.matcher(value).matches()){
            throw new IllegalArgumentException("The provided email %s is invalid".formatted(value));
        }
    }
}
