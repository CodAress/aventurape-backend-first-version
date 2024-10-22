package com.upc.aventurape.platform.publication.application.internal.commandservices;

import com.upc.aventurape.platform.publication.domain.model.aggregates.Publication;
import com.upc.aventurape.platform.publication.domain.model.commands.*;
import com.upc.aventurape.platform.publication.domain.model.entities.Adventure;
import com.upc.aventurape.platform.publication.domain.model.entities.Comment;
import com.upc.aventurape.platform.publication.domain.model.entities.Favorite;
import com.upc.aventurape.platform.publication.domain.model.valueobjects.EntrepreneurId;
import com.upc.aventurape.platform.publication.domain.model.valueobjects.ProfileId;
import com.upc.aventurape.platform.publication.domain.services.PublicationCommandService;
import com.upc.aventurape.platform.publication.infrastructure.persistence.jpa.repositories.PublicationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PublicationCommandServiceImpl  implements PublicationCommandService {

    private final PublicationRepository publicationRepository;

    public PublicationCommandServiceImpl(PublicationRepository publicationRepository) {
        this.publicationRepository = publicationRepository;
    }


      @Override
      public Publication handle(CreatePublicationCommand command) {
            var adventure = new Adventure(  command.nameActivity(), command.description(), command.cantPeople(), command.timeDuration());
            var publication = new Publication(new EntrepreneurId(command.entrepreneurId()), adventure, command.cost(),command.image());
            publicationRepository.save(publication);
            return publication;
      }


    @Override
    public Optional<Publication> handle(UpdatePublicationCommand command) {
        if (!publicationRepository.existsById(command.publicationId())) {
            throw new IllegalArgumentException("Publication does not exist");
        }
        var publication = publicationRepository.findById(command.publicationId()).get();
        publication.setCost(command.cost());
        publication.setEntrepreneurId(new EntrepreneurId(command.entrepreneurId()));
        publication.setAdventure(new Adventure(command.nameActivity(), command.description(), command.timeDuration(), command.cantPeople()));
        publication.setImage(command.image());
        publicationRepository.save(publication);
        return Optional.of(publication);
    }

    @Override
    public void handle(DeletePublicationCommand command) {
        if (!publicationRepository.existsById(command.publicationId())) {
            throw new IllegalArgumentException("Publication does not exist");
        }
        publicationRepository.deleteById(command.publicationId());
    }

    @Override
    public Comment handle(AddCommentToPublicationCommand command) {
        if (!publicationRepository.existsById(command.publicationId())) {
            throw new IllegalArgumentException("Publication does not exist");
        }
        var publication = publicationRepository.findById(command.publicationId()).get();
        var comment = new Comment(publication, command.content(), command.rating());
        publication.getComments().add(comment);
        publicationRepository.save(publication);
        return comment;
    }
    @Override
    public void handle(AssignEntrepreneurToPublicationCommand command) {

        if (!publicationRepository.existsById(command.publicationId())) {
            throw new IllegalArgumentException("Publication does not exist");
        }
        var publication = publicationRepository.findById(command.publicationId()).get();
        publication.updateEntrepreneurId(command.entrepreneurId());
        publicationRepository.save(publication);
    }
}
