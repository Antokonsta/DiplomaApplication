package ru.betchain.applicationcore.tradeFinance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.betchain.applicationcore.tradeFinance.ethereum.EthereumDeployService;
import ru.betchain.applicationcore.tradeFinance.model.Deal;




/**
 * Created by Anton on 31.08.17.
 */
@Controller
public class DealsRegistrationController {

    private static final org.jboss.logging.Logger LOGGER = org.jboss.logging.Logger.getLogger(DealsRegistrationController.class);

    @Autowired
    EthereumDeployService ethereumDeployService;

    @RequestMapping(value = {"/dealRegistration"}, method = RequestMethod.GET)
    public String tfDealRegistr(Model model) {
        model.addAttribute("deal", new Deal());
        return "dealRegistr";
    }

    @RequestMapping(
            value = {"/dealRegistration/deploy"},
            method = {RequestMethod.POST}
    )
    public String addTfDeal(@ModelAttribute("deal") Deal deal, Model model) throws Exception {
        LOGGER.info(deal.toString());
        String contractAddr = ethereumDeployService.deployDealSmartContract(deal);
        //String contractAddr = "0x22cb10ae2fefe692de0f77433c79edcfdc0e47cc";
        LOGGER.info(contractAddr);
        model.addAttribute("contractAddress", contractAddr);
        return "welcome";
    }
}
