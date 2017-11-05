package com.kodilla.patterns2.facade.employees;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by ola on 05/11/2017.
 */
@Service
@Aspect
public class OrderWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderWatcher.class);

    public void logEvent() {
        LOGGER.info("logging order");
    }

}
