package com.upc.aventurape.platform.publication.domain.model.commands;

import com.upc.aventurape.platform.publication.domain.model.aggregates.Publication;
import com.upc.aventurape.platform.publication.domain.model.valueobjects.ProfileId;

public record CreateFavoritePublicationCommand(ProfileId profileId, Publication publication) {
}
