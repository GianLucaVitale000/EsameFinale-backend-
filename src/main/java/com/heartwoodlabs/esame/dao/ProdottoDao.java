package com.heartwoodlabs.esame.dao;

import com.heartwoodlabs.esame.dto.ProdottoDto;
import com.heartwoodlabs.esame.model.Prodotto;

import java.util.List;

public class ProdottoDao extends BaseDao {

    public List<ProdottoDto> getAll() {
        String query = "select new com.heartwoodlabs.esame.dto.ProdottoDto(p.nome, p.descrizione, p.prezzo, m.nome)" +
                "from " + Prodotto.class.getName() + " p " +
                " join p.marca m " +
                "order by p.nome, p.prezzo";

        return entityManager.createQuery(query).getResultList();
    }
}
