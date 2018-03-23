package ru.betchain.applicationcore.tradeFinance.ethereum;


import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;

import javax.annotation.PostConstruct;
import java.net.URL;

@Scope(value = "singleton")
@Component
public class CredentialsInfo {

    private Credentials credentials;

    private static final Logger LOGGER = Logger.getLogger(CredentialsInfo.class);


    private static final String password = "30011994";

    private static final String walletName = "/mainExjex.json";

    @PostConstruct
    private void startup() {
        LOGGER.info("Start opening wallet file as postConstruct");

        try {
            URL pathToWallet = this.getClass().getResource(walletName);
            credentials = WalletUtils.loadCredentials(password, pathToWallet.getPath());
            LOGGER.info("Wallet was successfully opened");
        } catch (Exception e) {
            LOGGER.error("Exceptions was occurred while opening wallet file",e);
        }
    }
    public Credentials getCredentials() {
        return credentials;
    }


}

