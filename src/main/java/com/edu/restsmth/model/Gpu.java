package com.edu.restsmth.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "gpu")
@Getter
@Setter
@NoArgsConstructor
public class Gpu {
    @Id
    @Column(name = "gpu_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gpuId;

    private String brand;

    private String graphicCoprocessor;
    private String memoryType;
    private Integer memorySize;
    private Integer clockSpeed;

    @Override
    public String toString() {
        return "GPU{" +
                "brand='" + brand + '\'' +
                ", graphicCoprocessor='" + graphicCoprocessor + '\'' +
                ", memoryType='" + memoryType + '\'' +
                ", memorySize=" + memorySize + " Gb" +
                ", clockSpeed=" + clockSpeed + " MHz" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gpu gpu = (Gpu) o;

        if (brand != null ? !brand.equals(gpu.brand) : gpu.brand != null) return false;
        if (graphicCoprocessor != null ? !graphicCoprocessor.equals(gpu.graphicCoprocessor) : gpu.graphicCoprocessor != null)
            return false;
        if (memoryType != null ? !memoryType.equals(gpu.memoryType) : gpu.memoryType != null) return false;
        if (memorySize != null ? !memorySize.equals(gpu.memorySize) : gpu.memorySize != null) return false;
        return clockSpeed != null ? clockSpeed.equals(gpu.clockSpeed) : gpu.clockSpeed == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (graphicCoprocessor != null ? graphicCoprocessor.hashCode() : 0);
        result = 31 * result + (memoryType != null ? memoryType.hashCode() : 0);
        result = 31 * result + (memorySize != null ? memorySize.hashCode() : 0);
        result = 31 * result + (clockSpeed != null ? clockSpeed.hashCode() : 0);
        return result;
    }
}
