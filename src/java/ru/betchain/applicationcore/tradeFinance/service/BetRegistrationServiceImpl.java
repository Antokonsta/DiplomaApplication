package ru.betchain.applicationcore.tradeFinance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.betchain.applicationcore.tradeFinance.dao.BetsDAO;
import ru.betchain.applicationcore.tradeFinance.model.Bet;

/**
 * Created by Anton on 02.09.17.
 */
@Component
@Service

public class BetRegistrationServiceImpl implements BetRegistrationService {


    @Autowired
    BetsDAO betsDAO;



    @Override
    public void save(Bet bet) {
        betsDAO.save(bet);
    }

}
