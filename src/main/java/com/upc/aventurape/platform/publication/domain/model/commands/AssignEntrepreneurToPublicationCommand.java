package com.upc.aventurape.platform.publication.domain.model.commands;

import com.upc.aventurape.platform.publication.domain.model.valueobjects.EntrepreneurId;

public record AssignEntrepreneurToPublicationCommand(
        Long publicationId,
        EntrepreneurId entrepreneurId
) {
}
