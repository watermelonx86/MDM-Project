package org.example.mdmprojectserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    public AppRunner() {

    }
    @Override
    public void run(String... args) throws Exception {
        logger.info("Hello, World!");
    }
}
