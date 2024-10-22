package com.upc.aventurape.platform.publication.domain.services;

import com.upc.aventurape.platform.publication.domain.model.commands.CreateFavoritePublicationCommand;
import com.upc.aventurape.platform.publication.domain.model.entities.Favorite;

public interface FavoritePublicationCommandService {
    Favorite handle(CreateFavoritePublicationCommand command);

}
