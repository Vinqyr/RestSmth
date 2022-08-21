package com.edu.restsmth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
public class CpuDTO  {
    private String brand;
    private String processorNumber;
    private String lithography;
    private Integer cores;
    private Integer threads;
    private Double baseFrequency;
}
