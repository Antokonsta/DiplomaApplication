package ru.betchain.applicationcore.tradeFinance.dao;

import ru.betchain.applicationcore.tradeFinance.model.Bet;

import java.util.List;

/**
 * Created by Anton on 02.09.17.
 */
public interface BetsDaoFromTable {
    List<Bet> showBetsForUser(String userName);
}
