/** Copyright (c) 2024. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 3 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed for educational purposes only, but WITHOUT
 * ANY WARRANTY; See the GNU General Public License version 3 for more
 * details (a copy is included in the LICENSE file that
 * accompanied this code).
 */
package de.hse.swt.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Main class for the Todo application. Starts the Spring Boot application.
 */
@SpringBootApplication
public class TodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    // /**
    //  * CommandLineRunner bean to initialize and display a simple in-memory list of Todo items.
    //  * 
    //  * @param todoService the TodoService to handle todo items
    //  * @return a CommandLineRunner that initializes the todo list
    //  */
    // @Bean
    // public CommandLineRunner init(TodoService todoService) {
    //     return args -> {
    //         todoService.addTodo("Buy groceries");
    //         todoService.addTodo("Study Spring Boot");
    //         todoService.getTodos().forEach(todo -> System.out.println(todo));
    //     };
    // }
}
