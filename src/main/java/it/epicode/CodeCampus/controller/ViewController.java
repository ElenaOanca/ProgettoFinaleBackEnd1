package it.epicode.CodeCampus.controller;
/*
import it.epicode.CodeCampus.model.View;
import it.epicode.CodeCampus.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Views")
public class ViewController {


    private final ViewService viewService;

    @Autowired
    public ViewController(ViewService viewService) {
        this.viewService = viewService;
    }



//    @PostMapping
//    public ResponseEntity<View> createView(@RequestBody View View) {
//        View createdView = ViewService.registerView(View);
//        return new ResponseEntity<>(createdView, HttpStatus.CREATED);
//    }




    @PostMapping("/{videoViewId}/play")
    public ResponseEntity<View> play(@PathVariable Long ViewId) {
        try {
            View view = viewService.play(ViewId);
            return new ResponseEntity<>(view, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/{ViewId}/pause")
    public ResponseEntity<?> pause(@PathVariable Long ViewId, @RequestBody Double percentage) {
        try {
            View view = viewService.pauseOrStop(ViewId, percentage);
            return new ResponseEntity<>(view, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/{ViewId}/stop")
    public ResponseEntity<?> stop(@PathVariable Long ViewId, @RequestBody Double percentage) {
        try {
            View view = viewService.pauseOrStop(ViewId, percentage);
            return new ResponseEntity<>(view, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/{ViewId}/advance")
    public ResponseEntity<?> advance(@PathVariable Long ViewId, @RequestBody Double percentage) {
        try {
            View view = viewService.updateViewPercentage(ViewId, percentage);
            return new ResponseEntity<>(view, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}*/
