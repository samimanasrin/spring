package org.idb.TestSpring1.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 60)
    private String name;

    @Column(length = 60)
    private String email;

    @Column(length = 60)
    private String cell;

    @Column(length = 60)
    private String gender;

    @Column(length = 60)
    private String subject;

    @Column(length = 60)
    private String address;


}
