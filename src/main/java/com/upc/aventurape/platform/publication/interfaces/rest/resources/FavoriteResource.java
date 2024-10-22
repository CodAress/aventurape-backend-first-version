package com.upc.aventurape.platform.publication.interfaces.rest.resources;

public record FavoriteResource(
        Long id,
        Long profileId,
        Long publicationId
) {
}
