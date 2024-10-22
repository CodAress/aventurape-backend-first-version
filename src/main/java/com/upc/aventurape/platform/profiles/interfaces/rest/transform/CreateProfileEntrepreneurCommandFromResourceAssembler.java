package com.upc.aventurape.platform.profiles.interfaces.rest.transform;

import com.upc.aventurape.platform.profiles.domain.model.commands.CreateProfileEntrepreneurCommand;
import com.upc.aventurape.platform.profiles.interfaces.rest.resources.CreateProfileEntrepreneurResource;

public class CreateProfileEntrepreneurCommandFromResourceAssembler {
    public static CreateProfileEntrepreneurCommand toCommandFromResource(CreateProfileEntrepreneurResource resource, Long userId) {
        return new CreateProfileEntrepreneurCommand(
                userId,
                resource.emailAddress(),
                resource.addressStreet(),
                resource.addressNumber(),
                resource.addressCity(),
                resource.addressPostalCode(),
                resource.addressCountry(),
                resource.nameEntrepreneurship()
        );
    }
}