package com.project.AssetAssignment.entity;


import lombok.*;

import javax.persistence.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    private String status;
    private String Created_by;
    private Date Created_datetime;
    private String Updated_by;
    private Date Updated_datetime;








}
