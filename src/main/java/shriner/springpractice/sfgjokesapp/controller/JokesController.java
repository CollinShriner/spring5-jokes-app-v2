package shriner.springpractice.sfgjokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import shriner.springpractice.sfgjokesapp.service.ChuckJokeService;
import shriner.springpractice.sfgjokesapp.service.JokeService;

@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService)
    {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model)
    {
        model.addAttribute("joke", jokeService.tellJoke());

        model.addAttribute("type", jokeService.jokeType());

        return "index";
    }
}
