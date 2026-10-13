package realWorld.classesAndObjects;

/**
 * Scenario :- We are building a user account system for an e-commerce website.
 * A user has a userId, email, a membershipType (Standard, Premium),
 * and an isActive status.
 **/

/**
 The Trade-off of Approach 2:

 • The Good: It is perfectly thread-safe and immutable. The object cannot be
 created in an invalid state.
 • The Bad (Why it fails at scale): Imagine this class grows to have 12 fields
 (address, phone, couponCode, registrationDate, etc.), most of which are optional.
 Instantiating it turns into a nightmare:
 */
public final class Approach2ImmutableClassFields {
    private final String userId;
    private final String email;
    private final String membershipType;
    private final boolean isActive;

    public Approach2ImmutableClassFields(String id, String email, String membershipType, boolean active){
        if(email == null || !email.contains("@")){
            throw new IllegalArgumentException("Invalid Email!");
        }
        this.userId = id;
        this.email = email;
        this.membershipType = membershipType;
        this.isActive = active;
    }

    // Only Getter
    public String getUserId(){ return userId;}
    public String getEmail(){ return email;}
    public String getMembershipType(){ return membershipType;}
    public boolean isActive(){ return isActive;}

}
