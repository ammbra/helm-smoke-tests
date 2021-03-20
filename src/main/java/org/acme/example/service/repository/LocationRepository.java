package org.acme.example.service.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.example.model.Location;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class LocationRepository implements PanacheRepository<Location> {


    public Optional<Location> findByAddress(String address) {
            return find("address like ?1",  "%"+address+"%").stream().findAny();
    }

    public Optional<Location> findByAddress(String address, boolean findAny) {
        if (findAny)
            return findByAddress(address);
        else
            return find("address like ?1",  "%"+address+"%").stream().findFirst();
    }
}