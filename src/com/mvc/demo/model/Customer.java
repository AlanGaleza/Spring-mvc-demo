package com.mvc.demo.model;

import com.mvc.demo.validation.CourseCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class Customer {

    private String firstName;

    @NotNull(message ="is required")
    @Size(message="is required", min=1)
    private String lastName;

    @NotNull(message ="is required")
    @Min(value = 0, message = "must be less than or equal to 10")
    @Max(value = 10, message = "must be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    @CourseCode(value="TOPS", message = "must start with TOPS")
    private String courseCode;

}
