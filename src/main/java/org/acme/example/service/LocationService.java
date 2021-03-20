package org.acme.example.service;

import org.acme.example.model.Location;
import org.acme.example.service.repository.LocationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class LocationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LocationService.class);

    @Inject
    LocationRepository repository;

    public Location findByAddress(String address, boolean findAny) {
        return repository.findByAddress(address, findAny).get();
    }

    public Location findByAddress(String address) {
        return repository.findByAddress(address).get();
    }
}


