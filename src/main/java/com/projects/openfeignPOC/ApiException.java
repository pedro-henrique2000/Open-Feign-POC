package com.projects.openfeignPOC;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiException extends RuntimeException {
    private int status;
    private String error;
    private String path;
}
