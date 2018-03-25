package ru.betchain.applicationcore.tradeFinance.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.betchain.applicationcore.tradeFinance.model.etherscan.EtherscanContractResultResponse;
import ru.betchain.applicationcore.tradeFinance.service.EtherscanApiService;

import java.util.List;


/**
 * Created by Anton on 31.08.17.
 */
@Controller
public class ActionsController {

    @Autowired
    EtherscanApiService apiService;

    @RequestMapping(value = {"/showContracts/{wallet}"}, method = RequestMethod.GET)
    public String showContractsForWallet(@PathVariable("wallet") String wallet, Model model) {

        if(wallet != null && !wallet.equals("null")) {
            List<EtherscanContractResultResponse> contractsForWallet = apiService.getContractsForWallet(wallet);
            model.addAttribute("contractsForWallet", contractsForWallet);
        }

        return "contractsView";
    }

}
