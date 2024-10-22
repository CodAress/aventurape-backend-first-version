package com.upc.aventurape.platform.publication.interfaces.rest.resources;

public record AdventureResource(
        String  nameActivity,
        String  description,
        Integer  timeDuration,
        Integer cantPeople
) {
}
