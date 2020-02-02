package eu.sdacademy.pl.demo.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class Project {

    private String name;
    private Date startDate;
    private int team;
}
