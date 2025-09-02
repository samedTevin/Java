public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void Add() {
        System.out.println("MySQL has been added.");
    }
}
