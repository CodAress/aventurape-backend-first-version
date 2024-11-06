package com.upc.aventurape.platform.publication.interfaces.rest.transform;

import com.upc.aventurape.platform.publication.domain.model.aggregates.Publication;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.PublicationByOrderResource;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.PublicationResource;

public class PublicationByOrderResourceFromEntityAssembler {


    public static PublicationByOrderResource toResourceFromEntity(Publication entity) {
        return new PublicationByOrderResource(
               entity.getId(),
                entity.getEntrepreneurId().entrepreneurId(),
                entity.getAdventure().getNameActivity(),
                entity.getAdventure().getDescription(),
                entity.getAdventure().getTimeDuration(),
                entity.getImage(),
                entity.getAdventure().getCantPeople(),
                entity.getCost(),
                entity.getAverageRating()
        );
    }



}
