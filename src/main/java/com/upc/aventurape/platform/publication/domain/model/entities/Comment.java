package com.upc.aventurape.platform.publication.domain.model.entities;

import com.upc.aventurape.platform.iam.infrastructure.security.SecurityUtils;
import com.upc.aventurape.platform.publication.domain.model.aggregates.Publication;
import com.upc.aventurape.platform.publication.domain.model.valueobjects.CommentManager;
import com.upc.aventurape.platform.publication.domain.model.valueobjects.ProfileId;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "publication_id")
    private Publication publication;

    @Embedded
    private CommentManager commentManager;

    private String content;

    private Short rating;

    @Embedded
    private ProfileId profileid;

    private Long adventureId;

    public Comment(){
        this.publication = new Publication();
        this.content = "";
        this.rating = 0;
        this.profileid = new ProfileId();
        this.adventureId = SecurityUtils.getCurrentUserId();
    }

    public Comment(Publication publication, String content, Short rating) {
        this.publication = publication;
        this.content = content;
        this.rating = rating;
        this.adventureId = SecurityUtils.getCurrentUserId();
    }
}