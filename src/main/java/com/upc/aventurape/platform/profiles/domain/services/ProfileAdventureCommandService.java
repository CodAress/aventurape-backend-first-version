package com.upc.aventurape.platform.profiles.domain.services;

import com.upc.aventurape.platform.profiles.domain.model.aggregates.ProfileAdventurer;
import com.upc.aventurape.platform.profiles.domain.model.commands.CreateProfileAdventurerCommand;

import java.util.Optional;

public interface ProfileAdventureCommandService {
    //Optional<ProfileAdventurer> handle(CreateProfileAdventurerCommand command);
    ProfileAdventurer handle(CreateProfileAdventurerCommand command);
}
