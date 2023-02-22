package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Choices {
    /*
    "choices": [
            {
                "text": "\n\nHej! Vad kan jag göra för dig?",
                "index": 0,
                "logprobs": null,
                "finish_reason": "stop"
         }
        ],
     */

    @JsonProperty
    private String text;
    @JsonProperty
    private Integer index;
    @JsonProperty
    private String logprobs;
    @JsonProperty
    private String finish_reason;

    public String getText() {
        return text;
    }

    public Integer getIndex() {
        return index;
    }

    public String getLogprobs() {
        return logprobs;
    }

    public String getFinish_reason() {
        return finish_reason;
    }
}
