package com.upc.aventurape.platform.publication.domain.model.aggregates;

import com.upc.aventurape.platform.publication.domain.model.entities.Adventure;
import com.upc.aventurape.platform.publication.domain.model.entities.Comment;
import com.upc.aventurape.platform.publication.domain.model.valueobjects.CommentManager;
import com.upc.aventurape.platform.publication.domain.model.valueobjects.EntrepreneurId;

import com.upc.aventurape.platform.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import jakarta.validation.constraints.Size;

@Setter
@Getter
@Entity
public class Publication extends AuditableAbstractAggregateRoot<Publication> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double rating;

    @Embedded
    private EntrepreneurId entrepreneurId;

    @OneToOne(mappedBy = "publication", cascade = CascadeType.ALL)
    private Adventure adventure;

    @OneToMany(mappedBy = "publication", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Comment> comments;

    @Embedded
    private CommentManager commentManager;


    @Column(nullable = false)
    @NotNull
    @Size(max = 1000)
    private String image;



    @Column(nullable = false)
    @NotNull
    private Integer cost;

    public Publication() {
        this.adventure = new Adventure();
        this.cost = 0;
        this.commentManager = new CommentManager();
        this.image = "";
        this.rating = 0.0;
    }

    public Publication(EntrepreneurId entrepreneurId, Adventure adventure, Integer cost, String image) {
        this.entrepreneurId = entrepreneurId;
        this.adventure = adventure;
        this.adventure.setPublication(this);
        this.cost = cost;
        this.image = image;
        this.commentManager = new CommentManager();
        this.rating = 0.0;
    }

    public void updateCost(Integer cost) {
        this.cost = cost;
    }

    public void updateEntrepreneurId(EntrepreneurId entrepreneurId) {
        this.entrepreneurId = entrepreneurId;
    }


    public void calculateRating() {
        double calculatedRating = commentManager.calculateRating(comments);
        this.rating =calculatedRating;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
