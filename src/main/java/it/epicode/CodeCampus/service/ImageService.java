package it.epicode.CodeCampus.service;
/*
import it.epicode.CodeCampus.model.Image;
import it.epicode.CodeCampus.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {

    private  ImageRepository imageRepository;

    @Autowired
    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    private  Cloudinary cloudinary;

    // Inietta il bean Cloudinary che hai configurato

    public ImageService(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }

    public Map uploadImage(MultipartFile file) {
        try {
            // Converti MultipartFile in File o in un InputStream
            File uploadedFile = convertMultiPartToFile(file);
            // Carica il file su Cloudinary
            Map uploadResult = cloudinary.uploader().upload(uploadedFile, ObjectUtils.emptyMap());
            // Cancella il file temporaneo se necessario
            uploadedFile.delete();
            return uploadResult;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Converti MultipartFile in File
    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }
    public List<Image> getAllImages() {
        return imageRepository.findAll();
    }

    public Optional<Image> getImageById(Long id) {
        return imageRepository.findById(id);
    }

    public Image createImage(Image image) {
        return imageRepository.save(image);
    }

    public void deleteImageById(Long id) {
        imageRepository.deleteById(id);
    }
}*/
