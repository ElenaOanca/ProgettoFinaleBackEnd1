package it.epicode.CodeCampus.controller;
/*
import it.epicode.CodeCampus.model.Video;
import it.epicode.CodeCampus.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/videos")
public class VideoController {

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping
    public ResponseEntity<List<Video>> getAllVideos() {
        List<Video> videos = videoService.getAllVideos();
        return new ResponseEntity<>(videos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Video> getVideoById(@PathVariable Long id) {
        Optional<Video> video = videoService.getVideoById(id);
        return video.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<?> createVideo(@RequestBody Video video) {
        try {
            Video createdVideo = videoService.createVideo(video);
            return new ResponseEntity<>(createdVideo, HttpStatus.CREATED);
        } catch (Exception e) {
            // Cattura l'eccezione specifica e restituisce una risposta con stato BAD_REQUEST (400)
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideoById(@PathVariable Long id) {
        videoService.deleteVideoById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}*/
