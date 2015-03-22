package com.marketplace.app.api.impl;

import com.marketplace.app.api.MonitorApi;
import com.marketplace.app.domain.beans.SiteStatusBean;
import com.marketplace.app.domain.beans.StatusBean;
import com.marketplace.app.services.WebClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author edmundas
 */
public class MonitorApiImpl implements MonitorApi {
    
    private static final Logger logger = LoggerFactory.getLogger(MonitorApiImpl.class);
    
    private WebClientService webClientService;
    
    @Override
    public SiteStatusBean checkStatus(String url) {
        url = url.trim();
        StatusBean status = webClientService.getSiteStatus(formatUrl(url));
        return new SiteStatusBean(url, status);
    }
    
    private String formatUrl(String url) {
        return (url.startsWith("http://") || url.startsWith("https://")) ? url : "http://"+url;
    }
    
    public void setWebClientService(WebClientService webClientService) {
        this.webClientService = webClientService;
    }
}