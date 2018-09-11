package io.fdlessard.codebites.recursivepojo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;


@Data
@Builder
@ToString
public class Pojo implements Serializable {

    private String id;
    private String code;
    private String description;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @JsonIgnore
    private Pojo parentPojo;
    private List<Pojo> pojoItems;
}
