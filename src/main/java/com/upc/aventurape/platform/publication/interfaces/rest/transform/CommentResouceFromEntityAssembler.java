package com.upc.aventurape.platform.publication.interfaces.rest.transform;

import com.upc.aventurape.platform.publication.domain.model.entities.Comment;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.CommentResource;

public class CommentResouceFromEntityAssembler {
    public static CommentResource toResourceFromEntity(Comment comment) {
        return new CommentResource(
                comment.getId(),
                comment.getAdventureId(),
                comment.getContent(),
                comment.getRating()
        );
    }
}