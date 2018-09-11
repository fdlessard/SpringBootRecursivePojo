package io.fdlessard.codebites.recursivepojo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@Slf4j
@RestController
public class PojoController {


    @GetMapping(value = "/pojo")
    public Pojo getPojo() {

        Pojo parentPojo = Pojo.builder()
                .id("1")
                .code("code1")
                .description("description1")
                .build();


        Pojo pojo1 =  Pojo.builder()
                .id("11")
                .code("code11")
                .description("description11")
                .parentPojo(parentPojo)
                .build();

        Pojo pojo2 =  Pojo.builder()
                .id("12")
                .code("code12")
                .description("description12")
                .parentPojo(parentPojo)
                .build();

        List<Pojo> pojoItems = Arrays.asList(pojo1, pojo2);

        parentPojo.setPojoItems(pojoItems);


        System.out.println(parentPojo);

        return parentPojo;
    }

}
