package com.upc.aventurape.platform.publication.interfaces.rest.resources;

public record PublicationByOrderResource(
       Long Id,
        Long entrepreneurId,
        String  nameActivity,
        String  description,
        Integer  timeDuration,
        String image,
        Integer cantPeople,
        Integer cost,
        double averageRating
) {
}
