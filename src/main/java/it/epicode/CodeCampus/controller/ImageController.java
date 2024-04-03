package it.epicode.CodeCampus.controller;
/*
import it.epicode.CodeCampus.model.Image;
import it.epicode.CodeCampus.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/images")
public class ImageController {

    private final ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping
    public ResponseEntity<List<Image>> getAllImages() {
        List<Image> images = imageService.getAllImages();
        return new ResponseEntity<>(images, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Image> getImageById(@PathVariable Long id) {
        Optional<Image> image = imageService.getImageById(id);
        return image.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Image> createImage(@RequestBody Image image) {
        Image createdImage = imageService.createImage(image);
        return new ResponseEntity<>(createdImage, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteImageById(@PathVariable Long id) {
        imageService.deleteImageById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // New endpoint for uploading images
    @PostMapping("/upload")
    public ResponseEntity<?> uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            Map uploadResult = imageService.uploadImage(file);
            return new ResponseEntity<>(uploadResult, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}*/
