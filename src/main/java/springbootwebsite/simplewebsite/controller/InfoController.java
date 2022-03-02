package springbootwebsite.simplewebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private InfoServiceUsingJpa service;

    @RequestMapping(path = "/getDevelopertName", method = RequestMethod.GET)
    public String getDeveloperName(){
        return "Bahamin Shahsavand";
    }

    @RequestMapping(path = "/getContent", method = RequestMethod.POST)
    public String getContent(HttpServletRequest request, @RequestBody ContentRequestDTO contentRequest){
        String content = "";

       // content = service.getContent(contentRequest);
        content = service.getContentWithJPA(contentRequest);

        return content;
    }

}
