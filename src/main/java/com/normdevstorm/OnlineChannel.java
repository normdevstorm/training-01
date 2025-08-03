package com.normdevstorm;

public class OnlineChannel extends Channel {
    private String  platformName;
    private String url;
    private String apiKey;
    private ShippingCostCalculationStrategy shippingCostCalculationStrategy;

    public OnlineChannel(String channelId, String platformName, String url, String apiKey, ShippingCostCalculationStrategy shippingCostCalculationStrategy) {
        super(channelId);
        this.platformName = platformName;
        this.url = url;
        this.apiKey = apiKey;
        this.shippingCostCalculationStrategy = shippingCostCalculationStrategy;
    }


    @Override
    public void getChanelInfo() {
        System.out.println("Online Channel Information: " +
                "\nPlatform Name: " + platformName);
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public ShippingCostCalculationStrategy getShippingCostCalculationStrategy() {
        return shippingCostCalculationStrategy;
    }

    public void setShippingCostCalculationStrategy(ShippingCostCalculationStrategy shippingCostCalculationStrategy) {
        this.shippingCostCalculationStrategy = shippingCostCalculationStrategy;
    }
}
