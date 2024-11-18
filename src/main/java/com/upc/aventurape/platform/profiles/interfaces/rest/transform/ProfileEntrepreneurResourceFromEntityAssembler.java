package com.upc.aventurape.platform.profiles.interfaces.rest.transform;

import com.upc.aventurape.platform.profiles.domain.model.aggregates.ProfileEntrepreneur;
import com.upc.aventurape.platform.profiles.interfaces.rest.resources.ProfileEntrepreneurResource;

public class ProfileEntrepreneurResourceFromEntityAssembler {
    public static ProfileEntrepreneurResource toResourceFromEntity(ProfileEntrepreneur entity) {
        Long userId = entity.getUserId() != null ? entity.getUserId().userId() : null;
        return new ProfileEntrepreneurResource(
                entity.getId(),
                userId,
                entity.getName(),
                entity.getCity(),
                entity.getCountry(),
                entity.getNumber(),
                entity.getPostalCode(),
                entity.getStreetAddress(),
                entity.getEmailAddress()
                );
    }
}