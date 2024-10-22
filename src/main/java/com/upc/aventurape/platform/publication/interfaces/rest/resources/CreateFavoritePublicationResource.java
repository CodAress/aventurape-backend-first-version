package com.upc.aventurape.platform.publication.interfaces.rest.resources;

public record CreateFavoritePublicationResource(
        Long profileId,
        Long publicationId
) {
}
