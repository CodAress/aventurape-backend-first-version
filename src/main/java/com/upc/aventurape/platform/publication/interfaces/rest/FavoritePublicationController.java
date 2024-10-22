// src/main/java/com/upc/aventurape/platform/publication/interfaces/rest/FavoritePublicationController.java
package com.upc.aventurape.platform.publication.interfaces.rest;

import com.upc.aventurape.platform.iam.infrastructure.security.SecurityUtils;
import com.upc.aventurape.platform.publication.application.internal.outboundservices.acl.ExternalProfileService;
import com.upc.aventurape.platform.publication.domain.model.entities.Favorite;
import com.upc.aventurape.platform.publication.domain.model.queries.GetAllFavoritePublicationsQuery;
import com.upc.aventurape.platform.publication.domain.model.queries.GetAllPublicationsQuery;
import com.upc.aventurape.platform.publication.domain.model.queries.GetFavoritePublicationByProfileId;
import com.upc.aventurape.platform.publication.domain.model.queries.GetPublicationByEntrepeneurIdQuery;
import com.upc.aventurape.platform.publication.domain.services.FavoritePublicationCommandService;
import com.upc.aventurape.platform.publication.domain.services.FavoritePublicationQueryService;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.FavoriteResource;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.CreateFavoritePublicationResource;
import com.upc.aventurape.platform.publication.interfaces.rest.resources.PublicationResource;
import com.upc.aventurape.platform.publication.interfaces.rest.transform.FavoritePublicationResourceFromEntityAssembler;
import com.upc.aventurape.platform.publication.interfaces.rest.transform.CreateFavoritePublicationCommandFromResourceAssembler;
import com.upc.aventurape.platform.publication.interfaces.rest.transform.PublicationResourceFromEntityAssembler;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

// src/main/java/com/upc/aventurape/platform/publication/interfaces/rest/FavoritePublicationController.java

@RestController
@RequestMapping(value= "/api/v1/favorite-publications", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Favorite Publications")
public class FavoritePublicationController {

    private final FavoritePublicationCommandService favoriteCommandService;
    private final FavoritePublicationQueryService favoriteQueryService;
    private final ExternalProfileService externalProfileService;

    public FavoritePublicationController(FavoritePublicationCommandService favoriteCommandService,
                                         FavoritePublicationQueryService favoriteQueryService,
                                         ExternalProfileService externalProfileService) {
        this.favoriteCommandService = favoriteCommandService;
        this.favoriteQueryService = favoriteQueryService;
        this.externalProfileService = externalProfileService;
    }

    @GetMapping("/my-favorite-publications")
    public ResponseEntity<List<FavoriteResource>> getAllFavoritePublications() {
        var getAllFavoritePublicationsQuery = new GetAllFavoritePublicationsQuery();
        var favoritePublications = favoriteQueryService.handle(getAllFavoritePublicationsQuery);
        var publicationResources = favoritePublications.stream()
                .map(FavoritePublicationResourceFromEntityAssembler::toResourceFromEntity)
                .collect(Collectors.toList());
        return new ResponseEntity<>(publicationResources, HttpStatus.OK);
    }

    @PostMapping("/create-favorite-publication")
    public ResponseEntity<FavoriteResource> createFavoritePublication(@RequestBody CreateFavoritePublicationResource resource) {
        var createFavoritePublicationCommand = CreateFavoritePublicationCommandFromResourceAssembler.toCommandFromResource(resource);
        var favoritePublication = favoriteCommandService.handle(createFavoritePublicationCommand);
        var favoriteResource = FavoritePublicationResourceFromEntityAssembler.toResourceFromEntity(favoritePublication);
        return new ResponseEntity<>(favoriteResource, HttpStatus.CREATED);
    }
}