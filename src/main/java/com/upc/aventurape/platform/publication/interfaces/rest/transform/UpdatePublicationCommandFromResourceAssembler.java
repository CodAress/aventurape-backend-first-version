package com.upc.aventurape.platform.publication.interfaces.rest.transform;

import com.upc.aventurape.platform.publication.domain.model.aggregates.Publication;
import com.upc.aventurape.platform.publication.domain.model.commands.UpdatePublicationCommand;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.UpdatePublicationResource;

public class UpdatePublicationCommandFromResourceAssembler {

        public static UpdatePublicationCommand toCommandFromResource(UpdatePublicationResource resource) {
            return new UpdatePublicationCommand(
                    resource.publicationId(),
                    resource.entrepreneurId(),
                    resource.adventure(),
                    resource.nameActivity(),
                    resource.description(),
                    resource.timeDuration(),
                    resource.image(),
                    resource.cantPeople(),
                    resource.cost()
            );
        }
}
