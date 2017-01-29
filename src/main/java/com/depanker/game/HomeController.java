package com.depanker.game;

import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by depankersharma on 20/11/16.
 */
@RestController
public class HomeController {

    @RequestMapping(method = GET, produces = APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(OK)
    public Resource<HashMap<String, Object>> index() {
        HashMap<String, Object> restData = new HashMap<>();
        restData.put("data-1", 1);
        restData.put("data-2", 2);
        restData.put("data-3", 3);
        return new Resource<>(restData);
    }
}
