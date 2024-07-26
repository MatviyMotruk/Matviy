package com.test.Crypto;

import java.util.ArrayList;

public class CryptoWallet {
    private ArrayList<String> Bitcoins;
    private ArrayList<String> Ethereum;

    public CryptoWallet() {
        this.Bitcoins = new ArrayList<>();
        this.Ethereum = new ArrayList<>();
    }

    public void addBitcoin(String BitcoinId) {
        if (BitcoinId != null && !BitcoinId.isEmpty() && BitcoinId.startsWith("BTC")) {
            Bitcoins.add(BitcoinId);   
            System.out.println("Bitcoin added: " + BitcoinId);
        } else {
            throw new FalseBTC();
        }
    } 

    public void addEthereum(String EthereumId) {
        if (EthereumId != null && !EthereumId.isEmpty() && EthereumId.startsWith("ETH")) {
            Ethereum.add(EthereumId);
            System.out.println("Ethereum added: " + EthereumId);
        } else {
            throw new FalseETH();
        }
    }

    
    class FalseBTC extends RuntimeException {
        public FalseBTC() {
            super("Invalid Bitcoin ID");
        }
    }

    class FalseETH extends RuntimeException {
        public FalseETH() {
            super("Invalid Ethereum ID");
        }
    }
}
