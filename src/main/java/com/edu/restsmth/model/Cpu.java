package com.edu.restsmth.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cpu")
@Getter
@Setter
@NoArgsConstructor
public class Cpu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cpu_id", nullable = false)
    private Long cpuId;

    private String brand;


    private String processorNumber;

    private String lithography;

    private Integer cores;

    private Integer threads;

    private Double baseFrequency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cpu cpu = (Cpu) o;

        if (brand != null ? !brand.equals(cpu.brand) : cpu.brand != null) return false;
        return processorNumber != null ? processorNumber.equals(cpu.processorNumber) : cpu.processorNumber == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (processorNumber != null ? processorNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "brand='" + brand + '\'' +
                ", processorNumber='" + processorNumber + '\'' +
                ", lithography='" + lithography + '\'' +
                ", cores=" + cores +
                ", threads=" + threads +
                ", baseFrequency='" + baseFrequency + " MHz" + '\'' +
                '}';
    }


}
