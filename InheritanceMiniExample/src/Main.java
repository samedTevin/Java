
public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();


        // These blocks are valid. Because we are using  parameter as BaseCreditManager (mother class).
        creditUI.calculateCredit(new TeacherCreditManager());
        creditUI.calculateCredit(new AgricultureCreditManager());
        creditUI.calculateCredit(new ArmyCreditManager());
        creditUI.calculateCredit(new BaseCreditManager());

    }
}