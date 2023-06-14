package shriner.springpractice.sfgjokesapp.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("regular")
@Service
public class RegularJokeService implements  JokeService {

    //added a blank constructor to just be consistent
    public RegularJokeService() {
    }

    @Override
    public String tellJoke()
    {
        return "Why did the chicken cross the road? To get to the other side!";
    }

    @Override
    public String jokeType()
    {
        return "Here is a regular joke:";
    }

}
