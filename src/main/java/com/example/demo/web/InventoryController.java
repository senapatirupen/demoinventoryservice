package com.example.demo.web;

import com.example.demo.entity.Inventory;
import com.example.demo.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping("/api/inventory/{productId}")
    public Inventory getInventoryForProduct(@PathVariable("productId") Long productId) {
        log.info("Inventory request for product: {}", productId);
        Inventory inventory = inventoryService.getInventory(productId);
        log.info("inventory : {}", inventory);
        return inventory;
    }
}
