package ru.betchain.applicationcore.tradeFinance.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.betchain.applicationcore.tradeFinance.model.Deal;
import ru.betchain.applicationcore.tradeFinance.model.WalletAddr;
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

    @RequestMapping(value = {"/showContracts","/showContracts/{wallet}"}, method = RequestMethod.GET)
    public String showContractsForWallet(@PathVariable("wallet") String wallet, Model model) {

        model.addAttribute("walletAddr", new WalletAddr());
        if(wallet != null && !wallet.equals("null")) {
            List<EtherscanContractResultResponse> contractsForWallet = apiService.getContractsForWallet(wallet);
            model.addAttribute("contractsForWallet", contractsForWallet);
        }

        return "contractsView";
    }

    @RequestMapping(
            value = {"/showContractResult"},
            method = {RequestMethod.POST}
    )
    public String showContractResult(@ModelAttribute("walletAddr")WalletAddr walletAddr, Model model) throws Exception {
        if(walletAddr != null) {
            List<EtherscanContractResultResponse> contractsForWallet = apiService.getContractsForWallet(walletAddr.getWalletAddress());
            model.addAttribute("contractsForWallet", contractsForWallet);
        }
        return "contractsView";
    }

}
