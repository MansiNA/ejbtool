package ch.martinelli.demo.keycloak.data.repository;


import ch.martinelli.demo.keycloak.data.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyRepository extends JpaRepository<Company, UUID> {

}
