package ru.betchain.applicationcore.tradeFinance.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.springframework.stereotype.Service;
import ru.betchain.applicationcore.tradeFinance.model.etherscan.EtherscanContractResponse;
import ru.betchain.applicationcore.tradeFinance.model.etherscan.EtherscanContractResultResponse;

import java.io.IOException;
import java.util.List;

@Service
public class EtherscanApiService {

    private static final String URL = "http://api-ropsten.etherscan.io/api?module=account&action=txlist&address=";

    private static OkHttpClient client = new OkHttpClient();

    private static final org.jboss.logging.Logger LOGGER = org.jboss.logging.Logger.getLogger(EtherscanApiService.class);


    public List<EtherscanContractResultResponse> getContractsForWallet(String wallet) {
        StringBuilder finalUrl = new StringBuilder(URL);
        finalUrl.append(wallet);
        finalUrl.append("&startblock=0&endblock=99999999&sort=asc&apikey=YourApiKeyToken");

        LOGGER.info("make a request to etherscan API :" + finalUrl.toString());

        Request request = new Request.Builder()
                .url(finalUrl.toString())
                .build();

        try {
            Response response = client.newCall(request).execute();
            ObjectMapper mapper = new ObjectMapper();
            EtherscanContractResponse value = mapper.readValue(response.body().string(), EtherscanContractResponse.class);
            List<EtherscanContractResultResponse> result = value.getResult();
            return result;
        } catch (IOException e) {
            LOGGER.error("ошибка получения списка контрактов", e);
        }

        return null;

    }


}
