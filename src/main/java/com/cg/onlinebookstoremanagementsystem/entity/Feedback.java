package com.cg.onlinebookstoremanagementsystem.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "feedback")
public class Feedback {
	
	@Id
	@Column(name = "feedback_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long feedbackId;
	
	@Column(name = "feedback_readerid")
	private String feedbackreaderId;
	
	@Column(name = "feedback_orderid")
	private String feedbackorderId;
	
	@Column(name = "feedback_ratingdetails")
	private String feedbackratingDetails;
	
	@Column(name = "feedback_bookid")
	private String feedbackbookId;
	
	@Column(name = "feedback_description")
	private String feedbackDescription;
	
	/*@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cat_id")
	private Category category;
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}*/
	
	public Feedback() {
		// TODO Auto-generated constructor stub
	}

	public Feedback(String feedbackreaderId, String feedbackorderId, String feedbackratingDetails,
			String feedbackbookId, String feedbackDescription) {
		super();
		this.feedbackreaderId = feedbackreaderId;
		this.feedbackorderId = feedbackorderId;
		this.feedbackratingDetails = feedbackratingDetails;
		this.feedbackbookId = feedbackbookId;
		this.feedbackDescription = feedbackDescription;
	}

	public Long getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedbackreaderId() {
		return feedbackreaderId;
	}

	public void setFeedbackreaderId(String feedbackreaderId) {
		this.feedbackreaderId = feedbackreaderId;
	}

	public String getFeedbackorderId() {
		return feedbackorderId;
	}

	public void setFeedbackorderId(String feedbackorderId) {
		this.feedbackorderId = feedbackorderId;
	}

	public String getFeedbackratingDetails() {
		return feedbackratingDetails;
	}

	public void setFeedbackratingDetails(String feedbackratingDetails) {
		this.feedbackratingDetails = feedbackratingDetails;
	}

	public String getFeedbackbookId() {
		return feedbackbookId;
	}

	public void setFeedbackbookId(String feedbackbookId) {
		this.feedbackbookId = feedbackbookId;
	}

	public String getFeedbackDescription() {
		return feedbackDescription;
	}

	public void setFeedbackDescription(String feedbackDescription) {
		this.feedbackDescription = feedbackDescription;
	}
	
	
	
	
	
	

}
