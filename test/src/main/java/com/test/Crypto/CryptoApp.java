package com.test.Crypto;

public class CryptoApp {
    public static void main(String[] args) {
        String BitcoindId = "BTC1234";
        String EthereumId = "ETH1234";
        CryptoWallet wallet = new CryptoWallet();
        
        wallet.addBitcoin(BitcoindId);
        wallet.addEthereum(EthereumId);
    }
}
