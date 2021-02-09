import React, { Component } from 'react'

export default class SubmitSurvey extends Component {

    onClickEvent= (e) =>{
        const {score,feedback}=this.state;
        axios({
          method: 'post',
          url: 'http://localhost:8080/submitsurvey',
          data: {
            topicId:1,
            feedback:feedback,
            score:score
          }
        });
    }
    render() {
        return (
            <div className="col-md-8 mb=4">
            <form>
            <label> Topic:</label>
            <input type="text" value=""/>
            <br></br>
            <label>Question:</label>
            <input type="text" value=""/>
            <br></br>
            <label>Score Table:</label>   
            <input type="number" value="" id="score"/>          
            <label>Feedbacks:</label>
            <br></br>
            <textarea id="feedback"></textarea> 
            </form>
            <button onClick={this.onClickEvent.bind(this,score,feedback)}>Submit Survey</button>
          </div>
        )
    }
}
