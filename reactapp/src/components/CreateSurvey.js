import React, { Component } from 'react'
var uniqid=require('')
class CreateSurvey extends Component {
//  constructor(props){
//    super(props)
//    this.onClickEvent=this.onClickEvent.bind(this);
//  }
  onClickEvent= (e) =>{
const {topic,question}=this.state;
axios({
  method: 'post',
  url: 'http://localhost:8080/createsurvey',
  data: {
    topic:topic,
    question:question
  }
});
  }
    render() {
        return (

            <div className="col-md-8 mb=4">
              <form>
              <label>Survey Topic:</label>
              <input type="text" value="" id="topic"/>
              <br></br>
              <label>Survey Question:</label>
              <input type="text" id="question"/>
              <br></br>
              <br></br>
              <div>
              </div>
              <label>Feedbacks:</label>
              <br></br>
              <textarea></textarea> 
              </form>
              <button onClick={this.onClickEvent.bind(this,topic,question)}>Create Survey</button>
            </div>
        )
    }
}
export default CreateSurvey;
