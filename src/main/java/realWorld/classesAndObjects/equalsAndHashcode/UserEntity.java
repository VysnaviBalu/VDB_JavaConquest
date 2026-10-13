package realWorld.classesAndObjects.equalsAndHashcode;

import java.util.Objects;
public class UserEntity {
    private final String userId;
    private final String email;

    public UserEntity(String userId, String email){
        this.userId = Objects.requireNonNull(userId, "userId");
        this.email = email;
    }

    public String getUserId(){ return userId;}
    public String getEmail(){ return email;}

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof UserEntity other)) return false;
        return userId.equals(other.userId);
    }

    @Override
    public int hashCode(){
       return Objects.hash(userId);
    }
}
