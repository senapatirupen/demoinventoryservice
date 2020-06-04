package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Builder
@Table(name = "Inventory")
public class Inventory {

    @Id
    @GeneratedValue
    private Long inventoryId;

    Long productId;
    Integer price;
    Integer quantity;

}


