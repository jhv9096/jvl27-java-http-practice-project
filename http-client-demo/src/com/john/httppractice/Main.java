package com.john.httppractice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.john.httppractice.Task;

public class Main {
    public static void main(String[] args) {
//        HttpService httpService = new HttpService();
//
//        try {
//            // Test GET
//            String getResponse = httpService.sendGet("https://jsonplaceholder.typicode.com/posts/1");
//            System.out.println("GET Response:\n" + getResponse);
//
//            // Test POST
//            String json = "{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}";
//            String postResponse = httpService.sendPost("https://jsonplaceholder.typicode.com/posts", json);
//            System.out.println("POST Response:\n" + postResponse);
//
//            // Test DELETE
//            String deleteResponse = httpService.sendDelete("https://jsonplaceholder.typicode.com/posts/1");
//            System.out.println("DELETE Response:\n" + deleteResponse);
//
//        } catch (Exception e) {
//            System.err.println("Error occurred: " + e.getMessage());
//        }

//        String json = "{ \"id\": 101, \"title\": \"Master JSON in Java\", \"completed\": true }";
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        try {
//            Task task = mapper.readValue(json, Task.class);
//            System.out.println("ID: " + task.id);
//            System.out.println("Title: " + task.title);
//            System.out.println("Completed: " + task.completed);
//        } catch (Exception e) {
//            System.err.println("Failed to parse JSON: " + e.getMessage());
//        }

        String json = """
        {
          "id": 1,
          "name": "John Doe",
          "email": "john@example.com",
          "address": {
            "street": "123 Main St",
            "city": "Victor",
            "zipcode": "14564"
          }
        }
        """;

        ObjectMapper mapper = new ObjectMapper();

        try {
            User user = mapper.readValue(json, User.class);
            System.out.println("Name: " + user.name);
            System.out.println("Email: " + user.email);
            System.out.println("City: " + user.address.city);
        } catch (Exception e) {
            System.err.println("Failed to parse JSON: " + e.getMessage());
        }


    }
}