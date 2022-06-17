package com.ossovita.realestateapp.core.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "sale_advertisements")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaleAdvertisement {

    @Id
    @SequenceGenerator(name = "sa_seq", allocationSize = 1)
    @GeneratedValue(generator = "sa_seq")
    @Column(name = "sale_advertisement_pk")
    private long saleAdvertisementPk;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_fk", insertable = false, updatable = false)
    @JsonIgnore
    private User user;

    @Column(name = "user_fk")
    private long userFk;

}
