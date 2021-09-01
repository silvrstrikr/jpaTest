package com.example.demo;

import com.example.demo.repo.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class SmokeTests {
    @Autowired
    private ContactRepository contactRepository;


}
