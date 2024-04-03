package it.epicode.CodeCampus.controller;
/*
import it.epicode.CodeCampus.model.Favourite;
import it.epicode.CodeCampus.service.FavouriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/favourites")
public class FavouriteController {

    private final FavouriteService favouriteService;

    @Autowired
    public FavouriteController(FavouriteService favouriteService) {
        this.favouriteService = favouriteService;
    }

    @GetMapping
    public ResponseEntity<List<Favourite>> getAllFavourites() {
        List<Favourite> favourites = favouriteService.getAllFavourites();
        return new ResponseEntity<>(favourites, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Favourite> getFavouriteById(@PathVariable Long id) {
        Optional<Favourite> favourite = favouriteService.getFavouriteById(id);
        return favourite.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Favourite> createFavourite(@RequestBody Favourite favourite) {
        Favourite createdFavourite = favouriteService.createFavourite(favourite);
        return new ResponseEntity<>(createdFavourite, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavouriteById(@PathVariable Long id) {
        favouriteService.deleteFavouriteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}*/
