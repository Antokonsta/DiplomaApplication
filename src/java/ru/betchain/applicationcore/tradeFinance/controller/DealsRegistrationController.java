package ru.betchain.applicationcore.tradeFinance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.betchain.applicationcore.tradeFinance.model.Deal;

import ru.betchain.applicationcore.tradeFinance.service.BetRegistrationService;
import ru.betchain.applicationcore.tradeFinance.service.MatchCenterService;
import ru.betchain.applicationcore.tradeFinance.service.MatchesMinerFromSites;



/**
 * Created by Anton on 31.08.17.
 */
@Controller
public class DealsRegistrationController {


    @Autowired
    MatchCenterService matchCenterService;

    @Autowired
    BetRegistrationService betRegistrationService;

    @Autowired
    private MatchesMinerFromSites matchesMinerFromSites;

    @RequestMapping(value = {"/dealRegistration"}, method = RequestMethod.GET)
    public String betRegistr(Model model) {
        model.addAttribute("deal", new Deal());
        return "dealRegistr";
    }

    @RequestMapping(
            value = {"/dealRegistration/deploy"},
            method = {RequestMethod.POST}
    )
    public String addBet(@ModelAttribute("deal") Deal deal, Model model) {

        System.out.println(deal.toString());

        return "welcome";
    }
}
