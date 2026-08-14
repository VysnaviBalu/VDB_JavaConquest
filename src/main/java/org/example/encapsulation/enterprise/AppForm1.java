package org.example.encapsulation.enterprise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Immutable class details entry
 * User Builder Pattern for Clean Construction
 */
public class AppForm1 {

    private static final Logger logger = LoggerFactory.getLogger(AppForm1.class);

    private final String homeroomTeacherName;
    private final int standard;
    private final String major;

    public AppForm1(Builder builder){
        this.homeroomTeacherName = builder.homeroomTeacherName;
        this.standard = builder.standard;
        this.major = builder.major;
        logger.info("AppForm1 is created {}", this);
    }

    public String getHomeroomTeacherName(){ return homeroomTeacherName;}
    public int getStandard() {return standard;}
    public String getMajor(){ return major;}

    @Override
    public String toString() {
        return "ClassDetails[teacher=" + homeroomTeacherName +
                ", standard=" + standard +
                ", major=" + major + "]";
    }

    /**
     * Builder for AppForm1.
     */
    public static class Builder {

        private String homeroomTeacherName;
        private int standard;
        private String major;

        public Builder homeroomTeacherName(String name) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Teacher name cannot be empty!");
            }
            this.homeroomTeacherName = name.trim();
            return this;
        }

        public Builder standard(int standard) {
            if (standard < 1 || standard > 12) {
                throw new IllegalArgumentException("Standard must be between 1 and 12!");
            }
            this.standard = standard;
            return this;
        }

        public Builder major(String major) {
            if (major == null || major.trim().isEmpty()) {
                throw new IllegalArgumentException("Major cannot be empty!");
            }
            this.major = major.trim();
            return this;
        }

        public AppForm1 build() {
            return new AppForm1(this);
        }
    }
}
