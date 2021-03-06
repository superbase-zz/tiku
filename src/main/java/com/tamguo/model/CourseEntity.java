package com.tamguo.model;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the tiku_course database table.
 * 
 */
@Entity
@Table(name="tiku_course")
@NamedQuery(name="CourseEntity.findAll", query="SELECT c FROM CourseEntity c")
public class CourseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private String uid;

	@Column(name="name")
	private String name;

	@Column(name="subject_id")
	private BigInteger subjectId;
	
	@Column(name="point_num")
	private BigInteger pointNum;
	
	@Column(name="question_num")
	private BigInteger questionNum;
	
	@Column(name="icon")
	private String icon;
	
	@Column(name="orders")
	private Integer orders;
	
	@Column(name="seo_title")
	private String seoTitle;
	
	@Column(name="seo_keywords")
	private String seoKeywords;
	
	@Column(name="seo_description")
	private String seoDescription;
	
	private String subjectName;
	
	private List<ChapterEntity> chapterList;

	public CourseEntity() {
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(BigInteger subjectId) {
		this.subjectId = subjectId;
	}

	public BigInteger getQuestionNum() {
		return questionNum;
	}

	public void setQuestionNum(BigInteger questionNum) {
		this.questionNum = questionNum;
	}

	public BigInteger getPointNum() {
		return pointNum;
	}

	public void setPointNum(BigInteger pointNum) {
		this.pointNum = pointNum;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getOrders() {
		return orders;
	}

	public void setOrders(Integer orders) {
		this.orders = orders;
	}

	public List<ChapterEntity> getChapterList() {
		return chapterList;
	}

	public void setChapterList(List<ChapterEntity> chapterList) {
		this.chapterList = chapterList;
	}

	public String getSeoTitle() {
		return seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}

	public String getSeoKeywords() {
		return seoKeywords;
	}

	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords = seoKeywords;
	}

	public String getSeoDescription() {
		return seoDescription;
	}

	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

}