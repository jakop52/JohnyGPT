package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Usage {
    /*
    "usage": {
            "prompt_tokens": 2,
            "completion_tokens": 17,
            "total_tokens": 19
        }
     */

    @JsonProperty
    private Integer prompt_tokens;
    @JsonProperty
    private Integer completion_tokens;
    @JsonProperty
    private Integer total_tokens;

    public Integer getPrompt_tokens() {
        return prompt_tokens;
    }

    public Integer getCompletion_tokens() {
        return completion_tokens;
    }

    public Integer getTotal_tokens() {
        return total_tokens;
    }
}
