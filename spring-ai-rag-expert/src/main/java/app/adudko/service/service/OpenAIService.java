package app.adudko.service.service;

import app.adudko.service.model.Answer;
import app.adudko.service.model.Question;

public interface OpenAIService {

    Answer getAnswer(Question question);

}
