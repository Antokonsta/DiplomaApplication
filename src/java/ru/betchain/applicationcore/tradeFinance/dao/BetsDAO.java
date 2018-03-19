package ru.betchain.applicationcore.tradeFinance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.betchain.applicationcore.tradeFinance.model.Bet;

/**
 * Created by Anton on 02.09.17.
 */
public interface BetsDAO extends JpaRepository<Bet, Long> {
}
