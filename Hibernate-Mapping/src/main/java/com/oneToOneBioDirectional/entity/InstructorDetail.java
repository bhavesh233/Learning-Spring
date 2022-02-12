package com.oneToOneBioDirectional.entity;

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

    @OneToOne(mappedBy = "instructorDetail",cascade = { CascadeType.DETACH,
            CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    private Instructor instructor;

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

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
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
