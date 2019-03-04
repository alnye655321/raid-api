package com.unrealtracker.raidapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "worlds")
public class World extends AuditModel {
    @Id
    @GeneratedValue(generator = "world_generator")
    @SequenceGenerator(
            name = "world_generator",
            sequenceName = "world_sequence",
            initialValue = 1000
    )
    private Long id;

    @Column(columnDefinition = "integer")
    private int sessionId;

    @Column(columnDefinition = "integer")
    private int worldHits;

    @Column(columnDefinition = "integer")
    private int worldShotsFired;

    @Column(columnDefinition = "integer")
    private int worldKills;

    @Column(columnDefinition = "double precision")
    private float gameTime;

    @Column(columnDefinition = "integer")
    private int enemyHits;


    public int getWorldKills() {
        return worldKills;
    }

    public void setWorldKills(int worldKills) {
        this.worldKills = worldKills;
    }

    public int getWorldShotsFired() {
        return worldShotsFired;
    }

    public void setWorldShotsFired(int worldShotsFired) {
        this.worldShotsFired = worldShotsFired;
    }

    public int getWorldHits() {
        return worldHits;
    }

    public void setWorldHits(int worldHits) {
        this.worldHits = worldHits;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public float getGameTime() {
        return gameTime;
    }

    public void setGameTime(float gameTime) {
        this.gameTime = gameTime;
    }

    public int getEnemyHits() {
        return enemyHits;
    }

    public void setEnemyHits(int enemyHits) {
        this.enemyHits = enemyHits;
    }

}

