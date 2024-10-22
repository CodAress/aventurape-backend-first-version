package com.upc.aventurape.platform.publication.interfaces.rest.resources;

public record AddCommentToPublicationResource(
        Long publicationId,
        String content,
        Short rating,
        Long adventureId
) {

}
