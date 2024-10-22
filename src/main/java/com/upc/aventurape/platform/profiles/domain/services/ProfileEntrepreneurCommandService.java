package com.upc.aventurape.platform.profiles.domain.services;

import com.upc.aventurape.platform.profiles.domain.model.aggregates.ProfileEntrepreneur;
import com.upc.aventurape.platform.profiles.domain.model.commands.CreateProfileEntrepreneurCommand;

import java.util.Optional;

public interface ProfileEntrepreneurCommandService {
    Optional<ProfileEntrepreneur> handle(CreateProfileEntrepreneurCommand command);
    //Optional<ProfileEntrepreneur> handle(CreateProfileEntrepreneurCommand command);
}
