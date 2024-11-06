package com.upc.aventurape.platform.publication.interfaces.rest.resources;

import com.upc.aventurape.platform.publication.domain.model.entities.Adventure;

public record UpdatePublicationResource(
        String nameActivity,
        String description,
        Integer timeDuration,
        String image,
        Integer cantPeople,
        Integer cost
) {}
