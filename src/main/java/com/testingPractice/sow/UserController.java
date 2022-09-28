package com.testingPractice.sow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.GeneratedValue;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String showUser(Model model)
    {
      List<User> users = userService.show();
        model.addAttribute("users", users);
        return "user";
    }

    @GetMapping("/users/new")
    public String AddNew(Model model){
        model.addAttribute("users", new User());
        model.addAttribute("page title", "Add New User");
        return "userAdd";
    }

    @PostMapping("/users/save")
    public String saveUser(User user)
    {
        userService.saveUser(user);
        return "redirect:/user";
    }

    @GetMapping("/users/edit/{id}")
    public String Update(@PathVariable("id") Integer id, Model model){
        try {

            User user = userService.updateUser(id);
            model.addAttribute("user", user);
            model.addAttribute("page title", "Edit User(ID: " + id + ")");
            return "userEdit";
        }catch (UserNotFoundException e){
            return "redirect:/user";
        }
    }

    @GetMapping("/users/delete/{id}")
    public String delete(@PathVariable("id") Integer id)
    {
        try {
            userService.delete(id);
        }catch (UserNotFoundException e){

        }
        return "redirect:/user";
    }
}
