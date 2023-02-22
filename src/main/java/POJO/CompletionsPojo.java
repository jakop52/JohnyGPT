package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompletionsPojo {
    @JsonProperty
    private String model;
    @JsonProperty
    private String prompt;
    @JsonProperty
    private Integer max_tokens;
    @JsonProperty
    private Double temperature;

    public CompletionsPojo(String model, String prompt, Integer max_tokens, Double temperature) {
        this.model = model;
        this.prompt = prompt;
        this.max_tokens = max_tokens;
        this.temperature = temperature;
    }
}
