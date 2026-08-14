package org.example.initial.entreprise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Core application class.
 * Separating app logic from entry point makes it testable!
 * You can create Application() in tests without running main()
 */
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    /**
     * Runs the application.
     * @param args command line arguments passed from main
     */
    public void run(String[] args) {

        // Log with context — enterprise logs tell you WHAT happened and WHEN
        logger.info("Hello World! Application running with {} argument(s)", args.length);

        // Business logic goes here or delegates to services
    }
}