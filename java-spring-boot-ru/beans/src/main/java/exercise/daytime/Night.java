package exercise.daytime;

import jakarta.annotation.PostConstruct;

public class Night implements Daytime {
    private String name = "night";

    public String getName() {
        return name;
    }

    @PostConstruct
    public void night() {
        System.out.println("Bean is created!");
    }
}
