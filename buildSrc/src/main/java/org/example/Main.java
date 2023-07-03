package org.example;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class Main extends DefaultTask {

    @TaskAction
    public void MyTask(){
        System.out.println("It is a custom task ant it really works!!!");
    }
}