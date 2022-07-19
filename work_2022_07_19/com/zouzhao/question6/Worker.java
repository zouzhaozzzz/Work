package com.zouzhao.question6;

import java.util.Objects;

public class Worker {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age && Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
