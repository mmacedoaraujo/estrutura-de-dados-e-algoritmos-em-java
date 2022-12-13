package com.mmacedo.datastructure.queue;

import java.util.Objects;

public class PatientPriorityColor {

    private String name;
    private String colorPriority;

    public PatientPriorityColor() {
    }

    public PatientPriorityColor(String name, String colorPriority) {
        this.name = name;
        this.colorPriority = colorPriority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorPriority() {
        return colorPriority;
    }

    public void setColorPriority(String colorPriority) {
        this.colorPriority = colorPriority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientPriorityColor that = (PatientPriorityColor) o;

        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(colorPriority, that.colorPriority);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (colorPriority != null ? colorPriority.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "nome: " + name +
                ", prioridade: " + colorPriority;
    }
}
