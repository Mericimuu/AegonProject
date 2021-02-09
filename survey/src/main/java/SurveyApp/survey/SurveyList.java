package SurveyApp.survey;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table; 
  
@Entity    
@Table  
public class SurveyList 
{    
@Id  
@Column  
private int submitsurveyid;  
@Column  
private int surveytopicid; 
@Column  
private String clientanswer;  
@Column  
private int score;     
@Column  
private String feedback; 

public int getsubmitSurveyid()   
{  
return submitsurveyid;  
} 
public int getSurveyTopicid()   
{  
return surveytopicid; 
}
public void setsubmitSurveyid(int surveyid)   
{  
this.submitsurveyid = surveyid;  
}  
public String getclientanswer()  
{  
return clientanswer;  
}  
public void setclientanswer(String answer)   
{  
this.clientanswer = answer;  
}  
public int getScore()   
{  
return score;  
}  
public void setScore(int point)   
{  
this.score = point;  
}
public String getFeedback()  
{  
return feedback;  
}  
public void setFeedback(String feedback)   
{  
this.feedback = feedback;  
}  
}  