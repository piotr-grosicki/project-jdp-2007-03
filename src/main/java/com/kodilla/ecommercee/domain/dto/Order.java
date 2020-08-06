package com.kodilla.ecommercee.domain.dto;

import com.kodilla.ecommercee.domain.GenericEntity;
import com.kodilla.ecommercee.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDERS")
public class Order extends GenericEntity {

    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    public User getUser(){
        return user;
    }



}
