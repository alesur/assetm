package io.github.alesur.assetm.restfullwebservice.asset.computer.model.data;


import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "computer")
@Data
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(max = 250)
    private String name;
    @NotNull
    @Size(max = 250)
    private String os;
    @NotNull
    @Size(max = 250)
    private String lastUser;
    @NotNull
    @Size(max = 250)
    private String lastIp;
    @NotNull
    @Size(max = 250)
    private String description;
    @NotNull
    @Size(max = 250)
    private String manufacturer;
    @NotNull
    @Size(max = 250)
    private String model;

    private Date lastActive;
    @NotNull
    @Size(max = 250)
    private String inventory;
    @NotNull
    @Size(max = 250)
    private String location;
    @NotNull
    @Size(max = 250)
    private String owner;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "site_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Site site;


}
