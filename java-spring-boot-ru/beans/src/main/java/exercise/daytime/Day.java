package exercise.daytime;

import jakarta.annotation.PostConstruct;

public class Day implements Daytime {
    private String name = "day";

    public String getName() {
        return name;
    }

    @PostConstruct
    public void day() {
        System.out.println("Bean is created!");
    }
}
