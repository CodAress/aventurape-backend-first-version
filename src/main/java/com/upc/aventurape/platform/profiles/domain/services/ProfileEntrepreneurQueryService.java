package com.upc.aventurape.platform.profiles.domain.services;

import com.upc.aventurape.platform.profiles.domain.model.aggregates.ProfileEntrepreneur;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetAllProfilesEntrepreneurQuery;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetProfileEntrepreneurByEmailQuery;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetProfileEntrepreneurByIdQuery;

import java.util.List;
import java.util.Optional;

public interface ProfileEntrepreneurQueryService {
    List<ProfileEntrepreneur> handle(GetAllProfilesEntrepreneurQuery query);
    Optional<ProfileEntrepreneur> handle(GetProfileEntrepreneurByIdQuery query);
    Optional<ProfileEntrepreneur> handle(GetProfileEntrepreneurByEmailQuery query);
}
