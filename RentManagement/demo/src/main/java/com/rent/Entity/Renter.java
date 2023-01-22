package com.rent.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Renter {

    @Id
    @Column(name = "U_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer U_Id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String email;
    private String phone;
    private String credit;
    private String password;



}
