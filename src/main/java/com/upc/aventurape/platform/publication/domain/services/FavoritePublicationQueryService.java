package com.upc.aventurape.platform.publication.domain.services;

import com.upc.aventurape.platform.publication.domain.model.entities.Favorite;
import com.upc.aventurape.platform.publication.domain.model.queries.GetAllFavoritePublicationsQuery;
import com.upc.aventurape.platform.publication.domain.model.queries.GetFavoritePublicationByProfileId;

import java.util.List;

public interface FavoritePublicationQueryService {
    List<Favorite> handle(GetAllFavoritePublicationsQuery query);
}
