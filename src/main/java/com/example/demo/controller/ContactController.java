package com.example.demo.controller;

import com.example.demo.model.Contact;
import com.example.demo.repo.ContactRepository;
import com.example.demo.utils.DBPopultate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private DBPopultate dbPopultate;

    @GetMapping
    public String contacts(Model model){
        model.addAttribute("contacts", contactRepository.findAll());
        return "contacts";
    }

    @GetMapping("/add")
    public String add(Model model){
        Contact contact = new Contact();
        model.addAttribute("contact", contact);
        return "add";
    }

    @PostMapping("/add")
    public String saveBook(@ModelAttribute Contact contact){
        contactRepository.save(contact);
        return "redirect:/contacts";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable long id, Model model){
        Contact contact =  contactRepository.findById(id).get();
        model.addAttribute("contact", contact);
        return "update";
    }

    @PostMapping("/update/{id}")
    public String UpdateOldContact(@PathVariable long id, @ModelAttribute Contact contact){
        Contact found = contactRepository.findById(id).get();
        found.setFirstname(contact.getFirstname());
        found.setLastname(contact.getLastname());
        found.setEmail(contact.getEmail());
        found.setPhoto(contact.getPhoto());
        contactRepository.save(found);
        return "redirect:/contacts";
    }

    @RequestMapping("/delete/{id}")
    public String deleteBook (@PathVariable long id, Model model) {
        contactRepository.deleteById(id);
        model.addAttribute("contacts", contactRepository.findAll());
        return "redirect:/contacts";
    }

    @RequestMapping("/populate")
    public String populateBooks (Model model) {
        dbPopultate.populateBooks();
        model.addAttribute("contacts", contactRepository.findAll());
        return "redirect:/contacts";
    }
}
