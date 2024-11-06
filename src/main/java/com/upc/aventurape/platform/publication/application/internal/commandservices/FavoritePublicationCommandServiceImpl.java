package com.upc.aventurape.platform.publication.application.internal.commandservices;

import com.upc.aventurape.platform.publication.domain.model.aggregates.Publication;
import com.upc.aventurape.platform.publication.domain.model.commands.CreateFavoritePublicationCommand;
import com.upc.aventurape.platform.publication.domain.model.commands.DeleteFavoriteCommand;
import com.upc.aventurape.platform.publication.domain.model.entities.Favorite;
import com.upc.aventurape.platform.publication.domain.model.valueobjects.ProfileId;
import com.upc.aventurape.platform.publication.domain.services.FavoritePublicationCommandService;
import com.upc.aventurape.platform.publication.infrastructure.persistence.jpa.repositories.FavoritePublicationRepository;
import org.springframework.stereotype.Service;

@Service
public class FavoritePublicationCommandServiceImpl implements FavoritePublicationCommandService {

    private final FavoritePublicationRepository favoritePublicationRepository;

    public FavoritePublicationCommandServiceImpl(FavoritePublicationRepository favoritePublicationRepository) {
        this.favoritePublicationRepository = favoritePublicationRepository;
    }

    @Override
    public Favorite handle(CreateFavoritePublicationCommand command) {
        ProfileId profileIdVO = command.profileId();
        Publication publication = command.publication();
        publication.setId(publication.getId());
        Favorite favorite = new Favorite(profileIdVO, publication);
        return favoritePublicationRepository.save(favorite);
    }

    @Override
    public void handle(DeleteFavoriteCommand command) {
        favoritePublicationRepository.deleteById(command.id());
    }
}
