package springbootwebsite.simplewebsite.service;

import springbootwebsite.simplewebsite.Objects.ContentRequestDTO;

public interface InfoService {

    public String getContentWithJPA(ContentRequestDTO input);

}
