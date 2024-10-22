package com.upc.aventurape.platform.publication.domain.model.commands;

import com.upc.aventurape.platform.publication.domain.model.entities.Adventure;

public record UpdatePublicationCommand(
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
