package com.cg.onlinebookstoremanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinebookstoremanagementsystem.entity.Feedback;
import com.cg.onlinebookstoremanagementsystem.exception.ResourceNotFoundException;
import com.cg.onlinebookstoremanagementsystem.repository.FeedbackRepository;
import com.cg.onlinebookstoremanagementsystem.controller.FeedbackController;
@Service //which marks this class as service class
public class FeedbackServiceImpl implements IFeedbackService{
	@Autowired
	private FeedbackRepository feedbackRepo;

	@Override
	public Feedback addFeedback(Feedback feed) {
		return feedbackRepo.save(feed);
	}
	
	@Override
	public List<Feedback> listAllFeedbacks() {
		return feedbackRepo.findAll();
	}

	@Override
	public Feedback getFeedbackById(Long fedId) throws ResourceNotFoundException{
		return feedbackRepo.findById(fedId) 
				.orElseThrow(() -> new ResourceNotFoundException("feedback Not found"));
	}
	
	@Override
	public Feedback updateFeedback(Feedback feed, Long fedId) throws ResourceNotFoundException{
		Feedback existingFeedback = feedbackRepo.findById(fedId)
		         .orElseThrow(() -> new ResourceNotFoundException("Feedback Not found"));
	
		existingFeedback.setFeedbackreaderId(feed.getFeedbackreaderId());
		existingFeedback.setFeedbackorderId(feed.getFeedbackorderId());
		existingFeedback.setFeedbackratingDetails(feed.getFeedbackratingDetails());
		existingFeedback.setFeedbackDescription(feed.getFeedbackDescription());
		feedbackRepo.save(existingFeedback);
		return existingFeedback;
	}
	
	@Override
	public void deleteFeedback(Long fedId)  {
		feedbackRepo.deleteById(fedId);		
	}

	@Override
	public List<Feedback> findByFeedbackreaderId(Long fedReaderId) {
		return feedbackRepo.findByFeedbackreaderId(fedReaderId);
	}

	@Override
	public List<Feedback> findByFeedbackorderId(Long fedOrderId) {
		return feedbackRepo.findByFeedbackorderId(fedOrderId);
	}

	@Override
	public List<Feedback> findByFeedbackratingDetails(String fedRatingDetails) {
		return feedbackRepo.findByFeedbackratingDetails(fedRatingDetails);
	}

	@Override
	public List<Feedback> findByFeedbackDescription(String fedDescription) {
		return feedbackRepo.findByFeedbackDescription(fedDescription);
	}

	@Override
	public Feedback getFeedbackbybookId(Long fedBookId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
