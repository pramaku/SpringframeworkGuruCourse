package guru.springframework.spring5.webapps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5.webapps.repos.AuthorRepository;

@Controller
@RequestMapping("/authors")
public class AuthorController
{
    private AuthorRepository authRepo;

    public AuthorController(AuthorRepository authRepo)
    {
        super();
        this.authRepo = authRepo;
    }

    @GetMapping
    public String getAllAuthors(Model model)
    {
        model.addAttribute("authors", authRepo.findAll());
        return "authors";
    }
}
