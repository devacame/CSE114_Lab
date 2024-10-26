package Lab16;

public class Stock {
    private String symbol, name;
    private double previousclosingPrice, currentPrice;

    Stock(String s, String n) {
        symbol = s;
        name = n;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousclosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setPreviousClosingPrice(double closingPrice) {
        previousclosingPrice = closingPrice;
    }

    public void setCurrentPrice(double curPrice) {
        currentPrice = curPrice;
    }

    public double changePercent() {
        return (currentPrice - previousclosingPrice) / previousclosingPrice * 100;
    }

    public static void main(String[] args) {
        Stock goog = new Stock("GOOG", "Google Inc.");
        goog.setPreviousClosingPrice(1000);
        goog.setCurrentPrice(2000);
        System.out.println("Percent change for " + goog.getName() + " is " + goog.changePercent() + "%.");
        Stock meta = new Stock("META", "Meta Platforms Inc.");
        meta.setPreviousClosingPrice(567.78);
        meta.setCurrentPrice(573.25);
        System.out.println("Percent change for " + meta.getName() + " is " + meta.changePercent() + "%.");
        Stock nvda = new Stock("NVDA", "NVIDIA Corp.");
        nvda.setPreviousClosingPrice(140.41);
        nvda.setCurrentPrice(141.54);
        System.out.println("Percent change for " + nvda.getName() + " is " + nvda.changePercent() + "%.");
    }
}
