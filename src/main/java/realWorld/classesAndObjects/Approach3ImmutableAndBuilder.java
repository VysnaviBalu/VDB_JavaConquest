package realWorld.classesAndObjects;


public final class Approach3ImmutableAndBuilder {
    private final String userId;
    private final String email;
    private final String membershipType;
    private final boolean isActive;

    public Approach3ImmutableAndBuilder(Builder builder){
        this.userId = builder.userId;
        this.email = builder.email;
        this.membershipType = builder.membershipType;
        this.isActive = builder.isActive;
    }

    public static class Builder {

        private final String userId;
        private final String email;

        // Optional fields resembling default values
        private String membershipType = "STANDARD";
        private boolean isActive = true;

        public Builder (String userId, String email){
            this.userId = userId;
            this.email = email;
        }

        // Fluent method for optional fields
        public Builder setMembershipType(String type){
            this.membershipType = type;
            return this;
        }

        public Builder isActive(boolean isActive){
            this.isActive = isActive;
            return this;
        }

        public Approach3ImmutableAndBuilder build() {
            if(email == null || !email.contains("@")){
                throw new IllegalArgumentException("Invalid Email");
            }
            return new Approach3ImmutableAndBuilder(this);
        }
    }
}
