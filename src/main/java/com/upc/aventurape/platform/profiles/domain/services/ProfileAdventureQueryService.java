package com.upc.aventurape.platform.profiles.domain.services;

import com.upc.aventurape.platform.profiles.domain.model.aggregates.Profile;
import com.upc.aventurape.platform.profiles.domain.model.aggregates.ProfileAdventurer;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetAllProfilesAdventurerQuery;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetProfileAdventurerByEmailQuery;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetProfileAdventurerByIdQuery;

import java.util.List;
import java.util.Optional;

public interface ProfileAdventureQueryService {
    List<ProfileAdventurer> handle(GetAllProfilesAdventurerQuery query);
    Optional<ProfileAdventurer> handle(GetProfileAdventurerByIdQuery query);
    Optional<ProfileAdventurer> handle(GetProfileAdventurerByEmailQuery query);
}
