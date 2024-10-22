// src/main/java/com/upc/aventurape/platform/profiles/interfaces/acl/ProfilesContextFacade.java
package com.upc.aventurape.platform.profiles.interfaces.acl;

import com.upc.aventurape.platform.profiles.domain.model.aggregates.Profile;
import com.upc.aventurape.platform.profiles.domain.model.commands.CreateProfileAdventurerCommand;
import com.upc.aventurape.platform.profiles.domain.model.commands.CreateProfileEntrepreneurCommand;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetProfileAdventurerByEmailQuery;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetProfileEntrepreneurByEmailQuery;
import com.upc.aventurape.platform.profiles.domain.model.valueobjects.EmailAddress;
import com.upc.aventurape.platform.profiles.domain.services.ProfileAdventureCommandService;
import com.upc.aventurape.platform.profiles.domain.services.ProfileAdventureQueryService;
import com.upc.aventurape.platform.profiles.domain.services.ProfileEntrepreneurCommandService;
import com.upc.aventurape.platform.profiles.domain.services.ProfileEntrepreneurQueryService;
import org.springframework.stereotype.Service;

@Service
public class ProfilesContextFacade {
    private final ProfileAdventureCommandService profileAdventureCommandService;
    private final ProfileEntrepreneurCommandService profileEntrepreneurCommandService;
    private final ProfileAdventureQueryService profileAdventureQueryService;
    private final ProfileEntrepreneurQueryService profileEntrepreneurQueryService;

    public ProfilesContextFacade(ProfileAdventureCommandService profileAdventureCommandService,
                                 ProfileEntrepreneurCommandService profileEntrepreneurCommandService,
                                 ProfileAdventureQueryService profileAdventureQueryService,
                                 ProfileEntrepreneurQueryService profileEntrepreneurQueryService) {
        this.profileAdventureCommandService = profileAdventureCommandService;
        this.profileEntrepreneurCommandService = profileEntrepreneurCommandService;
        this.profileAdventureQueryService = profileAdventureQueryService;
        this.profileEntrepreneurQueryService = profileEntrepreneurQueryService;
    }
/*
    public Long createProfile(String firstName, String lastName, String email, String street, String number, String city, String postalCode, String country, String gender, String profileType) {
        if ("adventurer".equalsIgnoreCase(profileType)) {
            CreateProfileAdventurerCommand command = new CreateProfileAdventurerCommand(firstName, lastName, email, street, number, city, postalCode, country, gender);
            var profile = profileAdventureCommandService.handle(command);
            return profile.map(Profile::getId).orElse(0L);
        } else if ("entrepreneur".equalsIgnoreCase(profileType)) {
            CreateProfileEntrepreneurCommand command = new CreateProfileEntrepreneurCommand(email, street, number, city, postalCode, country, firstName);
            var profile = profileEntrepreneurCommandService.handle(command);
            return profile.map(Profile::getId).orElse(0L);
        } else {
            throw new IllegalArgumentException("Invalid profile type: " + profileType);
        }
    }

    public Long fetchProfileIdByEmail(String email, String profileType) {
        if ("adventurer".equalsIgnoreCase(profileType)) {
            var getProfileByEmailQuery = new GetProfileAdventurerByEmailQuery(email);
            var profile = profileAdventureQueryService.handle(getProfileByEmailQuery);
            return profile.map(Profile::getId).orElse(0L);
        } else if ("entrepreneur".equalsIgnoreCase(profileType)) {
            var getProfileByEmailQuery = new GetProfileEntrepreneurByEmailQuery(email);
            var profile = profileEntrepreneurQueryService.handle(getProfileByEmailQuery);
            return profile.map(Profile::getId).orElse(0L);
        } else {
            throw new IllegalArgumentException("Invalid profile type: " + profileType);
        }
    }*/
}