package com.upc.aventurape.platform.profiles.interfaces.rest.resources;

public record ProfileEntrepreneurResource(
        Long id,
        Long userId,
        String name,
        String city,
        String country,
        String number,
        String postalCode,
        String streetAddress,
        String emailAddress
) {
}
