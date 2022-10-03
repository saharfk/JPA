package com.jpav2.repository;

import com.jpav2.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//**************  The JPA Repository  *************
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
//    HAMIDE CODE
//    Optional<MicroServiceEntity> findByServiceNameAndServiceVersionAndSet(String serviceName, String version, String set);
//    Optional<MicroServiceEntity> findByServiceNameAndServiceVersionAndSetAndServiceType(String serviceName, String version, String set,String serviceType);
}
