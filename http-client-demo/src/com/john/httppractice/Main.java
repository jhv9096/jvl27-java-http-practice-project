package com.john.httppractice;

public class Main {
    public static void main(String[] args) {
        HttpService httpService = new HttpService();

        try {
            // Test GET
            String getResponse = httpService.sendGet("https://jsonplaceholder.typicode.com/posts/1");
            System.out.println("GET Response:\n" + getResponse);

            // Test POST
            String json = "{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}";
            String postResponse = httpService.sendPost("https://jsonplaceholder.typicode.com/posts", json);
            System.out.println("POST Response:\n" + postResponse);

            // Test DELETE
            String deleteResponse = httpService.sendDelete("https://jsonplaceholder.typicode.com/posts/1");
            System.out.println("DELETE Response:\n" + deleteResponse);

        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}