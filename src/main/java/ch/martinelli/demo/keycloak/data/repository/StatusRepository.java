package ch.martinelli.demo.keycloak.data.repository;

import ch.martinelli.demo.keycloak.data.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StatusRepository extends JpaRepository<Status, UUID> {

}
