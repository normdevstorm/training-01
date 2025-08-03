package com.normdevstorm;

import java.util.Map;

public class LazadaChannel extends OnlineChannel{
    private Map<String, String> otherConfigurations;

    public LazadaChannel(String channelId, String platformName, String url, String apiKey, ShippingCostCalculationStrategy shippingCostCalculationStrategy, Map<String, String> otherConfigurations) {
        super(channelId, platformName, url, apiKey, ShippingCostCalculationStrategy.ADDRESS_LEVEL_BASED);
        this.otherConfigurations = otherConfigurations;
    }

    public Map<String, String> getOtherConfigurations() {
        return otherConfigurations;
    }

    public void setOtherConfigurations(Map<String, String> otherConfigurations) {
        this.otherConfigurations = otherConfigurations;
    }
}
