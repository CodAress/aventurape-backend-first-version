package com.upc.aventurape.platform.profiles.domain.model.aggregates;

import com.upc.aventurape.platform.profiles.domain.model.commands.CreateProfileEntrepreneurCommand;
import com.upc.aventurape.platform.profiles.domain.model.valueobjects.NameEntrepreneurship;
import com.upc.aventurape.platform.profiles.domain.model.valueobjects.UserId;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

@Entity
public class ProfileEntrepreneur extends Profile {
    @Embedded
    private NameEntrepreneurship name;

    @Embedded
    private UserId userId;

    public ProfileEntrepreneur() {
        super();
    }

    public ProfileEntrepreneur(UserId userId, String email, String street, String number, String city, String postalCode, String country, String name) {
        super(email, street, number, city, postalCode, country);
        this.userId = userId;
        this.name = new NameEntrepreneurship(name);
    }

    public ProfileEntrepreneur(CreateProfileEntrepreneurCommand command) {
        super(command.email(), command.street(), command.number(), command.city(), command.postalCode(), command.country());
        this.userId = new UserId(command.userId());
        this.name = new NameEntrepreneurship(command.name());
    }

    public UserId getUserId() {
        return userId;
    }

    public String getName() {
        return name.nameEntrepreneurship();
    }
}