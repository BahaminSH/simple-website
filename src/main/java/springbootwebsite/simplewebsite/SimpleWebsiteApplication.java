package springbootwebsite.simplewebsite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;


@SpringBootApplication
public class SimpleWebsiteApplication extends SpringBootServletInitializer {

    private static final Logger logger = LogManager.getLogger(SimpleWebsiteApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SimpleWebsiteApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebsiteApplication.class, args);
        logger.info("Application has been started successfully");
    }

    @KafkaListener(topics = "KafkaMessageLogger", groupId = "group-id")
    public void listen(String message) {
        logger.info ("Received Messasge in group - group-id: " + message);
    }
}
