package ch.martinelli.demo.keycloak.data.service;

import ch.martinelli.demo.keycloak.data.repository.ConfigurationRepository;
import ch.martinelli.demo.keycloak.data.entity.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigurationService {

    private ConfigurationRepository configurationRepository;

    public ConfigurationService(ConfigurationRepository configurationRepository) {

        this.configurationRepository = configurationRepository;
    };

   public List<Configuration> findAllConfigurations(){
            return configurationRepository.findAll();
        };

 //   public List<Configuration> findMessageConfigurations(){
 //       return configurationRepository.findByName();
 //   };

   public List<Configuration> findMessageConfigurations(){
        return configurationRepository.findAll();
    };



    public void saveConfiguration(Configuration config){

    if(config == null){
        System.err.println("Configuration is null!");
        return;
    }
    configurationRepository.save(config);
}

}
