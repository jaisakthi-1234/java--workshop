package com.vetias.Temp.bean;

import java.time.LocalDate;

public record Organation(String name,
        String completeAddress,
        String webdite,
        String email,
        String contactNumber,
        long registrationNumber,
        LocalDate registrationDate) {


}
