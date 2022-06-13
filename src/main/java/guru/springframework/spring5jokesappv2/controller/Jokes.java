package guru.springframework.spring5jokesappv2.controller;

import guru.springframework.spring5jokesappv2.service.ChuckNorrisQuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Jokes {

    private final ChuckNorrisQuotesService chuckNorrisQuotes;

    public Jokes(ChuckNorrisQuotesService chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        String joke = chuckNorrisQuotes.getRandomQuote();

        model.addAttribute("joke", joke);

        return "index";
    }
}
