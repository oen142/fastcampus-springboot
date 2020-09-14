package kr.co.fastcampus.eatgo.domain;

public class Restaurant {

    private Long id;
    private String name;

    private String address;

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    public Long getId() {
        return id;
    }

    public String getInformation() {
        return name + " in " + address;
    }

}
