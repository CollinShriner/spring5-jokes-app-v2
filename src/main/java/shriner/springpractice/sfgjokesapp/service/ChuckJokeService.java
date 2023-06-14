package shriner.springpractice.sfgjokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"default", "chuck"})
@Service
public class ChuckJokeService implements JokeService{

    private final ChuckNorrisQuotes generate;

    public ChuckJokeService() {
        this.generate = new ChuckNorrisQuotes();
    }

    @Override
    public String tellJoke()
    {
        return generate.getRandomQuote();
    }

    @Override
    public String jokeType()
    {
        return "Here is a Chuck Norris joke:";
    }
}
