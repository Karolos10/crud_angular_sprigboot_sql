package com.crud.card.ms_card.repository;

import com.crud.card.ms_card.model.Card;

import java.util.List;

public interface ICardRepository {

    public List<Card> findAll();
    public int save(Card card);
    public int update(Card card);
    public int deleteById(int id);
}
