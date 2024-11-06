package com.upc.aventurape.platform.profiles.application.internal.queryservices;

import com.upc.aventurape.platform.profiles.domain.model.aggregates.ProfileEntrepreneur;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetAllProfilesEntrepreneurQuery;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetProfileEByUserIdQuery;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetProfileEntrepreneurByEmailQuery;
import com.upc.aventurape.platform.profiles.domain.model.queries.GetProfileEntrepreneurByIdQuery;
import com.upc.aventurape.platform.profiles.domain.model.valueobjects.UserId;
import com.upc.aventurape.platform.profiles.domain.services.ProfileEntrepreneurQueryService;
import com.upc.aventurape.platform.profiles.infrastructure.persistence.jpa.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileEntrepreneurQueryServiceImpl implements ProfileEntrepreneurQueryService {
    private final ProfileRepository profileRepository;
    public ProfileEntrepreneurQueryServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }


    @Override
    public List<ProfileEntrepreneur> handle(GetAllProfilesEntrepreneurQuery query) {
        return profileRepository.findAllEntrepreneurs();
    }

    @Override
    public Optional<ProfileEntrepreneur> handle(GetProfileEntrepreneurByIdQuery query) {
        return profileRepository.findEntrepreneurById(query.id());
    }

    @Override
    public Optional<ProfileEntrepreneur> handle(GetProfileEntrepreneurByEmailQuery query) {
        return profileRepository.findEntrepreneurByEmail(query.email());
    }

    @Override
    public Optional<ProfileEntrepreneur> handle(GetProfileEByUserIdQuery query) {
        return profileRepository.findEntrepreneurByUserId(new UserId(query.userId()));
    }
}
