/**
 * Lab-03 Observer Pattern-Auction
 * 
 * Champlain College CSI-340, Fall 2018
 * 
 * Author: Matthew Schwartzkopf And Paul Lindberg Emails:
 * matthew.schwartzkopf@mymail.champlain.edu,
 * paul.lindberg@mymail.champlain.edu Class : CSI-340 Assignment: Lab 03
 * Observer Pattern-Action Date Assigned: October 4, 2018 Due Date: October 11, 2018
 * 
 * Description:
 * 
 * This code represents the Observer Pattern using strategy patterns and UML for an Auction House/
 **/

import java.util.ArrayList;

public class Auctioneer implements Subject {

	public ArrayList<Observer> observerList;
	public double initPrice;
	public double currPrice;
	public Item item = new Item(initPrice, null);
	public int AuctionCountdown = 10;

	public Auctioneer() {
		observerList = new ArrayList<>();
	}

	public void register(Observer O) {
		observerList.add(O);
	}

	public void remove(Observer O) {
		observerList.remove(O);
	}

	public void notifyObservers() {
		for (Observer ob : observerList) {
			ob.update(item);
		}
	}

	public void itemsChanged() {
		notifyObservers();
	}

	public void setItem(Item item) {
		if (currPrice >= initPrice) {
			initPrice = item.initPrice;
			currPrice = item.currPrice;
			itemsChanged();
		}
	}
}
