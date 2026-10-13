package realWorld.classesAndObjects;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import java.util.List;

/**
 * For a traditional class, with complex inner builder patter with optional fields, we can use
 * Lombak. Lombak is a tool that writes code behind the scenes during compilation using
 * annotations
 */

@Getter
@Builder(toBuilder = true)
public final class Approach5Lombok {
    @NonNull private final String userId;
    private final String email;

    @Builder.Default
    private String membershipType = "STANDARD";
    @Builder.Default
    private boolean isActive = true;

    private final List<String> roles;

    public Approach5Lombok (String userId, String email, String membershipType, boolean isActive, List<String> roles){
        if(email == null || !email.contains("@")){
            throw new IllegalArgumentException("Invalid Email");
        }
        this.userId = userId;
        this.email = email;
        this.membershipType = membershipType;
        this.isActive = isActive;
        this.roles = roles != null ? List.copyOf(roles) : List.of();
    }
}
