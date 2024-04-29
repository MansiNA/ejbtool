package ch.martinelli.demo.keycloak.data.repository;

import ch.martinelli.demo.keycloak.data.entity.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ConfigurationRepository extends JpaRepository<Configuration, UUID> {

    @Query("Select c from Configuration c where c.userName='Michi'")
    List<Configuration> findByName();
}
