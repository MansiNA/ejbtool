package ch.martinelli.demo.keycloak.data.service;

import ch.martinelli.demo.keycloak.data.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

    public interface PersonRepository extends JpaRepository<Person, UUID> {
}
