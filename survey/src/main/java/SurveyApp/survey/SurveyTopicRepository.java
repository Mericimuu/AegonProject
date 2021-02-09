
package SurveyApp.survey;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//repository that extends CrudRepository  
@Repository
public interface SurveyTopicRepository extends CrudRepository<SurveyTopic, Integer>  
{  
	
}

