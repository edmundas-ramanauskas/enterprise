package com.marketplace.app.domain.repositories;

import com.marketplace.app.domain.entities.Application;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author edmundas
 */
public interface ApplicationRepository extends Repository<Application, Long> {
    
    List<Application> findAll();
}