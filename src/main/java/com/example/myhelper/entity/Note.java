package com.example.myhelper.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "notes")
@Getter
@Setter
@ToString(exclude = "person")
@NoArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String body;
    @ManyToOne(optional = false)
    @JoinColumn(name = "person_id",foreignKey = @ForeignKey(name = "notes_persons_fk"))
    private Person person;
    //при такому типу звязку та записі маппінг знагохиться тут

    public Note(String body) {
        this.body = body;
    }
}
