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
import ru.betchain.applicationcore.tradeFinance.model.Shipping;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Anton on 31.08.17.
 */
@Controller
public class ShippingController {

    private static final org.jboss.logging.Logger LOGGER = org.jboss.logging.Logger.getLogger(ShippingController.class);

    @Autowired
    EthereumDeployService ethereumDeployService;


    @RequestMapping(value = {"/shippingRegistr"}, method = RequestMethod.GET)
    public String paymentObligationRegistr(Model model) {
        Shipping shipping = new Shipping();
        shipping.setStartDate(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
        model.addAttribute("shipping", shipping);
        return "shipRegistr";
    }

    @RequestMapping(
            value = {"/shippingRegistr/deploy"},
            method = {RequestMethod.POST}
    )
    public String addTfDeal(@ModelAttribute("deal") PaymentObligation payment, Model model) throws Exception {
        LOGGER.info(payment.toString());
        String contractAddr = ethereumDeployService.deployObligationSmartContract(payment);
        //String contractAddr = "0x22cb10ae2fefe692de0f77433c79edcfdc0e47cc";
        LOGGER.info(contractAddr);
        model.addAttribute("contractAddress", contractAddr);
        return "welcome";
    }
}
