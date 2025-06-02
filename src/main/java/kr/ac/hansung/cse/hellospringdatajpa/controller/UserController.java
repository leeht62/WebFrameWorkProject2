package kr.ac.hansung.cse.hellospringdatajpa.controller;

import kr.ac.hansung.cse.hellospringdatajpa.entity.MyUser;
import kr.ac.hansung.cse.hellospringdatajpa.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/admin/home")
  public String listUsers(Model model) {
    List<MyUser> users = userRepository.findAll();
    model.addAttribute("users", users);
    return "adminhome";
  }
}
