package com.edu.restsmth.dto;

import com.edu.restsmth.model.Cpu;
import com.edu.restsmth.model.Gpu;
import com.edu.restsmth.model.Ram;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class LaptopDTO {
    private String brand;

    private String model;

    private Gpu gpu;

    private Cpu cpu;

    private Ram ram;

    private String refreshRate;
    private String resolution;
}
