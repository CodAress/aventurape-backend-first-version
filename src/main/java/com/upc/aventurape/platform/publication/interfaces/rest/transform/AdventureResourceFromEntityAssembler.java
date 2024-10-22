package com.upc.aventurape.platform.publication.interfaces.rest.transform;

import com.upc.aventurape.platform.publication.domain.model.entities.Adventure;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.AdventureResource;

public class AdventureResourceFromEntityAssembler {
    public static AdventureResource toResourceFromEntity(Adventure adventure) {
        return new AdventureResource(
                adventure. getNameActivity(),
                adventure.getDescription(),
                adventure.getTimeDuration(),
                adventure.getCantPeople()
        );
    }
}
