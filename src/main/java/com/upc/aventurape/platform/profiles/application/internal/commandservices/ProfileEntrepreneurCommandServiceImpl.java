package com.upc.aventurape.platform.profiles.application.internal.commandservices;

import com.upc.aventurape.platform.profiles.domain.model.aggregates.ProfileEntrepreneur;
import com.upc.aventurape.platform.profiles.domain.model.commands.CreateProfileEntrepreneurCommand;
import com.upc.aventurape.platform.profiles.domain.services.ProfileEntrepreneurCommandService;
import com.upc.aventurape.platform.profiles.infrastructure.persistence.jpa.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileEntrepreneurCommandServiceImpl implements ProfileEntrepreneurCommandService {

    private final ProfileRepository profileRepository;

    ProfileEntrepreneurCommandServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Optional<ProfileEntrepreneur> handle(CreateProfileEntrepreneurCommand command) {
        var profile = new ProfileEntrepreneur(command);
        profileRepository.save(profile);
        return Optional.of(profile);
    }
}