package it.epicode.CodeCampus.service;
/*
import it.epicode.CodeCampus.model.View;
import it.epicode.CodeCampus.repository.ViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewService {
    private final ViewRepository ViewRepository;

    @Autowired
    public ViewService(ViewRepository ViewRepository) {
        this.ViewRepository = ViewRepository;
    }



    // Metodo che salva la percentuale di visualizzazione di un
    public View savePercentage(View View) throws IllegalArgumentException {
        if (View.getViewPercentage() < 0 || View.getViewPercentage() > 100) {
            throw new IllegalArgumentException("La percentuale di visualizzazione deve essere compresa tra 0 e 100.");
        }
        return ViewRepository.save(View);
    }

    // Metodo per registrare la ripresa della visualizzazione
    public View play(Long ViewId) {

        View View = ViewRepository.findById(ViewId)
                .orElseThrow(() -> new IllegalArgumentException("VideoView non trovato"));
        // Assumiamo che play non modifichi la viewPercentage,
        // ma potresti aggiornare lo stato se necessario
        return View;
    }


    // Metodo per aggiornare la percentuale di visualizzazione (es. avanzamento)
    public View updateViewPercentage(Long ViewId, Double percentage) {
        View View = ViewRepository.findById(ViewId)
                .orElseThrow(() -> new IllegalArgumentException("VideoView non trovato"));
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("La percentuale di visualizzazione deve essere compresa tra 0 e 100.");
        }
        View.setViewPercentage(percentage);
        return ViewRepository.save(View);
    }

    // Metodo per gestire pausa/stop
    public View pauseOrStop(Long ViewId, Double percentage) {
        return updateViewPercentage(ViewId, percentage);
    }


//    public static View registerView(View View) {
//        return ViewRepository.save(View);
//    }

    public void deleteViewById(Long id) {
        ViewRepository.deleteById(id);
    }

    public void deleteAllViews() {
        ViewRepository.deleteAll();
    }

    public long countViews() {
        return ViewRepository.count();
    }

//metoto che memoriza i dati di una view
    public View saveView(View view) {
        return ViewRepository.save(view);
    }



}*/
