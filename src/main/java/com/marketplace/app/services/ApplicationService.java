package com.marketplace.app.services;

import com.marketplace.app.domain.entities.Application;
import java.util.List;

/**
 *
 * @author edmundas
 */
public interface ApplicationService {
    List<Application> getApplications();
}
