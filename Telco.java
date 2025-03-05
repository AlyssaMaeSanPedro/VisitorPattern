public class Telco implements TelcoSubscription{
    private int dataAllowance;
    private double promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText){
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public int getDataAllowance(){
        return dataAllowance;
    }
    
    public String getTelcoName(){
        return telcoName;
    }
    
    public double getPromoPrice(){
        return promoPrice;
    }

    public boolean getUnliCallText(){
        return unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price){
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText){
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}