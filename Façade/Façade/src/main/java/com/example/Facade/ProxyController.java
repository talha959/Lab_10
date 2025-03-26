package com.example.Facade;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/image")
public class ProxyController {
    @GetMapping("/display")
    public ResponseEntity<String> displayImage(@RequestParam String filename) {
        Image image = new ProxyImage(filename);
        image.display();
        return ResponseEntity.ok("Image displayed successfully");
    }
}