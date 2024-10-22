package com.example.mockapi.model.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class CreateLoanContract {

    @NotNull
    private Integer id;

    @NotNull
    @NotBlank
    @Size(max = 3)
    private String code;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @Valid
    private List<Guar> data;


}
