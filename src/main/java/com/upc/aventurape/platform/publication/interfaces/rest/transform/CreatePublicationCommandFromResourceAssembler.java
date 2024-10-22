// src/main/java/com/upc/aventurape/platform/publication/interfaces/rest/transform/CreatePublicationCommandFromResourceAssembler.java
package com.upc.aventurape.platform.publication.interfaces.rest.transform;

import com.upc.aventurape.platform.publication.domain.model.commands.CreatePublicationCommand;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.CreatePublicationResource;

public class CreatePublicationCommandFromResourceAssembler {
    public static CreatePublicationCommand toCommandFromResource(
            CreatePublicationResource resource, Long entrepreneurId) {
        return new CreatePublicationCommand(
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