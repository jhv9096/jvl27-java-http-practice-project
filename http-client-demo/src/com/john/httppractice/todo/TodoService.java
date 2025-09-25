package com.john.httppractice.todo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.john.httppractice.core.HttpService;
import com.john.httppractice.core.JsonUtil;

import java.io.IOException;
import java.util.List;

public class TodoService {
    private final HttpService httpService;
    private final ObjectMapper mapper;

    public TodoService() {
        this.httpService = new HttpService();
        this.mapper = JsonUtil.getMapper();
    }

    public List<Todo> getAllTodos() throws IOException, InterruptedException {
        String url = "https://jsonplaceholder.typicode.com/todos";
        String response = httpService.sendGet(url);

        // Extract just the JSON body
        String jsonBody = response.substring(response.indexOf("Response Body:\n") + "Response Body:\n".length());

        return mapper.readValue(jsonBody, new TypeReference<List<Todo>>() {});
    }

    public Todo getTodoById(int id) throws IOException, InterruptedException {
        String url = "https://jsonplaceholder.typicode.com/todos/" + id;
        String response = httpService.sendGet(url);

        String jsonBody = response.substring(response.indexOf("Response Body:\n") + "Response Body:\n".length());

        return mapper.readValue(jsonBody, Todo.class);
    }
}