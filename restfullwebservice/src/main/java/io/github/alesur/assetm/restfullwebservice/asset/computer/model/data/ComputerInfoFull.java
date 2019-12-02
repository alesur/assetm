package io.github.alesur.assetm.restfullwebservice.asset.computer.model.data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.github.alesur.assetm.restfullwebservice.asset.computer.model.data.Computer;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name = "computer_info_full")
@Data
public class ComputerInfoFull {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(max = 250)
    private String processor;
    @NotNull
    @Size(max = 250)
    private String memory;
    @NotNull
    @Size(max = 250)
    private String serialNumber;
    @NotNull
    @Size(max = 250)
    private String osVersion;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "computer_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Computer computer;


}

