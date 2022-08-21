package com.edu.restsmth.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ram_id", nullable = false)
    private Long ramId;

    private String brand;
    private String memoryType;
    private Integer memorySize;
    private Integer frequency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ram ram = (Ram) o;

        if (brand != null ? !brand.equals(ram.brand) : ram.brand != null) return false;
        if (memoryType != null ? !memoryType.equals(ram.memoryType) : ram.memoryType != null) return false;
        if (memorySize != null ? !memorySize.equals(ram.memorySize) : ram.memorySize != null) return false;
        return frequency != null ? frequency.equals(ram.frequency) : ram.frequency == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (memoryType != null ? memoryType.hashCode() : 0);
        result = 31 * result + (memorySize != null ? memorySize.hashCode() : 0);
        result = 31 * result + (frequency != null ? frequency.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "brand='" + brand + '\'' +
                ", memoryType='" + memoryType + '\'' +
                ", memorySize=" + memorySize + " Gb" +
                ", frequency=" + frequency + " MHz" +
                '}';
    }
}
