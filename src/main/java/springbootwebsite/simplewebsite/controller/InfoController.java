package springbootwebsite.simplewebsite.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springbootwebsite.simplewebsite.Objects.ContentRequestDTO;
import springbootwebsite.simplewebsite.service.InfoServiceUsingJpa;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("info")
public class InfoController {
    private static final Logger logger = LogManager.getLogger(InfoController.class);

    @Autowired
    private InfoServiceUsingJpa service;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping(path = "/getDevelopertName", method = RequestMethod.GET)
    public String getDeveloperName() {
        return "Bahamin Shahsavand";
    }

    @RequestMapping(path = "/getContent", method = RequestMethod.POST)
    public String getContent(HttpServletRequest request, @RequestBody ContentRequestDTO contentRequest) {
        String content = "";

        // content = service.getContent(contentRequest);
        content = service.getContentWithJPA(contentRequest);

        kafkaTemplate.send("KafkaMessageLogger", content);
        logger.info("Sent by Kafka: " + content);

        return content;
    }

}
