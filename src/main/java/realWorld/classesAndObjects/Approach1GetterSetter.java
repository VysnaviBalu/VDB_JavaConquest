package realWorld.classesAndObjects;

/**
 * Scenario :- We are building a user account system for an e-commerce website.
 * A user has a userId, email, a membershipType (Standard, Premium),
 * and an isActive status.
 **/

/**
 Why it fails at scale (The Hidden Risks):

 1. Invalid State Creation: A developer can write User u = new User(); and
 forget to set the email. Now we have a broken, half-baked object floating around the codebase
 that will eventually cause a NullPointerException down the line.
 2. Data Corruption via Mutability: Because of public setters, any piece of code anywhere
 in application can change a user’s email or membership type at any time:
 user.setMembershipType("PREMIUM"); without validation or logging.
 3. Thread Safety Nightmare: If two server threads access this object at the exact same millisecond,
 one reading the email while another calls setEmail(), the data can become corrupted.

 **/
public class Approach1GetterSetter {
    private String userId;
    private String email;
    private String membershipType;
    private boolean isActive;

    public Approach1GetterSetter() {} // Empty Constructor

    // Standard Getters and Setters
    public String getUserId(){ return userId;}
    public void setUserId(String id){this.userId = id;}

    public String getEmail(){ return email;}
    public void setEmail(String email){ this.email = email;}

    public String getMembershipType(){ return membershipType;}
    public void setMembershipType(String membershipType){ this.membershipType = membershipType;}

    public boolean isActive(){return isActive;}
    public void setActive(boolean active){ this.isActive = active;}

}
