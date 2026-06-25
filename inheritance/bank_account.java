public class bank_account {
    static class BankAccount {
        private final long accountNumber;
        private final String holder;
        private double balance;
        private static int totalAccounts = 0;

        public BankAccount(long accountNumber, String holder, double initialBalance) {
            if (holder == null || holder.isBlank()) {
                throw new IllegalArgumentException("Holder name cannot be null/blank");
            }
            this.accountNumber = accountNumber;
            this.holder = holder;
            this.balance = Math.max(0, initialBalance);
            totalAccounts++;
        }

        public long getAccountNumber() {
            return accountNumber;
        }

        public String getHolder() {
            return holder;
        }

        public double getBalance() {
            return balance;
        }

        public static int getTotalAccounts() {
            return totalAccounts;
        }

    }

};
