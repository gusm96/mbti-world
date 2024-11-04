package com.smsl.mbti_world.domain;


import java.time.LocalDateTime;

public abstract class BaseEntity {

    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private LocalDateTime deleteDate;

    void createBaseEntity(){
        this.createDate = LocalDateTime.now();
        this.updateDate = null;
        this.deleteDate = null;
    }

}
