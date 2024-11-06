package com.upc.aventurape.platform.publication.domain.model.queries;

import com.upc.aventurape.platform.publication.domain.model.valueobjects.ProfileId;

public record GetFavoritePublicationByProfileIdQuery(ProfileId profileId) {
}