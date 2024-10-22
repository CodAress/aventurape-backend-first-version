// src/main/java/com/upc/aventurape/platform/publication/interfaces/rest/transform/CreateFavoritePublicationCommandFromResourceAssembler.java
package com.upc.aventurape.platform.publication.interfaces.rest.transform;

import com.upc.aventurape.platform.publication.domain.model.aggregates.Publication;
import com.upc.aventurape.platform.publication.domain.model.commands.CreateFavoritePublicationCommand;
import com.upc.aventurape.platform.publication.domain.model.valueobjects.ProfileId;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.CreateFavoritePublicationResource;

public class CreateFavoritePublicationCommandFromResourceAssembler {
    public static CreateFavoritePublicationCommand toCommandFromResource(CreateFavoritePublicationResource resource) {
        ProfileId profileId = new ProfileId(resource.profileId());
        Publication publication = new Publication();
        publication.setId(resource.publicationId());
        return new CreateFavoritePublicationCommand(profileId, publication);
    }
}