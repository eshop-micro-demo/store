package com.kubewarrior.store;

public class FooDto {
    private long id;
    private String name;
    public FooDto() {}
    public FooDto(long id, String name) {
        this.setId(id);
        this.setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}