package ru.betchain.applicationcore.tradeFinance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.betchain.applicationcore.tradeFinance.service.MatchCenterService;
import ru.betchain.applicationcore.tradeFinance.service.MatchesMinerFromSites;


/**
 * Created by Anton on 31.08.17.
 */
@Controller
public class WelcomeController {

    @Autowired
    private MatchesMinerFromSites matchesMinerFromSites;

    @Autowired
    MatchCenterService matchCenterService;




    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {

        return "welcome";
    }

}
