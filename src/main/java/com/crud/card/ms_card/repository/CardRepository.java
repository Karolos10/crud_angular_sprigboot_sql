package com.crud.card.ms_card.repository;

import com.crud.card.ms_card.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardRepository implements ICardRepository{

    @Autowired(required = false)
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Card> findAll() {
        String SQL = "SELECT * FROM cards WHERE status = 1";
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Card.class));
    }

    @Override
    public int save(Card card) {
        String SQL = "INSERT INTO cards (name, number, type, cvv, status) VALUES (?, ?, ?, ?, ?)";
        return jdbcTemplate.update(SQL, new Object[]{card.getName(), card.getNumber(), card.getType(),
                card.getCvv(), card.getStatus()});
    }

    @Override
    public int update(Card card) {
        String SQL = "UPDATE cards SET name=?, number=?, type=?, cvv=?, status=? WHERE id_card = 1";
        return jdbcTemplate.update(SQL, new Object[]{card.getName(), card.getNumber(),
                card.getType(), card.getCvv(), card.getStatus(), card.getId_card()});
    }

    @Override
    public int deleteById(int id) {
        String SQL = "UPDATE cards SET status=0 WHERE id_card = ?";
        return jdbcTemplate.update(SQL, new Object[]{id});
    }
}
