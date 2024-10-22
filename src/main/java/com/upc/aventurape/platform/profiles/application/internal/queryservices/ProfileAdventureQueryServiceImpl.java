package com.upc.aventurape.platform.profiles.application.internal.queryservices;

import com.upc.aventurape.platform.profiles.domain.model.aggregates.Profile;
import com.upc.aventurape.platform.profiles.domain.model.aggregates.ProfileAdventurer;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetAllProfilesAdventurerQuery;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetProfileAdventurerByEmailQuery;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetProfileAdventurerByIdQuery;
import com.upc.aventurape.platform.profiles.domain.services.ProfileAdventureQueryService;
import com.upc.aventurape.platform.profiles.infrastructure.persistence.jpa.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileAdventureQueryServiceImpl implements ProfileAdventureQueryService {
    private final ProfileRepository profileRepository;

    public ProfileAdventureQueryServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public List<ProfileAdventurer> handle(GetAllProfilesAdventurerQuery query) {
        return profileRepository.findAllAdventurers();
    }

    @Override
    public Optional<ProfileAdventurer> handle(GetProfileAdventurerByIdQuery query) {
        return profileRepository.findAdventurerById(query.id());
    }

    @Override
    public Optional<ProfileAdventurer> handle(GetProfileAdventurerByEmailQuery query) {
        return profileRepository.findAdventurerByEmail(query.email());
    }
}
