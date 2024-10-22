package com.upc.aventurape.platform.publication.domain.model.commands;

public record AddCommentToPublicationCommand(
        Long publicationId,
        String content,
        Short rating
) {
}