package com.policy;

import java.util.Date;

public class Policy {
    private String policyId;
    private String policyType;
    private double premium;
    private double coverageAmount;
    private Date expiryDate;

    // Constructor
    public Policy(String policyId, String policyType, double premium, double coverageAmount, Date expiryDate) {
        this.policyId = policyId;
        this.policyType = policyType;
        this.premium = premium;
        this.coverageAmount = coverageAmount;
        this.expiryDate = expiryDate;
    }
    // Getters
    public String getPolicyId() {
        return policyId;
    }

    public String getPolicyType() {
        return policyType;
    }

    public double getPremium() {
        return premium;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }



    @Override
    public String toString() {
        return "PolicyID: " + policyId + ", Type: " + policyType + ", Premium: " + premium + 
               ", Coverage: " + coverageAmount + ", Expiry Date: " + expiryDate;
    }
}
