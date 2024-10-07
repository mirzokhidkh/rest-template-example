package com.example.mockapi.model.kafka;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KafkaHeader {

    @Schema(required = true, example = "758f14b9-b1e5-4900-b9de-956620c648f7")
    private String requestId;

    @Schema(required = true, example = "1.0.0")
    private String calledVersion;

    @Schema(required = true, example = "createLoanContract")
    private String methodName;

    @Schema(required = true, example = "SA")
    private String methodType;

    @Schema(required = true, example = "1.0.0",defaultValue = "ru")
    private String acceptLanguage;

    @Schema(example = "Solfy")
    private String source;

    @Schema(required = true, example = "eyJhbGciOiJIUzI1NiJ.efsadsad....")
    private String token;

    @Schema(example = "")
    private String type;

}
