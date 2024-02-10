package data.oriented.bank.users;

import java.util.regex.Pattern;

/**
 * Represents a user name within the system
 * @param value
 */
public record Name(String value) {

    private static final Pattern NAME_PATTERN = Pattern.compile("[A-Za-z]{1,32}");

    public Name{

        if (!NAME_PATTERN.matcher(value).matches()){
            throw new IllegalArgumentException("The provided name %s is invalid".formatted(value));
        }
    }
}
