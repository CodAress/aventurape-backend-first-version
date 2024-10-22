package com.upc.aventurape.platform.profiles.interfaces.rest.resources;

public record UpdateProfileResource(
        String name,
        String lastName,
        String birthDate,
        String gender,
        String location,
        String category
) {
}