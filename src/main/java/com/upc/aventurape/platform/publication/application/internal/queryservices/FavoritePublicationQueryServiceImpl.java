package com.upc.aventurape.platform.publication.application.internal.queryservices;

import com.upc.aventurape.platform.publication.domain.model.entities.Favorite;
import com.upc.aventurape.platform.publication.domain.model.queries.GetAllFavoritePublicationsQuery;
import com.upc.aventurape.platform.publication.domain.model.queries.GetFavoritePublicationByProfileId;
import com.upc.aventurape.platform.publication.domain.services.FavoritePublicationQueryService;
import com.upc.aventurape.platform.publication.infrastructure.persistence.jpa.repositories.FavoritePublicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritePublicationQueryServiceImpl implements FavoritePublicationQueryService {

    private final FavoritePublicationRepository favoriteRepository;

    public FavoritePublicationQueryServiceImpl(FavoritePublicationRepository favoriteRepository) {
        this.favoriteRepository = favoriteRepository;
    }

    @Override
    public List<Favorite> handle(GetAllFavoritePublicationsQuery query) {
        return favoriteRepository.findAll();
    }

}