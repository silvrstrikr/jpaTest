package com.example.demo.utils;

import com.example.demo.model.Contact;
import com.example.demo.repo.ContactRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class DBPopultate {
    @Autowired
    private ContactRepository contactRepository;

    private String [] firstName = {"Alan", "Sam", "Gem", "Hob", "Jim"};
    private String [] lastName = {"Charles", "Twain", "Loyed", "Beals", "Z."};
    private String [] email = {"blah@gmail.com", "Ginger@gmail.com", "Awesome@gmail.com", "jam@gmail.com", "PB@gmail.com"};
    private String [] photo = {"C:\\Users\\Alan\\Pictures\\javaWeek3.PNG", "", "", "", ""};

    public void populateBooks () {
        for (int n = 0; n < firstName.length; n++) {
            Contact Contact = new Contact();
            Contact.setFirstname(firstName[n]);
            Contact.setLastname(lastName[n]);
            Contact.setEmail(email[n]);
            Contact.setPhoto(photo[n]);
            contactRepository.save(Contact);
        }
    }
}
