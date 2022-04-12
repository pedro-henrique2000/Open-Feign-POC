package com.projects.openfeignPOC;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Integer id;
    private String name;
    private double price;

}
