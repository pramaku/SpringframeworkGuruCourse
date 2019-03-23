package guru.springframework.spring5.webapps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5.webapps.repos.BookRepository;

@Controller
@RequestMapping("/books")
public class BookController
{
    private BookRepository bookRepo;

    public BookController(BookRepository bookRepo)
    {
        this.bookRepo = bookRepo;
    }

    @GetMapping
    public String getAllBooks(Model model)
    {
        model.addAttribute("books", bookRepo.findAll());
        return "books";
    }
}
