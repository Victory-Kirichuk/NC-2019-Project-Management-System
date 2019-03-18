package com.netcracker.victory.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping(value = "/get-simple-object")
    SimpleObject getSimpleString() {
        SimpleObject simpleObject = new SimpleObject();
        simpleObject.setId("21312321");
        simpleObject.setName("Ivan");
        return simpleObject;
    }
}


class SimpleObject {

    String id;
    String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}