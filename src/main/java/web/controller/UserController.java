package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.servise.ServiseImpl;

@Controller
@RequestMapping("/users")
public class UserController {

    private final ServiseImpl servise;

    @Autowired
    public UserController(ServiseImpl servise) {
        this.servise = servise;
    }


    @GetMapping
    public String all(Model model) {
        model.addAttribute("people", servise.findAll());
        return "index";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", servise.findOne(id));
        return "show";
    }

    @GetMapping("/new")
    public String newUser(@ModelAttribute("person") User user) {
        return "/new";
    }

    @PostMapping
    public String createNewUser(@ModelAttribute("person") User user) {
        servise.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/update")
    public String updateUser(Model model, @PathVariable("id") int id) {
        model.addAttribute("person", servise.findOne(id));
        return "update";
    }

    @PatchMapping("/{id}")
    public String updateuser(@ModelAttribute("person") User user, @PathVariable("id") int id) {
        servise.updateUser(id, user);
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        servise.deleteById(id);
        return "redirect:/users";
    }

}
