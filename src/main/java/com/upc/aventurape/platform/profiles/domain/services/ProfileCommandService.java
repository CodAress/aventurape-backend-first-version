package com.upc.aventurape.platform.profiles.domain.services;

import com.upc.aventurape.platform.profiles.domain.model.aggregates.Profile;
import com.upc.aventurape.platform.profiles.domain.model.aggregates.ProfileEntrepreneur;
import com.upc.aventurape.platform.profiles.domain.model.commands.CreateProfileCommand;
import com.upc.aventurape.platform.profiles.domain.model.commands.DeleteProfileCommand;
import com.upc.aventurape.platform.profiles.domain.model.commands.UpdateProfileCommand;

import java.util.Optional;
import java.util.OptionalInt;

public interface ProfileCommandService {
    //Profile handle(CreateProfileCommand command);

    Optional<ProfileEntrepreneur> handle(CreateProfileCommand command);
    Optional<Profile> handle(UpdateProfileCommand command);
    void handle(DeleteProfileCommand command);
}
