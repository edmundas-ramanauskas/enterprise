package com.marketplace.app.services.impl;

import com.marketplace.app.domain.entities.Application;
import com.marketplace.app.domain.repositories.ApplicationRepository;
import com.marketplace.app.services.ApplicationService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    public Page<Application> getApplications(int page) {
        return applicationRepository.findAll(new PageRequest(page-1, 10));
    }
    
    @Override
    public Application getApplication(long id) {
        return applicationRepository.findOne(id);
    }
    
    public void setApplicationRepository(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }
    
    public ApplicationRepository getApplicationRepository() {
        return applicationRepository;
    }
}