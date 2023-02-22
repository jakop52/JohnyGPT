package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Array;
import java.util.List;

public class CompletionResponsePojo {
/*
    {
        "id": "cmpl-6m8iZkV6BwypA3oGjcrOF0JpkEm63",
        "object": "text_completion",
        "created": 1676931275,
        "model": "text-davinci-003",
        "choices": [
            {
                "text": "\n\nHej! Vad kan jag göra för dig?",
                "index": 0,
                "logprobs": null,
                "finish_reason": "stop"
         }
        ],
        "usage": {
            "prompt_tokens": 2,
            "completion_tokens": 17,
            "total_tokens": 19
        }
    }
*/
    @JsonProperty
    private String id;
    @JsonProperty
    private String object;
    @JsonProperty
    private Integer created;
    @JsonProperty
    private String model;
    @JsonProperty
    private List<Choices> choices;
    @JsonProperty
    private Usage usage;

    public String getId() {
        return id;
    }

    public String getObject() {
        return object;
    }

    public Integer getCreated() {
        return created;
    }

    public String getModel() {
        return model;
    }

    public List<Choices> getChoices() {
        return choices;
    }

    public Usage getUsage() {
        return usage;
    }
}
