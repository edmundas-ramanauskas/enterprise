package com.marketplace.app.services.impl;

import com.marketplace.app.domain.entities.Application;
import com.marketplace.app.domain.repositories.ApplicationRepository;
import com.marketplace.app.services.ApplicationService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author edmundas
 */
@Repository
public class ApplicationServiceImpl implements ApplicationService {
    
    @Autowired
    private ApplicationRepository applicationRepository;
    
    @Override
    public List<Application> getApplications() {
        List<Application> applications = new ArrayList<Application>();
        if(applicationRepository == null) {
            System.out.println("Repository null");
        } else {
            applications.addAll(applicationRepository.findAll());
        }
        return applications;
    }
    
    public void setApplicationRepository(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }
    
    public ApplicationRepository getApplicationRepository() {
        return applicationRepository;
    }
}