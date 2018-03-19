package ru.betchain.applicationcore.tradeFinance.service;

import ru.betchain.applicationcore.tradeFinance.model.Bet;
import ru.betchain.applicationcore.tradeFinance.model.BetMatchAssociation;
import ru.betchain.applicationcore.tradeFinance.model.Match;

import java.util.List;

/**
 * Created by Anton on 31.08.17.
 */
public interface MatchCenterService {
    void save(Match match);

    List<Bet> showBetsForUser(String userName);

    List<BetMatchAssociation> showBetMatchAssociation();

    Match findById(String id);
}
