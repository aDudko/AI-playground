package app.adudko.service.service;

import app.adudko.service.model.Question;
import org.springframework.web.multipart.MultipartFile;

public interface OpenAIService {

    byte[] getSpeech(Question question);

    String getTranscript(MultipartFile file);

}
