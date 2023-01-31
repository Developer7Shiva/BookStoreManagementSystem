package com.cg.onlinebookstoremanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinebookstoremanagementsystem.entity.Feedback;
import com.cg.onlinebookstoremanagementsystem.exception.ResourceNotFoundException;
import com.cg.onlinebookstoremanagementsystem.service.IFeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	private IFeedbackService feedbackService;
	
	@PostMapping("/addfeedback")
	public Feedback addFeedback(@RequestBody Feedback feed) {
		return feedbackService.addFeedback(feed);
	}
	
	@GetMapping("/getfeedback")
	public List<Feedback> listAllFeedbacks(){
		return feedbackService.listAllFeedbacks();
	}
	
	@GetMapping("/getfeedback/{fedid}")
	public Feedback getFeedbackById(@PathVariable("fedid") Long fedId) throws ResourceNotFoundException {
		return feedbackService.getFeedbackById(fedId);
	}

     /* @GetMapping("/getfeedback/{fedbookid}")
	public Feedback getFeedbackbybookId(@PathVariable("fedbookid") Long fedBookId)  throws ResourceNotFoundException{
		return feedbackService.getFeedbackbybookId(fedBookId);
	}*/
	
	@PutMapping("/update/{fedid}")
	public Feedback updateFeedback(@RequestBody Feedback feed,@PathVariable("fedid") Long fedId) throws ResourceNotFoundException{
		return feedbackService.updateFeedback(feed, fedId);
	}
	
	@DeleteMapping("/deletefeedback/{fedid}")
	public void deleteFeedback(@PathVariable("fedid") Long fedId) {
		feedbackService.deleteFeedback(fedId);
	}
	
	@GetMapping("/getfeedback/{fedbookid}")
	public Feedback getFeedbackbybookId(@PathVariable("fedbookid") Long fedBookId) throws ResourceNotFoundException{
		return feedbackService.getFeedbackbybookId(fedBookId);
	}
	
	@GetMapping("/findfeedbackbyreaderid/{fedreadid}")
	public List<Feedback> findByFeedbackreaderId(@PathVariable("fedreadid") Long fedReaderId) {
		return feedbackService.findByFeedbackreaderId(fedReaderId);
	}
	
	@GetMapping("/findfeedbackbyorderid/{fedordid}")
	public List<Feedback> findByFeedbackorderId(@PathVariable("fedordid") Long fedOrderId) {
		return feedbackService.findByFeedbackorderId(fedOrderId);
	}
       
	
	@GetMapping("/findfeedbackbyratdetails/{fedratdet}")
	public List<Feedback> findByFeedbackratingDetails(@PathVariable("fedratdet") String fedRatingDetails){
		return feedbackService.findByFeedbackratingDetails(fedRatingDetails);
	}
	
	@GetMapping("/findfeedbackbydesc/{feddesc}")
	public List<Feedback> findByFeedbackDescription(@PathVariable("feddesc")  String fedDescription){
		return feedbackService.findByFeedbackDescription(fedDescription);
	}
	
	

}
