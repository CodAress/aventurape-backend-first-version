// src/main/java/com/upc/aventurape/platform/publication/domain/model/commands/CreatePublicationCommand.java
package com.upc.aventurape.platform.publication.domain.model.commands;

public record CreatePublicationCommand(
        Long entrepreneurId,
        String nameActivity,
        String description,
        Integer timeDuration,
        String image,
        Integer cantPeople,
        Integer cost
) {
}