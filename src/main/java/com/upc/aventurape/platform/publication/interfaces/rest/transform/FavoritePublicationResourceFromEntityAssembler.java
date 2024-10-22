package com.upc.aventurape.platform.publication.interfaces.rest.transform;

import com.upc.aventurape.platform.publication.domain.model.entities.Favorite;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.FavoriteResource;

public class FavoritePublicationResourceFromEntityAssembler {
    public static FavoriteResource toResourceFromEntity(Favorite entity) {
        return new FavoriteResource(
                entity.getId(),
                entity.getProfileid().userId(),
                entity.getPublication().getId()
        );
    }
}