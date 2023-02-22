import POJO.CompletionResponsePojo;
import POJO.CompletionsPojo;
import io.restassured.response.Response;
import org.json.JSONObject;

public class Completion {

    /*
        {
            "model": "text-davinci-003",
            "prompt": "Jaka jest różnica między kaczką?",
            "max_tokens": 64,
            "temperature": 0.5
        }
     */

    private static final ServiceHelper serviceHelper = new ServiceHelper();

    public static String MakeCompletion(String prompt){
        String resp="";
        String endpoint = "/completions";


        String model = "text-davinci-003";
        Integer maxTokens = 512;
        Double temperature = 0.2;

        CompletionsPojo bodyRequest = new CompletionsPojo(model, prompt, maxTokens, temperature);
        Response response = serviceHelper.sendPostRequest(bodyRequest,endpoint);
        CompletionResponsePojo responseBody = response.as(CompletionResponsePojo.class);
        resp = responseBody.getChoices().get(0).getText().replaceAll("\\R+", " ");;
        return resp;
    }

}
