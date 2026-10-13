package realWorld.classesAndObjects;

import java.util.List;

/**
 * A Record is a special type of class introduced in modern
 * Java to eliminate boilerplate for data-holding classes.
 */

// One line creates fields, constructor, getters, equals(), hashCode(), and toString()!
public record Approach4JavaRecords(String userId, String email, String membershipType, boolean isActive, List<String> roles) {

    // Compact Constructor: Used for Validation and Defensive Copying
    public Approach4JavaRecords {
        if(email == null || !email.contains("@")){
            throw new IllegalArgumentException("Invalid Email");
        }
        // Defensive Copying
        roles = List.copyOf(roles);
    }
}
