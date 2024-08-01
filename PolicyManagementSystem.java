package PROBLEM;

import java.util.*;
import java.util.stream.Collectors;

class InsurancePolicy {
    private String policyNumber;
    private String holderName;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String holderName, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }
}

public class PolicyManagementSystem {
    public static void main(String[] args) {
        List<InsurancePolicy> policies = new ArrayList<>(); // Initialize with your data

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Filter Policies by Premium Amount");
            System.out.println("2. Sort Policies by Holder Name");
            System.out.println("3. Compute Total Premium");
            // Add other menu options here

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    List<InsurancePolicy> filteredPolicies = policies.stream()
                            .filter(p -> p.getPremiumAmount() > 1200.0)
                            .collect(Collectors.toList());
                    // Print filteredPolicies
                    break;
                case 2:
                    List<InsurancePolicy> sortedPolicies = policies.stream()
                            .sorted(Comparator.comparing(InsurancePolicy::getHolderName))
                            .collect(Collectors.toList());
                    // Print sortedPolicies
                    break;
                case 3:
                    double totalPremium = policies.stream()
                            .mapToDouble(InsurancePolicy::getPremiumAmount)
                            .sum();
                    System.out.println("Total premium amount: $" + totalPremium);
                    break;
                // Add other cases for remaining features
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
