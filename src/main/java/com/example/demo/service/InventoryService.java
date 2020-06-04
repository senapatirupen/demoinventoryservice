package com.example.demo.service;

import com.example.demo.entity.Inventory;
import com.example.demo.repository.InventoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    public Inventory getInventory(Long productId) {
        log.info("Inventory lookup request for productId: {}", productId);
        Optional<Inventory> inventory = inventoryRepository.findById(productId);
        return inventory.orElse(Inventory.builder()
                .inventoryId(1l)
                .productId(productId)
                .price(200)
                .quantity(2)
                .build());
    }

}

