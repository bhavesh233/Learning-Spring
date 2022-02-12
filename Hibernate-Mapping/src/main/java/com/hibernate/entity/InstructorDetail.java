package com.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "youtube_channel1")
    private String youtubeChannel1;

    @Column(name = "hobby")
    private String hobby;

    public InstructorDetail() {
    }

    public InstructorDetail(String youtubeChannel1, String hobby) {
        this.youtubeChannel1 = youtubeChannel1;
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYoutubeChannel1() {
        return youtubeChannel1;
    }

    public void setYoutubeChannel1(String youtubeChannel1) {
        this.youtubeChannel1 = youtubeChannel1;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "InstructorDetail{" +
                "id=" + id +
                ", youtubeChannel1='" + youtubeChannel1 + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
