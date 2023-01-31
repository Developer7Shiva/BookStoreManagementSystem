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
	private Long feedbackreaderId;
	
	@Column(name = "feedback_orderid")
	private Long feedbackorderId;
	
	@Column(name = "feedback_ratingdetails")
	private String feedbackratingDetails;
	
	@Column(name = "feedback_bookid")
	private Long feedbackbookId;
	
	@Column(name = "feedback_description")
	private String feedbackDescription;
	
	/*@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reader_id")
	private Reader reader;
	
	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}*/
	
	public Feedback() {
		// TODO Auto-generated constructor stub
	}

	public Feedback(Long feedbackreaderId, Long feedbackorderId, String feedbackratingDetails,
			Long feedbackbookId, String feedbackDescription) {
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

	public Long getFeedbackreaderId() {
		return feedbackreaderId;
	}

	public void setFeedbackreaderId(Long feedbackreaderId) {
		this.feedbackreaderId = feedbackreaderId;
	}

	public Long getFeedbackorderId() {
		return feedbackorderId;
	}

	public void setFeedbackorderId(Long feedbackorderId) {
		this.feedbackorderId = feedbackorderId;
	}

	public String getFeedbackratingDetails() {
		return feedbackratingDetails;
	}

	public void setFeedbackratingDetails(String feedbackratingDetails) {
		this.feedbackratingDetails = feedbackratingDetails;
	}

	public Long getFeedbackbookId() {
		return feedbackbookId;
	}

	public void setFeedbackbookId(Long feedbackbookId) {
		this.feedbackbookId = feedbackbookId;
	}

	public String getFeedbackDescription() {
		return feedbackDescription;
	}

	public void setFeedbackDescription(String feedbackDescription) {
		this.feedbackDescription = feedbackDescription;
	}
}
