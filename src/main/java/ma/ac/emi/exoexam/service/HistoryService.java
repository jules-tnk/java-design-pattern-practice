package ma.ac.emi.exoexam.service;

import ma.ac.emi.exoexam.Account;
import ma.ac.emi.exoexam.operation.Operation;

import java.util.Date;

public class HistoryService {
    public void showTotalOperation(Account account, Class c, Date startDate, Date endDate){
        double total = 0;
        for (Operation operation: account.getOperations()){
            if(operation.getClass().getName().equals(c.getName())){
                total+=operation.getAmount();
            }
        }
        System.out.println("Compte: "+ account.getAccountId() +" \n"+
                            "\tTotal des "+c.getName()+" entre "+startDate+" et "+endDate+" : " + total);
    }
}
