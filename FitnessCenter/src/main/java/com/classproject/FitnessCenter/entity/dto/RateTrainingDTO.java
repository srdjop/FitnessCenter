package com.classproject.FitnessCenter.entity.dto;

import com.classproject.FitnessCenter.entity.Member;
import com.classproject.FitnessCenter.entity.Terms;

import java.util.Date;

public class RateTrainingDTO {
    private Long id;
    private String username;
    private String name;
    private String aboutTraining;
    private String typeOfTraining;
    private Integer length;
    private Double price;
    private Date trainingDay;
    private Integer grade;
    private Long member;
    private Long terms;
    private Member members;
    private Terms term;

    public RateTrainingDTO() {
    }

    public RateTrainingDTO(Long id, String username, String name, String aboutTraining, String typeOfTraining, Integer length, Double price, Date trainingDay, Integer grade) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.aboutTraining = aboutTraining;
        this.typeOfTraining = typeOfTraining;
        this.length = length;
        this.price = price;
        this.trainingDay = trainingDay;
        this.grade = grade;
    }

    public RateTrainingDTO(Long id, String username, String name, String aboutTraining, String typeOfTraining, Integer grade) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.aboutTraining = aboutTraining;
        this.typeOfTraining = typeOfTraining;
        this.grade = grade;
    }


    public RateTrainingDTO(Long id, Integer grade, Long id1, Long id2) {
        this.id = id;
        this.grade = grade;
        this.member = id1;
        this.terms = id2;
    }

    public Member getMembers() {
        return members;
    }

    public void setMembers(Member members) {
        this.members = members;
    }

    public Terms getTerm() {
        return term;
    }

    public void setTerm(Terms term) {
        this.term = term;
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }

    public Long getTerms() {
        return terms;
    }

    public void setTerms(Long terms) {
        this.terms = terms;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAboutTraining() {
        return aboutTraining;
    }

    public void setAboutTraining(String aboutTraining) {
        this.aboutTraining = aboutTraining;
    }

    public String getTypeOfTraining() {
        return typeOfTraining;
    }

    public void setTypeOfTraining(String typeOfTraining) {
        this.typeOfTraining = typeOfTraining;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getTrainingDay() {
        return trainingDay;
    }

    public void setTrainingDay(Date trainingDay) {
        this.trainingDay = trainingDay;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
