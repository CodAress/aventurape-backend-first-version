// src/main/java/com/upc/aventurape/platform/publication/domain/model/entities/Favorite.java
package com.upc.aventurape.platform.publication.domain.model.entities;

import com.upc.aventurape.platform.publication.domain.model.aggregates.Publication;
import com.upc.aventurape.platform.publication.domain.model.valueobjects.ProfileId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "profile_id")
    @Embedded
    private ProfileId profileid;

    @ManyToOne
    @JoinColumn(name = "publication_id", nullable = false)
    private Publication publication;

    public Favorite() {}

    public Favorite(ProfileId profileid, Publication publication) {
        this.profileid = profileid;
        this.publication = publication;
    }
}