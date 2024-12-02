package app.adudko.service.service;

import app.adudko.service.model.Question;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface OpenAIService {

    byte[] getImage(Question question);

    String getDescription(MultipartFile file) throws IOException;

}
