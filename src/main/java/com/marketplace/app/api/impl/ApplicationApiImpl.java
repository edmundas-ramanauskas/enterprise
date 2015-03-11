package com.marketplace.app.api.impl;

import com.marketplace.app.api.ApplicationApi;
import com.marketplace.app.domain.entities.Application;
import com.marketplace.app.services.ApplicationService;
import java.util.List;

/**
 *
 * @author edmundas
 */
public class ApplicationApiImpl implements ApplicationApi {
    
    private ApplicationService applicationService;

    @Override
    public List<Application> applications() {
        return applicationService.getApplications();
    }
    
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }
    
    public ApplicationService getApplicationService() {
        return applicationService;
    }
}