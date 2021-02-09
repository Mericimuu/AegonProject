package SurveyApp.survey;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  

@Service
public class SurveyService {
	@Autowired
	SurveyListRepository listRepo; 
	@Autowired
	SurveyTopicRepository topicRepo; 
	public void saveTopic(SurveyTopic surveys)   
	{  
		topicRepo.save(surveys);  
	}  
	public List<SurveyTopic> getAllTopics()   
	{  
	List<SurveyTopic> topicList = new ArrayList<SurveyTopic>();  
	
	topicRepo.findAll().forEach(survey -> topicList.add(survey)); 
	topicList.forEach(topic -> {
		List<SurveyList> surveyList = getAllAnswers(topic.getSurveyid());
		Integer detractors = 0;
		Integer promoters = 0;
		for (SurveyList answer : surveyList) {
			 if (answer.getScore() <= 6)
		            detractors += 1;
		        if (answer.getScore() >= 9)
		            promoters += 1;	   
		}
		topic.setNpmscore((promoters / surveyList.size()) - (detractors / surveyList.size()) * 100);
	});
	
	
	return topicList;  
	}  
	
	public List<SurveyList> getAllAnswers(Integer topicId)   
	{  
	List<SurveyList> answerList = new ArrayList<SurveyList>();  
	listRepo.findAll().forEach(survey -> {if (survey.getSurveyTopicid() == topicId) answerList.add(survey);});  
	return answerList;  
	}
	
	public void submitList(SurveyList surveys)   
	{  
		listRepo.save(surveys);  
	} 
}
