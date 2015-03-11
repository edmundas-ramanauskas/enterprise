package com.marketplace.app.services.impl;

import com.marketplace.app.domain.entities.Application;
import com.marketplace.app.domain.repositories.ApplicationRepository;
import com.marketplace.app.services.ApplicationService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author edmundas
 */
public class ApplicationServiceImpl implements ApplicationService {
    
    @Inject
    private ApplicationRepository applicationRepository;
    
    @Override
    public List<Application> getApplications() {
        return applicationRepository.findAll();
    }
}