package com.edu.restsmth.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "laptop_id", nullable = false)
    private Long id;

    @Max(value = 10)
    private String brand;

    private String model;


    @OneToOne
    @JoinColumn(name = "gpu_id",referencedColumnName = "gpu_id")
    private Gpu gpu;
    @OneToOne
    @JoinColumn(name = "cpu_id",referencedColumnName = "cpu_id")
    private Cpu cpu;

    @OneToOne
    @JoinColumn(name = "ram_id", referencedColumnName = "ram_id")
    private Ram ram;

    private String refreshRate;
    private String resolution;


    @Override
    public String toString() {
        return "Laptop{" +
                "manufacturingCompany='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        if (brand != null ? !brand.equals(laptop.brand) : laptop.brand != null) return false;
        return model != null ? model.equals(laptop.model) : laptop.model == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }
}
