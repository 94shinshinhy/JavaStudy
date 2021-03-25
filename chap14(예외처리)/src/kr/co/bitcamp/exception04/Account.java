package kr.co.bitcamp.exception04;

public class Account {
    
    private long balance;
    
    public Account() {
        
    }
    
    // 현재 잔액을 가져오기
    public long getBalance() {
        return this.balance;
    }
    
    // 입금하기
    public void deposite(int money) {
        this.balance += money;
    }
    
    // 출금하기
    public void withdraw(int money) throws BalanceException {
        if(this.balance < money) {
            throw new BalanceException("잔액부족");        // 예외발생
        }
        this.balance -= money;
    }

}



















