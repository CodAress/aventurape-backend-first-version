package com.upc.aventurape.platform.profiles.interfaces.rest.resources;

public record ProfileAdventurerResource (
        Long id,
        Long userId,
        String fullName,
        String gender,
        String email,
        String streetAddress
){ }
