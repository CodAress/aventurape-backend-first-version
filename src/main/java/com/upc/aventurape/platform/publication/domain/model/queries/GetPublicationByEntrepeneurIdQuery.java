package com.upc.aventurape.platform.publication.domain.model.queries;

import com.upc.aventurape.platform.publication.domain.model.valueobjects.EntrepreneurId;

public record GetPublicationByEntrepeneurIdQuery(
        Long entrepeneurId
) {

    public EntrepreneurId entrepreneurId() {
        return new EntrepreneurId(entrepeneurId);
    }
}
