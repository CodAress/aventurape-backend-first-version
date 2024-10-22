package com.upc.aventurape.platform.profiles.domain.model.valueobjects;

public record UserId(Long userId) {
    public UserId {
        if (userId < 0) {
            throw new IllegalArgumentException("User id cannot be negative");
        }
    }

    public UserId() {
        this(0L);
    }
}