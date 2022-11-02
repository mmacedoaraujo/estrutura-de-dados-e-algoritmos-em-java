package com.mmacedo.datastructure.test;

import java.util.Objects;

public class Class10Contact {

    private String name;
    private String telefone;
    private String email;

    public Class10Contact() {
    }

    public Class10Contact(String name, String telefone, String email) {
        this.name = name;
        this.telefone = telefone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class10Contact that = (Class10Contact) o;
        return Objects.equals(name, that.name) && Objects.equals(telefone, that.telefone) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, telefone, email);
    }

    @Override
    public String toString() {
        return "Class10Contact{" +
                "name='" + name + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
