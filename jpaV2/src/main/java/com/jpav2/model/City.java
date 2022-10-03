package com.jpav2.model;

import javax.persistence.*;

// ********** The Entities ***********

@Entity
@Table(schema = "City")
//@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int population;

//    @Column(unique = true, nullable = false)
//    private String email;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    public City() {
    }

    public City(String name, int population) {

        this.name = name;
        this.population = population;
    }

//    public String getEmail() {
//        return email;
//    }


//
//    public void setEmail(String email) {
//        this.email = email;
//    }


    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getPopulation() {

        return population;
    }

    public void setPopulation(int population) {

        this.population = population;
    }

//    @Override
//    public int hashCode() {
//
//        int hash = 7;
//        hash = 79 * hash + Objects.hashCode(this.id);
//        hash = 79 * hash + Objects.hashCode(this.name);
//        hash = 79 * hash + this.population;
//
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//
//        final City other = (City) obj;
//        if (this.population != other.population) {
//            return false;
//        }
//
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//
//        return Objects.equals(this.id, other.id);
//    }

}