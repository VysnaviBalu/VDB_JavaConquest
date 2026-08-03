package org.example.inheritance.domain;

import java.util.Objects;

/**
 * Immutable value - safe for any Animal Entity
 *
 * <p> Subclasses are registered via Spring components </p>
 * scan and resolved through Animal services
 */
public abstract class AnimalEnter {
    private final String id;
    private final String name;
    private final int numberOfLegs;

}
