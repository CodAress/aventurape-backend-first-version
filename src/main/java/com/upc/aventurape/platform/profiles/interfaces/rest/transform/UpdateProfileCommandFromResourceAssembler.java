package com.upc.aventurape.platform.profiles.interfaces.rest.transform;

import com.upc.aventurape.platform.profiles.domain.model.commands.UpdateProfileCommand;
import com.upc.aventurape.platform.profiles.interfaces.rest.resources.UpdateProfileResource;

public class UpdateProfileCommandFromResourceAssembler {
    public static UpdateProfileCommand toCommandFromResource(Long profileId,
                                                                UpdateProfileResource resource) {
        return new UpdateProfileCommand(
                profileId,
                resource.name(),
                resource.lastName(),
                resource.birthDate(),
                resource.gender(),
                resource.location(),
                resource.category());
    }
}
