package com.it.h2.m0.impl.service;

import com.it.h2.m0.api.service.ITestData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

/**
 * Created by flower9 on 23/11/2016.
 */
@Named
public class TestDataService implements ITestData {
    private Logger logger = LoggerFactory.getLogger(TestDataService.class);

    public void testData(String name) {
        logger.info("class => {}", this.getClass());
    }
}
