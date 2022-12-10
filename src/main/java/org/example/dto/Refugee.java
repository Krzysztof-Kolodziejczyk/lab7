package org.example.dto;

import javax.persistence.*;

@Entity
@Table(name = "refugee")
public class Refugee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refugee_id")
    private Long refugeeId;
    private String name;
    private String lastname;
    private double x;
    private double y;

    public Long getRefugeeId() {
        return refugeeId;
    }

    public void setRefugeeId(Long refugeeId) {
        this.refugeeId = refugeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Refugee{" +
                "refugeeId=" + refugeeId +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
