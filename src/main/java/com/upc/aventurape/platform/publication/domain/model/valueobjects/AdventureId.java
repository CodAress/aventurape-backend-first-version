package com.upc.aventurape.platform.publication.domain.model.valueobjects;

public record AdventureId(Long adventureId) {
    public AdventureId {
        if (adventureId < 0) {
            throw new IllegalArgumentException("Entrepreneur id cannot be negative");
        }
    }

    public AdventureId() {
        this(0L);
    }
}
