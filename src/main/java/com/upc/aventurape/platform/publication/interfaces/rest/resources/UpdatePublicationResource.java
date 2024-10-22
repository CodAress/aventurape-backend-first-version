package com.upc.aventurape.platform.publication.interfaces.rest.resources;

import com.upc.aventurape.platform.publication.domain.model.entities.Adventure;

public record UpdatePublicationResource(
        Long publicationId,
        Long entrepreneurId,
        Adventure adventure,
        String  nameActivity,
        String  description,
        Integer  timeDuration,
        String image,
        Integer cantPeople,
        Integer cost
) {

}
