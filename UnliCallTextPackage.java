import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer{
    private static Map<String, String> OfferMap = new HashMap<>();

    static {
        OfferMap.put("Smart", "Does not offer any free calls or texts and you will be charged per use.");
        OfferMap.put("Globe", "This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.");
        OfferMap.put("Ditto", "This plan includes unlimited calls and texts to all networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return OfferMap.get(telcoName);
    }
}