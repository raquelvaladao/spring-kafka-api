package com.args.brtravels.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "receiver")
    private String email;

    private String body;

    @Column(name = "player_id")
    private String playerTag;

    private LocalDateTime date;

    public Message(String email, String body, String playerTag) {
        this.email = email;
        this.body = body;
        this.playerTag = playerTag;
    }
}
