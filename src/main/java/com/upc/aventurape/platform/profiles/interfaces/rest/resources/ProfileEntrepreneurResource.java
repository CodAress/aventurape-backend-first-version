package com.upc.aventurape.platform.profiles.interfaces.rest.resources;

public record ProfileEntrepreneurResource(
        Long id,
        Long userId,
        String name,
        String email,
        String streetAddress
) {
}
