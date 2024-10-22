package com.upc.aventurape.platform.publication.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record ProfileId(Long userId) {
    public ProfileId {
        if (userId < 0) {
            throw new IllegalArgumentException("User id cannot be negative");
        }
    }

    public ProfileId() {
        this(0L);
    }
}
