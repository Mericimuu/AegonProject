package SurveyApp.survey;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table; 

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class SurveyTopic
{  
//Defining survey id as primary key  
@Id  
@Column  
private int createsurveyid;  
@Column  
private String srvtopic;  
@Column  
private String srvquestion;  
@Column
private int npmscore; 
@Column  
public int getSurveyid()   
{  
return createsurveyid;  
}  
public void setSurveyid(int surveyid)   
{  
this.createsurveyid = surveyid;  
}  
public String getSrvtopic()  
{  
return srvtopic;  
}  
public void setSrvtopic(String srvtopic)   
{  
this.srvtopic = srvtopic;  
}  
public String getSrvquestion()   
{  
return srvquestion;  
}  
public void setSrvquestion(String srvquestion)   
{  
this.srvquestion = srvquestion;  
}
public int getNpmscore()   
{  
return npmscore;  
}  
public void setNpmscore(int npmscore)   
{  
this.npmscore = npmscore;  
} 
}  