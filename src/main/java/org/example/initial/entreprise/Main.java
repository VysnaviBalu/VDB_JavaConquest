package org.example.initial.entreprise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application entry point.
 *
 * In enterprise apps, main() is usually thin — it just bootstraps
 * the app and delegates everything else to other classes.
 * Business logic never lives in main()!
 */
public class Main {

    // SLF4J is the industry standard logging library
    // Works with Logback, Log4j2 — swap implementation without changing code!
    private static final Logger logger = LoggerFactory.getLogger(org.example.initial.local.Main.class);

    public static void main(String[] args) {

        // Log application startup — enterprise apps always log lifecycle events
        logger.info("Application starting...");

        try {
            // Delegate to application class — main() stays clean!
            Application app = new Application();
            app.run(args);

        } catch (Exception e) {
            // Never swallow exceptions silently in enterprise!
            // Always log with the exception object for full stack trace
            logger.error("Application failed to start", e);

            // Exit with non-zero code so deployment tools know it failed
            System.exit(1);
        }
    }
}
