package com.example.demo.repo;

import com.example.demo.model.Contact;
import com.example.demo.utils.DBPopultate;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
public class ContactRepositoryTests {
    @Autowired
    private DBPopultate popultate;
    @Autowired
    private ContactRepository contactRepository;

    @Test
    private void testFindByTitle (){
        //contactRepository.deleteAll();

        //prep
        popultate.populateBooks();

        String titles [] = popultate.getFirstName();
        String authors [] = popultate.getLastName();
        String email [] = popultate.getEmail();
        String photo [] = popultate.getPhoto();

        //test


    }

}
