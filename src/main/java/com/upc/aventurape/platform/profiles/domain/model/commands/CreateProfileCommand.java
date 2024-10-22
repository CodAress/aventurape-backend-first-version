package com.upc.aventurape.platform.profiles.domain.model.commands;

public record CreateProfileCommand(String name, String lastName,
                                   String birthDate, String gender,
                                   String location, String category) {
}