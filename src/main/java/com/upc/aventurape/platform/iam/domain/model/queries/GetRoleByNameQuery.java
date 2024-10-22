package com.upc.aventurape.platform.iam.domain.model.queries;

import com.upc.aventurape.platform.iam.domain.model.valueobjects.Roles;

public record GetRoleByNameQuery(Roles name) {
}
