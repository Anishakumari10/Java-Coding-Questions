package com.example.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {
 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    @SequenceGenerator(name = "address_seq", sequenceName = "address_seq", allocationSize = 1)
    @Column(name = "address_id")
    private Long addressId;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;
 
    @Column(name = "street")
    private String street;
 
    // Getters and setters
 
    public Long getAddressId() {
        return addressId;
    }
 
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
 
    public Employee getEmployee() {
        return employee;
    }
 
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
 
    public String getStreet() {
        return street;
    }
 
    public void setStreet(String street) {
        this.street = street;
    }
}