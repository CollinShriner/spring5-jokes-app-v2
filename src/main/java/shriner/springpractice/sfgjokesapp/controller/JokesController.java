package shriner.springpractice.sfgjokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import shriner.springpractice.sfgjokesapp.service.ChuckJokeService;

@Controller
public class JokesController {

    private final ChuckJokeService chuckJokeService;

    public JokesController(ChuckJokeService chuckJokeService)
    {
        this.chuckJokeService = chuckJokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model)
    {
        model.addAttribute("joke", chuckJokeService.tellJoke());

        return "index";
    }
}
