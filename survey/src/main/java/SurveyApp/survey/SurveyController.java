
package SurveyApp.survey;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;  

//mark class as Controller  
@RestController  
public class SurveyController   
{  
//autowire the CreateSurveyService class  
@Autowired  
SurveyService surveyService;  
//creating a get mapping that retrieves all the survey detail from the database   
@PostMapping("/createsurvey") 
private int saveSurvey(@RequestBody SurveyTopic surveys)   
{  
	surveyService.saveTopic(surveys);  
return surveys.getSurveyid();  
}  

@PostMapping("/submitsurvey") 
private int submitSurvey(@RequestBody SurveyList surveys)   
{  
	surveyService.submitList(surveys);  
return surveys.getsubmitSurveyid();  
}  

@GetMapping("/listanswers")
private List<SurveyList> getAllAnswers(@RequestParam(value = "topicId", defaultValue = "0") String topicId)   
{  
return surveyService.getAllAnswers(Integer.parseInt(topicId));  
}   
 
@GetMapping("/listtopics")
private List<SurveyTopic> getAllTopics()   
{  
return surveyService.getAllTopics();  
}     

}















