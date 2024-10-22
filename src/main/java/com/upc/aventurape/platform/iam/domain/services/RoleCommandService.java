package com.upc.aventurape.platform.iam.domain.services;

import com.upc.aventurape.platform.iam.domain.model.commands.SeedRolesCommand;

public interface RoleCommandService {
  void handle(SeedRolesCommand command);
}
