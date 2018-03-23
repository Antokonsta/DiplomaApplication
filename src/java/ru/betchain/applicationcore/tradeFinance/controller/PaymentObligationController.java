package ru.betchain.applicationcore.tradeFinance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.betchain.applicationcore.tradeFinance.ethereum.EthereumDeployService;
import ru.betchain.applicationcore.tradeFinance.model.Deal;
import ru.betchain.applicationcore.tradeFinance.model.PaymentObligation;


/**
 * Created by Anton on 31.08.17.
 */
@Controller
public class PaymentObligationController {

    private static final org.jboss.logging.Logger LOGGER = org.jboss.logging.Logger.getLogger(PaymentObligationController.class);

    @Autowired
    EthereumDeployService ethereumDeployService;

    @RequestMapping(value = {"/paymentObligationsRegistration"}, method = RequestMethod.GET)
    public String paymentObligationRegistr(Model model) {
        model.addAttribute("paymentObligation", new PaymentObligation());
        return "paymentObligationsRegistr";
    }

    @RequestMapping(
            value = {"/paymentRegistration/deploy"},
            method = {RequestMethod.POST}
    )
    public String addTfDeal(@ModelAttribute("deal") PaymentObligation payment, Model model) throws Exception {
        LOGGER.info(payment.toString());
        //String contractAddr = ethereumDeployService.deploySmartContract(deal);
        String contractAddr = "0x22cb10ae2fefe692de0f77433c79edcfdc0e47cc";
        LOGGER.info(contractAddr);
        model.addAttribute("contractAddress", contractAddr);
        return "welcome";
    }
}
