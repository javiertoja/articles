package data.oriented.bank.users;

import java.util.UUID;

/**
 * This interface identifies all different user types in the platform, each user can have a
 * different set or properties and some others in common, all common properties can be defined
 * as methods in interface, by that means the sealed implementations will be required to offer it,
 * because we are working with records this will translate that either a method or a property
 * that satisfy the name will be required.
 */
public sealed interface User {

    /**
     * Unique identifier
     */
    UUID identifier();

    /**
     * User registration email
     */
    String email();
    String name();
    String surname();

    /**
     * Represents a customer within the system
     * @param identifier
     * @param email
     * @param name
     * @param surname
     */
    record Customer(UUID identifier, String email, String name, String surname) implements User {}
}
