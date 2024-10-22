package com.upc.aventurape.platform.profiles.application.internal.commandservices;

import com.upc.aventurape.platform.profiles.domain.model.aggregates.ProfileAdventurer;
import com.upc.aventurape.platform.profiles.domain.model.commands.CreateProfileAdventurerCommand;
import com.upc.aventurape.platform.profiles.domain.model.valueobjects.EmailAddress;
import com.upc.aventurape.platform.profiles.domain.model.valueobjects.UserId;
import com.upc.aventurape.platform.profiles.domain.services.ProfileAdventureCommandService;
import com.upc.aventurape.platform.profiles.infrastructure.persistence.jpa.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileAdventurerCommandServiceImpl implements ProfileAdventureCommandService {
    private final ProfileRepository profileRepository;

    public ProfileAdventurerCommandServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public ProfileAdventurer handle(CreateProfileAdventurerCommand command) {
        var emailAddress = new EmailAddress(command.email());
        var userId = new UserId(command.userId());
        var profile = new ProfileAdventurer(command);
        profileRepository.save(profile);
        return profile;
    }
}
