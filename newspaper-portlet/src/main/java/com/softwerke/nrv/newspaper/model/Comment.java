package com.softwerke.nrv.newspaper.model;

public class Comment {
	
	private long commentId;
	private long reviewerId;
	private String reviewerName;
	private String commentContent;
	
	Comment(long commentId, long reviewerId,String reviewerName,String commentContent) {
		this.commentId = commentId;
		this.reviewerId = reviewerId;
		this.reviewerName = reviewerName;
		this.commentContent = commentContent;
	}
	
	public long getCommentId() {
		return commentId;
	}
	
	public long getReviewerId() {
		return reviewerId;
	}
	
	public String getReviewerName() {
		return reviewerName;
	}
	
	public String getCommentContent() {
		return commentContent;
	}
	
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	
	public void setReviewerId(long reviewerId) {
		this.reviewerId = reviewerId;
	}
	
	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}
	
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
}
