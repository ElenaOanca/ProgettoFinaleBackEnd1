package it.epicode.CodeCampus.controller;
/*
import it.epicode.CodeCampus.model.Purchase;
import it.epicode.CodeCampus.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    private final PurchaseService purchaseService;

    @Autowired
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping
    public ResponseEntity<List<Purchase>> getAllPurchases() {
        List<Purchase> purchases = purchaseService.getAllPurchases();
        return new ResponseEntity<>(purchases, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Purchase> getPurchaseById(@PathVariable Long id) {
        Optional<Purchase> purchase = purchaseService.getPurchaseById(id);
        return purchase.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Purchase> createPurchase(@RequestBody Purchase purchase) {
        Purchase createdPurchase = purchaseService.createPurchase(purchase);
        return new ResponseEntity<>(createdPurchase, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePurchaseById(@PathVariable Long id) {
        purchaseService.deletePurchaseById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
*/