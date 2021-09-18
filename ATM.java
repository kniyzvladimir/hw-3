public class ATM {
    public int countBanknotes(int sum) {
        int countBanknotes = 0;
        int [] varB = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int countVarB = 0;
        while (sum > 0) {
            if (sum - varB[countVarB] >= 0) {
                sum -= varB[countVarB];
                countBanknotes++;
            }
            else countVarB++;
        }
        return countBanknotes;
    }
}
