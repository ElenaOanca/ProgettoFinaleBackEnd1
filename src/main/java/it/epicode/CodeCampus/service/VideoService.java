package it.epicode.CodeCampus.service;
/*
import it.epicode.CodeCampus.model.Video;
import it.epicode.CodeCampus.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoService {

    private final VideoRepository videoRepository;

    @Autowired
    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public Optional<Video> getVideoById(Long id) {
        return videoRepository.findById(id);
    }

    public Video createVideo(Video video) throws Exception {
        if (video.getVimeoUrl() == null || video.getVimeoUrl().isEmpty()) {
            throw new Exception("vimeoUrl non può essere vuoto");
        }

        // Aggiungi qui altre validazioni se necessario

        return videoRepository.save(video);
    }

    public void deleteVideoById(Long id) {
        videoRepository.deleteById(id);
    }


}
*/