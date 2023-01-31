package com.cg.onlinebookstoremanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.onlinebookstoremanagementsystem.entity.Feedback;
public interface FeedbackRepository extends JpaRepository<Feedback, Long>{
	
	    //select * from feedback where feedbackreader_id = ?
		public List<Feedback> findByFeedbackId(Long fedId);
		
	
	    //select * from feedback where feedbackreader_id = ?
		public List<Feedback> findByFeedbackreaderId(Long fedReaderId);
	
	    //select * from feedback where feedbackorder_id = ?
		public List<Feedback> findByFeedbackorderId(Long fedOrderId);
		
		//select * from feedback where String feedback_description = ?
		public Feedback FeedbackbybookId(Long fedBookId);
		
		//select * from feedback where String feedbackrating_details = ?
		public List<Feedback> findByFeedbackratingDetails(String fedRatingDetails);
		
		//select * from feedback where String feedback_description = ?
		public List<Feedback> findByFeedbackDescription(String fedDescription);
		
}
