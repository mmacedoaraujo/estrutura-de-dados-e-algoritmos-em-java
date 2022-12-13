package com.mmacedo.datastructure.queue;

import java.util.Objects;

public class Patient implements Comparable<Patient> {

    private String name;
    private int priority;

    public Patient() {
    }

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        if (priority != patient.priority) return false;
        return Objects.equals(name, patient.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + priority;
        return result;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Patient o) {
        return Integer.valueOf(this.priority).compareTo(o.getPriority());
    }
}
