package org.example.apiwhatsauto.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class WhatsAutoController {

    @PostMapping(value = "/message", consumes = "application/x-www-form-urlencoded")
    public Map<String, String> handleMessage(
            @RequestParam("app") String appName,
            @RequestParam("sender") String sender,
            @RequestParam("message") String message) {

        // Crear la respuesta
        Map<String, String> response = new HashMap<>();
        response.put("reply", "Hello " + sender + ", we received your message: " + message);

        return response;
    }
}