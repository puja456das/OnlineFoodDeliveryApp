package org.anudip.onlineFoodDeliveryApp.Dao;

import java.util.List;
import org.anudip.onlineFoodDeliveryApp.bean.Bill;

public interface BillDao {

	public void saveBill(Bill bill); // store new course

	public List<Bill> displayAllBill();

	public Bill findABillById(Integer serialNumber);

	public Integer generateNewBillId();

	
}