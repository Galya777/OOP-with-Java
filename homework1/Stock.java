package zad2;
public class Stock {
private String symbol;
private String name;
private double previousClothingPrice;
private double currentPRice;

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public Stock(String symbol, String name) {
        this.symbol=symbol;
        this.name = name;
    }

    public double getPreviousClothingPrice() {
        return previousClothingPrice;
    }

    public void setPreviousClothingPrice(double previousClothingPrice) {
        this.previousClothingPrice = previousClothingPrice;
    }

    public double getCurrentPRice() {
        return currentPRice;
    }

    public void setCurrentPRice(double currentPRice) {
        this.currentPRice = currentPRice;
    }

    public double changePercent(){
        return Math.abs(currentPRice-previousClothingPrice) /100;
    }

}
