package com.upc.aventurape.platform.publication.domain.model.queries;

import com.upc.aventurape.platform.publication.domain.model.valueobjects.EntrepreneurId;
import com.upc.aventurape.platform.publication.domain.model.valueobjects.ProfileId;
import lombok.Getter;

public record GetFavoritePublicationsByProfileIdOrderedByRatingQuery(
        Long entrepeneurId
) {

    public EntrepreneurId entrepreneurId() {
        return new EntrepreneurId(entrepeneurId);
    }
}
