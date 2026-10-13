package realWorld.classesAndObjects.equalsAndHashcode;

public class UserNoOverride {
    private final String userId;
    private final String email;

    public UserNoOverride(String userId, String email){
        this.userId = userId;
        this.email = email;
    }

    public String getUserId() { return userId;}
    public String getEmail(){ return email;}
}
