package com.upc.aventurape.platform.publication.interfaces.rest.transform;

import com.upc.aventurape.platform.publication.domain.model.aggregates.Publication;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.PublicationResource;

public class PublicationResourceFromEntityAssembler {


    public static PublicationResource toResourceFromEntity(Publication entity) {
        return new PublicationResource(
               entity.getId(),
                entity.getEntrepreneurId().entrepreneurId(),
                entity.getAdventure().getNameActivity(),
                entity.getAdventure().getDescription(),
                entity.getAdventure().getTimeDuration(),
                entity.getImage(),
                entity.getAdventure().getCantPeople(),
                entity.getCost()
        );
    }



}
