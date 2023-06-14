package shriner.springpractice.sfgjokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckJokeService implements JokeService{

    private ChuckNorrisQuotes generate = new ChuckNorrisQuotes();
    @Override
    public String tellJoke()
    {
        return generate.getRandomQuote();
    }
}
