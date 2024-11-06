package com.upc.aventurape.platform.publication.interfaces.rest.transform;

import com.upc.aventurape.platform.publication.domain.model.aggregates.Publication;
import com.upc.aventurape.platform.publication.domain.model.commands.UpdatePublicationCommand;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.UpdatePublicationResource;

public class UpdatePublicationCommandFromResourceAssembler {

    public static UpdatePublicationCommand toCommandFromResource(
            Long publicationId, Long entrepreneurId, UpdatePublicationResource resource) {
        return new UpdatePublicationCommand(
                publicationId,
                entrepreneurId,
                resource.nameActivity(),
                resource.description(),
                resource.timeDuration(),
                resource.image(),
                resource.cantPeople(),
                resource.cost()
        );
    }
}