package com.upc.aventurape.platform.publication.interfaces.rest.transform;

import com.upc.aventurape.platform.publication.domain.model.commands.AddCommentToPublicationCommand;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.AddCommentToPublicationResource;

public class AddCommentCommandFromResourceAssembler {
    public static AddCommentToPublicationCommand toCommandFromResource(AddCommentToPublicationResource resource) {
        return new AddCommentToPublicationCommand(
                resource.publicationId(),
                resource.content(),
                resource.rating()
        );
    }
}