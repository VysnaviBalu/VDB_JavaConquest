package org.example.initial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application entry point.
 *
 * In enterprise apps, main() is usually thin — it just bootstraps
 * the app and delegates everything else to other classes.
 * Business logic never lives in main()!
 */
public class MainEnterprise {

    // SLF4J is the industry standard logging library
    // Works with Logback, Log4j2 — swap implementation without changing code!
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        // Log application startup — enterprise apps always log lifecycle events
        logger.info("Application starting...");

        try {
            // Delegate to application class — main() stays clean!
            ApplicationMain app = new ApplicationMain();
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
