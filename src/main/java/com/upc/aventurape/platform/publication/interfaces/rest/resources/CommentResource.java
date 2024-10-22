package com.upc.aventurape.platform.publication.interfaces.rest.resources;

public record CommentResource(
        Long id,
        Long adventureId,
        String content,
        Short rating
) {
}