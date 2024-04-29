package ch.martinelli.demo.keycloak.utils;


import ch.martinelli.demo.keycloak.data.entity.fvm_monitoring;

public interface myCallback {
    void cancel();
    void save(fvm_monitoring mon);
    void delete(fvm_monitoring mon);
}