package com.cg.onlinebookstoremanagementsystem.service;

import java.util.List;

import com.cg.onlinebookstoremanagementsystem.entity.Feedback;
import com.cg.onlinebookstoremanagementsystem.exception.ResourceNotFoundException;

public interface IFeedbackService {
	
	public Feedback addFeedback(Feedback feed);
	public List<Feedback> listAllFeedbacks();
	public Feedback getFeedbackById(Long fedId) throws ResourceNotFoundException;
	public Feedback updateFeedback(Feedback feed,Long fedId) throws ResourceNotFoundException;
	public void deleteFeedback(Long fedId);
    public Feedback getFeedbackbybookId(Long fedBookId);  
	public List<Feedback> findByFeedbackreaderId(Long fedReaderId) ;
	public List<Feedback> findByFeedbackorderId(Long fedOrderId) ;
	public List<Feedback> findByFeedbackratingDetails(String fedRatingDetails);
	public List<Feedback> findByFeedbackDescription(String fedDescription);

}
