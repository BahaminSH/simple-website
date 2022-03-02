package springbootwebsite.simplewebsite.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootwebsite.simplewebsite.Objects.ContentRequestDTO;
import springbootwebsite.simplewebsite.entity.ContentValue;
import springbootwebsite.simplewebsite.repository.JpaContentValueRepository;

@Service
public class InfoServiceUsingJpa implements InfoService {

    @Autowired
    private JpaContentValueRepository jpaContentValueRepo;

    private static final Logger logger = LogManager.getLogger(InfoServiceUsingJpa.class);

    @Override
    public String getContentWithJPA(ContentRequestDTO input) {
        ContentValue contentValue = new ContentValue();

        try {
            contentValue = jpaContentValueRepo.retrieveByUserAndType(input.getUserId(), input.getContentType());

            logger.info("data fetch with JPA");
            return contentValue.getContent_value();
        } catch (Exception e) {
            logger.info(e.getMessage().toString());
            return "False";
        }
    }

}
