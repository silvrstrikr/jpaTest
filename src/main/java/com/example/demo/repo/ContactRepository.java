package com.example.demo.repo;

import com.example.demo.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface ContactRepository extends JpaRepository <Contact, Long> {
    @Query("Select c from Contact c where c.firstname = ?1")
    public static void findByfirstName(String title){

    }
}
