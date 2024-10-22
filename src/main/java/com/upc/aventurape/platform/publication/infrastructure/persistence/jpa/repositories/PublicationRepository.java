package com.upc.aventurape.platform.publication.infrastructure.persistence.jpa.repositories;

import com.upc.aventurape.platform.publication.domain.model.aggregates.Publication;
import com.upc.aventurape.platform.publication.domain.model.valueobjects.EntrepreneurId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {
    Boolean existsByAdventureNameActivity(String nameActivity);
    List<Publication> findByEntrepreneurId(EntrepreneurId entrepreneurId);

    boolean existsByEntrepreneurId(EntrepreneurId entrepreneurId);
}
