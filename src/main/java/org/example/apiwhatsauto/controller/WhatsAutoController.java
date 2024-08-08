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
            @RequestParam("message") String message,
            @RequestParam("group_name") String groupName,
            @RequestParam("phone") String phone) {

        // Crear la respuesta
        System.out.println(appName+sender+message+groupName+phone);
        Map<String, String> response = new HashMap<>();
        response.put("reply", "Hello " + sender + ", we received your message: " + message);
        return response;
    }

    @PostMapping(value = "/mess", consumes = "application/x-www-form-urlencoded")
    public Map<String, String> methodPost() {

        // Crear la respuesta
        Map<String, String> response = new HashMap<>();
        response.put("reply", "Hello this is post");

        return response;
    }
}