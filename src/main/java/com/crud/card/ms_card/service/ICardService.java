package com.crud.card.ms_card.service;

import com.crud.card.ms_card.model.Card;

import java.util.List;

public interface ICardService {

    public List<Card> findAll();
    public int save(Card card);
    public int update(Card card);
    public int deleteById(int id);
}
