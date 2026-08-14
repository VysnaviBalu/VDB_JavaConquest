package org.example.initial.production;

// Good practice: import logger instead of using System.out.println

import java.util.logging.Logger;

/**
 * Main entry point of the application.
 * Javadoc comments like this explain the class to other developers.
 */
public class Main {

    // Logger is the production way to print messages
    // System.out.println is fine for learning but never used in production!
    private static final Logger logger = Logger.getLogger(org.example.initial.local.Main.class.getName());

    /**
     * Application starts here.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Use logger instead of System.out.println
        // INFO = normal messages, WARNING = issues, SEVERE = errors
        logger.info("Hello World!");
    }
}